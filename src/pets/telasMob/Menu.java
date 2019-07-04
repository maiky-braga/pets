/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;

//import pets.telas.CadastroAnimal;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pets.modelo.ContaLogada;
import pets.modelo.Dono;


/**
 *
 * @author Maiky
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     * @throws java.io.IOException
     */
    public Menu() throws IOException {
        initComponents();
        
        
        ContaLogada contaLogada = new ContaLogada();
        Dono dTeste = new Dono();
        
        campoNome.setText(contaLogada.getCampo(2));
        
        if(contaLogada.getCampo(5).length() > 7){
            campoCelular.setText(contaLogada.getCampo(5));
        }
        else{
            //campoCelular.setText("( )    -    ");
            campoCelular.setText("");
        }
             
        if(contaLogada.getCampo(0) != null){
            File file = new File("fotos/", contaLogada.getCampo(0));
            TesteResizeFoto tamanho = new TesteResizeFoto();
            labelFoto.setIcon(tamanho.ResizeImage(file.getAbsolutePath(), labelFoto));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        campoNome = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        botaoPerfil = new javax.swing.JButton();
        botaoConta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        naoClinicas = new javax.swing.JPanel();
        botaoClinicas = new javax.swing.JButton();
        naoAlertas = new javax.swing.JPanel();
        botaoAlertas = new javax.swing.JButton();
        naoAmigos = new javax.swing.JPanel();
        botaoAmigos = new javax.swing.JButton();
        naoConfig = new javax.swing.JPanel();
        botaoConfig = new javax.swing.JButton();
        naoPerguntas = new javax.swing.JPanel();
        botaoPerguntas = new javax.swing.JButton();
        campoCelular = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(645, 140));
        setMinimumSize(new java.awt.Dimension(301, 534));
        setResizable(false);

        jPanelFundo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFundo.setPreferredSize(new java.awt.Dimension(301, 540));
        jPanelFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFundoMouseClicked(evt);
            }
        });
        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 186, 120));
        jPanel5.setMinimumSize(new java.awt.Dimension(225, 540));
        jPanel5.setPreferredSize(new java.awt.Dimension(225, 540));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFoto.setBackground(new java.awt.Color(102, 102, 102));
        labelFoto.setToolTipText("");
        labelFoto.setOpaque(true);
        labelFoto.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel5.add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        campoNome.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        campoNome.setForeground(new java.awt.Color(51, 51, 51));
        campoNome.setText("Nome");
        jPanel5.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 80, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(193, 310));
        jPanel6.setPreferredSize(new java.awt.Dimension(225, 400));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoPerfil.setBackground(new java.awt.Color(51, 51, 51));
        botaoPerfil.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoPerfil.setForeground(new java.awt.Color(51, 51, 51));
        botaoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/icoPerfil.png"))); // NOI18N
        botaoPerfil.setText("Meu perfil");
        botaoPerfil.setBorder(null);
        botaoPerfil.setBorderPainted(false);
        botaoPerfil.setContentAreaFilled(false);
        botaoPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPerfil.setFocusable(false);
        botaoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPerfilActionPerformed(evt);
            }
        });
        jPanel6.add(botaoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, 20));

        botaoConta.setBackground(new java.awt.Color(51, 51, 51));
        botaoConta.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoConta.setForeground(new java.awt.Color(51, 51, 51));
        botaoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/icoAlt.png"))); // NOI18N
        botaoConta.setText("Trocar de conta");
        botaoConta.setBorder(null);
        botaoConta.setBorderPainted(false);
        botaoConta.setContentAreaFilled(false);
        botaoConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConta.setFocusable(false);
        botaoConta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoConta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContaActionPerformed(evt);
            }
        });
        jPanel6.add(botaoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 20));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(225, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, -1, -1));

        naoClinicas.setBackground(new java.awt.Color(51, 51, 51));
        naoClinicas.setFocusable(false);
        naoClinicas.setPreferredSize(new java.awt.Dimension(75, 1));

        javax.swing.GroupLayout naoClinicasLayout = new javax.swing.GroupLayout(naoClinicas);
        naoClinicas.setLayout(naoClinicasLayout);
        naoClinicasLayout.setHorizontalGroup(
            naoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        naoClinicasLayout.setVerticalGroup(
            naoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel6.add(naoClinicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 140, -1, -1));

        botaoClinicas.setBackground(new java.awt.Color(51, 51, 51));
        botaoClinicas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoClinicas.setForeground(new java.awt.Color(51, 51, 51));
        botaoClinicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/icoClin.png"))); // NOI18N
        botaoClinicas.setText("Clínicas");
        botaoClinicas.setBorder(null);
        botaoClinicas.setBorderPainted(false);
        botaoClinicas.setContentAreaFilled(false);
        botaoClinicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoClinicas.setFocusable(false);
        botaoClinicas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoClinicas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoClinicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClinicasActionPerformed(evt);
            }
        });
        jPanel6.add(botaoClinicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 20));

        naoAlertas.setBackground(new java.awt.Color(51, 51, 51));
        naoAlertas.setFocusable(false);
        naoAlertas.setPreferredSize(new java.awt.Dimension(75, 1));

        javax.swing.GroupLayout naoAlertasLayout = new javax.swing.GroupLayout(naoAlertas);
        naoAlertas.setLayout(naoAlertasLayout);
        naoAlertasLayout.setHorizontalGroup(
            naoAlertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        naoAlertasLayout.setVerticalGroup(
            naoAlertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel6.add(naoAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 180, -1, -1));

        botaoAlertas.setBackground(new java.awt.Color(51, 51, 51));
        botaoAlertas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoAlertas.setForeground(new java.awt.Color(51, 51, 51));
        botaoAlertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/icoAle.png"))); // NOI18N
        botaoAlertas.setText("Alertas");
        botaoAlertas.setBorder(null);
        botaoAlertas.setBorderPainted(false);
        botaoAlertas.setContentAreaFilled(false);
        botaoAlertas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlertas.setFocusable(false);
        botaoAlertas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoAlertas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoAlertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlertasActionPerformed(evt);
            }
        });
        jPanel6.add(botaoAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, 20));

        naoAmigos.setBackground(new java.awt.Color(51, 51, 51));
        naoAmigos.setFocusable(false);
        naoAmigos.setPreferredSize(new java.awt.Dimension(120, 1));

        javax.swing.GroupLayout naoAmigosLayout = new javax.swing.GroupLayout(naoAmigos);
        naoAmigos.setLayout(naoAmigosLayout);
        naoAmigosLayout.setHorizontalGroup(
            naoAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        naoAmigosLayout.setVerticalGroup(
            naoAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel6.add(naoAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 220, -1, -1));

        botaoAmigos.setBackground(new java.awt.Color(51, 51, 51));
        botaoAmigos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoAmigos.setForeground(new java.awt.Color(51, 51, 51));
        botaoAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/iconAmi.png"))); // NOI18N
        botaoAmigos.setText("Convidar amigos");
        botaoAmigos.setBorder(null);
        botaoAmigos.setBorderPainted(false);
        botaoAmigos.setContentAreaFilled(false);
        botaoAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAmigos.setFocusable(false);
        botaoAmigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoAmigos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAmigosActionPerformed(evt);
            }
        });
        jPanel6.add(botaoAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 20));

        naoConfig.setBackground(new java.awt.Color(51, 51, 51));
        naoConfig.setFocusable(false);
        naoConfig.setPreferredSize(new java.awt.Dimension(110, 1));

        javax.swing.GroupLayout naoConfigLayout = new javax.swing.GroupLayout(naoConfig);
        naoConfig.setLayout(naoConfigLayout);
        naoConfigLayout.setHorizontalGroup(
            naoConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        naoConfigLayout.setVerticalGroup(
            naoConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel6.add(naoConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 260, -1, -1));

        botaoConfig.setBackground(new java.awt.Color(51, 51, 51));
        botaoConfig.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoConfig.setForeground(new java.awt.Color(51, 51, 51));
        botaoConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/icoConf.png"))); // NOI18N
        botaoConfig.setText("Configurações");
        botaoConfig.setBorder(null);
        botaoConfig.setBorderPainted(false);
        botaoConfig.setContentAreaFilled(false);
        botaoConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConfig.setFocusable(false);
        botaoConfig.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoConfig.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfigActionPerformed(evt);
            }
        });
        jPanel6.add(botaoConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 20));

        naoPerguntas.setBackground(new java.awt.Color(51, 51, 51));
        naoPerguntas.setFocusable(false);
        naoPerguntas.setPreferredSize(new java.awt.Dimension(150, 1));

        javax.swing.GroupLayout naoPerguntasLayout = new javax.swing.GroupLayout(naoPerguntas);
        naoPerguntas.setLayout(naoPerguntasLayout);
        naoPerguntasLayout.setHorizontalGroup(
            naoPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        naoPerguntasLayout.setVerticalGroup(
            naoPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel6.add(naoPerguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 300, -1, -1));

        botaoPerguntas.setBackground(new java.awt.Color(51, 51, 51));
        botaoPerguntas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoPerguntas.setForeground(new java.awt.Color(51, 51, 51));
        botaoPerguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/icoPerg.png"))); // NOI18N
        botaoPerguntas.setText("Perguntas Frequentes");
        botaoPerguntas.setBorder(null);
        botaoPerguntas.setBorderPainted(false);
        botaoPerguntas.setContentAreaFilled(false);
        botaoPerguntas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPerguntas.setFocusable(false);
        botaoPerguntas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoPerguntas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPerguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPerguntasActionPerformed(evt);
            }
        });
        jPanel6.add(botaoPerguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 20));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        campoCelular.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        campoCelular.setForeground(new java.awt.Color(51, 51, 51));
        campoCelular.setText("Tel");
        jPanel5.add(campoCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 110, -1, -1));

        jPanelFundo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPerfilActionPerformed
        PerfilDonoV2 perfil = null;
        try {
            perfil = new PerfilDonoV2();
            perfil.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_botaoPerfilActionPerformed

    private void botaoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContaActionPerformed
        int nome = JOptionPane.showConfirmDialog(null, "Deseja sair?", "", JOptionPane.YES_NO_OPTION);
        if (nome==0){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoContaActionPerformed

    private void botaoAlertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAlertasActionPerformed

    private void botaoAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAmigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAmigosActionPerformed

    private void botaoConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoConfigActionPerformed

    private void botaoPerguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPerguntasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPerguntasActionPerformed

    private void botaoClinicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClinicasActionPerformed
        CadastroClinica clinica;
        try {
            clinica = new CadastroClinica();
            clinica.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_botaoClinicasActionPerformed

    private void jPanelFundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFundoMouseClicked
        InicialV2 principal = null;
        try {
            principal = new InicialV2();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelFundoMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                try {
                    new Menu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlertas;
    private javax.swing.JButton botaoAmigos;
    private javax.swing.JButton botaoClinicas;
    private javax.swing.JButton botaoConfig;
    private javax.swing.JButton botaoConta;
    private javax.swing.JButton botaoPerfil;
    private javax.swing.JButton botaoPerguntas;
    private javax.swing.JLabel campoCelular;
    private javax.swing.JLabel campoNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JPanel naoAlertas;
    private javax.swing.JPanel naoAmigos;
    private javax.swing.JPanel naoClinicas;
    private javax.swing.JPanel naoConfig;
    private javax.swing.JPanel naoPerguntas;
    // End of variables declaration//GEN-END:variables
}
