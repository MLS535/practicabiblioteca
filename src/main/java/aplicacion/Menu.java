package aplicacion;

import data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    /*public static void main(String[] args) {

        //String isbn, String titulo, String autor, String editorial, int numCopias, int numCopiasDisponibles
        //
        //myList.add(Libro.agregarLibro("55552ff", "La pantera negra","pepe pardo", "ignatius", 25,255));

        System.out.println(" BIENVENIDO A LA BIBLIOTECA");
        System.out.println(" ----------------");
        System.out.println(" 1. AGREGAR LIBROS");
        System.out.println(" 1. VER TODOS LOS LIBROS");
        Scanner autor1 = new Scanner(System.in);
        System.out.print("\n Elija una opción (1-2): ");
        String autor = autor1.nextLine();
        ArrayList<Libro> myList = new ArrayList<>();
        switch (autor) {
            case "1":
                myList.add(Libro.agregarLibro());

                break;
            case "2":
                Biblioteca.mostrarTodosLibros(myList);
                break;
            default:
                System.out.print("\nLo siento, la opción elegida no es correcta.");
        }
    }*/

    public int executeMainMenu() {
        int entrada;
        Scanner opcion = new Scanner(System.in);

        do {

            System.out.println("Ingresa el numero de la accion que quieres relizar");

            System.out.println(" 1. AGREGAR LIBROS");
            System.out.println(" 2. VER TODOS LOS LIBROS");
            System.out.println(" 3. Buscar por ISBN");
            System.out.println(" 4. Buscar por Titulo");
            System.out.println(" 5. Eliminar Libro");
            System.out.println(" 6. VER TODOS LOS LIBROS DISPONIBLES");
            System.out.println(" 7. Comprobar que solicitarDatosPersona es correcto");
            System.out.print("\n Para salir pulse 9 ");
            System.out.print("\n Elija una opción (1-7): ");

            entrada = opcion.nextInt();
        } while (entrada > 10 || entrada < 1);


        return entrada;
    }
//todo ordenarlo más tarde
    public static void main(String[] args) {
        int entrada;
        Menu Menu = new Menu();

        entrada = Menu.executeMainMenu();
        Persona bibliotecario= new Bibliotecario();
        ArrayList<Libro> myList = new ArrayList<>();
        ArrayList <Persona> personaArrayList=new ArrayList<>();

        while (entrada != 20) {
            switch (entrada) {
                case 1:
                    myList.add(Libro.agregarLibro());
                    entrada = Menu.executeMainMenu();
                    break;

                case 2:
                    Biblioteca.mostrarTodosLibros(myList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 3:
                   Libro.buscarIsbn(myList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 4:
                    Libro.buscarTitulo(myList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 5:
                    Libro.eliminarLibro(myList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 6:
                    Biblioteca.mostrarLibroDisponible(myList);
                    entrada = Menu.executeMainMenu();
                    break;

                case 7:
                    personaArrayList.add(bibliotecario.solicitarDatosPersona());
                    System.out.println(personaArrayList);
                    entrada = Menu.executeMainMenu();
                    break;
                default:
                    System.out.println("hasta lueguito");

            }
        }

    }
}
