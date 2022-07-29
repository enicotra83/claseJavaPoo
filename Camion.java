package ejemplopoo;

public class Camion extends Vehiculo {
    int cant_ejes;
    boolean acoplado;

    //Constructor que hereda de Vehiculo
    public Camion(int num_registro, int cant_ruedas, String marca, String modelo, int cant_ejes, boolean acoplado) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.cant_ejes = cant_ejes;
        this.acoplado = acoplado;
    }

    public Camion() {
    }

    public int getCant_ejes() {
        return cant_ejes;
    }

    public void setCant_ejes(int cant_ejes) {
        this.cant_ejes = cant_ejes;
    }

    public boolean isAcoplado() {
        return acoplado;
    }

    public void setAcoplado(boolean acoplado) {
        this.acoplado = acoplado;
    }
    // si quiero sobreescribir los getters y setters de la clase padre, uso override methods, sino ya los hereda de vehiculo 
    
}
