/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes.Poo;

/**
 *
 * @author CC-07
 */
class MountainBike
{
    int velocidad;
    String color;
    
    public int getVelocidad()
    {
        return velocidad;
    }
    
    public boolean setVelocidad(int velocidad)
    {
        if(velocidad > 0)
        {
            this.velocidad = velocidad;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String getColor()
    {
        return color;
    }
    
    public boolean setColor(String color)
    {
        if(!color.isEmpty())
        {
            this.color = color;
            return true;
        }
        else
        {
            return false;
        }
    }
}
