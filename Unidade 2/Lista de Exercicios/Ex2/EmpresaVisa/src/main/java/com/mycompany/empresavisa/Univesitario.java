
package com.mycompany.empresavisa;

public class Univesitario extends Cartao {
    private String instituicao;

    public Univesitario(String instituicao, int codPrincipal, int CVV, int dataExpedicao, int validade) {
        super(codPrincipal, CVV, dataExpedicao, validade,300);
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    } 
}
