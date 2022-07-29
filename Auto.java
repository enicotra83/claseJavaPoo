package ejemplopoo;

public class Auto  extends Vehiculo{
//declarando atributos
private int id;
private String patente;
private int cant_puertas;
private String color;
private boolean caja_manual;

//declarando constructores
//constructor vacio
public Auto() {
}
//constructor por parametros

//declarando getters y setters
public int getId() {
    return id;
}
public Auto(int num_registro, int cant_ruedas, String marca, String modelo, int id, String patente, int cant_puertas,
        String color, boolean caja_manual) {
    super(num_registro, cant_ruedas, marca, modelo);
    this.id = id;
    this.patente = patente;
    this.cant_puertas = cant_puertas;
    this.color = color;
    this.caja_manual = caja_manual;
}

public String getPatente() {
    return patente;
}
public int getCant_puertas() {
    return cant_puertas;
}
public String getColor() {
    return color;
}
public boolean isCaja_manual() {
    return caja_manual;
}

public void setId(int id) {
    this.id = id;
}
public void setPatente(String patente) {
    this.patente = patente;
}
public void setCant_puertas(int cant_puertas) {
    this.cant_puertas = cant_puertas;
}
public void setColor(String color) {
    this.color = color;
}
public void setCaja_manual(boolean caja_manual) {
    this.caja_manual = caja_manual;
}
//toString
@Override
public String toString() {
    return "Auto [caja_manual=" + caja_manual + ", cant_puertas=" + cant_puertas + ", color=" + color + ", id=" + id
            + ", patente=" + patente + "]";
}

// declarando metodos personalizados
public void encender (){
    System.out.println("Estoy encendiendo");
}
public void apagar (){
    System.out.println("Estoy apagando");
}
public void acelerar (double km){
    System.out.println("Estoy acelerando "+km+" kms");
}
public void frenar (double km){
    System.out.println("Estoy frenando "+km+" kms");
}

}

