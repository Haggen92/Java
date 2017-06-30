/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Viernes.socketsTres;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author CC-07
 */
public class DReciever {
    public static void main(String[] args) throws Exception {
        System.out.println("Servidor");
        DatagramSocket ds = new DatagramSocket(300);
        byte[]b= new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,1024);
        
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println(dp);
        ds.close();
    }
}
