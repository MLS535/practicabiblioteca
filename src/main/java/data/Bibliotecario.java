package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotecario extends Persona {
    private String puestoTrabajo;
    private String nif;
    private String password;

    public Bibliotecario() {

    }

    public Bibliotecario(String nombre, String apellido1, String apellido2, Integer edad, String puestoTrabajo, String nif, String password) {
        super(nombre, apellido1, apellido2, edad);
        this.puestoTrabajo = puestoTrabajo;
        this.nif = nif;
        this.password = password;
    }

    public Bibliotecario(Bibliotecario bibliotecario) {
        this.puestoTrabajo = bibliotecario.puestoTrabajo;
        this.nif = bibliotecario.nif;
        this.password = bibliotecario.password;
    }


    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Bibliotecario solicitarDatosPersona() {
        Bibliotecario bibliotecario= new Bibliotecario();
        ArrayList<Bibliotecario> bibliotecarioList= new ArrayList<>();
        System.out.println("Introduce el nombre");
        Scanner nombre2 = new Scanner(System.in);
        String nombre = nombre2.nextLine();
        bibliotecario.setNombre(nombre);

        System.out.println("Introduce el Primer Apellido:");
        Scanner apellido1 = new Scanner(System.in);
        String primerApellido = apellido1.nextLine();
        bibliotecario.setApellido1(primerApellido);

        System.out.println("Introduce el Segundo Apellido:");
        Scanner apellido2 = new Scanner(System.in);
        String segundoApellido = apellido2.nextLine();
        bibliotecario.setApellido2(segundoApellido);

        System.out.println("Introduce la edad:");
        Scanner edad1 = new Scanner(System.in);
        Integer edad = Integer.parseInt(edad1.nextLine());
        bibliotecario.setEdad(edad);

        System.out.println("Introduce el puesto de trabajo:");
        Scanner pusT = new Scanner(System.in);
        String puestoTrabajo = pusT.nextLine();
        bibliotecario.setPuestoTrabajo(puestoTrabajo);

        System.out.println("Introduce el NIF:");
        Scanner nif1 = new Scanner(System.in);
        String nif = nif1.nextLine();
        bibliotecario.setNif(nif);

        System.out.println("Introduce el Password:");
        Scanner password1 = new Scanner(System.in);
        String password = password1.nextLine();
        bibliotecario.setPassword(password);

        bibliotecarioList.add(bibliotecario);
        return bibliotecario;
    }

    public static void accesoPassword(ArrayList<Persona> personaArrayList) {
        System.out.print("\n Introduce tu contraseña: ");
        Scanner leer = new Scanner(System.in);
        String contrasena = leer.nextLine();
        int comprobante = 1;
        //ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
       // Bibliotecario bibliotecario =new Bibliotecario();

     //biblioteca.getPersonaList().get(i).equals(bibliotecario.getPassword())
        for (int i = 0; i < Biblioteca.getBibliotecarioList().size(); i++) {
            if (Biblioteca.getBibliotecarioList().equals(contrasena)) {
                System.out.println("\n" +"Acceso correcto");
                comprobante = 0;
            }
        }
        if (comprobante == 1) {
            System.out.println("No es correcto");
        }
    }


    @Override
    public String toString() {
        return "Bibliotecario{" +
                "puestoTrabajo='" + puestoTrabajo + '\'' +
                ", nif='" + nif + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
