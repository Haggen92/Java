/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *
 * @author CC-07
 */
class PruebaEstudiante
{
    //caso 5
    int dato = 5;
    
    PruebaEstudiante()
    {
        Student s5 = new Student(this);
        s5.s();
    }
    
    public static void main(String[] args) 
    {
        Student s1 = new Student(111, "Josue","UAS");
        Student s2 = new Student(111, "Jose","UAS");
        Student s3 = new Student(111, "Juan","UAS");
        
        Student s4 = new Student(111, "Juan","UAS",10);
        /*
        s1.display();
        s2.display();
        s3.display();*/

        s1.mensaje();
        s2.mensaje();
        s3.mensaje();
        //caso 4
        PruebaEstudiante ps1 = new PruebaEstudiante();
        ps1.despliega();
        
        //caso 5
        PruebaEstudiante ps2 = new PruebaEstudiante();
        
        //Caso 6
        new Student().getStudent().msg();
    }
    
    //caso 4
    void muestra(PruebaEstudiante obj)
    {
        System.out.println("Metodo es invocado");
    }
    //caso 4
    void despliega()
    {
        muestra(this);
    }
}
