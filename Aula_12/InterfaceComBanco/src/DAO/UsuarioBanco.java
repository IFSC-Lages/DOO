/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author lidiane
 */
public class UsuarioBanco {
    public void inserirUsuarioBD(UsuarioModel usuario){
        String sql = "INSERT INTO USUARIO(nome, usuario, senha) VALUES(?, ?, ?)";
        Connection connection = null;
        PreparedStatement stmt = null;
        
        try {
            connection = new ConexaoDAO().conectorBD();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getSenha());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos no banco com sucesso!");
            
        }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco");
        }finally{
            try{
               if(stmt != null){
                   stmt.close();
               } 
            }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
        }
    }
    public ArrayList<UsuarioModel> listarTodosUsuarios(){
        Connection conn = null;
        PreparedStatement stmt = null;
        UsuarioModel usuario = null;
        ArrayList<UsuarioModel> listaUsuarios = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM usuario";
        
        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            if(rs != null){
                listaUsuarios = new ArrayList<>();
                while(rs.next()){
                    usuario = new UsuarioModel();
                    usuario.setID(rs.getInt("idusuario"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setUsuario(rs.getString("usuario"));
                    listaUsuarios.add(usuario);
                }
            }
            System.out.println("Dados coletados com sucesso!"); 
       } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar os dados!");
        }finally{
            try{
               if(stmt != null){
                   stmt.close();
               } 
            }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
        }
        
        return listaUsuarios;
    } 
}
