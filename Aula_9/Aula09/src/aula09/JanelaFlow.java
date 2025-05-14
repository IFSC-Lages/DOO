/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author lidiane
 */
public class JanelaFlow extends JFrame {
    
    private JButton bPrimeiro, bSegundo, bTerceiro;
    public JanelaFlow(){
        bPrimeiro = new JButton("Primeiro");
        bSegundo = new JButton("Segundo");
        bTerceiro = new JButton("Terceiro");
        
        FlowLayout flow = new FlowLayout();
      //  flow.setAlignment(FlowLayout.LEFT); // Alinha a Esquerda
        setLayout(flow);
        
        add(bPrimeiro);
        add(bSegundo);
        add(bTerceiro);
        
        setSize(400,150);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
