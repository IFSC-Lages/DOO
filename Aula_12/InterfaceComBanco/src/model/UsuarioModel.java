/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.UsuarioBanco;
import java.util.ArrayList;

/**
 *
 * @author lidiane
 */
public class UsuarioModel {
    private int id;
    private String nome;
    private String usuario;
    private String senha;

    // construtures
    public UsuarioModel() {
    }

    public UsuarioModel(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    //getter e setters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setID(int id) {
        this.id = id;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrarUsuarioDAO(UsuarioModel usuario){
        UsuarioBanco novoUsuario = new UsuarioBanco();
        novoUsuario.inserirUsuarioBD(usuario);
        System.out.println("Dados enviados para o banco de dados!");
        
    }
    
    public ArrayList<UsuarioModel> listaUsuarios(){
        return new UsuarioBanco().listarTodosUsuarios();
    }
    
    
}
