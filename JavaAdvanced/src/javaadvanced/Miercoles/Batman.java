
package javaadvanced.Miercoles;

abstract class Habilidades 
{
    abstract void inteligencia();
}

class Inteligencia extends Habilidades
{
    @Override
    void inteligencia()
    {
        System.out.println("Inteligencia encima del promedio...");
    }
}

public class Batman extends Habilidades {
    public static void main(String[] args) {
        Habilidades h = new Batman();
        Habilidades h2 = new Inteligencia();
        
        h.inteligencia();
        h2.inteligencia();
    }

    @Override
    void inteligencia() {
        
    }
}
