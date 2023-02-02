public class Persona {
    private String nombre;
    private int edad;
    private int identificacion;

    public Persona(String nombre, int edad, int identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {

    }

    public boolean esMayorDeEdad() {
        if(this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Mi nombre es: " + this.nombre + " y mi edad es: "+ this.edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", identificacion=" + identificacion +
                '}';
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }
}
