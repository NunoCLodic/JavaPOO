package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame(String main_frme_em_tela_cheia) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar_menu = new javax.swing.JMenuBar();
        jMenu_suporte = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
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

        jDesktopPane.setPreferredSize(new java.awt.Dimension(1500, 950));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1336, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );

        jMenu_suporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suporte.png"))); // NOI18N
        jMenu_suporte.setText("Suporte");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casa27.png"))); // NOI18N
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_suporte.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Chat");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_suporte.add(jMenuItem2);

        jMenuItem_config.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/configuracoes.png"))); // NOI18N
        jMenuItem_config.setText("Configurações");
        jMenuItem_config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_configActionPerformed(evt);
            }
        });
        jMenu_suporte.add(jMenuItem_config);

        jMenuItem_sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
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

        jMenuItem_add_est.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_add_est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jMenuItem_add_est.setText("Adicionar ");
        jMenuItem_add_est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_add_estActionPerformed(evt);
            }
        });
        jMenu_estacionamento.add(jMenuItem_add_est);

        jMenuItem_ed_est.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_ed_est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jMenuItem_ed_est.setText("Editar");
        jMenu_estacionamento.add(jMenuItem_ed_est);

        jMenuItem_exl_est.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_exl_est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        jMenuItem_exl_est.setText("Excluir");
        jMenu_estacionamento.add(jMenuItem_exl_est);

        jMenuItem_pesq_est.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_pesq_est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar.png"))); // NOI18N
        jMenuItem_pesq_est.setText("Pesquisar");
        jMenu_estacionamento.add(jMenuItem_pesq_est);

        jMenuBar_menu.add(jMenu_estacionamento);

        jMenu_condutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/motoristas.png"))); // NOI18N
        jMenu_condutor.setText("Condutor");

        jMenuItem_add_mot.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem_add_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jMenuItem_add_mot.setText("Adicionar");
        jMenuItem_add_mot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_add_motActionPerformed(evt);
            }
        });
        jMenu_condutor.add(jMenuItem_add_mot);

        jMenuItem_ed_mot.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem_ed_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jMenuItem_ed_mot.setText("Editar");
        jMenu_condutor.add(jMenuItem_ed_mot);

        jMenuItem_ex_mot.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem_ex_mot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        jMenuItem_ex_mot.setText("Excluir");
        jMenu_condutor.add(jMenuItem_ex_mot);

        jMenuItem_pes_mot.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
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

        jMenuItem_add_via.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_add_via.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jMenuItem_add_via.setText("Adicionar");
        jMenu_viaturas.add(jMenuItem_add_via);

        jMenuItem_ed_via.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_ed_via.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jMenuItem_ed_via.setText("Editar");
        jMenu_viaturas.add(jMenuItem_ed_via);

        jMenuItem_ex_via.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_ex_via.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        jMenuItem_ex_via.setText("Excluir");
        jMenuItem_ex_via.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ex_viaActionPerformed(evt);
            }
        });
        jMenu_viaturas.add(jMenuItem_ex_via);

        jMenuItem_pes_via.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_pes_via.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar.png"))); // NOI18N
        jMenuItem_pes_via.setText("Pesquisar");
        jMenu_viaturas.add(jMenuItem_pes_via);

        jMenuBar_menu.add(jMenu_viaturas);

        setJMenuBar(jMenuBar_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_add_estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_add_estActionPerformed
// Limpar todos os InternalFrames do DesktopPane
        jDesktopPane.removeAll();

// Criar Internal Frame Add Estacionamento
        JInternalFrame addEstacionamentoFrame = new JInternalFrame("Adicionar Estacionamento", true, true, true, true);
        addEstacionamentoFrame.setSize(1365, 710);

// Adicionar o conteúdo ao InternalFrame
        Add_estacionamento telaAddEst = new Add_estacionamento();
        addEstacionamentoFrame.add(telaAddEst);
        addEstacionamentoFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

//para que o panel ocupe todo o espaço do frame
        addEstacionamentoFrame.setLayout(new BorderLayout());
        addEstacionamentoFrame.add(telaAddEst, BorderLayout.CENTER);

// Tornar o InternalFrame visível
        addEstacionamentoFrame.setVisible(true);

// Adicionar o InternalFrame ao DesktopPane
        jDesktopPane.add(addEstacionamentoFrame);
        jDesktopPane.revalidate();
        jDesktopPane.repaint();
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
        jDesktopPane.removeAll();
        JInternalFrame addCondutorFrame = new JInternalFrame("Adicionar Condutor", true, true, true, true);
        addCondutorFrame.setSize(1365, 710);
        Add_condutorF telaAddCond = new Add_condutorF();
        addCondutorFrame.add(telaAddCond);
        addCondutorFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        addCondutorFrame.setLayout(new BorderLayout());
        addCondutorFrame.add(telaAddCond, BorderLayout.CENTER);
        addCondutorFrame.setVisible(true);
        jDesktopPane.add(addCondutorFrame);
        jDesktopPane.revalidate();
        jDesktopPane.repaint();
    }//GEN-LAST:event_jMenuItem_add_motActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jDesktopPane.removeAll();
        //criar Internal Frame Home
        JInternalFrame homeFrame = new JInternalFrame("Home", true, true, true, true);
        homeFrame.setSize(1365, 710);
        homeFrame.setVisible(true);

        //adicionar conteudo ao internal Frame
        JLabel label = new JLabel("BEM-VINDO A TELA INICIAL!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        homeFrame.add(label);

        //Adicionar o InternalFrame ao DesktopPane
        jDesktopPane.add(homeFrame);
        jDesktopPane.revalidate();
        jDesktopPane.repaint();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //criar J framne principal
                MainFrame mainFrame = new MainFrame("Main frame em tela cheia");
                mainFrame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
                mainFrame.setVisible(true);

                //configurar para ocupar toda tela
                mainFrame.setExtendedState(MainFrame.MAXIMIZED_BOTH);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuBar jMenuBar_menu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
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
