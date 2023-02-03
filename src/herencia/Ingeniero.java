package herencia;

public class Ingeniero extends Profesion{

    private String tipoIngenieria;

    public Ingeniero(String nombre, int baseSueldo){
        super(nombre, baseSueldo);
    }

    public Ingeniero(String nombre, int baseSueldo, String tipoIngenieria) {
        super(nombre, baseSueldo);
        this.tipoIngenieria = tipoIngenieria;
    }

    @Override
    public int calcularSueldo(){
        return getBaseSueldo() + 20000;
    }

}
