/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Add_transporte extends javax.swing.JPanel {

    public Add_transporte() {
        initComponents();

        ButtonGroup transporte = new ButtonGroup();

        transporte.add(jRadioButton_ligeiro);
        transporte.add(jRadioButton_motociclo);
        Color laranjaClaro = new Color(255, 200, 100);
        Color castanhoClaro = new Color(210, 180, 140);

//        jRadioButton_ligeiro.setSelected(true);
//        jPanel_transporte.setBackground(laranjaClaro);

        ActionListener listenerTransporte = (ActionEvent e) -> {
            if (jRadioButton_ligeiro.isSelected()) {
                jPanel_transporte.setBackground(laranjaClaro);
            } else {
                jPanel_transporte.setBackground(castanhoClaro);
            }
        };

        jRadioButton_ligeiro.addActionListener(listenerTransporte);
        jRadioButton_motociclo.addActionListener(listenerTransporte);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_transporte = new javax.swing.ButtonGroup();
        jPanel_addTransporte = new javax.swing.JPanel();
        jPanel_condutor = new javax.swing.JPanel();
        jComboBox_selectCondutor = new javax.swing.JComboBox<>();
        jTextField_pesquisa = new javax.swing.JTextField();
        jLabel_pesquisa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel_transporte = new javax.swing.JPanel();
        jLabel_matricula = new javax.swing.JLabel();
        jLabel_marca = new javax.swing.JLabel();
        jLabel_modelo = new javax.swing.JLabel();
        jLabel_anoViatura = new javax.swing.JLabel();
        jLabel_largura = new javax.swing.JLabel();
        jLabel_cor = new javax.swing.JLabel();
        jLabel_comprimento = new javax.swing.JLabel();
        jLabel_altura = new javax.swing.JLabel();
        jTextField_matricula = new javax.swing.JTextField();
        jSpinner_anoveiculo = new javax.swing.JSpinner();
        jComboBox_marca = new javax.swing.JComboBox<>();
        jComboBox_modelo = new javax.swing.JComboBox<>();
        jComboBox_cor = new javax.swing.JComboBox<>();
        jRadioButton_ligeiro = new javax.swing.JRadioButton();
        jRadioButton_motociclo = new javax.swing.JRadioButton();
        jSpinner_comp = new javax.swing.JSpinner();
        jSpinner_larg = new javax.swing.JSpinner();
        jSpinner_alt = new javax.swing.JSpinner();
        jButton_limpar = new javax.swing.JButton();
        jButton_addTransporte = new javax.swing.JButton();

        jPanel_addTransporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel_condutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Condutor"));

        jComboBox_selectCondutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "******************************Adicione o condutor******************************" }));

        jLabel_pesquisa.setText("ID:");

        jButton1.setText("Pesquisar");

        javax.swing.GroupLayout jPanel_condutorLayout = new javax.swing.GroupLayout(jPanel_condutor);
        jPanel_condutor.setLayout(jPanel_condutorLayout);
        jPanel_condutorLayout.setHorizontalGroup(
            jPanel_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_condutorLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jComboBox_selectCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel_pesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_condutorLayout.setVerticalGroup(
            jPanel_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_condutorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_selectCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_pesquisa)
                    .addComponent(jButton1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel_transporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Transporte"));

        jLabel_matricula.setText("Matricula:");

        jLabel_marca.setText("Marca:");

        jLabel_modelo.setText("Modelo:");

        jLabel_anoViatura.setText("Ano:");

        jLabel_largura.setText("Largura:");

        jLabel_cor.setText("Cor:");

        jLabel_comprimento.setText("Comprimento:");

        jLabel_altura.setText("Altura:");

        jTextField_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_matriculaActionPerformed(evt);
            }
        });

        jSpinner_anoveiculo.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(631152000000L), new java.util.Date(), java.util.Calendar.YEAR));

        jComboBox_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---escolha a marca---", "Acura", "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "BMW", "Bugatti", "Buick", "Cadillac", "Chery", "Chevrolet", "Chrysler", "Citroën", "Dacia", "Daewoo", "Daihatsu", "Dodge", "Ferrari", "Fiat", "Fisker", "Ford", "Geely", "GMC", "Genesis", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Jaguar", "Jeep", "Kia", "Koenigsegg", "Lamborghini", "Lancia", "Land Rover", "Lexus", "Lincoln", "Lotus", "Maserati", "Mazda", "McLaren", "Mercedes-Benz", "Mini", "Mitsubishi", "Nissan", "Opel", "Pagani", "Peugeot", "Polestar", "Porsche", "RAM", "Renault", "Rivian", "Rolls-Royce", "Saab", "SEAT", "Škoda", "Subaru", "Suzuki", "Tata", "Tesla", "Toyota", "Volkswagen", "Volvo", "Wuling" }));
        jComboBox_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_marcaActionPerformed(evt);
            }
        });

        jComboBox_modelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---escolha o modelo---" }));

        jComboBox_cor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---escolha a cor---", "Branco", "Preto", "Cinza", "Prata", "Vermelho", "Azul", "Verde", "Amarelo", "Prata Metálico", "Dourado", "Bronze", "Cobre", "Azul Metálico", "Verde Perolado", "Vermelho Perolado", "Preto Perolado", "Roxo", "Laranja", "Bege", "Castanho", "Rosa", "Turquesa", "Cinza Grafite" }));

        jRadioButton_ligeiro.setText("Ligueiro");
        jRadioButton_ligeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ligeiroActionPerformed(evt);
            }
        });

        jRadioButton_motociclo.setText("Motociclo");

        javax.swing.GroupLayout jPanel_transporteLayout = new javax.swing.GroupLayout(jPanel_transporte);
        jPanel_transporte.setLayout(jPanel_transporteLayout);
        jPanel_transporteLayout.setHorizontalGroup(
            jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_transporteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_cor)
                    .addComponent(jLabel_matricula))
                .addGap(18, 18, 18)
                .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_transporteLayout.createSequentialGroup()
                        .addComponent(jComboBox_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel_comprimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_transporteLayout.createSequentialGroup()
                        .addComponent(jTextField_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel_marca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_transporteLayout.createSequentialGroup()
                                .addComponent(jRadioButton_ligeiro)
                                .addGap(99, 99, 99)
                                .addComponent(jRadioButton_motociclo))
                            .addGroup(jPanel_transporteLayout.createSequentialGroup()
                                .addComponent(jComboBox_marca, 0, 130, Short.MAX_VALUE)
                                .addGap(73, 73, 73)
                                .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel_transporteLayout.createSequentialGroup()
                                        .addComponent(jLabel_modelo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_transporteLayout.createSequentialGroup()
                                        .addComponent(jLabel_largura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinner_larg, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_transporteLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel_anoViatura))
                                    .addComponent(jLabel_altura, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner_anoveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(63, 63, 63))
        );
        jPanel_transporteLayout.setVerticalGroup(
            jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_transporteLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_transporteLayout.createSequentialGroup()
                        .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_anoViatura)
                            .addComponent(jSpinner_anoveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel_transporteLayout.createSequentialGroup()
                        .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_motociclo)
                            .addComponent(jRadioButton_ligeiro))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_transporteLayout.createSequentialGroup()
                                    .addComponent(jComboBox_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_transporteLayout.createSequentialGroup()
                                    .addComponent(jLabel_modelo)
                                    .addGap(37, 37, 37)))
                            .addGroup(jPanel_transporteLayout.createSequentialGroup()
                                .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_matricula)
                                    .addComponent(jLabel_marca)
                                    .addComponent(jComboBox_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)))))
                .addGroup(jPanel_transporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cor)
                    .addComponent(jLabel_comprimento)
                    .addComponent(jLabel_largura)
                    .addComponent(jLabel_altura)
                    .addComponent(jComboBox_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_larg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_alt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jButton_limpar.setText("Limpar");
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
            }
        });

        jButton_addTransporte.setText("Adicionar");
        jButton_addTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addTransporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_addTransporteLayout = new javax.swing.GroupLayout(jPanel_addTransporte);
        jPanel_addTransporte.setLayout(jPanel_addTransporteLayout);
        jPanel_addTransporteLayout.setHorizontalGroup(
            jPanel_addTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_addTransporteLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel_addTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_transporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_condutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
            .addGroup(jPanel_addTransporteLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_addTransporte)
                .addGap(58, 58, 58))
        );
        jPanel_addTransporteLayout.setVerticalGroup(
            jPanel_addTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_addTransporteLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel_condutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel_transporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_addTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_limpar)
                    .addComponent(jButton_addTransporte))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_addTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel_addTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_limparActionPerformed

    private void jButton_addTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addTransporteActionPerformed

    private void jTextField_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_matriculaActionPerformed

    private void jComboBox_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_marcaActionPerformed

    private void jRadioButton_ligeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ligeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_ligeiroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_transporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_addTransporte;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JComboBox<String> jComboBox_cor;
    private javax.swing.JComboBox<String> jComboBox_marca;
    private javax.swing.JComboBox<String> jComboBox_modelo;
    private javax.swing.JComboBox<String> jComboBox_selectCondutor;
    private javax.swing.JLabel jLabel_altura;
    private javax.swing.JLabel jLabel_anoViatura;
    private javax.swing.JLabel jLabel_comprimento;
    private javax.swing.JLabel jLabel_cor;
    private javax.swing.JLabel jLabel_largura;
    private javax.swing.JLabel jLabel_marca;
    private javax.swing.JLabel jLabel_matricula;
    private javax.swing.JLabel jLabel_modelo;
    private javax.swing.JLabel jLabel_pesquisa;
    private javax.swing.JPanel jPanel_addTransporte;
    private javax.swing.JPanel jPanel_condutor;
    private javax.swing.JPanel jPanel_transporte;
    private javax.swing.JRadioButton jRadioButton_ligeiro;
    private javax.swing.JRadioButton jRadioButton_motociclo;
    private javax.swing.JSpinner jSpinner_alt;
    private javax.swing.JSpinner jSpinner_anoveiculo;
    private javax.swing.JSpinner jSpinner_comp;
    private javax.swing.JSpinner jSpinner_larg;
    private javax.swing.JTextField jTextField_matricula;
    private javax.swing.JTextField jTextField_pesquisa;
    // End of variables declaration//GEN-END:variables
}
