
package com.mycompany.empresavisa;


public class Compra {
    private String estabelicimento;
    private String endereco;
    private int data;
    private Cartao cartao;
    private float valor;
    private float pontos;

    public Compra(String estabelicimento, String endereco, int data, Cartao cartao, float valor) {
        this.estabelicimento = estabelicimento;
        this.endereco = endereco;
        this.data = data;
        this.cartao = cartao;
        this.valor = valor;
    }
    
    public int gerarPontos(){
        this.setPontos(cartao.calcularPontos() * this.getValor());
    }

    public String getEstabelicimento() {
        return estabelicimento;
    }

    public void setEstabelicimento(String estabelicimento) {
        this.estabelicimento = estabelicimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
}
