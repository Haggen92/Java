
package javaadvanced.Martes;
abstract class Bici{
    Bici(){//constructor
        System.out.println("La bicicleta se creo");
    }
    abstract void run();//metodo abstracto
    
    void changeColor(){//metodo de implementacion Que hace
        System.out.println("Color cambiado");
    }
}

class Magistroni extends Bici{
    void run(){
        System.out.println("Soy una bicicleta");
    }
}

public class Abstraccion2 {
    void run(){//Como lo hace
        System.out.println("La bici esta corriendo");
    }
    public static void main(String[] args) {
        Bici bici = new Magistroni();
        bici.run();
        bici.changeColor();
    }
}
