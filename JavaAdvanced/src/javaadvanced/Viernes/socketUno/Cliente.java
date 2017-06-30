
package javaadvanced.Viernes.socketUno;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 
*/
public class Cliente {
    public static void main(String[] args) {
        try{
            System.out.println("ventana cliente");
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hola Servidor!!!");
            dout.flush();
            dout.close();
            s.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
