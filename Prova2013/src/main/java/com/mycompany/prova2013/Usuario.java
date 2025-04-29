package com.mycompany.prova2013;

import java.util.ArrayList;

public class Usuario {
    private String login;
    private int senha;
    private int dataAtivacao;
    private ArrayList<Aplicativo> apps;
    
    public Usuario(String login, int senha, int dataAtivacao){
        this.login = login;
        this.senha = senha;
        this.dataAtivacao = dataAtivacao;
        this.apps = new ArrayList<>();
    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }


    public int getDataAtivacao() {
        return dataAtivacao;
    }
    public void setDataAtivacao(int dataAtivacao) {
        this.dataAtivacao = dataAtivacao;
    }
    
    
    
}
