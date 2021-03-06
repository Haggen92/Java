
package javaadvanced.Viernes.socketDos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws IOException{
        System.out.println("ventana del servidor:");
        //Conexion del socket
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Textos
        String strCliente = "", strServidor = "";
        
        //Centinela
        while (!strCliente.equals("stop")) {
            strCliente = dis.readUTF();
            System.out.println("El cliente dice: "+strCliente);
            
            strServidor = br.readLine();
            dos.writeUTF(strServidor);
            dos.flush();
        }
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}
