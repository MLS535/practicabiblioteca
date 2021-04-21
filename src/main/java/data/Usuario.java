package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario extends Persona {
    private Integer telefono;
    private String direccion;
    private Integer codigoPostal;
    private String correoElectronico;
    private List<Reserva> listaReserva;

    public Usuario() {

    }

    public Usuario(String nombre, String apellido1, String apellido2, Integer edad, Integer telefono, String direccion, Integer codigoPostal, String correoElectronico, List<Reserva> listaReserva) {
        super(nombre, apellido1, apellido2, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
        this.listaReserva = listaReserva;
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

    public List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    @Override
    public Usuario solicitarDatosPersona() {

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
        //usuario.setListaReserva(null);

        usuarioList.add(usuario);
        return usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre=" + getNombre() +'\'' +
                "apellido1=" + getApellido1() +'\'' +
                "apellido2=" + getApellido2() +'\'' +
                "edad=" + getEdad() +
                "telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", listaReserva=" + listaReserva +
                '}';
    }
}
