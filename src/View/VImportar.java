/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConectandoBanco;

import Model.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;

/**
 *
 * @author João Felipe
 */
public class VImportar extends javax.swing.JFrame {

    ConectandoBanco conect = new ConectandoBanco();

    /**
     * Creates new form VImportar
     */
    public VImportar() {
        initComponents();

        ConectandoBanco conect = new ConectandoBanco();
        //Puxa dados do banco para o ComboBOx
        conect.configuraComboBox(jComboBoxArea);

        URL url = this.getClass().getResource("/Imagens/icone.ico");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);

        chooser.setApproveButtonText("Importar");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String extension = Utils.getExtension(f);
                if (extension != null) {
                    if (extension.equals(Utils.xls)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }

            @Override
            public String getDescription() {
                return "Arquivos Microsoft Excel 97-2003 (*.xls)";
            }
        });
//        this.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxArea = new javax.swing.JComboBox();
        jButtonSelecionar = new javax.swing.JButton();
        jLabelTemps = new javax.swing.JLabel();

        chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Importar");
        setResizable(false);

        jLabel1.setText("Importar para a área:");

        jComboBoxArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxAreaMouseClicked(evt);
            }
        });
        jComboBoxArea.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jComboBoxAreaComponentShown(evt);
            }
        });
        jComboBoxArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAreaItemStateChanged(evt);
            }
        });
        jComboBoxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAreaActionPerformed(evt);
            }
        });

        jButtonSelecionar.setText("Selecionar Arquivo");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTemps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabelTemps))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSelecionar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooserActionPerformed
    }//GEN-LAST:event_chooserActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        final VImportando teste = new VImportando();
        teste.setVisible(true);

        /**
        * FAZER O METODO DE SUBSTITUIR OU DE IGNORAR. ... ARRUMAR METODOS UTAH
        * CAROLINA.
        */
        boolean sobrescrever = true;
        int resultado = chooser.showOpenDialog(this);
        System.out.println("Resultado: " + resultado);
        String area = jComboBoxArea.getSelectedItem().toString();

        if (resultado == JFileChooser.APPROVE_OPTION) {

            String endereco = chooser.getSelectedFile().toString();
            System.out.println("Arquivos Selecionado: " + endereco);
            //        File file = chooser.getSelectedFile();
            int tamanho = endereco.length();
            String aux = endereco.substring(tamanho - 3, tamanho);
            System.out.println("Substring: " + aux);
            //            System.out.println("S: "+ s); // Teste da substring

            ImportaTabela tab = new ImportaTabela();

            if (aux.equals("xls")) {
                try {
                    ArrayList<ArrayList> dados = tab.carregaLinha(endereco);
                    VImportarArea imp = new VImportarArea();

                    imp.importaArea(area, dados, sobrescrever);

                    imp.setVisible(false);

                    JOptionPane.showMessageDialog(null, "Arquivo Importado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException | BiffException ex) {
                    Logger.getLogger(VImportar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(VImportar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um arquivo .XLS", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
            this.setVisible(false);

        } else {
            System.out.println("File access cancelled by user.");
        }
        teste.setVisible(false);
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jComboBoxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAreaActionPerformed

    }//GEN-LAST:event_jComboBoxAreaActionPerformed

    private void jComboBoxAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAreaItemStateChanged
        conect.conecta();
        try {
            ResultSet RS = conect.execRetorna("SELECT calculoTemp FROM Area WHERE nomeArea='" + jComboBoxArea.getSelectedItem().toString() + "'");
            String s = RS.getString("calculoTemp");
            conect.desconecta();
        } catch (Exception ex) {
            Logger.getLogger(VImportar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBoxAreaItemStateChanged

    private void jComboBoxAreaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxAreaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAreaComponentShown

    private void jComboBoxAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxAreaMouseClicked

    }//GEN-LAST:event_jComboBoxAreaMouseClicked

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
            java.util.logging.Logger.getLogger(VImportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VImportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VImportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VImportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VImportar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser chooser;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JComboBox jComboBoxArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTemps;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}