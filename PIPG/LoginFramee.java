package view;

import javax.swing.JOptionPane;

public class LoginFramee extends javax.swing.JDialog {

    public LoginFramee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_senha = new javax.swing.JLabel();
        jLabel_pipg = new javax.swing.JLabel();
        jLabel_imgPipg = new javax.swing.JLabel();
        jPasswordField_senha = new javax.swing.JPasswordField();
        jButton_entrar = new javax.swing.JButton();
        imgpipg = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/senha.png"))); // NOI18N
        getContentPane().add(jLabel_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 37, 16));

        jLabel_pipg.setBackground(new java.awt.Color(240, 240, 240));
        jLabel_pipg.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel_pipg.setText("PIPG");
        jLabel_pipg.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLabel_pipgComponentMoved(evt);
            }
        });
        getContentPane().add(jLabel_pipg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 96, -1));

        jLabel_imgPipg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suporte.png"))); // NOI18N
        getContentPane().add(jLabel_imgPipg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 37, 40));
        getContentPane().add(jPasswordField_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 86, -1));

        jButton_entrar.setText("Entrar");
        jButton_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 120, -1));

        imgpipg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pipg.jpg"))); // NOI18N
        getContentPane().add(imgpipg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_pipgComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel_pipgComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_pipgComponentMoved

    private void jButton_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_entrarActionPerformed
        // TODO add your handling code here:
        //String usuario = (String) jComboBox_nome.getSelectedItem();
        String senha = new String(jPasswordField_senha.getPassword());

        if (senha.equals("1011577")) {
            //JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
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
        getRootPane().setDefaultButton(jButton_entrar); // Define o botão como padrão
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            LoginFramee dialog = new LoginFramee(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgpipg;
    private javax.swing.JButton jButton_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_imgPipg;
    private javax.swing.JLabel jLabel_pipg;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JPasswordField jPasswordField_senha;
    // End of variables declaration//GEN-END:variables
}
