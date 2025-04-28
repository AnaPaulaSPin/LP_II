package com.mycompany.faculdade;

import java.util.ArrayList;

public class Facul {
   private String nome;
   private int ano;
   private ArrayList<Curso> cursos;

   
   public Facul(String nome, int ano){
       this.nome = nome;
       this.ano = ano;
       this.cursos = new ArrayList<>();
   }
   
   

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
   
   
}
