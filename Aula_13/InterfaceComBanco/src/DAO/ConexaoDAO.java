/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;

/**
 *
 * @author lidiane
 */
public class ConexaoDAO {
    //método responsável por estabelacer a conexão com o banco
    public static Connection conectorBD(){
        java.sql.Connection conexao = null;
        //chama o driver para conectar
        String driver = "com.mysql.jdbc.Driver";
        
        //informações referentes ao banco de dados
        String url = "jdbc:mysql://localhost:3306/bancojava";
        String user = "root";
        String password = "123456";
        
        //estabelecendo a conexao com o banco de dados
        try {
            Class.forName(driver); // executa o arquivo de driver
            conexao = DriverManager.getConnection(url, user, password); // obtem a conexao
            return conexao;  // retorna a conexao
        } catch (Exception e) {
            return null; // caso ocorra algum erro
        }
    }
}
