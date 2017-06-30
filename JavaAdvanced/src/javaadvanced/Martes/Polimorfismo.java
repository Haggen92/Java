
package javaadvanced.Martes;
/*
Polimorfismo: 
    Existen 3 formas de polimorfismo:
        1.-Primitivo: Se implementa gracias a la sobrecarga de metodos.
        2.-Real: Se implementa gracias a la redefinicion de metodos.
        3.-Generico: Se implementa gracias a las clases genericas.

Una variable es polmorfica cuando puede referirse a objetos de clsaes diferentes  
y en consecuencia puede adoptar distintos comportamientos

El polimorfismo permite desplegar comportamientos distintos en las subclases de
una jerarquia de herencia cuando ellas activan metodos con la misma firma o 
signatura

Ej. Empleado e = new Administrador()
Para manipular al empleado como si fuera administrador es necesario modelar el 
tipo de la subclase.
El hecho de que una cariable apuntadora a un objeto (Tal como la variable "e")
pueda referirse automaticamente a tipos multiples se llama polimorfismo.

La JVM automaticamente selecciona el metodo apropiado a tiempo de ejecucion, lo 
que se denomina "LIGADURA DINAMICA". En conclusion todas las variables de 
tipo superclase concretas son polimorficas
 */

class Bike2 
{
    void run()
    {
        System.out.println("running...");
    }
}
public class Polimorfismo extends Bike2 {
    void run()
    {
        System.err.println("running safely with 60km");
    }
    public static void main(String[] args) {
        Bike2 b =  new Polimorfismo();
        /*
           Upcasting -> Cuando la variable de referencia refiere al objeto de la
            clase hija:
        Class A(){}
        class B() extrends A{}
        A a = new B();
        */
        b.run();
    }
}
