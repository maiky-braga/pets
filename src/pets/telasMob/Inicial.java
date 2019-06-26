/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;

//import pets.telas.CadastroAnimal;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.Normalizer.Form;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pets.persistenciaArquivo.PersistenciaArquivo;
import pets.telas.Principal;


/**
 *
 * @author Maiky
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Inicial() {
        initComponents();
        cao1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/caoSelec.png")));
        cao1.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        botaoMenu = new javax.swing.JButton();
        botaoPontos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaoRede = new javax.swing.JButton();
        botaoPets = new javax.swing.JButton();
        mapa = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botaoAdicionar = new javax.swing.JButton();
        cao1 = new javax.swing.JButton();
        cao2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botaoEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoFoto = new javax.swing.JLabel();
        botaoDeletar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelRaca = new javax.swing.JLabel();
        labelPorte = new javax.swing.JLabel();
        campoNome = new javax.swing.JLabel();
        campoTipo = new javax.swing.JLabel();
        campoRaca = new javax.swing.JLabel();
        campoCor = new javax.swing.JLabel();
        campoPorte = new javax.swing.JLabel();
        menuInf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setMaximumSize(new java.awt.Dimension(300, 533));
        setMinimumSize(new java.awt.Dimension(300, 533));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 533));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botaoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/menu2.png"))); // NOI18N
        botaoMenu.setToolTipText("Menu");
        botaoMenu.setBorder(null);
        botaoMenu.setContentAreaFilled(false);
        botaoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });

        botaoPontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/3pontos2.png"))); // NOI18N
        botaoPontos.setToolTipText("Sair da conta");
        botaoPontos.setBorderPainted(false);
        botaoPontos.setContentAreaFilled(false);
        botaoPontos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(botaoPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPontos))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(242, 167, 30));

        botaoRede.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        botaoRede.setForeground(new java.awt.Color(255, 255, 255));
        botaoRede.setText("REDE");
        botaoRede.setBorderPainted(false);
        botaoRede.setContentAreaFilled(false);
        botaoRede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoPets.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        botaoPets.setForeground(new java.awt.Color(255, 255, 255));
        botaoPets.setText("PETS");
        botaoPets.setBorderPainted(false);
        botaoPets.setContentAreaFilled(false);
        botaoPets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRede)
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(botaoPets)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoRede, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(botaoPets, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/mapa.png"))); // NOI18N
        mapa.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(200, 78));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 78));

        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/adicionarTrans.png"))); // NOI18N
        botaoAdicionar.setToolTipText("Adicionar um animal");
        botaoAdicionar.setBorderPainted(false);
        botaoAdicionar.setContentAreaFilled(false);
        botaoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        cao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/caoMen.png"))); // NOI18N
        cao1.setToolTipText("Adicionar um animal");
        cao1.setBorderPainted(false);
        cao1.setContentAreaFilled(false);
        cao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cao1.setRequestFocusEnabled(false);
        cao1.setVerifyInputWhenFocusTarget(false);
        cao1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cao1FocusGained(evt);
            }
        });
        cao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cao1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cao1MousePressed(evt);
            }
        });
        cao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cao1ActionPerformed(evt);
            }
        });

        cao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/caoMen.png"))); // NOI18N
        cao2.setToolTipText("Adicionar um animal");
        cao2.setBorderPainted(false);
        cao2.setContentAreaFilled(false);
        cao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cao2.setRequestFocusEnabled(false);
        cao2.setVerifyInputWhenFocusTarget(false);
        cao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cao2MouseClicked(evt);
            }
        });
        cao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cao2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cao1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cao2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cao2)
                    .addComponent(botaoAdicionar)
                    .addComponent(cao1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setToolTipText("");
        jPanel4.setAlignmentY(0.0F);

        botaoEditar.setFont(new java.awt.Font("Khmer UI", 1, 10)); // NOI18N
        botaoEditar.setForeground(new java.awt.Color(153, 153, 153));
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(null);
        botaoEditar.setBorderPainted(false);
        botaoEditar.setContentAreaFilled(false);
        botaoEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        campoFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/fundo.png"))); // NOI18N

        botaoDeletar.setFont(new java.awt.Font("Khmer UI", 1, 10)); // NOI18N
        botaoDeletar.setForeground(new java.awt.Color(153, 153, 153));
        botaoDeletar.setText("Deletar");
        botaoDeletar.setBorder(null);
        botaoDeletar.setBorderPainted(false);
        botaoDeletar.setContentAreaFilled(false);
        botaoDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        labelNome.setForeground(new java.awt.Color(153, 153, 153));
        labelNome.setText("Nome:");

        labelTipo.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(153, 153, 153));
        labelTipo.setText("Tipo:");

        labelCor.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        labelCor.setForeground(new java.awt.Color(153, 153, 153));
        labelCor.setText("Cor:");

        labelRaca.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        labelRaca.setForeground(new java.awt.Color(153, 153, 153));
        labelRaca.setText("Raça:");

        labelPorte.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        labelPorte.setForeground(new java.awt.Color(153, 153, 153));
        labelPorte.setText("Porte:");

        campoNome.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        campoNome.setForeground(new java.awt.Color(153, 153, 153));
        campoNome.setText("?");

        campoTipo.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        campoTipo.setForeground(new java.awt.Color(153, 153, 153));
        campoTipo.setText("?");

        campoRaca.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        campoRaca.setForeground(new java.awt.Color(153, 153, 153));
        campoRaca.setText("?");

        campoCor.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        campoCor.setForeground(new java.awt.Color(153, 153, 153));
        campoCor.setText("?");

        campoPorte.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        campoPorte.setForeground(new java.awt.Color(153, 153, 153));
        campoPorte.setText("?");

        menuInf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/menuInf.png"))); // NOI18N
        menuInf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(78, 264, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelCor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelRaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(menuInf)
                                    .addComponent(labelPorte))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(botaoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoDeletar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(campoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoDeletar)
                            .addComponent(botaoEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(campoNome))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTipo)
                            .addComponent(campoTipo))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCor))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRaca)
                            .addComponent(campoRaca))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPorte)
                            .addComponent(campoPorte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuInf)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
//        CadastroAnimal cadastroAnimal = new CadastroAnimal();
//        cadastroAnimal.setVisible(true);
    
        CadastroAnimalV2 cadastroAnimalV2 = new CadastroAnimalV2();
        cadastroAnimalV2.setVisible(true);

        this.hide();
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPetsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPetsActionPerformed

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        Menu menu;
        try {
            menu = new Menu();
            menu.setVisible(true);
            this.hide();
        } catch (IOException ex) {
            Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botaoMenuActionPerformed

    private void botaoPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontosActionPerformed
        int nome = JOptionPane.showConfirmDialog(null, "Deseja sair?");
        if (nome==0){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoPontosActionPerformed

    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        String nome = JOptionPane.showInputDialog("Nome do animal");
        PersistenciaArquivo deletar = new PersistenciaArquivo();
        try {
            deletar.deletarDadosAnimal(nome,"animal.csv"); //Deletar animal do parâmetro nome
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

    private void cao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cao1ActionPerformed
        cao1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/caoSelec.png")));
        cao1.setSelected(true);
        cao2.setSelected(false);
    }//GEN-LAST:event_cao1ActionPerformed

    private void cao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cao2ActionPerformed
        cao2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/caoSelec.png")));
        cao2.setSelected(true);
        cao1.setSelected(false);
    }//GEN-LAST:event_cao2ActionPerformed

    private void cao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cao2MouseClicked
        
    }//GEN-LAST:event_cao2MouseClicked

    private void cao1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cao1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cao1MouseEntered

    private void cao1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cao1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cao1MousePressed

    private void cao1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cao1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cao1FocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoPets;
    private javax.swing.JButton botaoPontos;
    private javax.swing.JButton botaoRede;
    private javax.swing.JLabel campoCor;
    private javax.swing.JLabel campoFoto;
    private javax.swing.JLabel campoNome;
    private javax.swing.JLabel campoPorte;
    private javax.swing.JLabel campoRaca;
    private javax.swing.JLabel campoTipo;
    private javax.swing.JButton cao1;
    private javax.swing.JButton cao2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPorte;
    private javax.swing.JLabel labelRaca;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel mapa;
    private javax.swing.JLabel menuInf;
    // End of variables declaration//GEN-END:variables
}
