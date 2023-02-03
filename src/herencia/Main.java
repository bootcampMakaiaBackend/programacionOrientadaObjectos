package herencia;

public class Main {
    public static void main(String[] args) {
        Profesion ingeniero = new Ingeniero("Mateo", 10000);
        Profesion medico = new Medico("Juan", 20000);
        System.out.println("El valor a pagar para el ingeniero es de: " + ingeniero.calcularSueldo());
        System.out.println("El valor a pagar para el medico es de: " + medico.calcularSueldo());
    }
}