/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author lidiane
 */
public class JanelaBorder extends JFrame{
    private JButton bNorte, bSul, bLeste, bOeste, bCentro;
    public JanelaBorder(){
        bNorte = new JButton("Norte");
        bSul = new JButton("Sul");
        bLeste = new JButton("Leste");
        bOeste = new JButton("Oeste");
        bCentro = new JButton("Centro");
        
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        
        add(bCentro, BorderLayout.CENTER);
        add(bLeste, BorderLayout.EAST);
        add(bNorte, BorderLayout.NORTH);
        add(bSul, BorderLayout.SOUTH);
        add(bOeste, BorderLayout.WEST);
        
        setSize(500,500);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
