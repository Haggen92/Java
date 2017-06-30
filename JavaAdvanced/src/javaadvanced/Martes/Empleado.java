
package javaadvanced.Martes;
/*
    Herencia: es un mecanismo que permite que un objeto adquiera todas las
    propiedades y comportamientos de un objeto padre.

    La idea de la herencia es que çpuedas crear nuevas clases a partir de las ya
    existentes.

    Existen diversas clasificaciones de relacion en la herencia.
    
    Relaciones entre clsaes: Asociacion, Composicion, Agregacion, Herencia.

    Hay un termino que perimite distinguir los distintos tipos de relaciones, 
    llamado ACOPLAMIENTO.
    
    -Medida de la dependencia qye hay entre 2 modulos, existen grados de 
    acoplamiento(bajo o alto).
    
    -Cada clase y metodo hace una sola cosa y la hace bien (COHESION). Numero
    de tareas quye tiene cada clase o metodo.
    
    Es deseable que 2 o mas modulos de un programa mantengan alta cohecion y
    bajo acoplamiento.

cohesion: que lo hace bien.
bajo acoplamiento: que no sea dependiente de otros.

    Relaciones entre clases:
    Asociacion (Es un): Cuando entre 2 o mas clases se da una interaccion que no 
    modifica en nada el comportamiento de los objetos antes o despues
    de terminada la relacion.

    La asociacion es un modo de interaccion entre objetos donde uno utiliza
    servicios de otro a corto plazo.

    La asociacion es una relacion de objetos debilmente acoplados.
    
    Agregacion (Tiene un): Es una relacion entre objetos que afecta el comportamiento
    entre ellos mientras que dura la relacion. Es decir, un objeto depende de
    los servicios de otro a largo plazo.

    Composicion: Cuando un objeto complejo usa otros objetos permanentemente.
    La composicion es una relacion entre objetos cuya escencia tiene sentido
    solo cuando ellos estan acoplados.
    Por ultimo podemos decir que la composicion es un tipo de agregacion a muy
    largo plazo.

    Herencia: Cuando un objeto tiene las caracteristicas de otro 
    permanentemente, tendremos una relacion entre objetos intimamente acoplados
    cuya existencia depende de un anscestro irrenunciablemente.
*/

//Relacion de Asociacion IS-A
public class Empleado 
{
    double salario = 40000;
}

class Programador extends Empleado
{
    int bono = 1000;
    
    public void main() 
    {
        Programador p = new Programador();
        System.out.println("El salario del programador es: "+p.salario);
        System.out.println("El bono del programador es: "+p.bono);
    }
    
    void mensaje()
    {
        System.out.println("Soy un programador");
        main();
    }
}
//Herencia simple Empleado a programador
//Herencia multinivel Empleado a programador - web
//Herencia jerarquica Empleado a programador y de empleado a web
class Web extends Programador
{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}
