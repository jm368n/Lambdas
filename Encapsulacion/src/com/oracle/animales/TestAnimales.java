/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.animales;

class Animal{
    String nombre;
    
    public Animal (String nombre)
    {
        this.nombre=nombre;
    }
    
    Animal reproducirse(Animal a)
    {
        Animal hijo = new Animal(nombre);
        return hijo;
    }

}

class Gato extends Animal
{

    
    public Gato(String nombre)
    {
    super(nombre);
    }
    
    @Override
    Animal reproducirse(Animal animal) {
        Gato gato = null;
        if(!(animal instanceof Gato))
        {
            System.out.println("No se puede reproducir");            
        }
        else
        {
        gato = new Gato ("Gato bebe");
        }
        return gato;
        
    }
}


class Perro extends Animal
{
    public Perro (String nombre)
    {
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal a) {
        return new Animal("soy un perro");
    }
}
public class TestAnimales {
    
    public static void main(String args[])
    {
        Perro p = new Perro ("Scobiduu");
        Gato g = new Gato ("Benito");
        
        System.err.println("Nuevo hijo" + p.reproducirse(p));
        
    }
    
}
