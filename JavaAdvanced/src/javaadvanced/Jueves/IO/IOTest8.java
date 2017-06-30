
package javaadvanced.Jueves.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class IOTest8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\magic.txt");
        FileInputStream fis2 = new FileInputStream("C:\\magia.txt");
        
        FileOutputStream fos = new FileOutputStream("C:\\todos.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis,fis2);
        
        int i;
        while ((i=sis.read())!=-1) {
            fos.write(i);
            System.out.println((char)i);
        }
        close(fis,fis2,fos,sis);
        System.out.println("Ya...");        
        
    }
    private static void close(FileInputStream fis, FileInputStream fis2,
            FileOutputStream fos, SequenceInputStream sis) throws IOException {
            fis.close();
            fis2.close();
            fos.close();
            sis.close();
        }
}
