
package com.netec.pedido.enums;

public enum Paises {
  
    MEXICO(0.16f), ESPAÑA(0.21f), ARGENTINA(0.20f), FRANCIA(0.30f);
    
    private float Iva ;

    private Paises(float Iva) {
        this.Iva = Iva;
    }

    public float getIva() {
        return Iva;
    }

    public void setIva(float Iva) {
        this.Iva = Iva;
    }
    
    
}
