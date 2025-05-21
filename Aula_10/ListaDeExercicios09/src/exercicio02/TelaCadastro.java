package exercicio02;

import java.util.ArrayList;

public class TelaCadastro extends javax.swing.JPanel {
    ArrayList<Cliente> lista_clientes;   //Arraylist para armazenar os clientes cadastrados.
    
    public TelaCadastro() {
        initComponents();
                
        lista_clientes = new ArrayList();   //Inicializa o Arraylist.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelCadastroCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        cb_estado_civil = new javax.swing.JComboBox<>();
        bt_visualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_cadastrar = new javax.swing.JButton();
        tf_idade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        rb_feminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Clientes");

        tf_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cb_estado_civil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_estado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo" }));

        bt_visualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_visualizar.setText("Visualizar");
        bt_visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_visualizarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Idade:");

        bt_cadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });

        tf_idade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        tf_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sexo:");

        buttonGroup1.add(rb_masculino);
        rb_masculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_masculino.setText("Masculino");

        buttonGroup1.add(rb_feminino);
        rb_feminino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_feminino.setText("Feminino");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Estado Civil:");

        javax.swing.GroupLayout jPanelCadastroClienteLayout = new javax.swing.GroupLayout(jPanelCadastroCliente);
        jPanelCadastroCliente.setLayout(jPanelCadastroClienteLayout);
        jPanelCadastroClienteLayout.setHorizontalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tf_idade))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tf_telefone))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(rb_masculino)
                                .addGap(28, 28, 28)
                                .addComponent(rb_feminino))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cb_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_visualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelCadastroClienteLayout.setVerticalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_masculino)
                        .addComponent(rb_feminino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cadastrar)
                    .addComponent(bt_visualizar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Clique no botão visualizar.
    private void bt_visualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_visualizarMouseClicked
        for(int i=0; i<lista_clientes.size(); i++){   //Percorre a lista de clientes.
            lista_clientes.get(i).imprimir();         //Recupera o cliente da lista e chama o método imprimir (classe cliente).
        }
    }//GEN-LAST:event_bt_visualizarMouseClicked

    //Clique no botão cadastrar.
    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked
        String nome, telefone, sexo, estado_civil;
        int idade;

        nome = tf_nome.getText();  //Recupera as informações preenchidas nos campos do formulário.
        idade = Integer.parseInt(tf_idade.getText());
        telefone = tf_telefone.getText();
        sexo = "";

        if(rb_masculino.isSelected()){  //Verifica qual botão está selecionado.
            sexo = "masculino";
        }
        else if(rb_feminino.isSelected()){
            sexo = "feminino";
        }

        estado_civil = cb_estado_civil.getSelectedItem().toString(); 

        Cliente c = new Cliente(nome, idade, telefone, sexo, estado_civil);  //Cria um objeto cliente com as informações do formulário.
        lista_clientes.add(c);  //Adiciona o objeto na lista.

        this.limparCampos();  //Limpa os campos do formulário.
    }//GEN-LAST:event_bt_cadastrarMouseClicked

    //Método para limpar os campos do formulário.
    private void limparCampos(){
        tf_nome.setText("");
        tf_idade.setText("");
        tf_telefone.setText("");
        buttonGroup1.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_visualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_estado_civil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelCadastroCliente;
    private javax.swing.JRadioButton rb_feminino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JTextField tf_idade;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_telefone;
    // End of variables declaration//GEN-END:variables

}
