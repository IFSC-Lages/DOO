/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.UsuarioModel;

/**
 *
 * @author lidiane
 */
public class UsuarioController {
    
    public void cadastraUsuarioController(String nome, String usuario, String senha){
        if((nome != null && nome.length()>0) && (usuario != null && usuario.length()>0) && (senha != null && senha.length()>0) ){
            UsuarioModel novoUsuario = new UsuarioModel(nome, usuario, senha);
            novoUsuario.cadastrarUsuarioDAO(novoUsuario);
            JOptionPane.showMessageDialog(null, "Usuario Registrado!");
        }else{
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }
    
    public ArrayList<UsuarioModel> listarUsuariosController(){
        UsuarioModel usuarios = new UsuarioModel();
        return usuarios.listaUsuarios();
        
    }
}
