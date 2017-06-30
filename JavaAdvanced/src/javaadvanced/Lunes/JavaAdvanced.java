/*
    La sentencia if no spermie evaluar desiciones simples o compuestas.
	-declaracion if
	-declaracion if-else
	-declaracion if anidada
*/
package javaadvanced.Lunes;

public class JavaAdvanced 
{
    static int edad = 20;
    public static void main(String args) 
    {
        /*if(edad > 18)
        {
            System.out.println("Es mayor de edad...");
        }
        else
        {
            System.out.println("Es menor de edad...");
        }*/
        String nombre;
        nombre = "Josue";
        
        if(!nombre.isEmpty())
        {
            System.out.println(nombre);
        }
        else
        {
            System.out.println("Esta vacio!...");
        }
    }
    
    public static void main(String[] args)
    {
        int calif = 70;
        if(calif < 70)
        {
            System.out.println("Recursa...");
        }
        else if(calif == 70)
        {
            System.out.println("Panzo...");
        }
        else
        {
            System.out.println("Aprobo...");
        }
    }
}
