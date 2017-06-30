/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes.Banco;

/**
 *
 * @author CC-07
 */
public class Banco {
    int getTazaDeInteres()
    {
        return 0;
    }
}

class Bancomer extends Banco{
    @Override
    int getTazaDeInteres()
    {
        return 8;
    }
}

class HSBC extends Banco
{
    @Override
    int getTazaDeInteres()
    {
        return 8;
    }
}

class Bancoppel extends Banco
{
    @Override
    int getTazaDeInteres()
    {
        return 9;
    }
}

class PruebaBanco
{
    public static void main(String[] args) {
        Bancomer b = new Bancomer();
        HSBC h = new HSBC();
        Bancoppel bc = new Bancoppel();
        
        System.out.println("Bancomer taza de interes: " +b.getTazaDeInteres());
        System.out.println("HSBC taza de interes: " +h.getTazaDeInteres());
        System.out.println("Bancoppel taza de interes: " +bc.getTazaDeInteres());
    }
}
