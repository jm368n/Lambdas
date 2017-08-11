
package com.notec.pedidos;

public class Usuario {
    public static void main(String[] args) {
        pedidos pedidoMexico= new PedidoMexico();
        pedidoMexico.setImporteSinIVA(10000);
        pedidoMexico.calcularPrecioConIVA();
        pedidoMexico.visualiza();
        
        pedidos pedidoEspana= new PedidoEspana();
        pedidoEspana.setImporteSinIVA(10000);
        pedidoEspana.calcularPrecioConIVA();
        pedidoEspana.visualiza();
    }
    
}
