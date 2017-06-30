
package javaadvanced.Miercoles;

public class TestJoin extends Thread {
   
    public void run(){
        for(int i = 1; i <= 5; i++)
        {
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),
                t3 = new TestJoin();
                
    }
}
