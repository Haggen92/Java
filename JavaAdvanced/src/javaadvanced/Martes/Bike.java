
package javaadvanced.Martes;
/*
    Constructor de una clase es un conjunto de instrucciones diseñado para
    inicializar una instancia de una clase.
    En su declaracion o en cabezado puede aceptar parametros.

    Bike b = new Bike()
    Bike() <- Hace referencia al constructor por omision.

    Antes de su ejecucion, b es null;al final de la llamada de "b" es un apuntador a un objeto(referencia)
    con espacio para contener sus valores de atributos y sus apuntadores a metodos.

    ¿porque el constructor no es metodo?
    No puedo llamar al constructor usando el operador de indireccion.

    Carece de un valor de retorno distinto a un apuntador.
    
    No puede ser REDEFINIDO ()
    No puede ser decladado con un type
    
    Bike.Show()
    Bike apuntador
    punto(.) operador de indireccion
    Show() metodo

    
*/
public class Bike 
{
    //proppiedades del objeto
    int velocidad;
    String color;
    String marca;

   
    
    //Declaro el constructor implicito
    public Bike(String color,int velocidad){
        this.velocidad = velocidad;
        this.color = color;
    }
    
    //Inmutable cuando su valor no cambia durante la ejecucion del programa
    public Bike(String color, String marca, int velocidad)
    {
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }
    
    public int getVelocidad() {return velocidad;}

    //public void setVelocidad(int velocidad) {this.velocidad = velocidad;}

    public String getColor() {return color;}

    //public void setColor(String color) {this.color = color;}
    
     public String getMarca() {
        return marca;
    }

    //public void setMarca(String marca) {this.marca = marca;}
}
