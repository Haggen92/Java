
package javaadvanced.Jueves.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
La clase Java BufferedOutputStream se utiliza para almacenar en un buffer un
stream de salida. Internamente utiliza un buffer para almacenar datos 
directamente en un stream.
Añade mas eficiencia que escribir datos de manera directa en un flujo.
Por lo tanto logran un mejor rendimiento.

Tiene 2 constructores :
    BufferedOutputStream(OutputStream os);
        Crea un nuevo flujo de salida almacenando en buffer. Que se utiliza para
        describir los datos en el stream especificado.
    BufferedOutputStream(OutputStream os, int size)
        Crea un nuevo flujo de salida que sera almacenado en buffer el cual se 
        utiliza para escribir los datos en el stream especificando el tamaño del
        buffer.

Metodos:
    void write(int b): Escribe el byte especificado en el stream de salida 
    almacenado en buffer.
    
    void write(byte[] b, int off, int len): Escribe la secuencia de los bytes
    de la secuencia de stream de bytes especificada en un arreglo de nytes.
    Comienza con el desplazamiento dado.
    
    voud flush(): Borra el flujo de salida almacenado en buffer.
    Vacia los datos de una secuencia y la envia a otros. Se necesita si se ha
    conectado una secuencia con otra.
*/
public class IOTest5 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\magic.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            
            String s = "Hola \n a todos";
            byte[]b = s.getBytes();
            
            bout.write(b);
            bout.flush();
            
            bout.close();
            fos.close();
            
            System.out.println("Listo");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
