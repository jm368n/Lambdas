
package com.notec.pedidos;

import com.netec.pedido.enums.Paises;


public class PedidoEspana extends pedidos{

    @Override
    protected void calcularIVA() {
        importeIVA = importeSinIVA * Paises.ESPAÑA.getIva();
        this.pais = Paises.ESPAÑA.toString();
    }
    
    
    
}
