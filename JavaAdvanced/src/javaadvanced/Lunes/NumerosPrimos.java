
package javaadvanced.Lunes;

public class NumerosPrimos 
{
    public static void main(String[] args) 
    {
        int i, m, flag = 0;
        int n=10;
        m=n/2;

        for(i=2; i<=m; i++)
        {
            if(n%i==0)
            {
                System.out.println("No es primo");
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {   
            System.out.print("Es primo");
        }
    }
    
    
    
}
