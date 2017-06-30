
package javaadvanced.Martes;



/*
    Super es una palabra reservada en java como una variable de referencia la 
    cual es usada para servir de intermediario entre la clase padre y la
    subclase
    
    Usos  de super
        1.-Se puede utilizar para referir la variable de instancia de la clase 
        padre inmediata.
        2.-Se puede utilizar para invocar el metodo de la clase padre.
        3.-Se puede utilizar para invocar al constructor de la clase padre 
        inmediata.
*/
class Animal
{
    Animal()
    {
        System.out.println("Se ha creado el animal");
    }
    
    
    void eat()
    {
            System.out.println("Comiendo ...");
    }
    
    //Caso 1
       String color = "Blanco";
       
}

   class Perro extends Animal
   {
       //Caso 3
       Perro()
       {
           super();
           System.out.println("Se ha creado el perro");
       }
       
       //Caso 2
       void eat()
       {
            System.out.println("Comiendo corquetas");
       }
       void dormir()
       {
           System.out.println("El perro se durmio");
       }
       
       void llamar()
       {
           super.eat();
           dormir();
       }
       
       void printColor()
       {
           //Imprime el color de la clase de animal
           System.out.println(super.color);
       }
   }

public class SuperTest {
    public static void main(String[] args) {
        // Caso 3 Perro p = new Perro();
        
        //Caso 2
        new Perro().llamar();
        
        //Caso1
        new Perro().printColor();
    }
}
