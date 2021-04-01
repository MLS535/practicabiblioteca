package data;

import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;
    private static List<Libro> libroList;
    private static List<Bibliotecario> bibliotecarioList;

    public Biblioteca() {

    }

    public Biblioteca(String nombreBiblioteca, List<Libro> libroList, List<Bibliotecario> bibliotecarioList) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libroList = libroList;
        this.bibliotecarioList = bibliotecarioList;
    }

    public Biblioteca(Biblioteca b) {
        this.nombreBiblioteca = b.nombreBiblioteca;
        this.libroList = b.libroList;
        this.bibliotecarioList = b.bibliotecarioList;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public List<Libro> getLibroList() {
        return libroList;
    }

    public void setLibroList(List<Libro> libroList) {
        this.libroList = libroList;
    }

    public List<Bibliotecario> getBibliotecarioList() {
        return bibliotecarioList;
    }

    public void setBibliotecarioList(List<Bibliotecario> bibliotecarioList) {
        this.bibliotecarioList = bibliotecarioList;
    }

    public static void mostrarTodosLibros(){

    }

    public static void mostrarLibroDisponible(){

    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombreBiblioteca='" + nombreBiblioteca + '\'' +
                ", libroList=" + libroList +
                ", bibliotecarioList=" + bibliotecarioList +
                '}';
    }
}
