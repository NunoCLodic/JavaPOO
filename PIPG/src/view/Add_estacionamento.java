/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javafx.scene.control.Spinner;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrador
 */
public class Add_estacionamento extends javax.swing.JPanel {

    /**
     * Creates new form Add_estacionamentoFF
     */
    public Add_estacionamento() {
        initComponents();
        jPanel_add_est.setPreferredSize(new Dimension(500, 640));

        JInternalFrame addEstacionamentoFrame = new JInternalFrame("Adicionar Condutor", true, true, true, true);
        addEstacionamentoFrame.setSize(1365, 710);
        addEstacionamentoFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        ButtonGroup coberto = new ButtonGroup();
        coberto.add(jRadioButton_coberto);
        coberto.add(jRadioButton_descoberto);

        jRadioButton_coberto.setSelected(true);

        jPanel_dimensao.add(new JLabel("Comprimento:"));
        jPanel_dimensao.add(new JSpinner(new SpinnerNumberModel(1, 1, 2, 0.1)));// Valor inicial: 15; Min: 1; Max: 1000; Incremento: 1
        jPanel_dimensao.add(new JLabel("Largura:"));
        jPanel_dimensao.add(new JSpinner(new SpinnerNumberModel(1, 1, 1.5, 0.1)));
        jPanel_dimensao.add(new JLabel("Altura:"));
        jPanel_dimensao.add(new JSpinner(new SpinnerNumberModel(2, 2, 3, 0.1)));
        jPanel_dimensao.setPreferredSize(new Dimension(300, 200));//ficar a dimensao do panel

        jRadioButton_coberto.addActionListener((ActionEvent e) -> {
            atualizarFormulario(jPanel_dimensao, "Coberto");
        });
        jRadioButton_descoberto.addActionListener((ActionEvent e) -> {
            atualizarFormulario(jPanel_dimensao, "Descoberto");
        });

//        // Adicionar os painéis ao JFrame e mostrar
//        addEstacionamentoFrame.setLayout(new BorderLayout());
//        jPanel_dimensao.setLayout(new BoxLayout(jPanel_dimensao, BoxLayout.Y_AXIS));
//        addEstacionamentoFrame.setVisible(true);
        JDesktopPane jDesktopPane = new JDesktopPane();
        jDesktopPane.add(addEstacionamentoFrame);

        // Garantir que a centralização acontece após o layout ser validado
        SwingUtilities.invokeLater(() -> {
            addEstacionamentoFrame.setLocation(
                    (jDesktopPane.getWidth() - addEstacionamentoFrame.getWidth()) / 2,
                    (jDesktopPane.getHeight() - addEstacionamentoFrame.getHeight()) / 2
            );
        });

        for (JInternalFrame frame : jDesktopPane.getAllFrames()) {
            if (frame.isIcon()) {
                // Se o frame estiver minimizado (icone), continue sem fechá-lo
                continue;
            }
            addEstacionamentoFrame.setVisible(true);
            jDesktopPane.revalidate();
            jDesktopPane.repaint();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_coberto = new javax.swing.ButtonGroup();
        jPanel_add_est = new javax.swing.JPanel();
        jLabel_zona = new javax.swing.JLabel();
        jLabel_categoria_zona = new javax.swing.JLabel();
        jPanel_dimensao = new javax.swing.JPanel();
        jPanel_localizacao = new javax.swing.JPanel();
        jLabel_latitude = new javax.swing.JLabel();
        jLabel_longitude = new javax.swing.JLabel();
        jTextField_latitude = new javax.swing.JTextField();
        jTextField_longetude = new javax.swing.JTextField();
        jComboBox_zona = new javax.swing.JComboBox<>();
        jComboBox_categoria_estacionamento = new javax.swing.JComboBox<>();
        jButton_enviar_est = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();
        jRadioButton_coberto = new javax.swing.JRadioButton();
        jRadioButton_descoberto = new javax.swing.JRadioButton();

        jPanel_add_est.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_zona.setText("Zona:");

        jLabel_categoria_zona.setText("Categoria:");

        jPanel_dimensao.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimensão:"));

        javax.swing.GroupLayout jPanel_dimensaoLayout = new javax.swing.GroupLayout(jPanel_dimensao);
        jPanel_dimensao.setLayout(jPanel_dimensaoLayout);
        jPanel_dimensaoLayout.setHorizontalGroup(
            jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_dimensaoLayout.setVerticalGroup(
            jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jPanel_localizacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Localização:"));

        jLabel_latitude.setText("Latitude:");

        jLabel_longitude.setText("Longetude:");

        javax.swing.GroupLayout jPanel_localizacaoLayout = new javax.swing.GroupLayout(jPanel_localizacao);
        jPanel_localizacao.setLayout(jPanel_localizacaoLayout);
        jPanel_localizacaoLayout.setHorizontalGroup(
            jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_localizacaoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_latitude)
                    .addComponent(jLabel_longitude))
                .addGap(39, 39, 39)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_latitude, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField_longetude))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel_localizacaoLayout.setVerticalGroup(
            jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_localizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_latitude)
                    .addComponent(jTextField_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_longetude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_longitude))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jComboBox_zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------------ Escolha a zona ------------------------", "SERVIÇOS CENTRAIS", "BIBLIOTECA", "ESECD", "ESS", "ESTG", "ESTH", " ", " " }));
        jComboBox_zona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_zonaActionPerformed(evt);
            }
        });

        jComboBox_categoria_estacionamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------------- Escolha a Categoria ----------------------", "PROFESSOR", "ESTUDANTE", "FUNCIONARIO", "VISITANTE", "DEFICIENTE", "MOTOCICLO" }));

        jButton_enviar_est.setText("Adicionar");

        jButton_limpar.setText("Limpar");

        jRadioButton_coberto.setText("Coberto");

        jRadioButton_descoberto.setText("Descoberto");

        javax.swing.GroupLayout jPanel_add_estLayout = new javax.swing.GroupLayout(jPanel_add_est);
        jPanel_add_est.setLayout(jPanel_add_estLayout);
        jPanel_add_estLayout.setHorizontalGroup(
            jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_estLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_add_estLayout.createSequentialGroup()
                        .addComponent(jButton_limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_enviar_est))
                    .addComponent(jPanel_dimensao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_localizacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_add_estLayout.createSequentialGroup()
                        .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_categoria_zona)
                            .addComponent(jLabel_zona))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_zona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_categoria_estacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_add_estLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jRadioButton_coberto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton_descoberto)
                                .addGap(78, 78, 78)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel_add_estLayout.setVerticalGroup(
            jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_add_estLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_zona)
                    .addComponent(jComboBox_zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_categoria_zona)
                    .addComponent(jComboBox_categoria_estacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_coberto)
                    .addComponent(jRadioButton_descoberto))
                .addGap(15, 15, 15)
                .addComponent(jPanel_dimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_limpar)
                    .addComponent(jButton_enviar_est))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jPanel_add_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel_add_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_zonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_zonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_zonaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_coberto;
    private javax.swing.JButton jButton_enviar_est;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JComboBox<String> jComboBox_categoria_estacionamento;
    private javax.swing.JComboBox<String> jComboBox_zona;
    private javax.swing.JLabel jLabel_categoria_zona;
    private javax.swing.JLabel jLabel_latitude;
    private javax.swing.JLabel jLabel_longitude;
    private javax.swing.JLabel jLabel_zona;
    private javax.swing.JPanel jPanel_add_est;
    private javax.swing.JPanel jPanel_dimensao;
    private javax.swing.JPanel jPanel_localizacao;
    private javax.swing.JRadioButton jRadioButton_coberto;
    private javax.swing.JRadioButton jRadioButton_descoberto;
    private javax.swing.JTextField jTextField_latitude;
    private javax.swing.JTextField jTextField_longetude;
    // End of variables declaration//GEN-END:variables

    private void atualizarFormulario(JPanel jPanel_dimensao, String coberto) {

        jPanel_dimensao.removeAll();

        SpinnerNumberModel comp = new SpinnerNumberModel(1, 1, 2, 0.1);// Valor inicial: 15; Min: 1; Max: 1000; Incremento: 1
        SpinnerNumberModel larg = new SpinnerNumberModel(1, 1, 1.5, 0.1);
        SpinnerNumberModel alt = new SpinnerNumberModel(2, 2, 3, 0.1);

        JSpinner spinnerC = new JSpinner(comp);
        JSpinner spinnerL = new JSpinner(larg);
        JSpinner spinnerA = new JSpinner(alt);

        if ("Coberto".equals(coberto)) {
            spinnerC.setPreferredSize(new Dimension(80, 30));
            spinnerL.setPreferredSize(new Dimension(80, 30));
            spinnerA.setPreferredSize(new Dimension(80, 30));

            jPanel_dimensao.add(new JLabel("Comprimento:"));
            jPanel_dimensao.add(new JSpinner(comp));
            jPanel_dimensao.add(new JLabel("Largura:"));
            jPanel_dimensao.add(new JSpinner(larg));
            jPanel_dimensao.add(new JLabel("Altura:"));
            jPanel_dimensao.add(new JSpinner(alt));
        } else {
            spinnerC.setPreferredSize(new Dimension(80, 30));
            spinnerL.setPreferredSize(new Dimension(80, 30));

            jPanel_dimensao.add(new JLabel("Comprimento:"));
            jPanel_dimensao.add(new JSpinner(comp));
            jPanel_dimensao.add(new JLabel("Largura:"));
            jPanel_dimensao.add(new JSpinner(larg));
        }

        // Atualizar o layout e repintar o painel
        jPanel_dimensao.setVisible(true);
        jPanel_dimensao.revalidate();
        jPanel_dimensao.repaint();
    }
}
