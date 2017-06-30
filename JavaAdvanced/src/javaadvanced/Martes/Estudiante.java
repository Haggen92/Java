/*
    3 canciones .wav
    imagenes/gif
*/
package javaadvanced.Martes;
/*
    La palabra reservada static es usada para la administracion de memoria
    principalmente. Es aplicada a variables,metodos, bloques y clases anidadas.
    
    La palabra static pertenece a la clase que la instancia.

    Para variables: Se puede utilizar para referir una propiedad comun en 
    todos los objetos.
    La variable estatica obtiene memoria solo una vez en el area de la clase en
    el momento que se crea.
    
    Promueve la eiciencia en el rendimiento del programa
*/
public class Estudiante 
{
    int matricula;
    String nombre;
    static String universidad = "UAS";
    
    public Estudiante(int m, String n)
    {
        matricula = m;
        nombre = n;
    }
    
    void show()
    {
        System.out.println(matricula+" "+nombre+" "+universidad);
    }
    
    public static void main(String[] args) 
    {
        Estudiante s1 =  new Estudiante(111,"Josue");
        Estudiante s2 =  new Estudiante(112,"Jose");
        
        s1.show();
        s2.show();
    }
}
