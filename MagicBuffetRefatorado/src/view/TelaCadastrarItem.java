/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;

import javax.swing.JOptionPane;

import InterfaceDAO.DAOComBuscaMultiplaInterface;
import controler.Item;
import entidadesDAO.FabricaDeDAO;

/**
 *
 * @author Josiel
 */
public class TelaCadastrarItem extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarItem
     */
	private DAOComBuscaMultiplaInterface daoAcessoCadastroDeItens; //um DAO gen�rico que serve para acessar cadastros de itens
	
    public TelaCadastrarItem() {
    	daoAcessoCadastroDeItens = FabricaDeDAO.criarItemDAO();
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

        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        textoNomeItem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textoQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textopreco = new HintTextField("Ex: 45.00");
       
        CANCELAR = new javax.swing.JButton();
        SALVAR = new javax.swing.JButton();

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cadastrar Novo Pacote");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Cadastrar Item");

        jLabel1.setText("Nome do Item");

        textoNomeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeItemActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade total");

        textoQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoQuantidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço Unitário");

        textopreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoprecoActionPerformed(evt);
            }
        });

        CANCELAR.setText("CANCELAR");
        CANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARActionPerformed(evt);
            }
        });

        SALVAR.setText("SALVAR");
        SALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALVARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(CANCELAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SALVAR)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoNomeItem)
                            .addComponent(textoQuantidade)
                            .addComponent(textopreco, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(textopreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANCELAR)
                    .addComponent(SALVAR))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNomeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeItemActionPerformed

    private void textoQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoQuantidadeActionPerformed

    private void textoprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoprecoActionPerformed

    private void CANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARActionPerformed
        this.dispose();
        TelaInicial telaInicial = TelaInicial.getInstance();
        telaInicial.setVisible(true);
    }//GEN-LAST:event_CANCELARActionPerformed

    private void SALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALVARActionPerformed
        Item item = new Item();
        
        if(algumAtributoImportanteParaCadastroNaoFoiPreenchidoCorretamente() == false)
        {
        	String nome = textoNomeItem.getText();
            String codigo = nome.substring(0, 1) + nome.substring(nome.length() / 2, nome.length() / 2 + 1);

            item.setIdItem("MF"+codigo);
            item.setNomeItem(textoNomeItem.getText());
            String quantidade = textoQuantidade.getText();
            item.setQuantidadeTotal(Integer.parseInt(quantidade));
            Float preco = Float.parseFloat(textopreco.getText());
            item.setPrecoUnidade(preco);


            daoAcessoCadastroDeItens.criar(item);
            TelaInicial telaInicial = TelaInicial.getInstance();
            this.dispose();
            telaInicial.setVisible(true);
        }

        

    }//GEN-LAST:event_SALVARActionPerformed
    
    private boolean algumAtributoImportanteParaCadastroNaoFoiPreenchidoCorretamente()
    {
    	//atributos importantes: NOmeItem, quantidadeTotal e PrecoUnidade
    	
    	String nomeItem = textoNomeItem.getText();
    	String quantidade = textoQuantidade.getText();
    	String preco = textopreco.getText();
    	
    	if(VerificadorCamposFormulario.campoNumericoDeValorAte11EhValido(quantidade, "quantidade do item") &&
    			VerificadorCamposFormulario.precoEhValido(preco) &&
    			VerificadorCamposFormulario.nomeEhValido(nomeItem, "Nome do item"))
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
    }

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
            java.util.logging.Logger.getLogger(TelaCadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarItem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCELAR;
    private javax.swing.JButton SALVAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textoNomeItem;
    private javax.swing.JTextField textoQuantidade;
    private HintTextField textopreco;
    // End of variables declaration//GEN-END:variables
}
