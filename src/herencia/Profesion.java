package herencia;

public class Profesion {
    private String nombre;
    private int baseSueldo;

    public Profesion(String nombre, int baseSueldo) {
        this.nombre = nombre;
        this.baseSueldo = baseSueldo;
    }

    public int calcularSueldo(){
        return 0;
    }

    public int calcularPension() {
        return 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBaseSueldo() {
        return baseSueldo;
    }
}
