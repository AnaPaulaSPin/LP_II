/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celular;

import java.util.ArrayList;

public class Usuario {
  private String Login;
  private String senha;
  private int data;
  private ArrayList<Aplicativos> apps;
  
  
    public String getLogin() {
        return Login;
    }
    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public ArrayList<Aplicativos> getApps() {
        return apps;
    }
    public void setApps(ArrayList<Aplicativos> apps) {
        this.apps = apps;
    }
  
  
}
