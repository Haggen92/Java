
package javaadvanced.Martes;
/*
    Firma o signatura de un metodo
    Es lo que permite distinguir sin ambigüedad a los metodos tanto en la
    declaracion como en la invocacion (Emision de mensajes) y contiene 3
    elementos:
    
        *El valor de retorno (tipo) : double
        *Nombre del metodo : pow
        *Numero, tipo y orden de los parametros : Math.pow(x,2) Math.pow(2,x)
    
    En la herencia ademas de producir una clase nueva basada en una antigua
    añadiendo caracteisticas adicionales (especializacion); puedes extender
    el comportamiento existente de la superclase.
     
    Si un metodo se define en la subclase de un modo que el nombre, el tipo de
    retorno y su lista de parametros coinciden exactamente con algun metodo
    de la clase ancestro, entonces ese nuevo metodo decimos que REDEFINE el
    comportamiento del antiguo.
    
    Los metodos con el mismo nombre, pero diferente lista de parametros dentro 
    de la misma clsae se consideran simplemente sobrecargados.
    Esto provoca que el compilador utilice los argumentos proporcionados en un
    mensaje para determinar cual metodo ha de llamar.
    
    To overload <- sobrecargar
    To override <- redefinir(sobremontar)
    To overwrite <- sobreescribir
    
    Override: Metodo con la misma asignatura en distintas clases 
    (de una jerarquia de herencia)

    Reglas para definir metodos
    1.-El tipo de retorno del metodo redefinido debe de ser identico al del 
    metodo que redefine.
    2.-Un metodo redefinido no puede ser menos accesible que un metodo al quye 
    redefine. superclase es publica, el redefinido no puede ser protected.
    3.-Un metodo redefinido no puede lanzar una excepcion diferente al metodo 
    que redefine.

    Diferencia entre sobrecarga y redefinicion.
    1.-La sobrecarga(overload) puede codificarse en una sola clase y la 
    redefinicion (override) requiere 2 o mas clsaes.
    2.-los metodos sobrecargados tienen distinta signatura.
    3.-Los metodos redefinidos tienen la misma signatura.
*/
//sobrecarga
public class Adder {
    //1.-Cambiando el numero de argumentos
    static int add(int a, int b)
    {
        return a+b;
    }
    
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    //2.-Cambiando el tipo de datos
    static int suma(int c, int d)
    {
        return c+d;
    }
    
    static double suma(double c, double d)
    {
        return c+d;
    }
    
    public static void main(String[] args) {
        //1.-Cambiando el numero de argumentos
        System.out.println(Adder.add(111, 222));
        System.out.println(Adder.add(111, 222,333));
        
        //2.-Cambiando el tipo de datos
        System.out.println(Adder.suma(11.1, 22.2));
        System.out.println(Adder.suma(15.1, 32.2));
        
    }
}
