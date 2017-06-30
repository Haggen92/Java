
package javaadvanced.Viernes.socketsTres;

import java.net.InetAddress;

public class InetD 
{
    public static void main(String[] args) 
    {
        try 
        {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            
            System.out.println("Nombre del Host: "+ip.getHostName());
            System.out.println("Direccion: "+ip.getHostAddress());
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
