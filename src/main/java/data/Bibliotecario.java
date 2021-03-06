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
        System.out.println("El usuario que se ha creado es el siguiente: \n" + bibliotecario);
    }


    public static void accesoBibliotecario(ArrayList<Bibliotecario> bibliotecarios) {
        System.out.print("\n Introduce tu nif: ");
        Scanner leer1 = new Scanner(System.in);
        String nif = leer1.nextLine();
        System.out.print("\n Introduce tu contraseña: ");
        Scanner leer = new Scanner(System.in);
        String contrasena = leer.nextLine();

        int comprobante = 1;
        /*Bibliotecario bibliotecario = new Bibliotecario();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        */

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

    public static void reservarLibro(ArrayList<Usuario> usuarios, ArrayList<Libro> libroArrayList, ArrayList<Reserva> reservaArrayList) {
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
                System.out.print("\n ISBN a buscar: ");
                Scanner leer3 = new Scanner(System.in);
                String isbn = leer3.nextLine();
                int comprobante = 1;
                Date fecha = new Date();
                for (int contador = 0; contador < libroArrayList.size(); contador++) {
                    if (libroArrayList.get(contador).getIsbn().equals(isbn) && libroArrayList.get(contador).getNumCopiasDisponibles() > 0) {
                        Reserva reserva = new Reserva(libroArrayList.get(contador), fecha);//ponemos en una variable para que la reserva del usuario y de  la lista de reservas sea la misma
                        reservaArrayList.add(reserva);//agregar el mismo libro del usuario a las reservas
                        libroArrayList.get(contador).setNumCopiasDisponibles(libroArrayList.get(contador).getNumCopiasDisponibles() - 1);
                        usuarios.get(i).getListaReserva().add(reserva);//agregar solo la reserva de ese libro al usuario

                        comprobante = 0;
                        compro = 0;//Para que no diga que "No es correcto"
                        //System.out.println(libroArrayList.get(contador));
                        //System.out.println(reserva);

                        //salirse de los ciclos, pues ya agregó la reserva
                        System.out.println("El Libro: \n"+ libroArrayList.get(contador) + "\n reservado por "+usuarios.get(i).getNombre()+" " +usuarios.get(i).getApellido1());
                        contador = libroArrayList.size();
                        i = usuarios.size();

                    }
                }
                if (comprobante == 1) {
                    System.out.println("No hay copias disponibles");
                }
            }

        }
        if (compro ==1) {
            System.out.println("No es correcto");

        }
    }

    public static void devolverlibro(ArrayList<Usuario> usuarios, ArrayList<Libro> libroArrayList, ArrayList<Reserva> reservaArrayList) {
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
                System.out.print("\n ISBN a buscar: ");
                Scanner leer3 = new Scanner(System.in);
                String isbn = leer3.nextLine();
                for (int contador = 0; contador < reservaArrayList.size(); contador++) {
                    if (reservaArrayList.get(contador).getLibro().getIsbn().equals(isbn)) {
                        reservaArrayList.remove(contador);
                        usuarios.get(i).getListaReserva().remove(contador);
                        libroArrayList.get(contador).setNumCopiasDisponibles(libroArrayList.get(contador).getNumCopiasDisponibles() + 1);
                        compro = 0;//Para que no diga que "No es correcto"
                        System.out.println(libroArrayList.get(contador));
                        System.out.println(reservaArrayList);
                        System.out.println(usuarios);
                        System.out.println("Libro devuelto por "+usuarios.get(i).getNombre()+" " +usuarios.get(i).getApellido1());
                        //salirse de los ciclos, pues ya agregó la reserva
                        contador = libroArrayList.size();
                        i = usuarios.size();
                        break;
                    }
                }


            }

        }
        if (compro == 1) {
            System.out.println("No es correcto");

        }
    }

    @Override
    public void cambiarpassword(ArrayList<Bibliotecario> bibliotecarios, ArrayList<Usuario> usuarios, ArrayList<Persona> arrayList) {
        System.out.println("Introduce el NIF:");
        Scanner nif1 = new Scanner(System.in);
        String nif = nif1.nextLine();

        System.out.println("Introduce una nueva contraseña que quieres cambiar:");
        Scanner password1 = new Scanner(System.in);
        String password = password1.nextLine();
        int i;
        for (i = 0; i < bibliotecarios.size(); i++) {
            if (bibliotecarios.get(i).getNif().equals(nif)) {
                bibliotecarios.get(i).setPassword(password);
                System.out.println("La contraseña se ha cambiado correctamente");
                System.out.println(bibliotecarios);
            }
        }if (!bibliotecarios.get(i).getNif().equals(nif))
            System.out.println("Lo siento ha habido un error");
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

