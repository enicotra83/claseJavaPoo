package ejemplopoo;

public class EjemploPoo {
    public static void main(String[] args){
        // uso del constructor vacio
    Auto auto1 = new Auto();

Vehiculo vehi = new Vehiculo(12214, 4, "Ford", "Indefinido");

    Auto auto2 = new Auto(65, 4, "Renault", "Kwid", 1, "111JO", 5, "rojo", true);

    Moto moto1 = new Moto( 125, 2, "Kawasaki", "Ninja", 700);

    Camion camion1 = new Camion(69875, 6, "Mercedes", "un modelo", 6, true);

    /*auto2.encender();
    auto2.acelerar(60);
    auto2.frenar(30);
    auto2.apagar();

    System.out.println("El valor de la id es "+ auto2.getId());
    auto2.setId(30000);
    System.out.println("El nuevo valor de la id es "+ auto2.getId());

    System.out.println("la id de auto1 es "+ auto1.getId());
    System.out.println("el color de auto1 es "+ auto1.getColor());
    auto1.setId(1500);
    auto1.setColor("amarillo");
    auto1.setCaja_manual(false);
    auto1.setCant_puertas(3);
    auto1.setPatente("ad031xg");
    System.out.println("la id de auto1 es "+ auto1.getId());
    System.out.println("el color de auto1 es "+ auto1.getColor());*/
    System.out.println(auto2.toString());
    System.out.println(auto1.toString());

//Ejemplo de polimorfismo
    Vehiculo vector[] = new Vehiculo[4];
    vector[0]= vehi;
    vector[1] = auto2;
    vector[2] = moto1;
    vector[3]= camion1;
    for (int i=0; i<4; i++){
        System.out.println("registro "+ i + vector[i].getMarca());
    }
    }

}
