public class Carro {
    private Motor motor;
    private Llanta[] llantas;
    private int contadorLlantas = 0;

    public Carro(Motor motor){
        this.llantas = new Llanta[4];
        this.motor = motor;
    }

    public void agregarLlanta(Llanta llanta){
        if(contadorLlantas <= 3) {
            this.llantas[contadorLlantas] = llanta;
            this.contadorLlantas++;
        } else {
            System.out.println("No se pueden agregar mas llantas");
        }
    }

    public String obtenerInformacionLlanta(int numeroLlanta) {
        Llanta llanta = this.llantas[numeroLlanta];
        return llanta.getMarca() + llanta.getNumeroRin();
    }

}
