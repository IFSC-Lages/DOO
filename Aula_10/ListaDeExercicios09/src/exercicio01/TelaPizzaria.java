package exercicio01;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TelaPizzaria extends javax.swing.JFrame {
    private double valor; //Valor total
    private String tamanho; //Tamanho da pizza
    private int qtdeSabores = 0, saboresSelecionados = 0;  //Quantidade de sabores de acordo como o tamnho da pizza e sabores já selecionados.
    private ArrayList<String> listaSabores; //Arraylist para guardar os sabores selecionados.
    private String borda, bebida; //Borda e bebida escolhidas.
    
    public TelaPizzaria() {
        initComponents();
        this.sp_scroll.getVerticalScrollBar().setUnitIncrement(10); //Altera a velocida do scroll.
        
        this.valor = 0.0;
        this.tamanho = "";
        this.listaSabores = new ArrayList();
        this.tf_valor.setText(String.valueOf(this.valor));
        
        this.desabilitaSabores();
        this.desabilitaBordas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_tamanho = new javax.swing.ButtonGroup();
        group_borda = new javax.swing.ButtonGroup();
        group_bebida = new javax.swing.ButtonGroup();
        sp_scroll = new javax.swing.JScrollPane();
        jPanelSabores = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lb_qtdeSabores = new javax.swing.JLabel();
        chb_alho = new javax.swing.JCheckBox();
        chb_calabresa = new javax.swing.JCheckBox();
        chb_coracao = new javax.swing.JCheckBox();
        chb_4queijos = new javax.swing.JCheckBox();
        chb_palmito = new javax.swing.JCheckBox();
        chb_frango = new javax.swing.JCheckBox();
        chb_portuguesa = new javax.swing.JCheckBox();
        chb_camarao = new javax.swing.JCheckBox();
        chb_salmao = new javax.swing.JCheckBox();
        chb_file = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        rb_refrigerante = new javax.swing.JRadioButton();
        rb_suco = new javax.swing.JRadioButton();
        rb_semBebida = new javax.swing.JRadioButton();
        bt_enviar = new javax.swing.JButton();
        jPanelTamanho = new javax.swing.JPanel();
        rb_gigante = new javax.swing.JRadioButton();
        rb_pequena = new javax.swing.JRadioButton();
        rb_grande = new javax.swing.JRadioButton();
        rb_media = new javax.swing.JRadioButton();
        jPanelLogo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tf_valor = new javax.swing.JLabel();
        jLabelLog = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rb_cheedar = new javax.swing.JRadioButton();
        rb_semBorda = new javax.swing.JRadioButton();
        rb_chocolate = new javax.swing.JRadioButton();
        rb_catupiry = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(367, 800));

        sp_scroll.setPreferredSize(new java.awt.Dimension(350, 560));

        jPanelSabores.setPreferredSize(new java.awt.Dimension(340, 850));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Sistema de Pedidos Online");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Escolha o TAMANHO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Escolha os SABORES:");

        lb_qtdeSabores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_qtdeSabores.setText("<Qtde de Sabores>");

        chb_alho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_alho.setText("Alho e Óleo");
        chb_alho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_alhoItemStateChanged(evt);
            }
        });

        chb_calabresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_calabresa.setText("Calabresa");
        chb_calabresa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_calabresaItemStateChanged(evt);
            }
        });

        chb_coracao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_coracao.setText("Coração");
        chb_coracao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_coracaoItemStateChanged(evt);
            }
        });

        chb_4queijos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_4queijos.setText("4 Queijos");
        chb_4queijos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_4queijosItemStateChanged(evt);
            }
        });

        chb_palmito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_palmito.setText("Palmito");
        chb_palmito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_palmitoItemStateChanged(evt);
            }
        });

        chb_frango.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_frango.setText("Frango com Catupiry");
        chb_frango.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_frangoItemStateChanged(evt);
            }
        });

        chb_portuguesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_portuguesa.setText("Portuguesa");
        chb_portuguesa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_portuguesaItemStateChanged(evt);
            }
        });

        chb_camarao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_camarao.setText("Camarão (+R$10,00)");
        chb_camarao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_camaraoItemStateChanged(evt);
            }
        });

        chb_salmao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_salmao.setText("Salmão (+R$15,00)");
        chb_salmao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_salmaoItemStateChanged(evt);
            }
        });

        chb_file.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_file.setText("Filé (+R$20,00)");
        chb_file.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chb_fileItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Escolha a BORDA: (+R$8,00)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Escolha a BEBIDA:");

        group_bebida.add(rb_refrigerante);
        rb_refrigerante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_refrigerante.setText("Refrigerante 2L (+R$8,00)");
        rb_refrigerante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_refrigeranteItemStateChanged(evt);
            }
        });

        group_bebida.add(rb_suco);
        rb_suco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_suco.setText("Suco (+R$5,00)");
        rb_suco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_sucoItemStateChanged(evt);
            }
        });

        group_bebida.add(rb_semBebida);
        rb_semBebida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_semBebida.setText("Nâo Desejo Bebida");
        rb_semBebida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_semBebidaItemStateChanged(evt);
            }
        });

        bt_enviar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_enviar.setText("ENVIAR PEDIDO");
        bt_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_enviarMouseClicked(evt);
            }
        });

        group_tamanho.add(rb_gigante);
        rb_gigante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_gigante.setText("Gigante (R$75,00)");
        rb_gigante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_giganteItemStateChanged(evt);
            }
        });

        group_tamanho.add(rb_pequena);
        rb_pequena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_pequena.setText("Pequena (R$25,00)");
        rb_pequena.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_pequenaItemStateChanged(evt);
            }
        });

        group_tamanho.add(rb_grande);
        rb_grande.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_grande.setText("Grande (R$60,00)");
        rb_grande.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_grandeItemStateChanged(evt);
            }
        });

        group_tamanho.add(rb_media);
        rb_media.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_media.setText("Média (R$45,00)");
        rb_media.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_mediaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelTamanhoLayout = new javax.swing.GroupLayout(jPanelTamanho);
        jPanelTamanho.setLayout(jPanelTamanhoLayout);
        jPanelTamanhoLayout.setHorizontalGroup(
            jPanelTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_pequena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rb_media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanelTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTamanhoLayout.createSequentialGroup()
                        .addComponent(rb_gigante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanelTamanhoLayout.createSequentialGroup()
                        .addComponent(rb_grande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(146, 146, 146))))
        );
        jPanelTamanhoLayout.setVerticalGroup(
            jPanelTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_pequena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rb_grande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanelTamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_gigante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rb_media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total a Pagar:");

        tf_valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_valor.setText("<VALOR>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabelLog.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabelLog.setForeground(new java.awt.Color(255, 153, 0));
        jLabelLog.setText("Albi's Pizzaria");

        group_borda.add(rb_cheedar);
        rb_cheedar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_cheedar.setText("Cheedar");
        rb_cheedar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_cheedarItemStateChanged(evt);
            }
        });

        group_borda.add(rb_semBorda);
        rb_semBorda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_semBorda.setText("Nâo Desejo Borda");
        rb_semBorda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_semBordaItemStateChanged(evt);
            }
        });

        group_borda.add(rb_chocolate);
        rb_chocolate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_chocolate.setText("Chocolate");
        rb_chocolate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_chocolateItemStateChanged(evt);
            }
        });

        group_borda.add(rb_catupiry);
        rb_catupiry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_catupiry.setText("Catupiry");
        rb_catupiry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_catupiryItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_catupiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_cheedar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_semBorda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rb_chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_chocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rb_catupiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_semBorda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rb_cheedar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSaboresLayout = new javax.swing.GroupLayout(jPanelSabores);
        jPanelSabores.setLayout(jPanelSaboresLayout);
        jPanelSaboresLayout.setHorizontalGroup(
            jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator5)
            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSaboresLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSaboresLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(216, 216, 216))
                    .addGroup(jPanelSaboresLayout.createSequentialGroup()
                        .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSaboresLayout.createSequentialGroup()
                        .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_alho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                .addComponent(chb_calabresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                .addComponent(chb_coracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                .addComponent(chb_4queijos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                .addComponent(chb_palmito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(24, 24, 24))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                .addComponent(lb_qtdeSabores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(98, 98, 98))
                            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                        .addComponent(chb_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(37, 37, 37))
                                    .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                        .addComponent(chb_salmao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(11, 11, 11))
                                    .addComponent(chb_camarao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                        .addComponent(chb_portuguesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(62, 62, 62))
                                    .addGroup(jPanelSaboresLayout.createSequentialGroup()
                                        .addComponent(chb_frango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2)))
                                .addGap(100, 100, 100))))
                    .addGroup(jPanelSaboresLayout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addContainerGap())))
            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(176, 176, 176))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSaboresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85))
            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_refrigerante)
                    .addComponent(rb_suco)
                    .addComponent(rb_semBebida)
                    .addComponent(jPanelTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSaboresLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSaboresLayout.createSequentialGroup()
                        .addComponent(bt_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSaboresLayout.createSequentialGroup()
                        .addComponent(jLabelLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(190, 190, 190))))
            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );
        jPanelSaboresLayout.setVerticalGroup(
            jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaboresLayout.createSequentialGroup()
                .addComponent(jLabelLog, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_qtdeSabores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_alho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chb_frango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_calabresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chb_portuguesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_coracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chb_camarao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_4queijos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chb_salmao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chb_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chb_palmito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(rb_refrigerante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_suco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_semBebida)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_enviar)
                .addGap(16, 16, 16))
        );

        sp_scroll.setViewportView(jPanelSabores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sp_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Clique no botão enviar.
    private void bt_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_enviarMouseClicked
        System.out.println("#### Recibo ####");
        System.out.println("Tamanho da Pizza: " + this.tamanho);
        System.out.println("Qtde de Sabores: " + this.qtdeSabores);
        
        //Percorre a lista de sabores selecionados imprimindo-os.
        for(int i=0; i<listaSabores.size(); i++){
            System.out.println("Sabor " + i + ": " + this.listaSabores.get(i));
        }
        
        System.out.println("Borda: " + this.borda);
        System.out.println("Bebida:" + this.bebida);
        
    }//GEN-LAST:event_bt_enviarMouseClicked

    //Tamnho pequeno selecionado.
    private void rb_pequenaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_pequenaItemStateChanged
        if(rb_pequena.isSelected()){  //Verifica se o botão foi selecionado.
           this.tamanho = "Pequena";  //Altera o tamanho da pizza.
           this.valor = this.valor + 25;  //Altera o total a pagar.
           this.qtdeSabores = 1;   //Ajusta a quantidade de sabores.
           this.atualizaTextoSabores(this.qtdeSabores);  //Atualiza a label com a qtde de sabores.
           this.limpaSabores();  //Desmarca os checkbox dos sabores.
        }
        else{  //Caso o botão seja deslecionado, ajusta o total a pagar.
            this.valor = this.valor - 25;
        }
        
        habilitaSabores();  //Libera os sabores para serem escolhidos.
        habilitaBordas();   //Libera as bordas para serem escolhidas.
        atualizaTextoTotal();  //Atualiza a label total a pagar.
    }//GEN-LAST:event_rb_pequenaItemStateChanged

    //Tamanho médio selecionado.
    private void rb_mediaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_mediaItemStateChanged
        if(rb_media.isSelected()){
            this.tamanho = "Média";
            this.valor = this.valor + 45;
            this.qtdeSabores = 2;
            this.atualizaTextoSabores(this.qtdeSabores);
            this.limpaSabores();
        }
        else
            this.valor = this.valor - 45;
        
        habilitaSabores();
        habilitaBordas();
        atualizaTextoTotal();
    }//GEN-LAST:event_rb_mediaItemStateChanged

    //Tamanho grande selecionado.
    private void rb_grandeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_grandeItemStateChanged
        if(rb_grande.isSelected()){
           this.tamanho = "Grande";
           this.valor = this.valor + 60;
           this.qtdeSabores = 3;
           this.atualizaTextoSabores(this.qtdeSabores);
           this.limpaSabores();
        }
        else
            this.valor = this.valor - 60;
        
        habilitaSabores();
        habilitaBordas();
        atualizaTextoTotal();
    }//GEN-LAST:event_rb_grandeItemStateChanged

    //Tamanho gigante selecionado.
    private void rb_giganteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_giganteItemStateChanged
       if(rb_gigante.isSelected()){
           this.tamanho = "Gigante";
           this.valor = this.valor + 75;
           this.qtdeSabores = 4;
           this.atualizaTextoSabores(this.qtdeSabores);
           this.limpaSabores();
       }
        else
            this.valor = this.valor - 75;
       
        habilitaSabores();
        habilitaBordas();
        atualizaTextoTotal();
    }//GEN-LAST:event_rb_giganteItemStateChanged

    //Checkbox do sabor alho e óleo.
    private void chb_alhoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_alhoItemStateChanged
        if(chb_alho.isSelected()){  //Verifica se o checkbox foi marcado.
            this.saboresSelecionados++;  //Aumenta o número de sabores já selecionados.
            this.listaSabores.add("Alho e Óleo");  //Adiciona o sabor no arraylist.
        }
        else{  //Se o checkbox foi desmarcado.
            this.saboresSelecionados--;  //Diminui o número de sabores já selecionados.
            this.listaSabores.remove("Alho e Óleo"); //Remove o sabor no arraylist.
        }
        
        if(this.saboresSelecionados == this.qtdeSabores){  //Verifica se já atingiu o limite de sabores selecionados.
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_alhoItemStateChanged

    //Checkbox do sabor calabresa.
    private void chb_calabresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_calabresaItemStateChanged
        if(chb_calabresa.isSelected()){
            this.saboresSelecionados++;
            this.listaSabores.add("Calabresa");
        }
        else{
            this.saboresSelecionados--;
            this.listaSabores.remove("Calabresa");
        }
        
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_calabresaItemStateChanged

    //Checkbox do sabor coração.
    private void chb_coracaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_coracaoItemStateChanged
        if(chb_coracao.isSelected()){
            this.saboresSelecionados++;
            this.listaSabores.add("Coração");
        }
        else{
            this.saboresSelecionados--;
            this.listaSabores.remove("Coração");
        }
       
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_coracaoItemStateChanged

    //Checkbox do sabor 4 queijos.
    private void chb_4queijosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_4queijosItemStateChanged
        if(chb_4queijos.isSelected()){
            this.saboresSelecionados++;
            this.listaSabores.add("4 Queijos");
        }
        else{
            this.saboresSelecionados--;
            this.listaSabores.remove("4 Queijos");
        }
        
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_4queijosItemStateChanged

    //Checkbox do sabor palmito.
    private void chb_palmitoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_palmitoItemStateChanged
        if(chb_palmito.isSelected()){
            this.saboresSelecionados++;
            this.listaSabores.add("Palmito");
        }
        else{
            this.saboresSelecionados--;
            this.listaSabores.remove("Palmito");
        }
        
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_palmitoItemStateChanged

    //Checkbox do sabor frango.
    private void chb_frangoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_frangoItemStateChanged
        if(chb_frango.isSelected()){
            this.saboresSelecionados++;
            this.listaSabores.add("Frango com Catupiry");
        }
        else{
            this.saboresSelecionados--;
            this.listaSabores.remove("Frango com Catupiry");
        }
        
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_frangoItemStateChanged

    //Checkbox do sabor portuguesa.
    private void chb_portuguesaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_portuguesaItemStateChanged
        if(chb_portuguesa.isSelected()){
            this.saboresSelecionados++;
            this.listaSabores.add("Portuguesa");
        }
        else{
            this.saboresSelecionados--;
            this.listaSabores.remove("Portuguesa");
        }
        
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_portuguesaItemStateChanged

    //Checkbox do sabor camarao.
    private void chb_camaraoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_camaraoItemStateChanged
        if(chb_camarao.isSelected()){
            this.saboresSelecionados++;
            this.valor = this.valor + 10.0;  //ajusta o total a pagar.
            this.listaSabores.add("Camarão");
        }
        else{
            this.saboresSelecionados--;
            this.valor = this.valor - 10.0;
            this.listaSabores.remove("Camarão");
        }
        
        atualizaTextoTotal();
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_camaraoItemStateChanged

    //Checkbox do sabor salmão.
    private void chb_salmaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_salmaoItemStateChanged
       if(chb_salmao.isSelected()){
            this.saboresSelecionados++;
            this.valor = this.valor + 15.0;
            this.listaSabores.add("Salmão");
        }
        else{
            this.saboresSelecionados--;
            this.valor = this.valor - 15.0;
            this.listaSabores.remove("Salmão");
        }
        
        atualizaTextoTotal();
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_salmaoItemStateChanged

    //Checkbox do sabor filé.
    private void chb_fileItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chb_fileItemStateChanged
        if(chb_file.isSelected()){
            this.saboresSelecionados++;
            this.valor = this.valor + 20.0;
            this.listaSabores.add("Filé");
        }
        else{
            this.saboresSelecionados--;
            this.valor = this.valor - 20.0;
            this.listaSabores.remove("Filé");
        }
        
        atualizaTextoTotal();
        if(this.saboresSelecionados == this.qtdeSabores){
            desabilitaSabores();
        }
    }//GEN-LAST:event_chb_fileItemStateChanged

    //Radio button da borda de catupiry.
    private void rb_catupiryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_catupiryItemStateChanged
        if(rb_catupiry.isSelected()){  //Verifica se o radio button está selecionado.
            this.valor = this.valor + 8.0;  //Ajusta o valor.
            this.borda = rb_catupiry.getText();
        }
        else  //Verifica se o radio button foi desmarcado.
            this.valor = this.valor - 8.0; //Ajusta o valor.
        
        atualizaTextoTotal();  //Atualiza a label total a pagar.
    }//GEN-LAST:event_rb_catupiryItemStateChanged

    //Radio button da borda de cheedar.
    private void rb_cheedarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_cheedarItemStateChanged
        if(rb_cheedar.isSelected()){
            this.valor = this.valor + 8.0;
            this.borda = this.rb_cheedar.getText();
        }
        else
            this.valor = this.valor - 8.0;
        
        atualizaTextoTotal();
    }//GEN-LAST:event_rb_cheedarItemStateChanged

    //Radio button da borda de chocolate.
    private void rb_chocolateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_chocolateItemStateChanged
        if(rb_chocolate.isSelected()){
            this.valor = this.valor + 8.0;
            this.borda = this.rb_chocolate.getText();
        }
        else
            this.valor = this.valor - 8.0;
        
        atualizaTextoTotal();
    }//GEN-LAST:event_rb_chocolateItemStateChanged

    //Radio button do refrigerante.
    private void rb_refrigeranteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_refrigeranteItemStateChanged
        if(rb_refrigerante.isSelected()){
            this.valor = this.valor + 8.0;
            this.bebida = "Refrigerante 2L";
        }
        else
            this.valor = this.valor - 8.0;
        
        atualizaTextoTotal();
    }//GEN-LAST:event_rb_refrigeranteItemStateChanged

    //Radio button do suco.
    private void rb_sucoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_sucoItemStateChanged
        if(rb_suco.isSelected()){
            this.valor = this.valor + 5.0;
            this.bebida = "Suco";
        }
        else
            this.valor = this.valor - 5.0;
        
        atualizaTextoTotal();
    }//GEN-LAST:event_rb_sucoItemStateChanged

    //Radio button do sem borda.
    private void rb_semBordaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_semBordaItemStateChanged
        if(rb_semBorda.isSelected()){
            this.borda = rb_semBorda.getText();
        }
    }//GEN-LAST:event_rb_semBordaItemStateChanged

    //Radio button do sem bebida.
    private void rb_semBebidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_semBebidaItemStateChanged
        if(rb_semBebida.isSelected()){
            this.bebida = rb_semBebida.getText();
        }
    }//GEN-LAST:event_rb_semBebidaItemStateChanged
  
    //Método para habilitar os checkbox dos sabores.
    private void habilitaSabores(){
        chb_4queijos.setEnabled(true);
        chb_alho.setEnabled(true);
        chb_calabresa.setEnabled(true);
        chb_camarao.setEnabled(true);
        chb_coracao.setEnabled(true);
        chb_file.setEnabled(true);
        chb_frango.setEnabled(true);
        chb_palmito.setEnabled(true);
        chb_portuguesa.setEnabled(true);
        chb_salmao.setEnabled(true);
    }
    
    //Método para desabilitar os checkbox dos sabores.
    private void desabilitaSabores(){
        chb_4queijos.setEnabled(false);
        chb_alho.setEnabled(false);
        chb_calabresa.setEnabled(false);
        chb_camarao.setEnabled(false);
        chb_coracao.setEnabled(false);
        chb_file.setEnabled(false);
        chb_frango.setEnabled(false);
        chb_palmito.setEnabled(false);
        chb_portuguesa.setEnabled(false);
        chb_salmao.setEnabled(false);
    }
    
    //Método para habilitar os radio buttons das bordas.
    private void habilitaBordas(){
        rb_catupiry.setEnabled(true);
        rb_cheedar.setEnabled(true);
        rb_chocolate.setEnabled(true);
        rb_semBorda.setEnabled(true);
    }
    
    //Método para desabilitar os radio buttons das bordas.
    private void desabilitaBordas(){
        rb_catupiry.setEnabled(false);
        rb_cheedar.setEnabled(false);
        rb_chocolate.setEnabled(false);
        rb_semBorda.setEnabled(false);
    }
    
    //Método para limpar a seleção dos sabores.
    private void limpaSabores(){
        chb_4queijos.setSelected(false);
        chb_alho.setSelected(false);
        chb_calabresa.setSelected(false);
        chb_camarao.setSelected(false);
        chb_coracao.setSelected(false);
        chb_file.setSelected(false);
        chb_frango.setSelected(false);
        chb_palmito.setSelected(false);
        chb_portuguesa.setSelected(false);
        chb_salmao.setSelected(false);
    }
    
    //Método para atualizar a label com a qtde máxima de sabores.
    private void atualizaTextoSabores(int qtde){
        this.lb_qtdeSabores.setText(String.valueOf(qtde));
    }
    
    //Método para atualizar a label com o total a pagar.
    private void atualizaTextoTotal(){
        tf_valor.setText(String.valueOf(valor));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enviar;
    private javax.swing.JCheckBox chb_4queijos;
    private javax.swing.JCheckBox chb_alho;
    private javax.swing.JCheckBox chb_calabresa;
    private javax.swing.JCheckBox chb_camarao;
    private javax.swing.JCheckBox chb_coracao;
    private javax.swing.JCheckBox chb_file;
    private javax.swing.JCheckBox chb_frango;
    private javax.swing.JCheckBox chb_palmito;
    private javax.swing.JCheckBox chb_portuguesa;
    private javax.swing.JCheckBox chb_salmao;
    private javax.swing.ButtonGroup group_bebida;
    private javax.swing.ButtonGroup group_borda;
    private javax.swing.ButtonGroup group_tamanho;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JPanel jPanelSabores;
    private javax.swing.JPanel jPanelTamanho;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lb_qtdeSabores;
    private javax.swing.JRadioButton rb_catupiry;
    private javax.swing.JRadioButton rb_cheedar;
    private javax.swing.JRadioButton rb_chocolate;
    private javax.swing.JRadioButton rb_gigante;
    private javax.swing.JRadioButton rb_grande;
    private javax.swing.JRadioButton rb_media;
    private javax.swing.JRadioButton rb_pequena;
    private javax.swing.JRadioButton rb_refrigerante;
    private javax.swing.JRadioButton rb_semBebida;
    private javax.swing.JRadioButton rb_semBorda;
    private javax.swing.JRadioButton rb_suco;
    private javax.swing.JScrollPane sp_scroll;
    private javax.swing.JLabel tf_valor;
    // End of variables declaration//GEN-END:variables
}
