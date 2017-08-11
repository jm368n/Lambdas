/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulacion;

/**
 *
 * @author Cisco
 */
public class empleado {
    
    private String nombre ;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void setEdades (int edad)
    {
        if(edad < 0)
        {
            System.out.println("Edad no permitida");
        }
        else
        {
            if(edad>100)
            {
                System.out.println("Edad no permitida");
            }
            else
            {
                this.edad=edad;
            }
        }
    }
    
    
}
