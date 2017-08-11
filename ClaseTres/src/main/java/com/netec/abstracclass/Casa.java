
package com.netec.abstracclass;

public class Casa {
    public static void main(String[] args) {
        Electrodomestico televisor = new Electrodomestico() {
            @Override
            public void encender() {
                System.out.println("Encender TV");
            }

            @Override
            public void apagar() {
                System.out.println("Apagar TV");
            }
        };
    }
    
}
