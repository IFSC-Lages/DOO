package exercicio03;

import java.awt.event.KeyEvent;

public class Janela extends javax.swing.JFrame {
    public Janela() {
        initComponents();
        jp_dados.setVisible(false);  //Esconde o painel do formulário.
        this.setSize(480, 205);      //Redimensiona a janela.
        bt_enviar.setEnabled(false); //Desabilita o botão enviar.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_idade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lb_resposta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jp_dados = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_endereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_cidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_estado = new javax.swing.JTextField();
        rb_voluntario = new javax.swing.JRadioButton();
        rb_nvoluntario = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        bt_cancelar = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(465, 370));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Verificador de Alistamento Militar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Idade:");

        tf_idade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_idadeKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Você está");

        lb_resposta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_resposta.setText("<resposta>");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ao alistamento militar.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nome:");

        tf_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Endereço:");

        tf_endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cidade:");

        tf_cidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Estado:");

        tf_estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup1.add(rb_voluntario);
        rb_voluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_voluntario.setText("Voluntário");

        buttonGroup1.add(rb_nvoluntario);
        rb_nvoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_nvoluntario.setText("Não Voluntário");

        javax.swing.GroupLayout jp_dadosLayout = new javax.swing.GroupLayout(jp_dados);
        jp_dados.setLayout(jp_dadosLayout);
        jp_dadosLayout.setHorizontalGroup(
            jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dadosLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(rb_voluntario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_nvoluntario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dadosLayout.createSequentialGroup()
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_estado))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tf_endereco))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nome)))
                .addContainerGap())
        );
        jp_dadosLayout.setVerticalGroup(
            jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_voluntario)
                    .addComponent(rb_nvoluntario))
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
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_idade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lb_resposta)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
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
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(tf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lb_resposta)
                    .addComponent(jLabel5))
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
            System.out.println("Nome: " + tf_nome.getText());
            System.out.println("Idade: " + tf_idade.getText());
            System.out.println("Endereço: " + tf_endereco.getText());
            System.out.println("Cidade: " + tf_cidade.getText());
            System.out.println("Estado: " + tf_estado.getText());
        
            String voluntario = "";
        
            //Verifica qual radio button está selecionado.
            if(rb_voluntario.isSelected()){ 
                voluntario = "É Voluntário";
            }
            else if(rb_nvoluntario.isSelected()){
                voluntario = "Não é Voluntário";
            }
        
            System.out.println(voluntario);
        }
    }//GEN-LAST:event_bt_enviarMouseClicked

    //Clique no botão cancelar.
    private void bt_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cancelarMouseClicked
       this.dispose();
    }//GEN-LAST:event_bt_cancelarMouseClicked

    private void tf_idadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_idadeKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){ //Clique na tecla enter
           String textoIdade = tf_idade.getText();
           int idade = Integer.parseInt(textoIdade);
           
           if(idade == 17 || idade == 18){  //Se a idade for 17 ou 18.
                jp_dados.setVisible(true);  //Mostra o painel do formulário.
                this.setSize(480, 370);     //Redimensiona a janela.
                lb_resposta.setText("APTO");
                bt_enviar.setEnabled(true); //Habilita o botão enviar.
           }
           else{  //Se digitar uma idade inválida, volta para o estado inicial da aplicação.
               this.limparFormulario();
               jp_dados.setVisible(false);
               this.setSize(480, 205);
               lb_resposta.setText("NÃO APTO");
               bt_enviar.setEnabled(false);
           }
       }
    }//GEN-LAST:event_tf_idadeKeyPressed

    //Método para limpar o formulário.
    public void limparFormulario(){
        this.tf_nome.setText("");
        this.tf_endereco.setText("");
        this.tf_cidade.setText("");
        this.tf_estado.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_enviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jp_dados;
    private javax.swing.JLabel lb_resposta;
    private javax.swing.JRadioButton rb_nvoluntario;
    private javax.swing.JRadioButton rb_voluntario;
    private javax.swing.JTextField tf_cidade;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_estado;
    private javax.swing.JTextField tf_idade;
    private javax.swing.JTextField tf_nome;
    // End of variables declaration//GEN-END:variables
}
