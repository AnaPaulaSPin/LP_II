
package com.mycompany.celular;

import java.util.ArrayList;

 class Aplicativos {
    private String nome;
    private String objetivo;
    private int tamanho;
    private float preco;
    private ArrayList<Usuario> users;
    
    //criar aplicativo pago
    public Aplicativos(String nome, String objetivo, int tamanho, float preco ){
        this.nome = nome;
        this.objetivo = objetivo;
        this.tamanho = tamanho;
        this.preco = preco;
        
    }

    //criar aplicativo gratuito
    public Aplicativos(String nome, String objetivo, int tamanho ){
        this.nome = nome;
        this.objetivo = objetivo;
        this.tamanho = tamanho;
        this.preco = 0;
        
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ArrayList<Usuario> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }
    
    
} 
