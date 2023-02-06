package abstracto;


public class Main {

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado("verde", 2.0);
        Triangulo triangulo = new Triangulo("rojo", 3.0, 2.0);
        System.out.println(cuadrado.calcularArea());
        System.out.println(triangulo.calcularArea());
        System.out.println(cuadrado.getColor());
        System.out.println(triangulo.getColor());
    }
}