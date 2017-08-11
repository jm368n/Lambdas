/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.bean;

/**
 *
 * @author Cisco
 */
public class Persona {
    
    Persona padre;
    Persona madre;
    
    String nombre;
    char sexo;
    
    
    public Persona reproducirse(Persona p)
    {
        Persona hijo = null;
                
            if(p != null && this.sexo != p.sexo)
            {
                    hijo = new Persona();
            switch (sexo) {
                case 'F':
                    hijo.madre=this;
                    hijo.padre=p;
                    break;
                case 'M':
                    hijo.madre=p;
                    hijo.padre=this;
                    break;
                default:
                    System.out.println("Falta sexo opuesto");
                    break;
            }
            }else{
                System.err.println("No pueden hacer bebes");
                    }
            
            
        
            
        
        
        
        return hijo;
    }
}
