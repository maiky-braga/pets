/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;

import pets.modelo.Dono;
import pets.persistenciaArquivo.PersistenciaArquivo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import pets.modelo.ContaLogada;


/**
 *
 * @author B. Dalzini/Maiky
 */
public class PerfilDonoV2 extends javax.swing.JFrame {

    /**
     * Creates new form PerfilDonoV2
     * @throws java.io.IOException
     */
    public PerfilDonoV2() throws IOException{
        initComponents();
        ContaLogada contaLogada = new ContaLogada();
        
        if(contaLogada.getCampo(0) != null){
            File file = new File("fotos/", contaLogada.getCampo(0));
            TesteResizeFoto tamanho = new TesteResizeFoto();
            labelFoto.setIcon(tamanho.ResizeImage(file.getAbsolutePath(), labelFoto));
            String name = file.getName();
            this.setNovaFoto(name);
            this.setNomeFoto(name);
        }
        
        //Pega o nome e mostra no perfil
        campoNome.setText(contaLogada.getCampo(2));     
        //Pega a rua e mostra no perfil
        campoRua.setText(contaLogada.getEndereco("rua"));        
        //Pega o número e mostra no perfil
        campoNumero.setText(contaLogada.getEndereco("numero"));       
        //Pega o número e mostra no perfil
        campoBairro.setText(contaLogada.getEndereco("bairro"));       
        //Pega o número e mostra no perfil
        campoCidade.setText(contaLogada.getEndereco("cidade"));       
        //Pega o número e mostra no perfil
        campoEstado.setSelectedIndex(Integer.parseInt((contaLogada.getEndereco("estado"))));       
        //Pega o número e mostra no perfil
        campoCep.setText(contaLogada.getEndereco("cep"));      
        //Pega o número e mostra no perfil
        campoComplemento.setText(contaLogada.getEndereco("complemento"));      
        //Pega o e-mail e mostra no perfil (não editável)
        campoEmail.setText(contaLogada.getEmailLogado());
        //Pega o telefone e mostra no perfil
        campoNumTelefone.setText(contaLogada.getCampo(4));
        //Pega o celular e mostra no perfil
        campoNumCelular.setText(contaLogada.getCampo(5));
        //Pega o facebook e mostra no perfil
        campoFacebook.setText(contaLogada.getCampo(6));
        //Pega o Instagram e mostra no perfil
        campoInstagram.setText(contaLogada.getCampo(7));
        //Pega o Twitter e mostra no perfil
        campoTwitter.setText(contaLogada.getCampo(8));
        //Pega o Whatsapp e mostra no perfil
        campoWhatsapp.setText(contaLogada.getCampo(9));
    }

    public void setNovaSenha(String senha) {
        novaSenha.setText(senha);
    }

    public void setNovaSenha2(String senha) {
        novaSenha2.setText(senha);
    }

    public void setCampoSenhaAtual(String senha) {
        campoSenhaAtual.setText(senha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        botaoFoto = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        labelFoto = new javax.swing.JLabel();
        bgFoto = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        nome18 = new javax.swing.JLabel();
        nome7 = new javax.swing.JLabel();
        nome14 = new javax.swing.JLabel();
        nome8 = new javax.swing.JLabel();
        campoSenhaAtual = new javax.swing.JPasswordField();
        novaSenha = new javax.swing.JPasswordField();
        campoRua = new javax.swing.JTextField();
        campoNumero = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoCep = new javax.swing.JFormattedTextField();
        campoEstado = new javax.swing.JComboBox<>();
        nome6 = new javax.swing.JLabel();
        nome5 = new javax.swing.JLabel();
        nome4 = new javax.swing.JLabel();
        nome3 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        nome13 = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        novaSenha2 = new javax.swing.JPasswordField();
        campoNumTelefone = new javax.swing.JFormattedTextField();
        campoNumCelular = new javax.swing.JFormattedTextField();
        campoEmail = new javax.swing.JTextField();
        campoFacebook = new javax.swing.JTextField();
        campoInstagram = new javax.swing.JTextField();
        campoTwitter = new javax.swing.JTextField();
        campoWhatsapp = new javax.swing.JFormattedTextField();
        botaoSalvar = new javax.swing.JButton();
        nome19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(328, 540));
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(318, 540));

        jPanel1.setMinimumSize(new java.awt.Dimension(301, 1127));
        jPanel1.setPreferredSize(new java.awt.Dimension(301, 1127));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoFoto.setBackground(new java.awt.Color(242, 242, 242));
        botaoFoto.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoFoto.setForeground(new java.awt.Color(102, 102, 102));
        botaoFoto.setText("Adicionar foto");
        botaoFoto.setBorder(null);
        botaoFoto.setBorderPainted(false);
        botaoFoto.setContentAreaFilled(false);
        botaoFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFoto.setFocusPainted(false);
        botaoFoto.setFocusable(false);
        botaoFoto.setRequestFocusEnabled(false);
        botaoFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFotoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 20));

        botaoVoltar.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(102, 102, 102));
        botaoVoltar.setText("<");
        botaoVoltar.setBorder(null);
        botaoVoltar.setContentAreaFilled(false);
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        labelFoto.setBackground(new java.awt.Color(102, 102, 102));
        labelFoto.setToolTipText("Foto");
        labelFoto.setOpaque(true);
        labelFoto.setPreferredSize(new java.awt.Dimension(78, 78));
        jPanel1.add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 61, -1, -1));

        bgFoto.setBackground(new java.awt.Color(255, 255, 255));
        bgFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 4, new java.awt.Color(255, 186, 120)));
        bgFoto.setOpaque(true);
        bgFoto.setPreferredSize(new java.awt.Dimension(86, 80));
        jPanel1.add(bgFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 60, -1, -1));

        campoNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNome.setForeground(new java.awt.Color(102, 102, 102));
        campoNome.setToolTipText("Nome");
        campoNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 230, 23));

        nome18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        nome18.setForeground(new java.awt.Color(255, 153, 0));
        nome18.setText("Alterar Senha");
        jPanel1.add(nome18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        nome7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome7.setForeground(new java.awt.Color(51, 51, 51));
        nome7.setText("Senha atual:");
        jPanel1.add(nome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        nome14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome14.setForeground(new java.awt.Color(51, 51, 51));
        nome14.setText("Nova senha:");
        nome14.setToolTipText("Complemento");
        jPanel1.add(nome14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        nome8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome8.setForeground(new java.awt.Color(51, 51, 51));
        nome8.setText("Confirmar senha:");
        jPanel1.add(nome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        campoSenhaAtual.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoSenhaAtual.setForeground(new java.awt.Color(102, 102, 102));
        campoSenhaAtual.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoSenhaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 160, 23));

        novaSenha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        novaSenha.setForeground(new java.awt.Color(102, 102, 102));
        novaSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(novaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 160, 23));

        campoRua.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoRua.setForeground(new java.awt.Color(102, 102, 102));
        campoRua.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 130, 23));

        campoNumero.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNumero.setForeground(new java.awt.Color(102, 102, 102));
        campoNumero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 527, 40, 23));

        campoComplemento.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoComplemento.setForeground(new java.awt.Color(102, 102, 102));
        campoComplemento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 210, 23));

        campoBairro.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoBairro.setForeground(new java.awt.Color(102, 102, 102));
        campoBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 210, 23));

        campoCidade.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoCidade.setForeground(new java.awt.Color(102, 102, 102));
        campoCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 210, 23));

        campoCep.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        campoCep.setForeground(new java.awt.Color(102, 102, 102));
        try {
            campoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(campoCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 120, 23));

        campoEstado.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoEstado.setForeground(new java.awt.Color(102, 102, 102));
        campoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        campoEstado.setBorder(null);
        campoEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoEstado.setFocusable(false);
        jPanel1.add(campoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, 23));

        nome6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome6.setForeground(new java.awt.Color(51, 51, 51));
        nome6.setText("CEP:");
        jPanel1.add(nome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, -1, -1));

        nome5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome5.setForeground(new java.awt.Color(51, 51, 51));
        nome5.setText("Estado:");
        jPanel1.add(nome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, -1));

        nome4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome4.setForeground(new java.awt.Color(51, 51, 51));
        nome4.setText("Cidade:");
        jPanel1.add(nome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        nome3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome3.setForeground(new java.awt.Color(51, 51, 51));
        nome3.setText("Bairro:");
        jPanel1.add(nome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        nome2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome2.setForeground(new java.awt.Color(51, 51, 51));
        nome2.setText("Nº:");
        jPanel1.add(nome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        nome13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome13.setForeground(new java.awt.Color(51, 51, 51));
        nome13.setText("Compl.:");
        nome13.setToolTipText("Complemento");
        jPanel1.add(nome13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        nome1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nome1.setForeground(new java.awt.Color(51, 51, 51));
        nome1.setText("Rua:");
        jPanel1.add(nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        novaSenha2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        novaSenha2.setForeground(new java.awt.Color(102, 102, 102));
        novaSenha2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        novaSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaSenha2ActionPerformed(evt);
            }
        });
        jPanel1.add(novaSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 160, 23));

        campoNumTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        campoNumTelefone.setForeground(new java.awt.Color(102, 102, 102));
        try {
            campoNumTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoNumTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(campoNumTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 810, 230, 23));

        campoNumCelular.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        campoNumCelular.setForeground(new java.awt.Color(102, 102, 102));
        try {
            campoNumCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(campoNumCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, 230, 23));

        campoEmail.setEditable(false);
        campoEmail.setBackground(new java.awt.Color(255, 255, 255));
        campoEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(102, 102, 102));
        campoEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 850, 230, 23));

        campoFacebook.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoFacebook.setForeground(new java.awt.Color(102, 102, 102));
        campoFacebook.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 935, 230, 23));

        campoInstagram.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoInstagram.setForeground(new java.awt.Color(102, 102, 102));
        campoInstagram.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 980, 230, 23));

        campoTwitter.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoTwitter.setForeground(new java.awt.Color(102, 102, 102));
        campoTwitter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1020, 230, 23));

        campoWhatsapp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        campoWhatsapp.setForeground(new java.awt.Color(102, 102, 102));
        try {
            campoWhatsapp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(campoWhatsapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 890, 230, 23));

        botaoSalvar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(null);
        botaoSalvar.setBorderPainted(false);
        botaoSalvar.setContentAreaFilled(false);
        botaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar.setFocusable(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1065, 260, 30));

        nome19.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        nome19.setForeground(new java.awt.Color(134, 134, 134));
        nome19.setText("Deixe em branco para não alterar");
        jPanel1.add(nome19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/dono1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoNumTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumTelefoneActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        boolean verificador;
        if (campoNome.getText().trim().equals("") ){
            this.dispose();
            InicialV2 inicial;
            try {
                inicial = new InicialV2();
                inicial.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(PerfilDonoV2.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
        else{
            try {
                Dono novoDono = new Dono();
                verificador = novoDono.atualizarDono(this.getNomeFoto(), this.campoNome.getText(),
                    new String(novaSenha.getPassword()), new String(novaSenha2.getPassword()),
                    new String(campoSenhaAtual.getPassword()), this.campoRua.getText(),
                    this.campoNumero.getText(), this.campoBairro.getText(),
                    this.campoCidade.getText(), (String)this.campoEstado.getSelectedItem(),
                    this.campoCep.getText(), this.campoComplemento.getText(),
                    this.campoNumTelefone.getText(), this.campoNumCelular.getText(),
                    this.campoEmail.getText(), this.campoFacebook.getText(),
                    this.campoTwitter.getText(), this.campoInstagram.getText(),
                    this.campoWhatsapp.getText());

                if(verificador){
                    this.dispose();
                    InicialV2 inicial = new InicialV2();
                    inicial.setVisible(true);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void novaSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaSenha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novaSenha2ActionPerformed

    private void setNomeFoto(String nomeFoto){
        this.nomeFoto = nomeFoto;
    }
    
    private String getNomeFoto(){
        return this.nomeFoto;
    }
    
    private void setNovaFoto(String novaFoto){
        this.novaFoto = novaFoto;
    }
    
    private String getNovaFoto(){
        return this.novaFoto;
    }
    
    private void botaoFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFotoActionPerformed

        JFileChooser foto = new JFileChooser();
        FileNameExtensionFilter tipoFoto = new FileNameExtensionFilter(".jpg, .jpeg, .png", "jpg", "jpeg", "png");
        foto.setFileFilter(tipoFoto);
        int selecao = foto.showOpenDialog(null);
        String name = "";
        File f = null;
        if(selecao == JFileChooser.APPROVE_OPTION) {
            f = foto.getSelectedFile();
            String path = f.getAbsolutePath();

            //redimensionar imagem pra caber no label
            TesteResizeFoto tamanho = new TesteResizeFoto();
            labelFoto.setIcon(tamanho.ResizeImage(path, labelFoto));
            //labelFoto.setIcon(new ImageIcon(f.toString()));

            name = f.getName();
        }
        //salvar foto na pasta
        PersistenciaArquivo persistencia = new PersistenciaArquivo();
        try {
            persistencia.salvarFoto(f, name);
            this.setNomeFoto(name);

            if(this.getNovaFoto() != null){
                if(!this.getNomeFoto().equals(this.getNovaFoto())){
                    Path p = Paths.get("fotos\\" + this.getNovaFoto());
                   /* try {
                        Files.delete(p);
                    } catch (IOException ex) {

                    }*/
                }

            }
            else{
                this.setNovaFoto("");
            }

            } catch (Exception ex) {

            }

    }//GEN-LAST:event_botaoFotoActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        Menu menu;
        try {
            menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botaoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilDonoV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilDonoV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilDonoV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilDonoV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PerfilDonoV2().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PerfilDonoV2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgFoto;
    private javax.swing.JButton botaoFoto;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JFormattedTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JComboBox<String> campoEstado;
    private javax.swing.JTextField campoFacebook;
    private javax.swing.JTextField campoInstagram;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoNumCelular;
    private javax.swing.JFormattedTextField campoNumTelefone;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRua;
    private javax.swing.JPasswordField campoSenhaAtual;
    private javax.swing.JTextField campoTwitter;
    private javax.swing.JFormattedTextField campoWhatsapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome13;
    private javax.swing.JLabel nome14;
    private javax.swing.JLabel nome18;
    private javax.swing.JLabel nome19;
    private javax.swing.JLabel nome2;
    private javax.swing.JLabel nome3;
    private javax.swing.JLabel nome4;
    private javax.swing.JLabel nome5;
    private javax.swing.JLabel nome6;
    private javax.swing.JLabel nome7;
    private javax.swing.JLabel nome8;
    private javax.swing.JPasswordField novaSenha;
    private javax.swing.JPasswordField novaSenha2;
    // End of variables declaration//GEN-END:variables

    private String nomeFoto = "";
    private String novaFoto = null;
}
