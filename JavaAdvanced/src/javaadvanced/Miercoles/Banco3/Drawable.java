
package javaadvanced.Miercoles.Banco3;

public interface Drawable {
    void draw();
}

class SuperHeroe implements Drawable{
    public void draw(){
        System.out.println("Dibujando a Superman");
    }
}

class SuperVillano implements Drawable{
    public void draw(){
        System.out.println("Dibujando a Lex Luthor");
    }
}

class Historia{
    public static void main(String[] args) {
        Drawable d,e; 
        d = new SuperHeroe(); 
        e = new SuperVillano();
        
        d.draw();
        e.draw();
    }
}
