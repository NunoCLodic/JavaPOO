/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.TextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Administrador
 */
public class LoginFrame extends javax.swing.JDialog {

    public LoginFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_pipg = new javax.swing.JLabel();
        jLabel_imgPipg = new javax.swing.JLabel();
        jPasswordField_senha = new javax.swing.JPasswordField();
        Label_senha = new javax.swing.JLabel();
        jButton_entrar = new javax.swing.JButton();
        jLabel_ipg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema pipg login");
        setBackground(new java.awt.Color(153, 204, 255));
        setLocation(new java.awt.Point(5, 5));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_pipg.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel_pipg.setText("PIPG");
        getContentPane().add(jLabel_pipg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 90, 30));

        jLabel_imgPipg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suporte.png"))); // NOI18N
        getContentPane().add(jLabel_imgPipg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));
        getContentPane().add(jPasswordField_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 100, -1));

        Label_senha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/senha.png"))); // NOI18N
        getContentPane().add(Label_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jButton_entrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_entrar.setText("Entrar");
        jButton_entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 100, 30));

        jLabel_ipg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pipg.jpg"))); // NOI18N
        getContentPane().add(jLabel_ipg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_entrarActionPerformed

//        String usuario = (String) jComboBox_nome.getSelectedItem();
        String senha = new String(jPasswordField_senha.getPassword());

        if (senha.equals("1011577")) {
//          JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            MainFrame inicio = new MainFrame("Main frame em tela cheia");
            this.dispose();
            inicio.setVisible(true);
            inicio.setExtendedState(MainFrame.MAXIMIZED_BOTH);
        } else {
            JOptionPane.showMessageDialog(this, "Senha incorreta!\n tente novamente...", "Opss,Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_entrarActionPerformed
    //permite que o usuário pressione Enter no campo de senha e acione automaticamente o botão "Entrar"
    @Override
    public void addNotify() {
        super.addNotify();
        getRootPane().setDefaultButton(jButton_entrar); // Define o botão como padrão
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginFrame dialog = new LoginFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_senha;
    private javax.swing.JButton jButton_entrar;
    private javax.swing.JLabel jLabel_imgPipg;
    private javax.swing.JLabel jLabel_ipg;
    private javax.swing.JLabel jLabel_pipg;
    private javax.swing.JPasswordField jPasswordField_senha;
    // End of variables declaration//GEN-END:variables

}
