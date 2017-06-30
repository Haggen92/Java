
package javaadvanced.Viernes.socketsTres;

import java.net.MalformedURLException;
import java.net.URL;

public class URLD {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://codigofacilito.com/articulos");
            
            System.out.println("Protocolo: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
        } catch (MalformedURLException mur) {
            mur.printStackTrace();
        }
    }
}
