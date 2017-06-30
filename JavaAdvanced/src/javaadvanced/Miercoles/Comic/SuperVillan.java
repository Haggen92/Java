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
public class SuperVillan implements Ataques{

    @Override
    public void Ataca() {
        System.out.println("Ataca a SuperMan por sorpresa");
    }
    
    @Override
    public void Cryptonita() {
        System.out.println("Ataca con guantes de criptonita cryptonita");
    }

    @Override
    public void Dispara() {
        System.out.println("Dispara con arma de fuego pero no es efectivo");
    }
    
    @Override
    public void Derrota() {
        System.out.println("Lex cae al suelo inconciente...");
    }
    
    @Override
    public void AtaqueSorpresa(){
        System.out.println("Ataca a superman por sorpresa...");   
    }
    
    @Override
    public void Metralla(){
        System.out.println("Toma una metralleta y dispara contra SuperMan");
    }
    
}
