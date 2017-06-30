/*
 Un hilo demonio en java es un hilo proveedor de servicios que proporcionan 
 servicios al hilo de usuario.
 Su vida depende de los demas hilos, es decir si todos los demas hilos se
 mueren la JMV lo termina automaticamente.
 
 Hay muchos hilos demonios en java que se ejectutan automaticamente.
 Garbage Collector, finalizer, etc.
 
 JConsole en el simbolo de sistema, proporciona la informacion sobre una de las
 clases cargadas, uso de memoria, ejecucion de hilos, etc.
 
 Puntos importantes.
 Un hilo en Java proporciona servicios a los hilos para brindar soporte a tareas
 en segundo plano.

 Su vida depende de los hilos de usuario

 Es un hilo de baja prioridad.

 Java.lang.Thread provee dos metodos para un demonio
 1.-public setDaemon(boolean status) es usado para marcar el hilo actual, 
    como hilo demonio
 2.-public boolean isDaemon() revisa si el hilo actual es un demonio.
 */
package javaadvanced.Jueves;

public class ThreadD extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Tenemos un demonio aqui");
        }
        else
        {
            System.out.println("Es un simple hilo de usuario");
        }
    }
    public static void main(String[] args) {
        ThreadD t1 = new ThreadD(),t2 = new ThreadD(),t3 = new ThreadD();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
