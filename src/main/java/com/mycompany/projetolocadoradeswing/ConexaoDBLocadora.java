/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolocadoradeswing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuário
 */
public class ConexaoDBLocadora {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "LocadoraBD";
    private static String usuario = "root";
    private static String senha = "1234";
    
     public static Connection conectaBanco(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://"+host+":"+porta+"/"+db, usuario, senha);
            return c;
        }catch (SQLException e){
            return null;
        }
    }
}
