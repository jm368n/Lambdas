
package com.netec.abstracclass;

//IS-A
public class Television extends LineaBlanca {

    //HAS-A
    public ControlRemotoUniversal controlRemoto;
    
    @Override
    public void tareaDomestica() {
        System.out.println("Ver Netflix");
    }

    @Override
    public void encender() {
        System.out.println("Encender como TV");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar como TV");
    }

   
    
}
