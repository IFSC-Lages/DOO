/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.UsuarioModel;

/**
 *
 * @author lidiane
 */
public class UsuarioController {

    public void cadastraUsuarioController(String nome, String usuario, String senha) {
        if ((nome != null && nome.length() > 0) && (usuario != null && usuario.length() > 0) && (senha != null && senha.length() > 0)) {
            UsuarioModel novoUsuario = new UsuarioModel(nome, usuario, senha);
            novoUsuario.cadastrarUsuarioDAO(novoUsuario);
            JOptionPane.showMessageDialog(null, "Usuario Registrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }

    public ArrayList<UsuarioModel> listarUsuariosController() {
        UsuarioModel usuarios = new UsuarioModel();
        return usuarios.listaUsuarios();

    }

    public ArrayList<UsuarioModel> buscarUsuariosController(String nome) {
        UsuarioModel usuarios = new UsuarioModel();
        return usuarios.buscarUsuarios(nome);

    }

    public void alterarUsuario(String id, String nome, String usuario) {
        if ((id != null && id.length() > 0) && (nome != null && nome.length() > 0) && (usuario != null && usuario.length() > 0)) {
            int idNumerico = Integer.parseInt(id);
            UsuarioModel alteraUsuario = new UsuarioModel(nome, usuario, idNumerico);
            alteraUsuario.alterarUsuario(alteraUsuario);

            JOptionPane.showMessageDialog(null, "Usuario Registrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Informações Incorretas!");
        }
    }

    public void excluirUsuario(String id) {
        if ((id != null && id.length() > 0)) {
            int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o usuário!");
            if (i == JOptionPane.YES_OPTION) {
                int idNumerico = Integer.parseInt(id);
                UsuarioModel excluiUsuario = new UsuarioModel();
                excluiUsuario.excluirUsuario(idNumerico);   
            } else if (i == JOptionPane.NO_OPTION) {
                System.out.println("Clicou em Não");
            } else if (i == JOptionPane.CANCEL_OPTION) {
                System.out.println("Clicou em Cancel");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informações Incorretas!");
        }
    }
    
    public boolean logarUsuario (String login, String senha) throws SQLException{
     
        
        if ((login != null && login.length() > 0) && (senha != null && senha.length() > 0)) {
            UsuarioModel logaUsuario = new UsuarioModel();
            return logaUsuario.confereCredenciais(login, senha);
        } else {
            JOptionPane.showMessageDialog(null, "Informações Incorretas!");
            return false;
        }
    }
       
}
