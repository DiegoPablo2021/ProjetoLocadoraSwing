/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolocadoradeswing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;


/**
 *
 * @author Usuário
 */
public class FilmesDAO {

    FilmesDAO() {
        
    }
    public void adicionarFilme(Filmes filmes){
        String sql = "INSERT INTO filme (titulo, genero, data_de_lancamento) VALUES (?, ?, ?)";
        try (Connection conexao = ConexaoDBLocadora.conectaBanco();
                PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, filmes.getTitulo());
            ps.setString(2, filmes.getGenero());
            ps.setString(3, filmes.getData_de_lancamento());
            ps.execute();            
        }
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
    }
    
    public void alterarFilme(Filmes filmes){
        String sql = "UPDATE filme SET titulo = ?, genero = ?, data_de_lancamento = ? WHERE id = ? ";
        try (Connection conexao = ConexaoDBLocadora.conectaBanco();
                PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, filmes.getTitulo());
            ps.setString(2, filmes.getGenero());
            ps.setString(3, filmes.getData_de_lancamento());
            ps.setInt(4, filmes.getId());
            ps.execute();            
        }
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
    }
    
    public void apagarFilme(Filmes filmes){
        String sql = "DELETE FROM filme WHERE id = ? ";
        try (Connection conexao = ConexaoDBLocadora.conectaBanco();
                PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, filmes.getId());
            ps.execute();            
        }
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
    }
    
    private ConexaoDBLocadora conexaoDBLocadora;
    
    public FilmesDAO(ConexaoDBLocadora conexaoDBLocadora){
        this.conexaoDBLocadora = conexaoDBLocadora;
    }
    
    public ArrayList<Filmes> readAll(){
        try{
            String SQL = "SELECT * FROM filme ";
            PreparedStatement ps = conexaoDBLocadora.conectaBanco().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Filmes> lista = new ArrayList<Filmes>();
            
            while(rs.next()){
                Filmes fil = new Filmes();
                fil.setId(rs.getInt("ID"));
                fil.setTitulo(rs.getString("titulo"));
                fil.setGenero(rs.getString("genero"));
                fil.setData_de_lancamento(rs.getString("data_de_lancamento"));
                lista.add(fil);
            }
            ps.close();
            return lista;
        }
        catch(SQLException ex){
            System.out.println("Erro ao recuperar" + ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Erro ao recuperar" + ex.getMessage());
        }
        return null;
    }
}
