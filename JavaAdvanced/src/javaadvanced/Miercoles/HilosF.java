
package javaadvanced.Miercoles;
/*
Hilo: Subproceso ligero, unidad pequeña de procesamiento. Es una via de 
ejecucion ejecucion separada.
Los hilos son independientes, si se produce una excepcion en un hilo no afecta
a los demas hilos y comparten un area en memoria comun.

Ventajas de usar hilos:
1.-No bloqueamos al usuario por que son tareas al mismo tiempo.
2.-Podemos realizar muchas tareas simultaneamente ahorrando tiempo.
3.-Los hilos al ser independientes no se afectan entre si, en caso de ocurrir,
una excepcion en un hilo los demas hilos funcionan igual.

Multitarea: Proceso de ejecucion de muchas tareas simultaneamente.
Usamos la multitarea en el CPU. Se logra de dos maneras:
1.-Multitarea basada en Procesos (Multiproceso).
    *Cada proceso tiene su propia diereccion en memoria, es decir, cada proceso
     asigna un area de memoria separada.
    *El proceso es pesado.
    *El costo de la comunicacion entre el proceso es alto.
    *Cambiar de un proceso a otro requiere de tiempo para guardar y cargar
     registros, mapas de memoria, listas de actualizacion.
2.-Multitarea basada en hilos (Multihilos).
    *Los hilos comparten los mismos espacios en memoria para direcciones.
    *El hilo es ligero.
    *El costo de comunicacion entre hilos es baja.
(Paralelismo)Multihilos
(Concurrencia)Es la propiedad de los sistemas para soportar multiples 
peticiones, auxiliandose de procesamiento y Multihilo logrando la Multitarea.

Ciclo de vida de un hilo.
    Un hilo puede encontrarse en uno de sus 5 estados.
    De acuyerdo con oracle solo hay 4 en el ciclo de ejecutables (Running) no
    existe.
    new, runnable, non-runnable and terminated.

    1.-New: El hilo esta en este estado, si se crea una instancia de la clase 
    Thread pero antes de invocacion de start()
    2.-Runnable: El hilo esta aqui, despues de la invocacion del metodo start(),
    despues de la ThreadScheduler (administrador de hilos) no lo ha seleccionado
    como el hilo en ejecucion.
    3.-Running: El hilo esta aqui cuando el TS lo ha seleccionado.
    4.-Non-Runnable: (Blocked): Es el estado cuando el hilo sigue activo, sin
    embargo no es apto para ejecutarse.
    5.-Terminated: Es el estado cuando el hilo ha finalizado, muerto, cuando 
    sale del metodo run()

Hay 2 formas de crear un hilo:
    1.-Al extender de la clase Thread.
    2.-Al implementar la interface Runnable.

Clase Thread
    Proporcionar los constructores y metodos para crear y realizar operaciones
    en un hilo. La clase Thread extiende de la clase Object e implementa la 
    interaccion Runnable.
    
Constrructores comunes de la clase Thread
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runable r, String name)

Runnable
    La interface Runnable debe ser implementada por cualquier clase cuyas 
    instancias esten destinadas a ser ejecutadas por un hilo.
    La interface Runnable tiene un solo metodo denominado run()
    public void run(): es usado para realizar la accion de un hilo.
*/
public class HilosF extends Thread {
    @Override
    public void run(){
        System.out.println("Hilo esta corriendo");
    }
    public static void main(String[] args){
        HilosF hilo = new HilosF();
        //Thread thread = new Thread(hilo);
        hilo.start();
    }
}

//Ejemplo de Runnable
class Hilos implements Runnable{

    @Override
    public void run() {
        System.err.println("El hilo de runnable esta corriendo");
    }
    public static void main(String[] args) {
        Hilos h = new Hilos();
        Thread t = new Thread(h);
        t.start();
    }
}

/*
Metodos Callbacks
public void run(){
    //Se utiliza para realizar la accion de un 
}

public void start() {
    //Inicia la ejecucion del hilo.
    //La JVM llama al metodo run() del hilo
}

public void sleep() {
    //Hace que el hilo actual ejecucion detenga 
    
}

public void join() {
    Regresa la prioridad del hilo
}

public int setPriority(){
    Cambia la prioridad del hilo
}

public String getName(){
    //Regresa el nombre del hilo
}

public String getName(){
    //Devuelve la referencia al hilo en ejecucion actual

public int getId(){
    //Devuelve el id del hilo
}

public Thread.State getState(){
    //regresa el estado actual del hilo
}

public boolean isAlive(){
    //prueba si el hilo esta vivo
}

public void yield(){
    //Hace qe el objeto del hilo actualmente
    //en ejecucion, se detenga temporalmente y
    //
}

public void suspend()
{
    //deprecado
    //para suspender el hilo
}

public void stop()
{
    //deprecado
    //se utiliza para detener el hilo
}

public boolean isDaemon(){
    //verifica si el hilo es un demonio
}

public void setDaemon(){
    //marca el hilo como un demonio
}

public void interrupt(){
    //interrumpe el hilo
}

public boolean interupted(){
    //verifica si el hilo se puede interrumpir
}

public static boolean interrupted(){
    //prueba si el hilo actual se ha interrumpido
}

*/
