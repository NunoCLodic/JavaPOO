package view;

import javax.swing.JFrame;

public class MainFrame extends javax.swing.JDialog {

    public MainFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane_add_est = new javax.swing.JTabbedPane();
        jMenuBar_menu = new javax.swing.JMenuBar();
        jMenu_suporte = new javax.swing.JMenu();
        jMenuItem_config = new javax.swing.JMenuItem();
        jMenuItem_sair = new javax.swing.JMenuItem();
        jMenu_estacionamento = new javax.swing.JMenu();
        jMenuItem_add_est = new javax.swing.JMenuItem();
        jMenuItem_ed_est = new javax.swing.JMenuItem();
        jMenuItem_exl_est = new javax.swing.JMenuItem();
        jMenuItem_pesq_est = new javax.swing.JMenuItem();
        jMenu_motoristas = new javax.swing.JMenu();
        jMenuItem_add_mot = new javax.swing.JMenuItem();
        jMenuItem_ed_mot = new javax.swing.JMenuItem();
        jMenuItem_ex_mot = new javax.swing.JMenuItem();
        jMenuItem_pes_mot = new javax.swing.JMenuItem();
        jMenu_viaturas = new javax.swing.JMenu();
        jMenuItem_add_via = new javax.swing.JMenuItem();
        jMenuItem_ed_via = new javax.swing.JMenuItem();
        jMenuItem_ex_via = new javax.swing.JMenuItem();
        jMenuItem_pes_via = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pipg Project");
        setSize(new java.awt.Dimension(0, 0));

        jMenu_suporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suporte.png"))); // NOI18N
        jMenu_suporte.setText("Suporte");

        jMenuItem_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/configuracoes.png"))); // NOI18N
        jMenuItem_config.setText("Configurações");
        jMenu_suporte.add(jMenuItem_config);

        jMenuItem_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        jMenuItem_sair.setText("Sair");
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

        jMenu_motoristas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/motoristas.png"))); // NOI18N
        jMenu_motoristas.setText("Motoristas");

        jMenuItem_add_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jMenuItem_add_mot.setText("Adicionar");
        jMenu_motoristas.add(jMenuItem_add_mot);

        jMenuItem_ed_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jMenuItem_ed_mot.setText("Editar");
        jMenu_motoristas.add(jMenuItem_ed_mot);

        jMenuItem_ex_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        jMenuItem_ex_mot.setText("Excluir");
        jMenu_motoristas.add(jMenuItem_ex_mot);

        jMenuItem_pes_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar.png"))); // NOI18N
        jMenuItem_pes_mot.setText("Pesquisar");
        jMenuItem_pes_mot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_pes_motActionPerformed(evt);
            }
        });
        jMenu_motoristas.add(jMenuItem_pes_mot);

        jMenuBar_menu.add(jMenu_motoristas);

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
            .addGap(0, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_pes_motActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_pes_motActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_pes_motActionPerformed

    private void jMenuItem_ex_viaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ex_viaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_ex_viaActionPerformed

    private void jMenuItem_add_estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_add_estActionPerformed
        AdicionarEstacionamento  telaAddEst = new AdicionarEstacionamento();
       
    }//GEN-LAST:event_jMenuItem_add_estActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame dialog = new MainFrame(new javax.swing.JFrame(), true);
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
    private javax.swing.JMenuBar jMenuBar_menu;
    private javax.swing.JMenuItem jMenuItem1;
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
    private javax.swing.JMenu jMenu_estacionamento;
    private javax.swing.JMenu jMenu_motoristas;
    private javax.swing.JMenu jMenu_suporte;
    private javax.swing.JMenu jMenu_viaturas;
    private javax.swing.JTabbedPane jTabbedPane_add_est;
    // End of variables declaration//GEN-END:variables

}
