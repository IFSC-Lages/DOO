package exercicio02;

public class Contador extends javax.swing.JFrame {
    //Atributos
    int contador1, contador2, contador3;
    
    //Construtor
    public Contador() {
        initComponents();
        contador1 = 0;
        contador2 = 0;
        contador3 = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelContador = new javax.swing.JLabel();
        btnValor1 = new javax.swing.JButton();
        btnValor2 = new javax.swing.JButton();
        btnValor3 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contador");

        jLabelContador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelContador.setText("Contador de Cliques");

        btnValor1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnValor1.setText("1");
        btnValor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValor1MouseClicked(evt);
            }
        });

        btnValor2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnValor2.setText("2");
        btnValor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValor2MouseClicked(evt);
            }
        });

        btnValor3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnValor3.setText("3");
        btnValor3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValor3MouseClicked(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnImprimir.setText("Imprimir Resultado");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContador)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelContador)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnValor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Clique no botão 1;
    private void btnValor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValor1MouseClicked
        this.contador1++;
    }//GEN-LAST:event_btnValor1MouseClicked

    //Clique no botão 2;
    private void btnValor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValor2MouseClicked
        this.contador2++;
    }//GEN-LAST:event_btnValor2MouseClicked

    //Clique no botão 3;
    private void btnValor3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValor3MouseClicked
        this.contador3++;
    }//GEN-LAST:event_btnValor3MouseClicked

    //Clique no botão imprimir;
    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        System.out.println("Clique no botão 1: " + contador1);
        System.out.println("Clique no botão 2: " + contador2);
        System.out.println("Clique no botão 3: " + contador3 + "\n");
    }//GEN-LAST:event_btnImprimirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnValor1;
    private javax.swing.JButton btnValor2;
    private javax.swing.JButton btnValor3;
    private javax.swing.JLabel jLabelContador;
    // End of variables declaration//GEN-END:variables
}
