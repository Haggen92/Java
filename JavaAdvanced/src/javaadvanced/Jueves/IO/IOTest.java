
package javaadvanced.Jueves.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/*
Java I/O
Entrada y Salida

Se utiliza para procesar la entrada y salida.
En java se utiliza el concepto Stream (flujo) para hacer que las operaciones de
E/S sean rapidas.

El paquete java.io contiene todas las clases necesarias para realizar 
operaciones de entrada y salida.

Podemos realizar el manejo de archivos a traves de Java I/O API

Stream
    Es un flujo de datos, que esta compuesto por byte. Se llama stream por que 
    es como un flujo de agua que sigue corriendo.

    En java existen 3 stream que se crean para nuestro uso automaticamente.
    
    1.-System.out: flujo de salida estandar
    2.-System.in: flujo de entrada estandar
    1.-System.err: flujo de errores estandar

    System.out.print("Error");
    System.err.print("Error";
    
    OutputStream vs InputStream
Imput: Lee
Output: Escribe
*/
public class IOTest {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\hola.txt");
            fos.write(65);
            fos.close();
        }catch(IOException ie){
            System.out.println(ie);
        }
    }
}
