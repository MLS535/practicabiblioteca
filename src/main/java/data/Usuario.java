package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario extends Persona {
    private Integer telefono;
    private String direccion;
    private Integer codigoPostal;
    private String correoElectronico;
    private ArrayList<Reserva> listaReserva;

    public Usuario() {

    }

    public Usuario(String nombre, String apellido1, String apellido2, Integer edad, Integer telefono, String direccion,
                   Integer codigoPostal, String correoElectronico, ArrayList<Reserva> listaReserva) {
        super(nombre, apellido1, apellido2, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
        this.listaReserva= new ArrayList<>();
    }

    public Usuario(Usuario usuario) {
        this.telefono = usuario.telefono;
        this.direccion = usuario.direccion;
        this.codigoPostal = usuario.codigoPostal;
        this.correoElectronico = usuario.correoElectronico;
        this.listaReserva = usuario.listaReserva;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(ArrayList<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    @Override
    public void solicitarDatosPersona(ArrayList<Bibliotecario> bibliotecarios, ArrayList<Usuario> usuarios, ArrayList<Persona> personaArrayList) {
        ArrayList<Reserva> reservaArrayList = new ArrayList<>();
        Usuario usuario = new Usuario();
        List<Persona> usuarioList = new ArrayList<>();
        System.out.println("Introduce el Nombre:");
        Scanner nombre1 = new Scanner(System.in);
        String nombre = nombre1.nextLine();
        usuario.setNombre(nombre);

        System.out.println("Introduce el Primer Apellido:");
        Scanner apellido1 = new Scanner(System.in);
        String primerApellido = apellido1.nextLine();
        usuario.setApellido1(primerApellido);

        System.out.println("Introduce el Segundo Apellido:");
        Scanner apellido2 = new Scanner(System.in);
        String segundoApellido = apellido2.nextLine();
        usuario.setApellido2(segundoApellido);

        System.out.println("Introduce la edad:");
        Scanner edad1 = new Scanner(System.in);
        Integer edad = Integer.parseInt(edad1.nextLine());
        usuario.setEdad(edad);

        System.out.println("Introduce el teléfono:");
        Scanner tel = new Scanner(System.in);
        Integer telefono = Integer.parseInt(tel.nextLine());
        usuario.setTelefono(telefono);

        System.out.println("Introduce la dirección:");
        Scanner direc = new Scanner(System.in);
        String direccion = direc.nextLine();
        usuario.setDireccion(direccion);

        System.out.println("Introduce el código postal:");
        Scanner cp = new Scanner(System.in);
        Integer codigoPostal = Integer.parseInt(cp.nextLine());
        usuario.setCodigoPostal(codigoPostal);

        System.out.println("Introduce el correo electrónico");
        Scanner email = new Scanner(System.in);
        String correo = email.nextLine();
        usuario.setCorreoElectronico(correo);
        usuario.setListaReserva(reservaArrayList);


        usuarioList.add(usuario);
        usuarios.add(usuario);
        personaArrayList.add(usuario);
        System.out.println("El usuario que se ha creado es el siguiente: \n" + usuario);
    }
    //todo ponerlo en el menu
    @Override
    public void cambiarpassword(ArrayList<Bibliotecario> bibliotecarios, ArrayList<Usuario> usuarios, ArrayList<Persona> arrayList) {

        System.out.println("Introduce el numero de telefono");
        Scanner telef = new Scanner(System.in);
        Integer telefono = Integer.parseInt(telef.nextLine());

        System.out.println("Introduce el correo electrónico");
        Scanner email = new Scanner(System.in);
        String correo = email.nextLine();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getTelefono().equals(telefono)) {
                usuarios.get(i).setCorreoElectronico(correo);
                System.out.println("El correo electrónico se ha cambiado correctamente");
            }else
                System.out.println("Lo siento ha habido un error");

        }
    }


    /*
    public static void accesoUsuario(ArrayList<Usuario> usuarioArrayList) {

        System.out.print("\n Introduce tu telefono: ");
        Scanner leer1 = new Scanner(System.in);
        Integer telefono = Integer.parseInt(leer1.nextLine());
        System.out.print("\n Introduce tu email: ");
        Scanner leer = new Scanner(System.in);
        String email = leer.nextLine();

        int comprobante = 1;

        for (int i = 0; i < usuarioArrayList.size(); i++) {
            if (usuarioArrayList.get(i).getTelefono().equals(telefono) && usuarioArrayList.get(i).getCorreoElectronico().equals(email)) {
                System.out.println("\n" + "Acceso correcto");
                comprobante = 0;
            }
        }
        if (comprobante == 1) {
            System.out.println("No es correcto");
        }

    }
*/

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre=" + getNombre() + '\'' +
                "apellido1=" + getApellido1() + '\'' +
                "apellido2=" + getApellido2() + '\'' +
                "edad=" + getEdad() +
                "telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", listaReserva=" + listaReserva +
                '}';
    }
}
