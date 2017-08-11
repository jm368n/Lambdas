
package com.netec.abstracclass;

public class TestCasa {
    public static void main(String[] args) {
        Electrodomestico television = new Television();
        Electrodomestico lavadora = new Lavadora();
        
        LineaBlanca lavadoraMabe = new Lavadora();
        LineaBlanca televisionEkt = new Television();
        
        television.encender();
        television.apagar();
        
        lavadora.encender();
        lavadora.apagar();
        
        
    }
}
