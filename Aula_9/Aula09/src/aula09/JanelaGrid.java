/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author lidiane
 */
public class JanelaGrid extends JFrame{
    private JButton bPrimeiro, bSegundo, bTerceiro, bQuarto, bQuinto, bSexto; //Declara todos os botões(painéis) que serão utilizados na utilizados na aplicação.

    public JanelaGrid(){
        bPrimeiro = new JButton("Primeiro");
        bSegundo = new JButton("Segundo");
        bTerceiro = new JButton("Terceiro");
        bQuarto = new JButton("Quarto");
        bQuinto = new JButton("Quinto");
        bSexto = new JButton("Sexto");
        // Inicializa o painel que será mostrado.
        GridLayout gl = new GridLayout(2,3,10,10); //(linhas, colunas, espaco entre colunas, espaco entre linhas )
     
        setLayout(gl);
        
        add(bPrimeiro);
        add(bSegundo);
        add(bTerceiro);
        add(bQuarto);
        add(bQuinto);
        add(bSexto);
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
