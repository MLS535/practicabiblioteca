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
    /*
    public int executeMainMenu() {
        int entrada;
        Scanner opcion = new Scanner(System.in);

        do {
            Biblioteca.nombreBiblio();
            System.out.println("Menu por consola de la biblioteca.");
            System.out.println("1.- Gestionar Personal biblioteca");
            System.out.println("2.- Gestionar Reservas");
            System.out.println("3.- Gestionar Biblioteca");
            System.out.println("4.- Gestionar contraseña");
            System.out.println("5.- Salir de la biblioteca");
            System.out.println("Ingrese la accion a realizar: "); //Pretendo que el usuario escriba el numero de  opcion


            entrada = opcion.nextInt();
        } while (entrada > 5 || entrada < 1);
        return entrada;

    }

    public static void main(String[] args) {
        int entrada;
        Menu Menu = new Menu();
        entrada = Menu.executeMainMenu();
        Scanner opcion = new Scanner(System.in);
        while (entrada != 20){
            switch (entrada) {
                case 1:
                    do {
                        System.out.println("Gestionar Personal biblioteca");
                        System.out.println("Crear nuevo usuario");//Pretendo que el usuario escriba el numero de  opcion
                        System.out.println("Crear nuevo bibliotecario");

                        entrada = opcion.nextInt();
                    } while (entrada > 5 || entrada < 1);

            }
            }
        }


    }*/
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";
    //https://www.codegrepper.com/code-examples/java/java+system.out.println+font+color
        public static void main(String[] args) {
            Usuario usuario = new Usuario();
            Libro libro=new Libro();
            Bibliotecario bibliotecario1 = new Bibliotecario();
            ArrayList<Libro> myList = new ArrayList<>();
            ArrayList<Persona> personaArrayList = new ArrayList<>();
            ArrayList<Bibliotecario> bibliotecarioArrayList = new ArrayList<>();
            ArrayList<Reserva> reservaArrayList = new ArrayList<>();
            ArrayList<Usuario> usuarioArrayList = new ArrayList<>();
            bibliotecarioArrayList.add(new Bibliotecario("Ignacio", "Akrich", "Vazquez", 25, "Vicedirector", "43152327A", "12345678"));
            bibliotecarioArrayList.add(new Bibliotecario("Maite", "Ladaria", "Sanchez", 25, "Directora", "43152327E", "12345678"));
            usuarioArrayList.add(new Usuario("1", "1", "1", 1, 1, "Calle 13", 07003, "1", reservaArrayList));
            myList.add(new Libro("002a", "El principito", "Antoine de Saint-Exupéry", "Editoriales Ignatius", 5, 2));
            myList.add(new Libro("003a", "50 Sombras de Grey", "Sam Taylor-Wood", "Editoriales Maitus", 5, 5));
            Scanner sc=new Scanner(System.in);

            int opc=0;
            try {
                Biblioteca.nombreBiblio();
            }catch (Exception e) {
                System.out.println("Ha habido un error");
            }
            do{
                System.out.println(TEXT_RED + "------------------------------------------"+ TEXT_RESET);
                System.out.println(TEXT_CYAN+ "Menu por consola de la biblioteca."+ TEXT_RESET);
                System.out.println(TEXT_RED + "------------------------------------------"+ TEXT_RESET);
                System.out.println("1.- Gestionar Personal biblioteca");
                System.out.println("2.- Gestionar Reservas");
                System.out.println("3.- Gestionar Biblioteca");
                System.out.println("4.- Gestionar contraseña");
                System.out.println("5.- Salir de la biblioteca");
                System.out.println(TEXT_RED + "------------------------------------------"+ TEXT_RESET);
                System.out.println("Ingrese la accion a realizar: ");
                opc=sc.nextInt();

                switch(opc){
                    case 1:
                        System.out.println("Gestionar Personal biblioteca");
                        Bibliotecario.accesoBibliotecario(bibliotecarioArrayList);
                        int opc1=0;
                        do{
                            System.out.println("1.Crear nuevo usuario");
                            System.out.println("2.Crear nuevo bibliotecario");
                            System.out.println("3.Volver al menu");
                            System.out.println("Ingrese la accion a realizar: ");
                            opc1=sc.nextInt();

                            switch(opc1){
                                case 1:
                                    usuario.solicitarDatosPersona(bibliotecarioArrayList, usuarioArrayList, personaArrayList);
                                    break;
                                case 2:
                                    try {
                                        bibliotecario1.solicitarDatosPersona(bibliotecarioArrayList, usuarioArrayList, personaArrayList);
                                        System.out.println(personaArrayList);
                                        //entrada = Menu.executeMainMenu();
                                    } catch (Exception e) {
                                        System.out.println("Algo no se ha introducido bien");
                                     //   entrada = Menu.executeMainMenu();
                                    }
                                    break;
                                default:
                                    System.out.println("Volviendo al menú principal");
                                    //todo aqui podriamos volver al menu o podriamos hacer el while con volver al menú

                            }

                        }while(opc1>0 & opc1<3);
                        break;

                    case 2:
                        System.out.println("Menu Gestionar Reserva");
                        int opc2=0;
                        do{
                            System.out.println("------------------------------------------");
                            System.out.println("Seleccione un número del menu de reservas");
                            System.out.println("1.Reservar libro");
                            System.out.println("2.Devolver reserva");
                            System.out.println("3.Mostrar libros disponibles");
                            System.out.println("4.volver al menú principal");
                            System.out.println("------------------------------------------");
                            System.out.println("Ingrese la accion a realizar: ");
                            opc2=sc.nextInt();
                            switch(opc2){
                                case 1:
                                    Bibliotecario.reservarLibro(usuarioArrayList, myList, reservaArrayList);
                                    break;
                                case 2:
                                    Bibliotecario.devolverlibro(usuarioArrayList, myList, reservaArrayList);
                                    break;
                                case 3:
                                    Biblioteca.mostrarLibroDisponible(myList);

                                    break;
                                default:
                                    System.out.println("Volviendo al menú principal");
                            }
                        }while(opc2>0 & opc2<4);
                        break;
                    case 3:
                        System.out.println("-------------------------------------");
                        System.out.println("3.- Gestionar Biblioteca");
                        System.out.println("-------------------------------------");
                        int opc3=0;
                        do{
                            System.out.println("------------------------------------------");
                            System.out.println("Seleccione un número del menu de reservas");
                            System.out.println("------------------------------------------");
                            System.out.println("1.Ver todos los libros");
                            System.out.println("2.Buscar ISBN del libro");
                            System.out.println("3.Buscar Título del libro");
                            System.out.println("4.Agregar libro");
                            System.out.println("5.Agregar libro copia");
                            System.out.println("6.Eliminar libro");
                            System.out.println("7.Contador libros");
                            System.out.println("8.Volver al menú principal");
                            System.out.println("------------------------------------------");
                            System.out.println("Ingrese la accion a realizar: ");

                            opc3=sc.nextInt();
                            switch(opc3){
                                case 1:
                                    Biblioteca.mostrarTodosLibros(myList);
                                  //  entrada = Menu.executeMainMenu();
                                    break;
                                case 2:
                                    Libro.buscarIsbn(myList);
                                   // entrada = Menu.executeMainMenu();
                                    break;
                                case 3:
                                    Libro.buscarTitulo(myList);
                                   // entrada = Menu.executeMainMenu();
                                    break;
                                case 4:
                                    try {
                                        myList.add(Libro.agregarLibro());
                                      //  entrada = Menu.executeMainMenu();
                                    } catch (Exception e) {
                                        System.out.println("ha habido un error al introducir el libro");
                                        //entrada = Menu.executeMainMenu();
                                    }
                                    break;
                                case 5:
                                    try {
                                        libro.agregarLibroCopia(myList);
                                        //  entrada = Menu.executeMainMenu();
                                    } catch (Exception e) {
                                        System.out.println("ha habido un error al introducir el libro");
                                        //entrada = Menu.executeMainMenu();
                                    }
                                    break;
                                case 6:
                                    Libro.eliminarLibro(myList);
                                   // entrada = Menu.executeMainMenu();
                                    break;
                                case 7:
                                    Libro.contadorLibros(myList);
                                    // entrada = Menu.executeMainMenu();
                                    break;
                                default:
                                    System.out.println("Volviendo al menú principal");
                            }
                        }while(opc3>0 & opc3<8);
                        break;
                    case 4:
                        System.out.println("Gestionar contraseñas de la biblioteca");
                        Bibliotecario.accesoBibliotecario(bibliotecarioArrayList);
                        int opc4=0;
                        do{
                            System.out.println("-------------------------------------");
                            System.out.println("1.Cambiar contraseña de usuario");
                            System.out.println("2.Cambiar contraseña de bibliotecario");
                            System.out.println("3.Volver al menu principal");
                            System.out.println("-------------------------------------");
                            System.out.println("Ingrese la accion a realizar: ");
                            opc4=sc.nextInt();
                            switch(opc4){
                                case 1:
                                    try {
                                    usuario.cambiarpassword(bibliotecarioArrayList, usuarioArrayList, personaArrayList);
                                    } catch (Exception e) {
                                        System.out.println("Algo no se ha introducido bien");
                                        //   entrada = Menu.executeMainMenu();
                                    }
                                    break;
                                case 2:
                                    try {
                                        bibliotecario1.cambiarpassword(bibliotecarioArrayList, usuarioArrayList, personaArrayList);
                                        System.out.println(personaArrayList);
                                        //entrada = Menu.executeMainMenu();
                                    } catch (Exception e) {
                                        System.out.println("Algo no se ha introducido bien");
                                        //   entrada = Menu.executeMainMenu();
                                    }
                                    break;
                                default:
                                    System.out.println("Volviendo al menú principal");
                                    //todo aqui podriamos volver al menu o podriamos hacer el while con volver al menú

                            }

                        }while(opc4>0 & opc4<3);
                        break;
                }
            }while((opc>0 & opc<5));
        }
    }

