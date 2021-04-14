package data;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;
    private static List<Libro> libroList;
    private static List<Persona> personaList;

    public Biblioteca() {

    }

    public Biblioteca(String nombreBiblioteca, List<Libro> libroList, List<Persona> personaList) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libroList = libroList;
        this.personaList = personaList;
    }

    public Biblioteca(Biblioteca b) {
        this.nombreBiblioteca = b.nombreBiblioteca;
        this.libroList = b.libroList;
        this.personaList = b.personaList;
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

    public static void mostrarTodosLibros(){

    }

    public static void mostrarLibroDisponible(ArrayList<Libro> libroList) {
        ArrayList<Libro> librosdisponibles = new ArrayList<>();

       /* for (int i = 0; i < libroList.size(); i++) {
            if (libroList.get(i).getNumCopiasDisponibles() > 0) {

            }*/
        }
        System.out.println(librosdisponibles);
    }
   /* public static void nombrebiblio(String nombreBibi){
        Biblioteca biblioteca= new Biblioteca();
        biblioteca.setNombreBiblioteca(nombreBibi);
        System.out.println(biblioteca);
    }
*/



    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombreBiblioteca='" + nombreBiblioteca + '\'' +
                ", libroList=" + libroList +
                ", bibliotecarioList=" + personaList +
                '}';
    }
}
