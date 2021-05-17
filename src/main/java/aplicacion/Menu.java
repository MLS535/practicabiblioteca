package aplicacion;

import data.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {

  /*  public int executeMainMenu() {
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
            System.out.println(" 8. Iniciar sesion como bibliotecario");
            System.out.println(" 9. Iniciar sesion como usuario");
            System.out.println(" 10. Comprobar que solicitarDatosPersona es correcto Usuario");
            System.out.println(" 11. Realizar una reserva");
            System.out.println(" 12. devolver un libro");
            System.out.println(" 13. cambiar contraseña");
            System.out.print("\n Para salir pulse 21 ");
            System.out.print("\n Elija una opción (1-12): ");

            entrada = opcion.nextInt();
        } while (entrada > 25 || entrada < 1);


        return entrada;
    }

    //todo ordenarlo más tarde
    public static void main(String[] args) {
        int entrada;
        Menu Menu = new Menu();

        entrada = Menu.executeMainMenu();
        Usuario usuario = new Usuario();
        Bibliotecario bibliotecario1 = new Bibliotecario();
        Libro libro1 = new Libro("001a", "El quijote", "Cervantes", "el quijote pum", 5, 5);
        ArrayList<Libro> myList = new ArrayList<>();
        ArrayList<Persona> personaArrayList = new ArrayList<>();
        ArrayList<Bibliotecario> bibliotecarioArrayList = new ArrayList<>();
        ArrayList<Reserva> reservaArrayList = new ArrayList<>();
        ArrayList<Usuario> usuarioArrayList = new ArrayList<>();

        myList.add(libro1);
        myList.add(new Libro("002a", "El principito", "Antoine de Saint-Exupéry", "Editoriales Ignatius", 5, 2));
        myList.add(new Libro("003a", "50 Sombras de Grey", "Sam Taylor-Wood", "Editoriales Maitus", 5, 5));
        myList.add(new Libro("004a", "La casa de Bernarda Alba", "Lorca", "Lorca Editorial", 5, 0));
        myList.add(new Libro("005a", "100 años de soledad", "Garcia Marquez", "Editorial Garcia", 5, 5));

        bibliotecarioArrayList.add(new Bibliotecario("Ignacio", "Akrich", "Vazquez", 25, "Vicedirector", "43152327A", "12345678"));
        bibliotecarioArrayList.add(new Bibliotecario("Maite", "Ladaria", "Sanchez", 25, "Directora", "43152327E", "12345678"));

        usuarioArrayList.add(new Usuario("1", "1", "1", 1, 1, "Calle 13", 07003, "1", reservaArrayList));
        usuarioArrayList.add(new Usuario("Paco", "Martinez", "Pedro", 55, 658490267, "Calle 13", 07003, "pacomartinez@gmail.com", reservaArrayList));
        usuarioArrayList.add(new Usuario("Pamela", "Mejia", "Fontseca", 20, 658490268, "Calle Blanquerna", 07777, "pamelamejia@gmail.com", reservaArrayList));


        while (entrada != 20) {
            switch (entrada) {
                case 1:
                    try {
                        myList.add(Libro.agregarLibro());
                        entrada = Menu.executeMainMenu();
                    } catch (Exception e) {
                        System.out.println("ha habido un error al introducir el libro");
                        entrada = Menu.executeMainMenu();
                    }
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
                    try {
                        bibliotecario1.solicitarDatosPersona(bibliotecarioArrayList, usuarioArrayList, personaArrayList);
                        System.out.println(personaArrayList);
                        entrada = Menu.executeMainMenu();
                    } catch (Exception e) {
                        System.out.println("Algo no se ha introducido bien");
                        entrada = Menu.executeMainMenu();
                    }

                case 8:
                    Bibliotecario.accesoBibliotecario(bibliotecarioArrayList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 9:
                        Libro.contadorLibros(myList);
                    //Usuario.accesoUsuario(usuarioArrayList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 10:
                    usuario.solicitarDatosPersona(bibliotecarioArrayList, usuarioArrayList, personaArrayList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 11:
                    Bibliotecario.reservarLibro(usuarioArrayList, myList, reservaArrayList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 12:
                    Bibliotecario.devolverlibro(usuarioArrayList, myList, reservaArrayList);
                    entrada = Menu.executeMainMenu();
                    break;
                case 13:
                    bibliotecario1.cambiarpassword(bibliotecarioArrayList, usuarioArrayList, personaArrayList);
                    entrada = Menu.executeMainMenu();
                    break;
                default:
                    System.out.println("hasta lueguito");

            }
        }

    }
*/

}
