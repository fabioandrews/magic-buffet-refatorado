/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import InterfaceDAO.GenericDAOInterface;
import controler.Gerente;
import controler.Pessoa;
import entidadesDAO.GerenteDAO;
import entidadesDAO.PessoaDAO;

import javax.swing.JOptionPane;

/**
 *
 * @author andreza
 */
public class Cadastros extends javax.swing.JFrame {

    /**
     * Creates new form Cadastros
     */
	private GenericDAOInterface interfaceDaoDadosCadastro = new PessoaDAO();//um DAO gen�rico para acesso a cadastro de pessoas
	
    public Cadastros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCancelar = new javax.swing.JButton();
        textoCidade = new javax.swing.JTextField();
        textoTelefone = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        botaoSalvar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        textoNumero = new javax.swing.JTextField();
        textoCEP = new javax.swing.JTextField();
        textoRua = new javax.swing.JTextField();
        textoBairro = new javax.swing.JTextField();
        textoCPF = new javax.swing.JTextField();
        textoRG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        botaoCancelar1 = new javax.swing.JButton();
        textoCidade1 = new javax.swing.JTextField();
        textoTelefone1 = new javax.swing.JTextField();
        botaoSalvar1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        textoNumero1 = new javax.swing.JTextField();
        textoCEP1 = new javax.swing.JTextField();
        textoRua1 = new javax.swing.JTextField();
        textoBairro1 = new javax.swing.JTextField();
        textoCPF1 = new javax.swing.JTextField();
        textoRG1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tipoCadastro = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textoNome1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        textoLogin = new javax.swing.JTextField();
        Login = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        textoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCidadeActionPerformed(evt);
            }
        });

        textoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefoneActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        textoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNumeroActionPerformed(evt);
            }
        });

        textoCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCEPActionPerformed(evt);
            }
        });

        textoRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRuaActionPerformed(evt);
            }
        });

        textoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBairroActionPerformed(evt);
            }
        });

        textoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCPFActionPerformed(evt);
            }
        });

        textoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRGActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Cidade");

        jLabel2.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cadastrar Novo Cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Numero");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Bairro");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Rua");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("RG");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("CEP");

        jPasswordField1.setText("jPasswordField1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoCancelar1.setText("Cancelar");
        botaoCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelar1ActionPerformed(evt);
            }
        });

        textoCidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCidade1ActionPerformed(evt);
            }
        });

        textoTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefone1ActionPerformed(evt);
            }
        });

        botaoSalvar1.setText("Salvar");
        botaoSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvar1ActionPerformed(evt);
            }
        });

        textoNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNumero1ActionPerformed(evt);
            }
        });

        textoCEP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCEP1ActionPerformed(evt);
            }
        });

        textoRua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRua1ActionPerformed(evt);
            }
        });

        textoBairro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBairro1ActionPerformed(evt);
            }
        });

        textoCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCPF1ActionPerformed(evt);
            }
        });

        textoRG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRG1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Cidade");

        jLabel12.setText("CPF");

        tipoCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tipoCadastro.setText("Cadastrar Novo Cliente");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Nome");

        textoNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNome1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Numero");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Bairro");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Rua");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("RG");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Telefone");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("CEP");

        textoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoLoginActionPerformed(evt);
            }
        });

        Login.setText("Login");

        jLabel13.setText("Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(botaoCancelar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(30, 30, 30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoRua1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                    .addComponent(textoBairro1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel20)
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(4, 4, 4)
                                        .addComponent(textoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Login)
                                .addGap(18, 18, 18)
                                .addComponent(textoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipoCadastro)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(textoRG1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textoNome1))))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(textoRG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoRua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(textoCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(textoCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login)
                    .addComponent(jLabel13)
                    .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar1)
                    .addComponent(botaoCancelar1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
        TelaInicial telaInicial = TelaInicial.getInstance();
        telaInicial.setVisible(true);

    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void textoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCidadeActionPerformed

    private void textoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefoneActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void textoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNumeroActionPerformed

    private void textoCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCEPActionPerformed

    private void textoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRuaActionPerformed

    private void textoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBairroActionPerformed

    private void textoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCPFActionPerformed

    private void textoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRGActionPerformed

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

    private void botaoCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelar1ActionPerformed
        this.dispose();
        TelaInicial telaInicial = TelaInicial.getInstance();
        telaInicial.setVisible(true);

    }//GEN-LAST:event_botaoCancelar1ActionPerformed

    private void textoCidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCidade1ActionPerformed

    private void textoTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefone1ActionPerformed

    private void botaoSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvar1ActionPerformed
        
        Pessoa p = new Pessoa();
        if (tipoCadastro.getText().contains("Cliente")) {
            p.setCpf(textoCPF1.getText());
            System.out.println("cpf");
            p.setPnome(textoNome1.getText());
            String RG = textoRG1.getText();
            System.out.println("nome");
            System.out.println(RG);
            p.setRg(Integer.parseInt(RG));
            System.out.println("rg");
            p.setRua(textoRua1.getText());
            System.out.println("rua");
            String Numero = textoNumero1.getText();
            p.setNumero(Integer.parseInt(Numero));
            System.out.println("numero");
            p.setBairro(textoBairro1.getText());
            System.out.println("bairro");
            p.setCep(textoCEP1.getText());
            p.setTipoPessoa(Pessoa.CLIENTE);
            p.setTelefone(textoTelefone1.getText());
            System.out.println("telefone");
            p.setCidade(textoCidade1.getText());
            p.setCep(textoCEP1.getText());
            System.out.println("cep");
            interfaceDaoDadosCadastro.criar(p);
            JOptionPane.showMessageDialog(this, "Cliente Criado");
        } else if (tipoCadastro.getText().contains("Gerente")) {
            GerenteDAO gerente = new GerenteDAO();
            Gerente manager = new Gerente();
            manager.setCpf(textoCPF1.getText());
            manager.setPnome(textoNome1.getText());
            String RG = textoRG1.getText();
            manager.setRg(Integer.parseInt(RG));
            manager.setRua(textoRua1.getText());
            String Numero = textoNumero1.getText();
                if(Numero.equals("")) 
                    Numero = "0";
            manager.setNumero(Integer.parseInt(Numero));
            manager.setBairro(textoBairro1.getText());
            manager.setCep(textoCEP1.getText());
            manager.setTipoPessoa(Pessoa.GERENTE);
            manager.setTelefone(textoTelefone1.getText());
            manager.setCidade(textoCidade1.getText());
            manager.setCep(textoCEP1.getText());
            manager.setGerenteLogin(textoLogin.getText());
            manager.setLogin(textoLogin.getText());
            manager.setSenha(String.valueOf(textoSenha.getPassword()));
            gerente.criar(manager);
            gerente.criar(manager);
            JOptionPane.showMessageDialog(this, "Gerente Criado");


        } else if (tipoCadastro.getText().contains("Monitor")) {
            p.setCpf(textoCPF1.getText());            
            p.setPnome(textoNome1.getText());
            String RG = textoRG1.getText();            
            p.setRg(Integer.parseInt(RG));            
            p.setRua(textoRua1.getText());            
            String Numero = textoNumero1.getText();
            p.setNumero(Integer.parseInt(Numero));            
            p.setBairro(textoBairro1.getText());            
            p.setCep(textoCEP1.getText());
            p.setTipoPessoa(Pessoa.MONITOR);
            p.setTelefone(textoTelefone1.getText());
            p.setCidade(textoCidade1.getText());
            p.setCep(textoCEP1.getText());
            interfaceDaoDadosCadastro.criar(p);
            JOptionPane.showMessageDialog(this, "Monitor Criado");
        }

            TelaInicial telaInicial = TelaInicial.getInstance();
            this.dispose();
            telaInicial.setVisible(true);
    }//GEN-LAST:event_botaoSalvar1ActionPerformed

    private void textoNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNumero1ActionPerformed

    private void textoCEP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCEP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCEP1ActionPerformed

    private void textoRua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRua1ActionPerformed

    private void textoBairro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBairro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBairro1ActionPerformed

    private void textoCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCPF1ActionPerformed

    private void textoRG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRG1ActionPerformed

    private void textoNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNome1ActionPerformed

    private void textoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoCancelar1;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoSalvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField textoBairro;
    public javax.swing.JTextField textoBairro1;
    private javax.swing.JTextField textoCEP;
    public javax.swing.JTextField textoCEP1;
    private javax.swing.JTextField textoCPF;
    public javax.swing.JTextField textoCPF1;
    private javax.swing.JTextField textoCidade;
    public javax.swing.JTextField textoCidade1;
    public javax.swing.JTextField textoLogin;
    private javax.swing.JTextField textoNome;
    public javax.swing.JTextField textoNome1;
    private javax.swing.JTextField textoNumero;
    public javax.swing.JTextField textoNumero1;
    private javax.swing.JTextField textoRG;
    public javax.swing.JTextField textoRG1;
    private javax.swing.JTextField textoRua;
    private javax.swing.JTextField textoRua1;
    public javax.swing.JPasswordField textoSenha;
    private javax.swing.JTextField textoTelefone;
    public javax.swing.JTextField textoTelefone1;
    public javax.swing.JLabel tipoCadastro;
    // End of variables declaration//GEN-END:variables
}
