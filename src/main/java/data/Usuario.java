package data;

import java.util.List;

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
