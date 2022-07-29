package ejemplopoo;

public class Moto extends Vehiculo {
    int cilindrada;

    public Moto() {
    }

    public Moto(int num_registro, int cant_ruedas, String marca, String modelo, int cilindrada) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    
    
}
