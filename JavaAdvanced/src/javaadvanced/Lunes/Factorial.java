
package javaadvanced.Lunes;

public class Factorial 
{
    public static void main(String[] args) 
    {
        int i, factoriza = 1;
        int numero = 5;
        for(i = 1; i<=5; i++)
        {
            factoriza = factoriza *i;
        }
        
        System.out.println("El factorial de "+ numero+ " Es "+ factoriza);
        /*String msg = "El factorial de ";
        msg += number +" es: " ;*/
    }
}
