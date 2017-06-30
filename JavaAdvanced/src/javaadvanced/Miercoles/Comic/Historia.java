
package javaadvanced.Miercoles.Comic;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Historia extends Thread {

    
    public void run(){
        
    }
    public static void main(String[] args) {
        Historia h = new Historia();
        h.start();
        
        HiloS h2 = new HiloS();
        Thread th1 = new Thread(h2);
        th1.start();
        
       
        

    }

    void showImage(String img) {
        String imagen = img;
        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadImageApp(imagen));
        f.pack();
        f.setVisible(true);
    }
}

class HiloS implements Runnable {
    SuperHero sh = new SuperHero();
    SuperVillan sv = new SuperVillan();
    Historia h = new Historia();
    String imagen = "codigo.png";
    JFrame f = new JFrame("Load Image Sample");
    
    @Override
    public void run() {
        try
        {   sv.Ataca();
            h.showImage("C:\\Users\\CC-07\\Desktop\\cursoJavaAdvanced\\comic\\lexluthor.jpg");
            Thread.sleep(1000);
            sh.Contrataca();
            h.showImage("C:\\Users\\CC-07\\Desktop\\cursoJavaAdvanced\\comic\\superman.jpg");
            Thread.sleep(2500);
            sv.Cryptonita();
            h.showImage("C:\\Users\\CC-07\\Desktop\\cursoJavaAdvanced\\comic\\criptonita.jpg");
            Thread.sleep(1000);
            sh.Esquiva();
            h.showImage("C:\\Users\\CC-07\\Desktop\\cursoJavaAdvanced\\comic\\esquiva.jpg");
            Thread.sleep(2000);
            sv.AtaqueSorpresa();
            h.showImage("C:\\Users\\CC-07\\Desktop\\cursoJavaAdvanced\\comic\\ataqueSorpresa.jpg");
            Thread.sleep(1000);
            sv.Metralla();
            h.showImage("C:\\Users\\CC-07\\Desktop\\cursoJavaAdvanced\\comic\\metralla.jpg");
            Thread.sleep(2000);
            sh.Derrota();
            Thread.sleep(1000);
            sv.Derrota();
            h.showImage("C:\\Users\\CC-07\\Desktop\\cursoJavaAdvanced\\comic\\inconciente.jpg");
        } catch(InterruptedException ie){
            System.out.println(ie);
        }
        
    }
}


