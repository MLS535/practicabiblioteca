package data;

import java.util.Date;

public class Reserva {
    private Libro libro;
    private Date fechaReserva;

    public Reserva() {

    }

    public Reserva(Libro libro, Date fechaReserva) {
        this.libro = libro;
        this.fechaReserva = fechaReserva;
    }

    public Reserva(Reserva reserva) {
        this.libro = reserva.libro;
        this.fechaReserva = reserva.fechaReserva;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "libro=" + libro +
                ", fechaReserva=" + fechaReserva +
                '}';
    }
}
