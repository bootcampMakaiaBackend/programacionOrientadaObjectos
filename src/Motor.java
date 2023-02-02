public class Motor {
    private String marca;
    private String nombreValvula;

    public Motor(String marca, String nombreValvula) {
        this.marca = marca;
        this.nombreValvula = nombreValvula;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getNombreValvula(){
        return this.nombreValvula;
    }
}
