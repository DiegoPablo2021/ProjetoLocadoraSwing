/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolocadoradeswing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuário
 */
public class AdministradorDAO {
    
    public boolean isUser(Administrador administrador) throws Exception {
        String sql = "select * from usuario where login = ? and senha = ? ";
        try (Connection conexao = ConexaoDBLocadora.conectaBanco();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, administrador.getLogin());
            ps.setString(2, administrador.getSenha());
            try (ResultSet rs = ps.executeQuery()){
               return rs.next();
            }
        }
    }
}
