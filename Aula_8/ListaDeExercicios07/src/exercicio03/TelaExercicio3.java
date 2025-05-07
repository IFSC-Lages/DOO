package exercicio03;

import java.awt.event.KeyEvent;

public class TelaExercicio3 extends javax.swing.JFrame {
    public TelaExercicio3() {
        initComponents();
        jp_dados.setVisible(false);  //Esconde o painel do formulário.
        this.setSize(480, 205);      //Redimensiona a janela.
        bt_enviar.setEnabled(false); //Desabilita o botão enviar.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelVerificador = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jTextFildIdade = new javax.swing.JTextField();
        jLabelVoce = new javax.swing.JLabel();
        jLabelResposta = new javax.swing.JLabel();
        jLabelAoAlistamento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jp_dados = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        rb_voluntario = new javax.swing.JRadioButton();
        jRadioButtonVoluntario = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        bt_cancelar = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(465, 370));

        jLabelVerificador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelVerificador.setText("Verificador de Alistamento Militar");

        jLabelIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdade.setText("Idade:");

        jTextFildIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFildIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFildIdadeKeyPressed(evt);
            }
        });

        jLabelVoce.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelVoce.setText("Você está");

        jLabelResposta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelResposta.setText("<resposta>");

        jLabelAoAlistamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAoAlistamento.setText("ao alistamento militar.");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEndereco.setText("Endereço:");

        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jTextFieldCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstado.setText("Estado:");

        jTextFieldEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup1.add(rb_voluntario);
        rb_voluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_voluntario.setText("Voluntário");

        buttonGroup1.add(jRadioButtonVoluntario);
        jRadioButtonVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonVoluntario.setText("Não Voluntário");

        javax.swing.GroupLayout jp_dadosLayout = new javax.swing.GroupLayout(jp_dados);
        jp_dados.setLayout(jp_dadosLayout);
        jp_dadosLayout.setHorizontalGroup(
            jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dadosLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(rb_voluntario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonVoluntario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dadosLayout.createSequentialGroup()
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_dadosLayout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstado))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_dadosLayout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEndereco))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_dadosLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome)))
                .addContainerGap())
        );
        jp_dadosLayout.setVerticalGroup(
            jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_voluntario)
                    .addComponent(jRadioButtonVoluntario))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        bt_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_cancelar.setText("Cancelar");
        bt_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cancelarMouseClicked(evt);
            }
        });

        bt_enviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_enviar.setText("Enviar");
        bt_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_enviarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bt_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(bt_enviar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelar)
                    .addComponent(bt_enviar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVerificador)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelIdade)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFildIdade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelVoce)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelResposta)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelAoAlistamento)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelVerificador)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelIdade))
                    .addComponent(jTextFildIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVoce)
                    .addComponent(jLabelResposta)
                    .addComponent(jLabelAoAlistamento))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Clique no botão enviar.
    private void bt_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_enviarMouseClicked
        if(bt_enviar.isEnabled()){  //Verifica se o botão está ativo.
            System.out.println("Dados do Alistamento:");
            System.out.println("Nome: " + jTextFieldNome.getText());
            System.out.println("Idade: " + jTextFildIdade.getText());
            System.out.println("Endereço: " + jTextFieldEndereco.getText());
            System.out.println("Cidade: " + jTextFieldCidade.getText());
            System.out.println("Estado: " + jTextFieldEstado.getText());
        
            String voluntario = "";
        
            //Verifica qual radio button está selecionado.
            if(rb_voluntario.isSelected()){ 
                voluntario = "É Voluntário";
            }
            else if(jRadioButtonVoluntario.isSelected()){
                voluntario = "Não é Voluntário";
            }
        
            System.out.println(voluntario);
        }
    }//GEN-LAST:event_bt_enviarMouseClicked

    //Clique no botão cancelar.
    private void bt_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cancelarMouseClicked
       this.dispose();
    }//GEN-LAST:event_bt_cancelarMouseClicked

    private void jTextFildIdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFildIdadeKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){ //Clique na tecla enter
           String textoIdade = jTextFildIdade.getText();
           int idade = Integer.parseInt(textoIdade);
           
           if(idade == 17 || idade == 18){  //Se a idade for 17 ou 18.
                jp_dados.setVisible(true);  //Mostra o painel do formulário.
                this.setSize(480, 370);     //Redimensiona a janela.
                jLabelResposta.setText("APTO");
                bt_enviar.setEnabled(true); //Habilita o botão enviar.
           }
           else{  //Se digitar uma idade inválida, volta para o estado inicial da aplicação.
               this.limparFormulario();
               jp_dados.setVisible(false);
               this.setSize(480, 205);
               jLabelResposta.setText("NÃO APTO");
               bt_enviar.setEnabled(false);
           }
       }
    }//GEN-LAST:event_jTextFildIdadeKeyPressed

    //Método para limpar o formulário.
    public void limparFormulario(){
        this.jTextFieldNome.setText("");
        this.jTextFieldEndereco.setText("");
        this.jTextFieldCidade.setText("");
        this.jTextFieldEstado.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_enviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelAoAlistamento;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JLabel jLabelVerificador;
    private javax.swing.JLabel jLabelVoce;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonVoluntario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFildIdade;
    private javax.swing.JPanel jp_dados;
    private javax.swing.JRadioButton rb_voluntario;
    // End of variables declaration//GEN-END:variables
}
