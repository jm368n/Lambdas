
package com.notec.pedidos;

import com.netec.pedido.enums.Paises;


public class PedidoMexico extends pedidos {

    @Override
    protected void calcularIVA() {
        this.pais = Paises.MEXICO.toString();
        importeIVA = importeSinIVA * Paises.MEXICO.getIva();
    }
      
}
