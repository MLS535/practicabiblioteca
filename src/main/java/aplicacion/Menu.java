package aplicacion;

import data.Libro;

import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Libro> libroArrayList= new  ArrayList();
        Libro.agregarLibro(libroArrayList);
        Libro.agregarLibro(libroArrayList);
        Libro.agregarLibro(libroArrayList);
    }
}
