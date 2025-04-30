
package com.mycompany.celular;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Usuario> users;
    private ArrayList<Aplicativos> apps;


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public ArrayList<Usuario> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }

    
    public ArrayList<Aplicativos> getApps() {
        return apps;
    }
    public void setApps(ArrayList<Aplicativos> apps) {
        this.apps = apps;
    }
    
    
}
