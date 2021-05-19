package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private String nombreBiblioteca;
    private static List<Libro> libroList;
    private static List<Persona> personaList;
    private static List<Bibliotecario> bibliotecarioList;
    private static List<Usuario> usuarioList;

    public static List<Bibliotecario> getBibliotecarioList() {
        return bibliotecarioList;
    }

    public static void setBibliotecarioList(List<Bibliotecario> bibliotecarioList) {
        Biblioteca.bibliotecarioList = bibliotecarioList;
    }

    public static List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public static void setUsuarioList(List<Usuario> usuarioList) {
        Biblioteca.usuarioList = usuarioList;
    }

    public Biblioteca() {

    }

    public Biblioteca(String nombreBiblioteca, List<Libro> libroList, List<Persona> personaList, List<Bibliotecario> bibliotecarioList, List<Usuario> usuarioList) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libroList = libroList;
        this.personaList = personaList;
        this.bibliotecarioList = bibliotecarioList;
        this.usuarioList = usuarioList;

    }

    public Biblioteca(Biblioteca b) {
        this.nombreBiblioteca = b.nombreBiblioteca;
        this.libroList = b.libroList;
        this.personaList = b.personaList;
        this.bibliotecarioList = b.bibliotecarioList;
        this.usuarioList = b.usuarioList;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        String firstLtr = nombreBiblioteca.substring(0, 1);
        String restLtrs = nombreBiblioteca.substring(1, nombreBiblioteca.length());
        firstLtr = firstLtr.toUpperCase();
        nombreBiblioteca = firstLtr + restLtrs;
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public List<Libro> getLibroList() {
        return libroList;
    }

    public void setLibroList(List<Libro> libroList) {
        this.libroList = libroList;
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }


    public static void mostrarTodosLibros(ArrayList<Libro> libroList) {
        for (int i = 0; i < libroList.size(); i++) {

            System.out.println(libroList.get(i).toString() + "\n");
        }
    }

    public static void mostrarLibroDisponible(ArrayList<Libro> libroList) {
        ArrayList<Libro> librosdisponibles = new ArrayList<>();

        for (int i = 0; i < libroList.size(); i++) {
            if (libroList.get(i).getNumCopiasDisponibles() > 0) {
                librosdisponibles.add(libroList.get(i));
            }
        }
        for (int i = 0; i < librosdisponibles.size(); i++) {

            System.out.println(librosdisponibles.get(i).toString() + "\n");
        }
    }

    //todo comprobar
    public static void nombreBiblio() {
        System.out.println("Por favor introduce el nombre la Biblioteca:");
        Scanner biblio = new Scanner(System.in);
        String nombre = biblio.nextLine();
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombreBiblioteca(nombre);
        System.out.println("Bienvenido a la biblioteca " + biblioteca.getNombreBiblioteca());
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombreBiblioteca='" + nombreBiblioteca + '\'' +
                ", libroList=" + libroList +
                ", bibliotecarioList=" + personaList +
                '}';
    }
}
