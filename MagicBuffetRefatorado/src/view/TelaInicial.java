/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import InterfaceDAO.DAOComBuscaMultiplaInterface;
import controler.Item;
import controler.Pacote;
import entidadesDAO.ItemDAO;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josiel
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    
     private static TelaInicial instance;
     private static DAOComBuscaMultiplaInterface DAOTrabalhaComItens;
    
    public static TelaInicial getInstance()
    {
        if(instance == null){
            instance = new TelaInicial();
            DAOTrabalhaComItens = new ItemDAO();
        }       
            return instance;        
    }
    
    private TelaInicial() {
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

        cadastros = new javax.swing.JButton();
        PACOTE = new javax.swing.JButton();
        FESTA = new javax.swing.JButton();
        TEMA = new javax.swing.JButton();
        ITENS = new javax.swing.JButton();
        BotaoBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastros.setText("CADASTROS");
        cadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosActionPerformed(evt);
            }
        });

        PACOTE.setText("PACOTE");
        PACOTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PACOTEActionPerformed(evt);
            }
        });

        FESTA.setText("FESTA");
        FESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FESTAActionPerformed(evt);
            }
        });

        TEMA.setText("TEMA");
        TEMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEMAActionPerformed(evt);
            }
        });

        ITENS.setText("ITENS");
        ITENS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ITENSActionPerformed(evt);
            }
        });

        BotaoBuscar.setText("BUSCAR");
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(FESTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TEMA, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ITENS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PACOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ITENS, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEMA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PACOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrosActionPerformed
    Cadastros tela = new Cadastros();
    String [] options = new String[] {"Gerente", "Cliente", "Monitor"};
    
    int resposta = JOptionPane.showOptionDialog(null, "Escolha o tipo de cadastro", "Opções",
     JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
    
        System.out.println(resposta);
    //se monitor
     if(resposta == 2){
       tela.tipoCadastro.setText("Cadastrar Novo Monitor");
       tela.textoCPF1.setText("0");
       tela.textoCPF1.setEnabled(false);
       tela.textoRG1.setText("0");
       tela.textoRG1.setEnabled(false);
       tela.textoCidade1.setText("Mossoró");
       tela.textoCidade1.setEnabled(false);
       tela.textoLogin.setEnabled(false);
       tela.textoSenha.setEnabled(false);
       tela.setVisible(true);
       
    }
    else
    //se clilente
        if(resposta == 1 ){        
            tela.textoLogin.setEnabled(false);
            tela.textoSenha.setEnabled(false);
            tela.setVisible(true);
        }        
     else
            if( resposta == 0){
                //se gerente
                tela.tipoCadastro.setText("Cadastrar Novo Gerente");
                tela.setVisible(true);
            }
     this.setVisible(false);
     
    }//GEN-LAST:event_cadastrosActionPerformed

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
        this.setVisible(false);
        TelaBuscar telabuscar = TelaBuscar.getInstance();
        telabuscar.setVisible(true);

    }//GEN-LAST:event_BotaoBuscarActionPerformed

    private void FESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FESTAActionPerformed
        CadastroFesta telaFesta = new CadastroFesta();
        telaFesta.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_FESTAActionPerformed

    private void TEMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEMAActionPerformed
        // TODO add your handling code here:
        CadastroDeTema telaTema = new CadastroDeTema();
        telaTema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TEMAActionPerformed

    private void ITENSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ITENSActionPerformed
        this.setVisible(false);
        TelaCadastrarItem telaItem = new TelaCadastrarItem();
        telaItem.setVisible(true);
    }//GEN-LAST:event_ITENSActionPerformed

    private void PACOTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PACOTEActionPerformed
        DefaultTableModel modelo;     
        ArrayList<Object> ListaPacotes = DAOTrabalhaComItens.buscar();
        ArrayList<Item> it = new ArrayList<>();
        
        for(Object p : ListaPacotes)
            it.add((Item)p);
        
        modelo = new DefaultTableModel();                                
        modelo.addColumn("Item");        
        modelo.addColumn("ID"); 
        String Item;
        String ID;
        for (int i = 0; i < ListaPacotes.size(); i++) {
              Item = it.get(i).getNomeItem();              
              ID = it.get(i).getIdItem();
              String [] linha = {Item,ID};
              modelo.addRow(linha);
          }
              
              TelaCadastrarpacote tela = new  TelaCadastrarpacote();
              tela.tabela.setModel(modelo);
              tela.setVisible(true);
              this.setVisible(false);
    }//GEN-LAST:event_PACOTEActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JButton FESTA;
    private javax.swing.JButton ITENS;
    private javax.swing.JButton PACOTE;
    private javax.swing.JButton TEMA;
    private javax.swing.JButton cadastros;
    // End of variables declaration//GEN-END:variables
}
