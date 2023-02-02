
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creo el motor
        Motor motorCarro = new Motor("china", "valcula");
        //crear carro
        Carro carro = new Carro(motorCarro);
        //crear llantas
        Llanta llantaIzqUno = new Llanta(17, "bmw");
        Llanta llantaIzqDos = new Llanta(18, "jj");
        Llanta llantaDerUno = new Llanta(19, "asd");
        Llanta llantaDerDos = new Llanta(10, "hh");
        //agregar llanatas izquierdas
        carro.agregarLlanta(llantaIzqUno);
        carro.agregarLlanta(llantaIzqDos);
        //agregar llantas derechas
        carro.agregarLlanta(llantaDerUno);
        carro.agregarLlanta(llantaDerDos);
        //informacion llantas
        String informacionLlanta = carro.obtenerInformacionLlanta(3);
        System.out.println(informacionLlanta);
    }
}