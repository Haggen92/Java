
package javaadvanced.Martes;
/*
    Es una variable de autorferencia.
    This tiene 6 usos en Java:
        *This se usa para referir a la variable de instancia de la clase actual.
        *This para invocar el metodo de una calse actual.
        *This() para invocar al constructor de una calse (actual).
        *This puede ser pasado como argumento en la llamada a un metodo.
        *This puede pasar como argumento en la llamada l constructor.
        *This se puede utilizar para devolver la instancia de la clase actual
            del metodo.
*/
public class Student 
{
    int matricula;
    String nombre;
    String universidad;
    
    //caso 6
    public Student()
    {
        
    }
    
    void msg()
    {
        System.out.println("Soy un mensaje");
    }
    Student getStudent()
    {
        return this;
    }
    
    //caso 5
    PruebaEstudiante obj;
    
    public Student(PruebaEstudiante obj)
    {
        this.obj = obj;
    }
    
    void s()
    {
        System.out.println(obj.dato);
    }
    /*
    //caso 3
    public Student()
    {
        
        System.out.println("Soy el constructor por default");
    }*/
    
    //caso 3
    public Student(int matricula, String nombre, String universidad,int a)
    {
        //this();
        this(matricula, nombre, universidad);
        System.out.println(matricula+nombre+universidad+a);
    }
    
    public Student(int matricula,String nombre, String universidad)
    {
        //this caso 1
        this.matricula = matricula;
        this.nombre = nombre;
        this.universidad = universidad;
    }
    
    void display()
    {
        String msg = "La matricula es: "+matricula;
        msg+="\n El nombre es: "+nombre;
        msg+="\n La universidad es: "+universidad;
        
        System.out.println(msg);
    }
    //this caso 2
    void mensaje()
    {
        System.out.println("Soy un mensaje");
        this.display();
        
    }
    
    
}


