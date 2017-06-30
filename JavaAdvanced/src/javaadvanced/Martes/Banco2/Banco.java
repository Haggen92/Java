
package javaadvanced.Martes.Banco2;

public class Banco {
    double getTasaDeInteres()
    {
        return 0;
    }
}


class Bancomer extends Banco
{
    double getTasaDeInteres()
    {
        return 7.3;
    }
}

class HSBC extends Banco
{
    double getTasaDeInteres()
    {
        return 9.7;
    }
}

class BanCoppel extends Banco
{
    double getTasaDeInteres()
    {
        return 9.7;
    }
}

class TestP
{
    public static void main(String[] args) {
        Banco b;
        
        b = new Bancomer();
        System.out.println("La tasa de interes  "
        +"de Bancomer es: "+b.getTasaDeInteres());
        
        b = new HSBC();
        System.out.println("La tasa de interes  "
        +"de HSBC es: "+b.getTasaDeInteres());
        
        b = new BanCoppel();
        System.out.println("La tasa de interes  "
        +"de BanCoppel es: "+b.getTasaDeInteres());
    }
}