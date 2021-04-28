package data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Bibliotecario extends Persona {
    private String puestoTrabajo;
    private String nif;
    private String password;

    public Bibliotecario() {

    }

    public Bibliotecario(String nombre, String apellido1, String apellido2, Integer edad, String puestoTrabajo, String nif, String password) {
        super(nombre, apellido1, apellido2, edad);
        this.puestoTrabajo = puestoTrabajo;
        this.nif = nif;
        this.password = password;
    }

    public Bibliotecario(Bibliotecario bibliotecario) {
        this.puestoTrabajo = bibliotecario.puestoTrabajo;
        this.nif = bibliotecario.nif;
        this.password = bibliotecario.password;
    }


    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("La contraseña es incorrecta debes añadir más de 8 caracteres");
            throw new IllegalArgumentException();
        }

        this.password = password;
    }

    @Override
    public void solicitarDatosPersona(ArrayList<Bibliotecario> bibliotecarios, ArrayList<Usuario> usuarios, ArrayList<Persona> personaArrayList) {
        Biblioteca biblioteca = new Biblioteca();
        Bibliotecario bibliotecario = new Bibliotecario();
        System.out.println("Introduce el nombre");
        Scanner nombre2 = new Scanner(System.in);
        String nombre = nombre2.nextLine();
        bibliotecario.setNombre(nombre);

        System.out.println("Introduce el Primer Apellido:");
        Scanner apellido1 = new Scanner(System.in);
        String primerApellido = apellido1.nextLine();
        bibliotecario.setApellido1(primerApellido);

        System.out.println("Introduce el Segundo Apellido:");
        Scanner apellido2 = new Scanner(System.in);
        String segundoApellido = apellido2.nextLine();
        bibliotecario.setApellido2(segundoApellido);

        System.out.println("Introduce la edad:");
        Scanner edad1 = new Scanner(System.in);
        Integer edad = Integer.parseInt(edad1.nextLine());
        bibliotecario.setEdad(edad);

        System.out.println("Introduce el puesto de trabajo:");
        Scanner pusT = new Scanner(System.in);
        String puestoTrabajo = pusT.nextLine();
        bibliotecario.setPuestoTrabajo(puestoTrabajo);

        System.out.println("Introduce el NIF:");
        Scanner nif1 = new Scanner(System.in);
        String nif = nif1.nextLine();
        bibliotecario.setNif(nif);

        System.out.println("Introduce el Password:");
        Scanner password1 = new Scanner(System.in);
        String password = password1.nextLine();
        bibliotecario.setPassword(password);

        bibliotecarios.add(bibliotecario);
        personaArrayList.add(bibliotecario);
        //Biblioteca.setBibliotecarioList(bibliotecarioList);
        System.out.println(bibliotecario);
    }


    public static void accesoBibliotecario(ArrayList<Bibliotecario> bibliotecarios) {
    /* personas.add(new Bibliotecario("Ignacio", "Akrich", "Vazquez", 25, "Vicedirector", "43152327A", "12345678"));
     personas.add(new Bibliotecario("Maite", "Ladaria", "Sanchez", 25, "Directora", "43152327E", "12345678"));
        */
        System.out.print("\n Introduce tu nif: ");
        Scanner leer1 = new Scanner(System.in);
        String nif = leer1.nextLine();
        System.out.print("\n Introduce tu contraseña: ");
        Scanner leer = new Scanner(System.in);
        String contrasena = leer.nextLine();

        int comprobante = 1;
        Bibliotecario bibliotecario = new Bibliotecario();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        for (int i = 0; i < bibliotecarios.size(); i++) {
            if (bibliotecarios.get(i).getNif().equals(nif) && bibliotecarios.get(i).getPassword().equals(contrasena)) {
                System.out.println("\n" + "Acceso correcto");
                comprobante = 0;
            }
        }
        if (comprobante == 1) {
            System.out.println("No es correcto");
        }

    }

    //todo falta averiguar por que la reserva aparece en todos los usuarios
    public static void reservarLibro(ArrayList<Usuario> usuarios, ArrayList<Libro> libroArrayList, ArrayList<Reserva> reservaArrayList) {
        //Usuario.accesoUsuario(usuarios);
        System.out.print("\n Introduce tu telefono: ");
        Scanner leer1 = new Scanner(System.in);
        Integer telefono = Integer.parseInt(leer1.nextLine());
        System.out.print("\n Introduce tu email: ");
        Scanner leer = new Scanner(System.in);
        String email = leer.nextLine();
        int compro = 1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getTelefono().equals(telefono) && usuarios.get(i).getCorreoElectronico().equals(email)) {
                System.out.println("\n" + "Acceso correcto");
                Usuario usuario = new Usuario();
                System.out.print("\n ISBN a buscar: ");
                Scanner leer3 = new Scanner(System.in);
                String isbn = leer3.nextLine();
                int comprobante = 1;
                Date fecha = new Date();
                for (int contador = 0; contador < libroArrayList.size(); contador++) {
                    if (libroArrayList.get(contador).getIsbn().equals(isbn) && libroArrayList.get(contador).getNumCopiasDisponibles() > 0) {
                        reservaArrayList.add(new Reserva(libroArrayList.get(contador), fecha));
                        libroArrayList.get(contador).setNumCopiasDisponibles(libroArrayList.get(contador).getNumCopiasDisponibles() - 1);

                        comprobante = 0;
                        System.out.println(libroArrayList);
                        System.out.println(reservaArrayList);
                    }
                }
                if (comprobante == 1) {
                    System.out.println("No hay copias disponibles");
                }
            }
        }
        for (int j = 0; j < usuarios.size(); j++) {
            if (usuarios.get(j).getTelefono().equals(telefono) && usuarios.get(j).getCorreoElectronico().equals(email)) {
                usuarios.get(j).setListaReserva(reservaArrayList);
                compro = 0;
                System.out.println(usuarios);

            }
        }
        if (compro == 1) {
            System.out.println("No es correcto");

        }
    }


    @Override
    public String toString() {
        return "Bibliotecario{" +
                "puestoTrabajo='" + puestoTrabajo + '\'' +
                ", nif='" + nif + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

