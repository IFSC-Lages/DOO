/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.UsuarioBanco;
import java.sql.SQLException;
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

    public UsuarioModel(String nome, String usuario, int id) {
        this.nome = nome;
        this.usuario = usuario;
        this.id = id;
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

    public void cadastrarUsuarioDAO(UsuarioModel usuario) {
        UsuarioBanco novoUsuario = new UsuarioBanco();
        novoUsuario.inserirUsuarioBD(usuario);
        System.out.println("Dados enviados para o banco de dados!");

    }

    public ArrayList<UsuarioModel> listaUsuarios() {
        return new UsuarioBanco().listarTodosUsuarios();
    }

    public ArrayList<UsuarioModel> buscarUsuarios(String nome) {
        return new UsuarioBanco().buscarUsuarios(nome);
    }

    public void alterarUsuario(UsuarioModel usuarioAjuste) {
        UsuarioBanco ajusteUsuario = new UsuarioBanco();
        ajusteUsuario.alterarUsuario(usuarioAjuste);
        System.out.println("Dados atualizados!");
    }

    public void excluirUsuario(int idNumerico) {
        UsuarioBanco excluiUsuario = new UsuarioBanco();
        excluiUsuario.excluirUsuario(idNumerico);
        System.out.println("Dados excluidos!");
    }

    public boolean confereCredenciais(String login, String senha) throws SQLException {
        UsuarioBanco confereUsuario = new UsuarioBanco();
        if (confereUsuario.conferirUsuario(login, senha)) {
            System.out.println("Acesso concedido!");
            return true;
        }
            System.out.println("Acesso NEGADO!");
        return false;

    }
}
