package herencia;

public class Medico extends Profesion{

    public Medico(String nombre, int baseSueldo){
        super(nombre, baseSueldo);
    }

    @Override
    public int calcularSueldo() {
        return getBaseSueldo() + 50000;
    }

    @Override
    public int calcularPension(){
        return 0;
    }
}
