package view;

public class MainFrame_biblioteca extends javax.swing.JFrame {

    public MainFrame_biblioteca() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane_add_mot = new javax.swing.JDesktopPane();
        jMenuBar_menu = new javax.swing.JMenuBar();
        jMenu_suporte = new javax.swing.JMenu();
        jMenuItem_config = new javax.swing.JMenuItem();
        jMenuItem_sair = new javax.swing.JMenuItem();
        jMenu_estacionamento = new javax.swing.JMenu();
        jMenuItem_add_est = new javax.swing.JMenuItem();
        jMenuItem_ed_est = new javax.swing.JMenuItem();
        jMenuItem_exl_est = new javax.swing.JMenuItem();
        jMenuItem_pesq_est = new javax.swing.JMenuItem();
        jMenu_condutor = new javax.swing.JMenu();
        jMenuItem_add_mot = new javax.swing.JMenuItem();
        jMenuItem_ed_mot = new javax.swing.JMenuItem();
        jMenuItem_ex_mot = new javax.swing.JMenuItem();
        jMenuItem_pes_mot = new javax.swing.JMenuItem();
        jMenu_viaturas = new javax.swing.JMenu();
        jMenuItem_add_via = new javax.swing.JMenuItem();
        jMenuItem_ed_via = new javax.swing.JMenuItem();
        jMenuItem_ex_via = new javax.swing.JMenuItem();
        jMenuItem_pes_via = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema pipg");

        jDesktopPane_add_mot.setPreferredSize(new java.awt.Dimension(1200, 900));

        javax.swing.GroupLayout jDesktopPane_add_motLayout = new javax.swing.GroupLayout(jDesktopPane_add_mot);
        jDesktopPane_add_mot.setLayout(jDesktopPane_add_motLayout);
        jDesktopPane_add_motLayout.setHorizontalGroup(
            jDesktopPane_add_motLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        jDesktopPane_add_motLayout.setVerticalGroup(
            jDesktopPane_add_motLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        jMenu_suporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suporte.png"))); // NOI18N
        jMenu_suporte.setText("Suporte");

        jMenuItem_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/configuracoes.png"))); // NOI18N
        jMenuItem_config.setText("Configurações");
        jMenuItem_config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_configActionPerformed(evt);
            }
        });
        jMenu_suporte.add(jMenuItem_config);

        jMenuItem_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        jMenuItem_sair.setText("Sair");
        jMenuItem_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_sairActionPerformed(evt);
            }
        });
        jMenu_suporte.add(jMenuItem_sair);

        jMenuBar_menu.add(jMenu_suporte);

        jMenu_estacionamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estacionamento.png"))); // NOI18N
        jMenu_estacionamento.setText("Estacionamento");

        jMenuItem_add_est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jMenuItem_add_est.setText("Adicionar ");
        jMenuItem_add_est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_add_estActionPerformed(evt);
            }
        });
        jMenu_estacionamento.add(jMenuItem_add_est);

        jMenuItem_ed_est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jMenuItem_ed_est.setText("Editar");
        jMenu_estacionamento.add(jMenuItem_ed_est);

        jMenuItem_exl_est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        jMenuItem_exl_est.setText("Excluir");
        jMenu_estacionamento.add(jMenuItem_exl_est);

        jMenuItem_pesq_est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar.png"))); // NOI18N
        jMenuItem_pesq_est.setText("Pesquisar");
        jMenu_estacionamento.add(jMenuItem_pesq_est);

        jMenuBar_menu.add(jMenu_estacionamento);

        jMenu_condutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/motoristas.png"))); // NOI18N
        jMenu_condutor.setText("Condutor");

        jMenuItem_add_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jMenuItem_add_mot.setText("Adicionar");
        jMenuItem_add_mot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_add_motActionPerformed(evt);
            }
        });
        jMenu_condutor.add(jMenuItem_add_mot);

        jMenuItem_ed_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jMenuItem_ed_mot.setText("Editar");
        jMenu_condutor.add(jMenuItem_ed_mot);

        jMenuItem_ex_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        jMenuItem_ex_mot.setText("Excluir");
        jMenu_condutor.add(jMenuItem_ex_mot);

        jMenuItem_pes_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar.png"))); // NOI18N
        jMenuItem_pes_mot.setText("Pesquisar");
        jMenuItem_pes_mot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_pes_motActionPerformed(evt);
            }
        });
        jMenu_condutor.add(jMenuItem_pes_mot);

        jMenuBar_menu.add(jMenu_condutor);

        jMenu_viaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viatura.png"))); // NOI18N
        jMenu_viaturas.setText("Viaturas");

        jMenuItem_add_via.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jMenuItem_add_via.setText("Adicionar");
        jMenu_viaturas.add(jMenuItem_add_via);

        jMenuItem_ed_via.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jMenuItem_ed_via.setText("Editar");
        jMenu_viaturas.add(jMenuItem_ed_via);

        jMenuItem_ex_via.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        jMenuItem_ex_via.setText("Excluir");
        jMenuItem_ex_via.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ex_viaActionPerformed(evt);
            }
        });
        jMenu_viaturas.add(jMenuItem_ex_via);

        jMenuItem_pes_via.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar.png"))); // NOI18N
        jMenuItem_pes_via.setText("Pesquisar");
        jMenu_viaturas.add(jMenuItem_pes_via);

        jMenuBar_menu.add(jMenu_viaturas);

        setJMenuBar(jMenuBar_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_add_mot, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_add_mot, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_add_estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_add_estActionPerformed
        Add_est_biblioteca telaAddEst = new Add_est_biblioteca();
        telaAddEst.setDefaultCloseOperation(Add_est_biblioteca.EXIT_ON_CLOSE);

        jDesktopPane_add_mot.add(telaAddEst);

        telaAddEst.setSize(1200, 900);

//        telaAddEst.setContentPane(jDesktopPane_add_mot);
        telaAddEst.setVisible(true);
    }//GEN-LAST:event_jMenuItem_add_estActionPerformed

    private void jMenuItem_pes_motActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_pes_motActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_pes_motActionPerformed

    private void jMenuItem_ex_viaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ex_viaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_ex_viaActionPerformed

    private void jMenuItem_configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_configActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_configActionPerformed

    private void jMenuItem_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem_sairActionPerformed

    private void jMenuItem_add_motActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_add_motActionPerformed

        Add_condutor telaAddCondutor = new Add_condutor();
        telaAddCondutor.setDefaultCloseOperation(Add_condutor.EXIT_ON_CLOSE);

        jDesktopPane_add_mot.add(telaAddCondutor);

        telaAddCondutor.setSize(800, 600);
//        telaAddEst.setContentPane(jDesktopPane_add_mot);
        telaAddCondutor.setVisible(true);


    }//GEN-LAST:event_jMenuItem_add_motActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame_biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame_biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame_biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame_biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame_biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane_add_mot;
    private javax.swing.JMenuBar jMenuBar_menu;
    private javax.swing.JMenuItem jMenuItem_add_est;
    private javax.swing.JMenuItem jMenuItem_add_mot;
    private javax.swing.JMenuItem jMenuItem_add_via;
    private javax.swing.JMenuItem jMenuItem_config;
    private javax.swing.JMenuItem jMenuItem_ed_est;
    private javax.swing.JMenuItem jMenuItem_ed_mot;
    private javax.swing.JMenuItem jMenuItem_ed_via;
    private javax.swing.JMenuItem jMenuItem_ex_mot;
    private javax.swing.JMenuItem jMenuItem_ex_via;
    private javax.swing.JMenuItem jMenuItem_exl_est;
    private javax.swing.JMenuItem jMenuItem_pes_mot;
    private javax.swing.JMenuItem jMenuItem_pes_via;
    private javax.swing.JMenuItem jMenuItem_pesq_est;
    private javax.swing.JMenuItem jMenuItem_sair;
    private javax.swing.JMenu jMenu_condutor;
    private javax.swing.JMenu jMenu_estacionamento;
    private javax.swing.JMenu jMenu_suporte;
    private javax.swing.JMenu jMenu_viaturas;
    // End of variables declaration//GEN-END:variables
}
