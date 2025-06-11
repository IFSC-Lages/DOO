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

    public void inserirUsuarioBD(UsuarioModel usuario) {
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

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
        }
    }

    public ArrayList<UsuarioModel> listarTodosUsuarios() {
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

            if (rs != null) {
                listaUsuarios = new ArrayList<>();
                while (rs.next()) {
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
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão!");
            }
        }

        return listaUsuarios;
    }

    public ArrayList<UsuarioModel> buscarUsuarios(String nome) {
        Connection conn = null;
        PreparedStatement stmt = null;
        UsuarioModel usuario = null;
        ArrayList<UsuarioModel> listaUsuarios = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM usuario WHERE nome LIKE '%" 
                + nome + "%' ORDER BY nome";

        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null) {
                listaUsuarios = new ArrayList<>();
                while (rs.next()) {
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
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão!");
            }
        }
        return listaUsuarios;
    }

    public void alterarUsuario(UsuarioModel usuarioAjuste) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE usuario SET nome = ?, usuario = ? WHERE idusuario = ?";
        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioAjuste.getNome());
            stmt.setString(2, usuarioAjuste.getUsuario());
            stmt.setInt(3, usuarioAjuste.getId());
            stmt.execute();
            System.out.println("Alteração de registro realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao atualizar os dados!");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão!");
            }
        }
    }

    public void excluirUsuario(int idusuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
//        ResultSet rs = null;

        String sql = "DELETE FROM usuario WHERE idusuario = " + idusuario;
        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("Exclusão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao excluir os dados!");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão!");
            }
        }
    }

    public boolean conferirUsuario(String login, String senha) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        // SQL Injection: seu SQL está vulnerável! Vamos corrigir logo abaixo.
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";

        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);

            // Protegendo os dados contra SQL Injection
            stmt.setString(1, login.trim()); // Para evitar espaços indesejados digitados pelo usuário
            stmt.setString(2, senha.trim());

            rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Acesso liberado");
                return true;
            } else {
                System.out.println("Acesso negado");
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar os dados!");
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão!");
            }
        }
    }
}
