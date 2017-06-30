
package javaadvanced.Miercoles;

public interface SuperHeroe {
    void Poderes();
    void Nombre();
}

class SuperMan implements SuperHeroe{
    @Override
    public void Poderes(){
        System.out.println("Volar");
    }
    @Override
    public void Nombre() {
        System.out.println("SuperMan: Clark Kent");
    }
}

class Hulk implements SuperHeroe{

    @Override
    public void Poderes() {
        System.out.println("Super Fuerza");
    }

    @Override
    public void Nombre() {
        System.out.println("Hulk: Bruce Banner");
    }
}

class Deadpool implements SuperHeroe{

    @Override
    public void Poderes() {
        System.out.println("Regeneracion");
    }

    @Override
    public void Nombre() {
        System.out.println("Deadpool");
    }
}

class SuperHeroeTest{
    public static void main(String[] args) {
        SuperHeroe s,h,d;
        s = new SuperMan(); 
        h = new Hulk();
        d = new Deadpool();
        
        s.Nombre();
        s.Poderes();
        
        h.Nombre();
        h.Poderes();
        
        d.Nombre();
        d.Poderes();
    }    
}
