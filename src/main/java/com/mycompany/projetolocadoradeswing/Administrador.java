/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolocadoradeswing;

/**
 *
 * @author Usuário
 */
public class Administrador {
    
    private int id;
    private String login;
    private String nome;
    private String senha;

    public Administrador() {
        
    }
    
    public Administrador(String login, String senha) {
        this.login = login;
        this.senha = senha;
        
    }
    
   
    public Administrador(int id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
