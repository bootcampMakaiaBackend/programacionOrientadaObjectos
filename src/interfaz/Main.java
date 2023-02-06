package interfaz;

public class Main {

    public static void main(String[] args) {
        Ladrador doberman = new Doberman();
        Ladrador lobo = new Lobo();
        System.out.println(doberman.ladrar());
        System.out.println(lobo.ladrar());
    }
}