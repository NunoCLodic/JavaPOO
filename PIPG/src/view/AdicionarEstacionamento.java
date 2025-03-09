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
public class AdicionarEstacionamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdicionarEstacionamento
     */
    public AdicionarEstacionamento() {
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
        jLabel_localizacao = new javax.swing.JLabel();
        jLabel_dimensao = new javax.swing.JLabel();
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
        jButton_voltar_est = new javax.swing.JButton();
        jButton_enviar_est = new javax.swing.JButton();

        setTitle("Adicionar Estacionamento");

        jLabel_zona.setText("Zona:");

        jLabel_categoria_zona.setText("Categoria:");

        jLabel_localizacao.setText("Dimensao:");

        jLabel_dimensao.setText("Localização:");

        jLabel_Comprimento.setText("Comprimento");

        jLabel_largura.setText("Largura");

        jLabel_altura.setText("Altura");

        jSpinner_comprimento.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(15.0f), Float.valueOf(1.0f)));

        jSpinner_largura.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(21.0f), Float.valueOf(1.0f)));

        javax.swing.GroupLayout jPanel_localizacaoLayout = new javax.swing.GroupLayout(jPanel_localizacao);
        jPanel_localizacao.setLayout(jPanel_localizacaoLayout);
        jPanel_localizacaoLayout.setHorizontalGroup(
            jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_localizacaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Comprimento)
                    .addComponent(jSpinner_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_localizacaoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel_largura)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel_altura)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_localizacaoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jSpinner_largura, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jSpinner_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel_localizacaoLayout.setVerticalGroup(
            jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_localizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Comprimento)
                    .addComponent(jLabel_largura)
                    .addComponent(jLabel_altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_localizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_largura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel_latitude.setText("Latitude");

        jLabel_longitude.setText("Longetude");

        javax.swing.GroupLayout jPanel_dimensaoLayout = new javax.swing.GroupLayout(jPanel_dimensao);
        jPanel_dimensao.setLayout(jPanel_dimensaoLayout);
        jPanel_dimensaoLayout.setHorizontalGroup(
            jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dimensaoLayout.createSequentialGroup()
                .addGroup(jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_dimensaoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTextField_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dimensaoLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel_latitude)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_longetude, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dimensaoLayout.createSequentialGroup()
                        .addComponent(jLabel_longitude)
                        .addGap(26, 26, 26)))
                .addGap(33, 33, 33))
        );
        jPanel_dimensaoLayout.setVerticalGroup(
            jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dimensaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_latitude)
                    .addComponent(jLabel_longitude))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_dimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_longetude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jComboBox_zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox_categoria_estacionamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel_add_estLayout = new javax.swing.GroupLayout(jPanel_add_est);
        jPanel_add_est.setLayout(jPanel_add_estLayout);
        jPanel_add_estLayout.setHorizontalGroup(
            jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_estLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_dimensao)
                        .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_localizacao)
                            .addComponent(jLabel_categoria_zona)))
                    .addComponent(jLabel_zona))
                .addGap(18, 18, 18)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox_categoria_estacionamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 158, Short.MAX_VALUE)
                        .addComponent(jComboBox_zona, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_add_estLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel_dimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel_add_estLayout.setVerticalGroup(
            jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_estLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_zona)
                    .addComponent(jComboBox_zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_categoria_zona)
                    .addComponent(jComboBox_categoria_estacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_add_estLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel_localizacao))
                    .addGroup(jPanel_add_estLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_add_estLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_add_estLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_dimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_add_estLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel_dimensao)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButton_voltar_est.setText("Voltar");

        jButton_enviar_est.setText("Enviar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_add_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_voltar_est)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_enviar_est)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_add_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_voltar_est)
                    .addComponent(jButton_enviar_est))
                .addContainerGap(14, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel_dimensao;
    private javax.swing.JLabel jLabel_largura;
    private javax.swing.JLabel jLabel_latitude;
    private javax.swing.JLabel jLabel_localizacao;
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
