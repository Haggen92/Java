/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaadvanced.Miercoles.Comic;

/**
 *
 * @author CC-07
 */
public class SuperHero implements Poderes {

    @Override
    public void Ataca() {
        System.out.println("Ataca a superman por sorpresa...");
    }

    @Override
    public void Esquiva() {
        System.out.println("Esquiva y evita la cryptonita");
    }

    @Override
    public void Contrataca() {
        System.out.println("SuperMan contra ataca a Lex");
    }

    @Override
    public void Derrota() {
        System.out.println("Contra ataca y derrota al villano Lex Luthor");
    }
}
