/*
    Se me cayo un arete mientras preparaba mi cafe en la taza con cafe y ese no se mojo
    ¿Por que?

    *Algoritmo
    *Clase encapsulada
    *Main
    *UML de capsulas
    *Programa
 */

package javaadvanced.Lunes.Poo;


public class Acertijo 
{
    public static void main(String[] args) 
    {
        show();
    }
    public static void show()
    {
        
        Taza taza = new Taza();
        Arete arete = new Arete();
        Cafe cafe = new Cafe();
        
        taza.setColor("rojo");
        taza.setTamaño("mediana");
        taza.setCapacidad(250);
        
        arete.setColor("azul");
        arete.setMaterial("plastico");
        arete.setTipo("broquel");
        arete.setTamaño(1);
        
        cafe.setMarca("");
        cafe.setTipo("grano");
        
        
        
        String msg ="Preparando el cafe en una ";
        msg += "taza color " +taza.getColor();
        msg += " y tamaño "+taza.getTamaño();
        msg += " con capacidad de "+taza.getCapacidad()+" ml";
        msg += " se me cayo un arete tipo "+arete.getTipo();
        msg += " color "+arete.getColor()+" de "+arete.getMaterial();
        msg += " de "+arete.getTamaño()+" cm";
        msg += " y no se mojo porque el cafe era de  "+cafe.getTipo()+"...";
        System.out.println(msg);
    }
}

class Taza
{
    String color;
    int capacidad;
    String tamaño;

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }
    
    
    
    public int getCapacidad() 
    {
        return capacidad;
    }

    public void setCapacidad(int capacidad) 
    {
        this.capacidad = capacidad;
    }

    
}

class Arete
{
    int tamaño;
    String color;
    String tipo;
    String material;
    String mojado;

    public String getMojado() {
        return mojado;
    }

    public boolean setMojado(String mojado) 
    {
        if(mojado.isEmpty())
        {
            this.mojado = mojado;
            return true;
        }
        else
        {
            return false;
        }
    }
    

    

    public int getTamaño() 
    {
        return tamaño;
    }

    public void setTamaño(int tamaño) 
    {
        this.tamaño = tamaño;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public String getMaterial() 
    {
        return material;
    }

    public void setMaterial(String material) 
    {
        this.material = material;
    }
   
}

class Cafe
{
    String tipo;
    String marca;

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }
    
}