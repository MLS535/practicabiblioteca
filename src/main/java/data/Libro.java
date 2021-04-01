package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int numCopias;
    private int numCopiasDisponibles;

    public Libro() {

    }

    public Libro(String isbn, String titulo, String autor, String editorial, int numCopias, int numCopiasDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numCopias = numCopias;
        this.numCopiasDisponibles = numCopiasDisponibles;
    }

    public Libro(Libro l) {
        this.isbn = l.isbn;
        this.titulo = l.titulo;
        this.autor = l.autor;
        this.editorial = l.editorial;
        this.numCopias = l.numCopias;
        this.numCopiasDisponibles = l.numCopiasDisponibles;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public int getNumCopiasDisponibles() {
        return numCopiasDisponibles;
    }

    public void setNumCopiasDisponibles(int numCopiasDisponibles) {
        this.numCopiasDisponibles = numCopiasDisponibles;
    }

    public static void agregarLibro(ArrayList<Libro> libros) {
        Libro libro= new Libro();
        Scanner pedir= new Scanner(System.in);
        System.out.println("Por favor añade un titulo al libro");
        String titulo = pedir.nextLine();
        libro.setTitulo(titulo);
        libros.add(libro);
        System.out.println(libros);
    }

    public static void eliminarLibro() {

    }

    public static void buscarIsbn() {

    }

    public static void buscarTitulo() {

    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numCopias=" + numCopias +
                ", numCopiasDisponibles=" + numCopiasDisponibles +
                '}';
    }
}
