/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolocadoradeswing;

/**
 *
 * @author Usuário
 */
public class Filmes {
    
    private int id;
    private String titulo;
    private String genero;
    private String data_de_lancamento;

    public Filmes() {
    }
    
    

    public Filmes(int id ,String titulo, String genero, String data_de_lancamento) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.data_de_lancamento = data_de_lancamento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getData_de_lancamento() {
        return data_de_lancamento;
    }

    public void setData_de_lancamento(String data_de_lancamento) {
        this.data_de_lancamento = data_de_lancamento;
    }
    
    public String toString(){
        return id + " " +titulo+ " "+ genero+" " +data_de_lancamento;
    }
    
}
