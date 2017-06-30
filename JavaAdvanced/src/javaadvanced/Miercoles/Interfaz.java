
package javaadvanced.Miercoles;

/*
Una interfaz en java es un modelo de una clase.
Tiene constantes estaticas y metodos abstractos.
La interfaz de java es un mecanismo para lograr la abstraccion. Solo puede
contener metodos abstractos que carezcan de implementacion.
Tambien permite la simulacion de herencia multiple.
Representa una relacion IS-A.
No se puede instanciar... como las clases abstractas.

Por que utilizar interfaces?
    *Para lograr la bastraccion.
    *Por interface podemos simular la herencia multiple.
    *Para lograr un bajo acoplamiento.

A partir de Java 8, la interfaz contiene metodos predeterminados y estaticos.
 */
abstract class Hola{
    void hola()
    {
        System.out.println("Hola...");
    }
}

interface Mostrar{
    //Que hace.
    void show();
    //abstract void saludar();
}
public class Interfaz implements Mostrar{

    @Override
    public void show() {
        System.out.println("Hola...");
    }
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        i.show();
    }
    
}
