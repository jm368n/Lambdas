package com.netec.persona;

public class PersonaImpl implements IPersona
{

    @Override
    public void comer(String comida) {
        
    }

    @Override
    public void reproducirse(String persona) {
        
    }
    
    public void caminar(String calle)
    {
        System.out.println("Caminando por la calle " + calle);
    }
    
    public  static void main(String[] args) {
        IPersona persona =new PersonaImpl();
        
    }
    
    
    
}
