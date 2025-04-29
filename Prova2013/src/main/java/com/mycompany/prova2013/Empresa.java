package com.mycompany.prova2013;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Aplicativo> apps;
    private ArrayList<Usuario> users;
    
    public Empresa(String nome){
        this.nome = nome;
        this.apps = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public ArrayList<Aplicativo> getApps() {
        return apps;
    }
    public void setApps(ArrayList<Aplicativo> apps) {
        this.apps = apps;
    }


    public ArrayList<Usuario> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }         
}
