package exercicio02;

import java.awt.BorderLayout;

public class Janela extends javax.swing.JFrame {
    private TelaCadastro telaA;  //Objeto do painel tela de cadastro.
    
    public Janela() {
        initComponents();
        
        this.telaA = new TelaCadastro();   //Inicializa o painel.
        
        this.setLayout(new BorderLayout());  //Define o layout do frame como borderlayout.
        this.add(this.telaA, BorderLayout.CENTER);  //Adiciona o painel ao frame, na posição central.
        this.pack();  //Redimensiona o frame para ficar de acordo com o conteúdo do painel.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
