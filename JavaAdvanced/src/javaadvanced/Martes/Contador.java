
package javaadvanced.Martes;
/*
    Restricciones de Static:
    No puede utilizar miembros estaticos para referencia.
    This y super no pueden ser usadas en un contexto estatico.
*/
public class Contador 
{
    static int i = 0;
    
    public Contador()
    {
        i++;
        System.out.println(i);
    }
    
    public static void main(String[] args) 
    {
        Contador i1 = new Contador();
        Contador i2 = new Contador();
        Contador i3 = new Contador();
    }
}
