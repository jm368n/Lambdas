
package com.notec.pedidos;

public abstract class pedidos {
    
    protected double importeSinIVA;
    protected double importeIVA;
    protected double importeConIVA;
    protected String pais;
    
    protected abstract void calcularIVA();
    
    public void calcularPrecioConIVA()
    {
        this.calcularIVA();
        importeConIVA = importeSinIVA + importeIVA;
        
    }
    
    public void setImporteSinIVA(double importeSinIVA)
    {
        this.importeSinIVA = importeSinIVA;
    }
    
    public void visualiza()
    {
        System.out.println("Pedido");
        System.out.println("Importe sin IVA " + importeSinIVA);
        System.out.println("Importe con IVA"  +importeConIVA);
    }
    
   
    
}
