/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Administrador
 */
public class Add_est_esecd extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdicionarEstacionamento
     */
    public Add_est_esecd() {
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

        jPanel_add_est = new javax.swing.JPanel();
        jLabel_zona = new javax.swing.JLabel();
        jLabel_categoria_zona = new javax.swing.JLabel();
        jPanel_localizacao = new javax.swing.JPanel();
        jLabel_Comprimento = new javax.swing.JLabel();
        jLabel_largura = new javax.swing.JLabel();
        jLabel_altura = new javax.swing.JLabel();
        jSpinner_comprimento = new javax.swing.JSpinner();
        jSpinner_largura = new javax.swing.JSpinner();
        jSpinner_altura = new javax.swing.JSpinner();
        jPanel_dimensao = new javax.swing.JPanel();
        jLabel_latitude = new javax.swing.JLabel();
        jLabel_longitude = new javax.swing.JLabel();
        jTextField_latitude = new javax.swing.JTextField();
        jTextField_longetude = new javax.swing.JTextField();
        jComboBox_zona = new javax.swing.JComboBox<>();
        jComboBox_categoria_estacionamento = new javax.swing.JComboBox<>();
        jButton_enviar_est = new javax.swing.JButton();
        jButton_voltar_est = new javax.swing.JButton();

        setTitle("Adicionar Estacionamento");

        jLabel_zona.setText("Zona:");

        jLabel_categoria_zona.setText("Categoria:");

        jPanel_localizacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimensão:"));

        jLabel_Comprimento.setText("Comprimento:");

        jLabel_largura.setText("Largura:");

        jLabel_altura.setText("Altura:");

        jSpinner_comprimento.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(15.0f), Float.valueOf(1.0f)));

        jSpinner_largura.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(21.0f), Float.valueOf(1.0f)));

        javax.swing.GroupLayout jPanel_localizacaoLayout = new javax.swing.GroupLayout(jPanel_localizacao);
        jPanel_localizacao.setLayout(jPanel_localizacaoLayout);
        jPanel_localizacaoLayout.setHorizontalGroup(
            jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_localizacaoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_altura)
                    .addComponent(jLabel_largura)
                    .addComponent(jLabel_Comprimento))
                .addGap(41, 41, 41)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_largura, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jSpinner_altura)
                    .addComponent(jSpinner_comprimento))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel_localizacaoLayout.setVerticalGroup(
            jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_localizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Comprimento))
                .addGap(18, 18, 18)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_largura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_largura))
                .addGap(18, 18, 18)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_altura))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel_dimensao.setBorder(javax.swing.BorderFactory.createTitledBorder("Localização:"));

        jLabel_latitude.setText("Latitude:");

        jLabel_longitude.setText("Longetude:");

        javax.swing.GroupLayout jPanel_dimensaoLayout = new javax.swing.GroupLayout(jPanel_dimensao);
        jPanel_dimensao.setLayout(jPanel_dimensaoLayout);
        jPanel_dimensaoLayout.setHorizontalGroup(
            jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dimensaoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_latitude)
                    .addComponent(jLabel_longitude))
                .addGap(39, 39, 39)
                .addGroup(jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_latitude, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField_longetude))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel_dimensaoLayout.setVerticalGroup(
            jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dimensaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_latitude)
                    .addComponent(jTextField_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_longetude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_longitude))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jComboBox_zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESECD" }));

        jComboBox_categoria_estacionamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Estudante", "Funcionario", "Visitante", "Deficiente", "Motociclo" }));

        jButton_enviar_est.setText("Adicionar");

        jButton_voltar_est.setText("Voltar");

        javax.swing.GroupLayout jPanel_add_estLayout = new javax.swing.GroupLayout(jPanel_add_est);
        jPanel_add_est.setLayout(jPanel_add_estLayout);
        jPanel_add_estLayout.setHorizontalGroup(
            jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_estLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_voltar_est)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_add_estLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_dimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel_add_estLayout.createSequentialGroup()
                                    .addComponent(jLabel_categoria_zona)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox_categoria_estacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_add_estLayout.createSequentialGroup()
                                    .addComponent(jLabel_zona)
                                    .addGap(33, 33, 33)
                                    .addComponent(jComboBox_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_add_estLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_enviar_est)
                        .addContainerGap())))
        );
        jPanel_add_estLayout.setVerticalGroup(
            jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_estLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_zona))
                .addGap(18, 18, 18)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_categoria_estacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_categoria_zona))
                .addGap(29, 29, 29)
                .addComponent(jPanel_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_dimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_enviar_est)
                    .addComponent(jButton_voltar_est))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel_add_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_add_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_enviar_est;
    private javax.swing.JButton jButton_voltar_est;
    private javax.swing.JComboBox<String> jComboBox_categoria_estacionamento;
    private javax.swing.JComboBox<String> jComboBox_zona;
    private javax.swing.JLabel jLabel_Comprimento;
    private javax.swing.JLabel jLabel_altura;
    private javax.swing.JLabel jLabel_categoria_zona;
    private javax.swing.JLabel jLabel_largura;
    private javax.swing.JLabel jLabel_latitude;
    private javax.swing.JLabel jLabel_longitude;
    private javax.swing.JLabel jLabel_zona;
    private javax.swing.JPanel jPanel_add_est;
    private javax.swing.JPanel jPanel_dimensao;
    private javax.swing.JPanel jPanel_localizacao;
    private javax.swing.JSpinner jSpinner_altura;
    private javax.swing.JSpinner jSpinner_comprimento;
    private javax.swing.JSpinner jSpinner_largura;
    private javax.swing.JTextField jTextField_latitude;
    private javax.swing.JTextField jTextField_longetude;
    // End of variables declaration//GEN-END:variables
}
