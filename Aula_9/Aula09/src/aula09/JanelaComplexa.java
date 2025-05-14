/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lidiane
 */
// Classe que estende JFrame, ou seja, cria uma janela gráfica personalizada
public class JanelaComplexa extends JFrame {
    // Declaração dos botões e do painel onde eles serão inseridos
    private JButton b1, b2, b3, b4;
    private JPanel painelBotao;
    
    // Construtor da classe, onde os componentes da janela são configurados
    public JanelaComplexa(){
        // Criação dos botões com seus respectivos textos
        b1 = new JButton("Botão 1");
        b2 = new JButton("Botão 2");
        b3 = new JButton("Botão 3");
        b4 = new JButton("Botão 4");
        
        // Criação do painel onde os botões serão organizados
        painelBotao = new JPanel();
        // Define o layout do painel como GridLayout com:
        // 1 linha, 4 colunas, espaçamento horizontal de 5px e vertical de 2px
        painelBotao.setLayout(new GridLayout(1,4, 5, 2));
        
        // Adiciona os botões ao painel
        painelBotao.add(b1);
        painelBotao.add(b2);
        painelBotao.add(b3);
        painelBotao.add(b4);
        
        // Define a cor de fundo do painel como azul
        painelBotao.setBackground(Color.BLUE);
        
        // Define o layout da janela principal como BorderLayout (padrão com 5 regiões)
        setLayout(new BorderLayout());
        
        // Adiciona o painel de botões à parte superior (NORTH) da janela
        add(painelBotao, BorderLayout.NORTH);
        
        setSize(400,300);
        
        // Define que o programa será finalizado quando a janela for fechada
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
