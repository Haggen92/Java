
package javaadvanced.Miercoles.Banco3;

public interface Bank {
    void TasaDeInteres();
}

class HSBC2 implements Bank{
    
    public void TasaDeInteres(){
        System.out.println("HSBC : 7%");
    }
}

class BanCoppel2 implements Bank{
    
    public void TasaDeInteres(){
        System.out.println("Bancoppel: 15%");
    }
}

class Bancomer2 implements Bank{
    
    public void TasaDeInteres(){
        System.out.println("Bancommer: 8%");
    }
}

class MostrarInteres{
    public static void main(String[] args) {
        Bank h,bc,b; 
        h = new HSBC2(); 
        bc = new BanCoppel2();
        b = new Bancomer2();
        
        h.TasaDeInteres();
        bc.TasaDeInteres();
        b.TasaDeInteres();
    }
}
