package data;

public abstract class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;

    public Persona() {

    }

    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.apellido1 = persona.apellido1;
        this.apellido2 = persona.apellido2;
        this.edad = persona.edad;
    }

    public Persona(String nombre, String apellido1, String apellido2, Integer edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Persona solicitarDatosPersona() {
        Persona persona = new Bibliotecario();
        return persona;
    }
/*
    public void solicitarDatosPersona() {
        Persona usuario= new Usuario();
        Persona bibliotecario = new Bibliotecario();
        List<Persona> personaList= new ArrayList<>();
        System.out.println("Introduce el nombre");
        Scanner nombre1 = new Scanner(System.in);
        String nombre = nombre1.nextLine();
        usuario.setNombre(nombre);
        bibliotecario.setNombre(nombre);
    }

 */

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", edad=" + edad +
                '}';
    }
}
