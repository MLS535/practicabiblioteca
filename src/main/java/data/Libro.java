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
        if (numCopias < 1)
            throw new IllegalArgumentException();
        this.numCopias = numCopias;
    }

    public int getNumCopiasDisponibles() {
        return numCopiasDisponibles;
    }

    public void setNumCopiasDisponibles(int numCopiasDisponibles) {
        this.numCopiasDisponibles = numCopiasDisponibles;
    }

    public static void contadorLibros(ArrayList<Libro> libroList) {
        System.out.println("En la biblioteca hay "+libroList.size() +" libros");
    }


    public static Libro agregarLibro() {
        Libro libro = new Libro();
        List<Libro> libroList = new ArrayList<>();
        System.out.println("Introduce el ISBN:");
        Scanner isbn1 = new Scanner(System.in);
        String isbn = isbn1.nextLine();
        libro.setIsbn(isbn);

        System.out.println("Introduce el título:");
        Scanner titulo1 = new Scanner(System.in);
        String titulo = titulo1.nextLine();
        libro.setTitulo(titulo);

        System.out.println("Introduce el autor:");
        Scanner autor1 = new Scanner(System.in);
        String autor = autor1.nextLine();
        libro.setAutor(autor);

        System.out.println("Introduce el editorial:");
        Scanner editorial1 = new Scanner(System.in);
        String editorial = editorial1.nextLine();
        libro.setEditorial(editorial);

        System.out.println("Introduce numCopias ten en cuenta que nunca de ser menor de 1:");
        Scanner numCopias1 = new Scanner(System.in);
        int numCopias = Integer.parseInt(numCopias1.nextLine());
        libro.setNumCopias(numCopias);

        System.out.println("Introduce numCopias disponibles:");
        Scanner numCopiasDisponibles1 = new Scanner(System.in);
        int numCopiasDisponibles = Integer.parseInt(numCopiasDisponibles1.nextLine());
        libro.setNumCopiasDisponibles(numCopiasDisponibles);

        libroList.add(libro);
        return libro;
    }


    public static void eliminarLibro(ArrayList<Libro> libroList) {
        System.out.print("\n ISBN a buscar: ");
        Scanner leer = new Scanner(System.in);
        String isbn = leer.nextLine();
        int comprobante = 1;
        for (int contador = 0; contador < libroList.size(); contador++) {
            if (libroList.get(contador).getIsbn().equals(isbn) && libroList.get(contador).getNumCopias() == libroList.get(contador).getNumCopiasDisponibles()) {
                libroList.remove(contador);
                System.out.print("\nLibro borrado.");
                comprobante = 0;
            }
        }
        if (comprobante == 1) {
            System.out.println("No se encuentra el libro o el libro está reservado");
        }
    }

    //todo preguntar si está bien o necesita algo más
    public static void buscarIsbn(ArrayList<Libro> libroList) {

        System.out.print("\n ISBN a buscar: ");
        Scanner leer = new Scanner(System.in);
        String isbn = leer.nextLine();
        int comprobante = 1;
        for (int contador = 0; contador < libroList.size(); contador++) {
            if (libroList.get(contador).getIsbn().equals(isbn)) {
                System.out.println("\n" + "La posicion del libro es " + libroList.indexOf(libroList.get(contador)) + ", " + libroList.get(contador).getIsbn() + ", " + libroList.get(contador).getTitulo() + " y " + libroList.get(contador).getEditorial() + " editorial.");
                comprobante = 0;
            }
        }
        if (comprobante == 1) {
            System.out.println("No se encuentra el libro");
        }
    }

    public static void buscarTitulo(ArrayList<Libro> libroList) {
        System.out.print("\n Titulo a buscar: ");
        Scanner leer = new Scanner(System.in);
        String titulo = leer.nextLine();
        int comprobante = 1;
        for (int contador = 0; contador < libroList.size(); contador++) {
            if (libroList.get(contador).getTitulo().equals(titulo)) {
                System.out.println("\n" + libroList.get(contador).getIsbn() + ", " + libroList.get(contador).getTitulo() + " y " + libroList.get(contador).getEditorial() + " editorial.");
                comprobante = 0;
            }
        }
        if (comprobante == 1) {
            System.out.println("No se encuentra el libro");
        }
    }
    //todo comprobar este metodo y preguntar en clase
    public void agregarLibroCopia(ArrayList<Libro> libroList) {
        Biblioteca biblioteca= new Biblioteca();
        System.out.println("\n Introduce el ISBN de las copias que quiere añadir");
        Scanner isbn = new Scanner(System.in);
        System.out.println("\n Cuantas copias quieres añadir?");
        Scanner leer = new Scanner(System.in);
        int numCopias = Integer.parseInt(leer.nextLine());
        for (int i = 0; i < libroList.size(); i++) {
            if (libroList.get(i).getIsbn().equals(isbn)) {
                libroList.get(i).setNumCopias(getNumCopias() + numCopias);
                libroList.get(i).setNumCopiasDisponibles(getNumCopiasDisponibles() + numCopias);
            }else{
                libroList.add(Libro.agregarLibro());
            }

        }
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
