package com.mycompany.prova2013;

import java.util.ArrayList;

public class Aplicativo {
    private String nome;
    private String objetivo;
    private int tamanho;
    private float preco;
    private ArrayList<Usuario> users;
    
    public Aplicativo(String nome, String Objetivo, int tamanho, float preco){
        this.nome = nome;
        this.objetivo = objetivo;
        this.tamanho = tamanho;
        this.preco = preco;
        this.users = new ArrayList<>();
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
