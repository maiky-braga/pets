/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import pets.modelo.ContaLogada;
import pets.persistenciaArquivo.PersistenciaArquivo;


/**
 *
 * @author B. Dalzini/Maiky
 */
public class InicialV2 extends javax.swing.JFrame {

    /**
     * Creates new form InicialV2
     * @throws java.io.IOException
     */
    public InicialV2() throws IOException {
        initComponents();
        
        //pega a posicao x do label da foto do animal para usar como referência para as que forem criadas
        this.setPosX(jLabel2.getX());
        
        //pega o arquivo de animais do dono da conta
        ContaLogada contaLogada = new ContaLogada();
        String conta=contaLogada.getEmailLogado();
        File arq = new File("animal_" + conta + ".csv");
        
        //confere se o arquivo existe e cria uma lista de lista dos animais
        if(arq.exists()){
            FileReader fr = null;
            try {
                fr = new FileReader(arq);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);

            String linha; 

            try {
                while ((linha = br.readLine()) != null) {
                    String[] values = linha.split(";");
                    dadosAnimal.add(values);
   
                }
            } catch (IOException ex) {
                Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //se o arquivo existir, a primeira linha vai ser dos nomes das colunas (foto, nome, idade, raça etc)
            //então se o dadosAnimal for maior que 1, significa que tem algum animal cadastrado
            //esse primeiro animal cadastrado é colocado no primeiro espaço de icones (jLabel2)  
            if (dadosAnimal.size() > 1){    
                
                //nessa tela principal, o primeiro icone vem selecionado
                //então aumenta o tamanho do primeiro jlabel, pra marcar esse destaque
                jLabel2.setPreferredSize(new Dimension(43, 43));
                jLabel2.setSize(43,43);
                //poe borda laranja, também pra mostrar o destaque
                jLabel2.setBorder(borda());
                //salva que a seleção está nesse item 1 da lista (o 0 sendo os nomes das colunas)
                this.setSelected(1);
                //salva que a seleção está nesse jLabel2
                this.setAtualClicked(jLabel2);
                //configura o nome do jlabel como o nome da imagem desse animal
                jLabel2.setName(dadosAnimal.get(1)[0]);
                //carrega a imagem
                loadImage(dadosAnimal.get(1)[0], jLabel2);
                
                //tenta carregar as informações do animal selecionado para aparecerem embaixo do mapa
                try {
                    testeLoadInfo(1);

                } catch (IOException ex) {
                    Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //chama a criação dos ícones dos outros animais cadastrados
                criaLabelsIcons();
            }
        fr.close();
        br.close();     
            
      }
        else{
           
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

        jPanel2 = new javax.swing.JPanel();
        botaoPontos = new javax.swing.JButton();
        botaoMenu = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botaoEditar = new javax.swing.JButton();
        botaoDeletar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelRaca = new javax.swing.JLabel();
        labelPorte = new javax.swing.JLabel();
        campoNome = new javax.swing.JLabel();
        campoTipo = new javax.swing.JLabel();
        campoCor = new javax.swing.JLabel();
        campoRaca = new javax.swing.JLabel();
        campoPorte = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        bgFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mapa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setMinimumSize(new java.awt.Dimension(301, 534));
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(301, 534));
        jPanel2.setPreferredSize(new java.awt.Dimension(301, 534));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoPontos.setBackground(new java.awt.Color(255, 255, 255));
        botaoPontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/sairicon2.png"))); // NOI18N
        botaoPontos.setToolTipText("Fechar aplicativo");
        botaoPontos.setBorder(null);
        botaoPontos.setBorderPainted(false);
        botaoPontos.setContentAreaFilled(false);
        botaoPontos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPontos.setFocusable(false);
        botaoPontos.setPreferredSize(new java.awt.Dimension(35, 35));
        botaoPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontosActionPerformed(evt);
            }
        });
        jPanel2.add(botaoPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

        botaoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/menuicon3.png"))); // NOI18N
        botaoMenu.setToolTipText("Menu");
        botaoMenu.setBorder(null);
        botaoMenu.setContentAreaFilled(false);
        botaoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMenu.setFocusable(false);
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });
        jPanel2.add(botaoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 40));

        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/add4.png"))); // NOI18N
        botaoAdicionar.setToolTipText("Adicionar um animal");
        botaoAdicionar.setBorder(null);
        botaoAdicionar.setBorderPainted(false);
        botaoAdicionar.setContentAreaFilled(false);
        botaoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAdicionar.setFocusable(false);
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 50, 50));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(330, 70));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(35, 35));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jScrollPane1.setViewportView(jPanel5);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 230, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setToolTipText("");
        jPanel4.setAlignmentY(0.0F);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoEditar.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        botaoEditar.setForeground(new java.awt.Color(153, 153, 153));
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(null);
        botaoEditar.setBorderPainted(false);
        botaoEditar.setContentAreaFilled(false);
        botaoEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });
        jPanel4.add(botaoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 6, -1, -1));

        botaoDeletar.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
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
        jPanel4.add(botaoDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 112, -1, -1));

        labelNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelNome.setForeground(new java.awt.Color(102, 102, 102));
        labelNome.setText("Nome:");
        jPanel4.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 28, -1, -1));

        labelTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(102, 102, 102));
        labelTipo.setText("Tipo:");
        jPanel4.add(labelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 50, -1, -1));

        labelCor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelCor.setForeground(new java.awt.Color(102, 102, 102));
        labelCor.setText("Cor:");
        jPanel4.add(labelCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 72, -1, 15));

        labelRaca.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelRaca.setForeground(new java.awt.Color(102, 102, 102));
        labelRaca.setText("Raça:");
        jPanel4.add(labelRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 91, -1, -1));

        labelPorte.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelPorte.setForeground(new java.awt.Color(102, 102, 102));
        labelPorte.setText("Porte:");
        jPanel4.add(labelPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 115, -1, -1));

        campoNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNome.setForeground(new java.awt.Color(102, 102, 102));
        campoNome.setText("?");
        jPanel4.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 27, 118, -1));

        campoTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoTipo.setForeground(new java.awt.Color(102, 102, 102));
        campoTipo.setText("?");
        jPanel4.add(campoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 49, 118, -1));

        campoCor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoCor.setForeground(new java.awt.Color(102, 102, 102));
        campoCor.setText("?");
        jPanel4.add(campoCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 70, 118, -1));

        campoRaca.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoRaca.setForeground(new java.awt.Color(102, 102, 102));
        campoRaca.setText("?");
        jPanel4.add(campoRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 91, 118, -1));

        campoPorte.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoPorte.setForeground(new java.awt.Color(102, 102, 102));
        campoPorte.setText("?");
        jPanel4.add(campoPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 115, 118, -1));

        labelFoto.setBackground(new java.awt.Color(102, 102, 102));
        labelFoto.setToolTipText("Foto");
        labelFoto.setOpaque(true);
        labelFoto.setPreferredSize(new java.awt.Dimension(78, 78));
        jPanel4.add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 27, -1, -1));

        bgFoto.setBackground(new java.awt.Color(255, 255, 255));
        bgFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 4, new java.awt.Color(255, 186, 120)));
        bgFoto.setOpaque(true);
        bgFoto.setPreferredSize(new java.awt.Dimension(86, 80));
        jPanel4.add(bgFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 26, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/mapa.png"))); // NOI18N
        mapa.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.add(mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, 200));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REDE");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 37));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 60, 140, 37));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PETS");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 150, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/principal.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //vai pra tela de cadastrar animal
    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        CadastroAnimalV2 cadastroAnimalV2 = new CadastroAnimalV2();
        cadastroAnimalV2.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    //deleta o animal selecionado e apaga a foto dele da pasta
    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        
        if(dadosAnimal.size() > 1){
        
            String nome = dadosAnimal.get(this.getSelected())[1];
            String foto = dadosAnimal.get(this.getSelected())[0];
            PersistenciaArquivo deletar = new PersistenciaArquivo();
            boolean tela;
            try {

                int input = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar " + nome + "?", "", JOptionPane.YES_NO_OPTION);

                if(input == 0){

                    tela=deletar.deletarDadosAnimal(nome,"animal_"); //Deletar animal do parâmetro nome
                    if (tela){

                        InicialV2 inicial;
                        inicial = new InicialV2();
                        this.dispose();
                        inicial.setVisible(true);
                    }

                    Path p = Paths.get("fotos\\" + foto);

                    try {
                        Files.delete(p);
                    } catch (NoSuchFileException ex) {
                        System.err.format("Não foi possível deletar a imagem%n" + "%s: não encontrado. ", p);
                    }
                }
            } catch (Exception ex) { 
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

    //carrega a imagem
    private void loadImage(String fileName, JLabel label){
        File file = new File("fotos/", fileName);
        //chama a função pra redimensionar a imagem selecionada pra ela ficar do tamanho do jlabel
        TesteResizeFoto tamanho = new TesteResizeFoto();
        label.setIcon(tamanho.ResizeImage(file.getAbsolutePath(), label));
    }
    
    //carrega algumas informações do animal selecionado embaixo do mapa
    private void testeLoadInfo(int pos) throws FileNotFoundException, IOException{
        if(dadosAnimal.size() > 1){
            //continuaTesteLoadInfo(dadosAnimal);

            loadImage(dadosAnimal.get(pos)[0], labelFoto);

            this.campoNome.setText(dadosAnimal.get(pos)[1]);
            this.campoTipo.setText(dadosAnimal.get(pos)[2]);
            this.campoCor.setText(dadosAnimal.get(pos)[3]);
            this.campoRaca.setText(dadosAnimal.get(pos)[4]);
            this.campoPorte.setText(dadosAnimal.get(pos)[6]);

        }
    }
    
    private int getPosX(){
        return this.posX;
    }
    
    private void setPosX(int posX){
        this.posX += posX;
    }
    
    private int getSelected(){
        return this.selected;
    }
    
    private void setSelected(int animal){
        this.selected = animal;
    }
   
    private JLabel getAtualClicked(){
        
        return this.atualClicked;
    }
    
    private void setAtualClicked(JLabel label){
        
        this.atualClicked = label;
        
    }
    
    //define o evento de "ao clicar" para o jlabel criado
    private void novoLabelClicked(java.awt.event.MouseEvent evt){
        JLabel novoT = new JLabel();
        novoT = (JLabel) evt.getSource();
        int j = 0;
        
        //se for clicado, o jlabel que estava selecionado antes diminui de tamanho
        resizeLabelSelecionado(this.atualClicked, 35, 35);
        //perde a borda 
        this.atualClicked.setBorder(null);
        //e redimensiona a imagem pra esse tamanho menor
        loadImage(dadosAnimal.get(this.getSelected())[0], this.atualClicked);
        
        
        //procura entre os dados dos animais qual posição que tem a imagem com o mesmo nome do jlabel clicado
        for(j = 0; dadosAnimal.get(j)[0] != novoT.getName(); j++){

        }
        
        //quando acha a posição, marca ela 
        if(dadosAnimal.get(j)[0] == novoT.getName()){
                
            this.setSelected(j);
        }
        
        //marca o jlabel clicado como o selecionado
        this.setAtualClicked(novoT);
        
        //aumenta o tamanho dele
        resizeLabelSelecionado(novoT, 43, 43);
        //poe borda
        novoT.setBorder(borda());
        //redimensiona imagem
        loadImage(dadosAnimal.get(j)[0], novoT);

        //pede pra carregar as informações desse animal
        try {
            testeLoadInfo(this.getSelected());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    //cria novos jlabels se existir mais de um animal
    private void criaLabelsIcons(){
        
        if(dadosAnimal.size() > 2){
            
            
            for(int i = 2; dadosAnimal.size() > i; i++){
                
                //vai colocar o novo jlabel na posição de acordo com a posição do anterior
                this.setPosX(52);
                
                JLabel novoLabel = new javax.swing.JLabel();
                
                novoLabel.setOpaque(true);
                novoLabel.setPreferredSize(new java.awt.Dimension(35, 35));
                novoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        
                        novoLabelClicked(evt);
                    }
                });
                jPanel5.add(novoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(this.getPosX(), 5, -1, -1));

                
                novoLabel.setBounds(this.getPosX(), 5, 35, 35);
                novoLabel.setSize(35,35);
                //diferencia cada jlabel criado ao colocar o nome da foto do animal desse ícone como o nome do jlabel
                novoLabel.setName(dadosAnimal.get(i)[0]);
                
                //mostra o cursor de mãozinha pra mostrar que dá pra clicar ali quando o usuário passa o mouse em cima do ícone
                Cursor c = new Cursor(HAND_CURSOR);
                novoLabel.setCursor(c);
                
                //carrega a imagem do animal pro jlabel/ícone dele
                loadImage(dadosAnimal.get(i)[0], novoLabel);

            }
        }
    }
    
    //redimensiona o jlabel pra um tamanho x,y
    private void resizeLabelSelecionado(JLabel label, int x, int y){
        label.setPreferredSize(new Dimension(x, y));
        label.setSize(x, y);
    }
    
    //poe a borda laranja de tamanho 2
    private Border borda(){
        MatteBorder novaB = new MatteBorder(2,2,2,2, new Color(255,186,120));
        return novaB;
        
        
    }
    
    //evento de "ao clicar" do jLabel2 (o primeiro jlabel, que é o principal)
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(dadosAnimal.size() > 1){
            //diminui o tamanho do antigo jlabel clicado
            resizeLabelSelecionado(this.atualClicked, 35, 35);
            //redimensiona a imagem dele pro tamanho menor
            loadImage(dadosAnimal.get(this.getSelected())[0], this.atualClicked);
            //tira a borda
            this.atualClicked.setBorder(null);
            
            //marca esse jlabel como o selecionado
            this.setAtualClicked(jLabel2);
            //marca esse item 
            this.setSelected(1);
            //aumenta o tamanho desse jlabel
            resizeLabelSelecionado(jLabel2, 43, 43);
            //poe a borda nesse jlabel
            jLabel2.setBorder(borda());
            //redimensiona a imagem
            loadImage(dadosAnimal.get(1)[0], jLabel2);
            try {
                //mostrar info
                testeLoadInfo(1);
            } catch (IOException ex) {
                ex.printStackTrace();
            }        
        }    
    }//GEN-LAST:event_jLabel2MouseClicked

    
    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        
    }//GEN-LAST:event_jLabel2MouseExited

    //vai pro menu lateral do Dono
    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        Menu menu;
        try {
            menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botaoMenuActionPerformed

    //pergunta se deseja sair do aplicativo
    private void botaoPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontosActionPerformed
        
        int nome = JOptionPane.showConfirmDialog(null, "Deseja sair do aplicativo?", "", JOptionPane.YES_NO_OPTION);
        if (nome==0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_botaoPontosActionPerformed

    //carrega a tela de animal com os dados do animal cadastrado para edição
    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        
        
        if(dadosAnimal.size() > 1){
            CadastroAnimalV2 animalEdit = new CadastroAnimalV2(dadosAnimal, this.getSelected());
            animalEdit.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_botaoEditarActionPerformed

    //vai pra tela do mural
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Rede rede = null;
        try {
            rede = new Rede();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        rede.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(InicialV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InicialV2().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgFoto;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoPontos;
    private javax.swing.JLabel campoCor;
    private javax.swing.JLabel campoNome;
    private javax.swing.JLabel campoPorte;
    private javax.swing.JLabel campoRaca;
    private javax.swing.JLabel campoTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPorte;
    private javax.swing.JLabel labelRaca;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel mapa;
    // End of variables declaration//GEN-END:variables

    private List<String[]> dadosAnimal = new ArrayList();
    private int posX = 0;
    private JLabel atualClicked = null;
    
    
    private int selected = 0;
}
