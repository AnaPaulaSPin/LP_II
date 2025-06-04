
package com.mycompany.empresavisa;

public class Ouro extends Cartao{

    public Ouro(int codPrincipal, int CVV, int dataExpedicao, int validade) {
        super(codPrincipal, CVV, dataExpedicao, validade, 100000);
    }
    
}
