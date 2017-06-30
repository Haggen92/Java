//0,1,1,2,3,5,8,13,21,34
package javaadvanced.Lunes;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int i;
        int n1 = 0;
        int n2 = 1;
        int suma;
        System.out.print(n1+","+n2+",");
        
        for(i = 0; i <=10; i++)
        {
           suma = n1+n2; 
           System.out.print(suma+",");
           //suma+1; 
            
            n2= suma;
            n1=n1+i;
        }
        
    }
}
