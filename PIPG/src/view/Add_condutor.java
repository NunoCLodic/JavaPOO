/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ButtonGroup;

public class Add_condutor extends javax.swing.JInternalFrame {
//    ButtonGroup grupoCategoria = new ButtonGroup();
//    grupoCategoria.add();
//    grupoCategoria.add();
//    grupoCategoria.add();
    
    
    public Add_condutor() {
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

        buttonGroup_categoria = new javax.swing.ButtonGroup();
        jPanel_add_condutor = new javax.swing.JPanel();
        jPanel_categoria = new javax.swing.JPanel();
        jRadioButton_professor = new javax.swing.JRadioButton();
        jRadioButton_estudante = new javax.swing.JRadioButton();
        jRadioButton_funcionario = new javax.swing.JRadioButton();
        jPanel_detalheCategoria = new javax.swing.JPanel();
        jPanel_dadosCondutor = new javax.swing.JPanel();
        jLabel_nomeCondutor = new javax.swing.JLabel();
        jLabel_dataCondutor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nomeCondutor = new javax.swing.JTextField();
        jSpinner_dia = new javax.swing.JSpinner();
        jTextField_contribuinte = new javax.swing.JTextField();
        jTextField_contato = new javax.swing.JTextField();
        jRadioButton_masculino = new javax.swing.JRadioButton();
        jRadioButton_feminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_numeroCarta = new javax.swing.JTextField();
        jPanel_dadosViatura = new javax.swing.JPanel();
        jLabel_matricula = new javax.swing.JLabel();
        jLabel_marca = new javax.swing.JLabel();
        jLabel_modelo = new javax.swing.JLabel();
        jLabel_anoViatura = new javax.swing.JLabel();
        jLabel_largura = new javax.swing.JLabel();
        jLabel_cor = new javax.swing.JLabel();
        jLabel_comprimento = new javax.swing.JLabel();
        jLabel_altura = new javax.swing.JLabel();
        jTextField_matricula = new javax.swing.JTextField();
        jTextField_marca = new javax.swing.JTextField();
        jTextField_modelo = new javax.swing.JTextField();
        jTextField_ano = new javax.swing.JTextField();
        jTextField_altura = new javax.swing.JTextField();
        jTextField_largura = new javax.swing.JTextField();
        jTextField_comprimento = new javax.swing.JTextField();
        jTextField_cor = new javax.swing.JTextField();
        jButton_adicionar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();

        setTitle("Adicionar Condutor");

        jPanel_add_condutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria:"));

        jRadioButton_professor.setText("Professor");

        jRadioButton_estudante.setText("Estudante");

        jRadioButton_funcionario.setText("Funcionario");

        jPanel_detalheCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes categoria:"));

        javax.swing.GroupLayout jPanel_detalheCategoriaLayout = new javax.swing.GroupLayout(jPanel_detalheCategoria);
        jPanel_detalheCategoria.setLayout(jPanel_detalheCategoriaLayout);
        jPanel_detalheCategoriaLayout.setHorizontalGroup(
            jPanel_detalheCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
        );
        jPanel_detalheCategoriaLayout.setVerticalGroup(
            jPanel_detalheCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_categoriaLayout = new javax.swing.GroupLayout(jPanel_categoria);
        jPanel_categoria.setLayout(jPanel_categoriaLayout);
        jPanel_categoriaLayout.setHorizontalGroup(
            jPanel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_categoriaLayout.createSequentialGroup()
                .addGroup(jPanel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_categoriaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel_detalheCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_categoriaLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jRadioButton_professor)
                        .addGap(86, 86, 86)
                        .addComponent(jRadioButton_estudante)
                        .addGap(81, 81, 81)
                        .addComponent(jRadioButton_funcionario)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel_categoriaLayout.setVerticalGroup(
            jPanel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_categoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_professor)
                    .addComponent(jRadioButton_estudante)
                    .addComponent(jRadioButton_funcionario))
                .addGap(18, 18, 18)
                .addComponent(jPanel_detalheCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_dadosCondutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Condutor"));

        jLabel_nomeCondutor.setText("Nome Completo:");

        jLabel_dataCondutor.setText("Data Nascimento:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Contribuinte:");

        jLabel5.setText("Contacto:");

        jSpinner_dia.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1742513364176L), new java.util.Date(-3600000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        jRadioButton_masculino.setText("M");

        jRadioButton_feminino.setText("F");

        jLabel6.setText("nº Carta Condução:");

        javax.swing.GroupLayout jPanel_dadosCondutorLayout = new javax.swing.GroupLayout(jPanel_dadosCondutor);
        jPanel_dadosCondutor.setLayout(jPanel_dadosCondutorLayout);
        jPanel_dadosCondutorLayout.setHorizontalGroup(
            jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nomeCondutor)
                    .addComponent(jLabel_dataCondutor))
                .addGap(68, 68, 68)
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                        .addComponent(jSpinner_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(jRadioButton_masculino)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_feminino))
                    .addComponent(jTextField_nomeCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_contribuinte, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_numeroCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_dadosCondutorLayout.setVerticalGroup(
            jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nomeCondutor)
                    .addComponent(jTextField_nomeCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_contribuinte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dataCondutor)
                    .addComponent(jSpinner_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton_masculino)
                    .addComponent(jRadioButton_feminino)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_numeroCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel_dadosViatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Viatura"));

        jLabel_matricula.setText("Matricula:");

        jLabel_marca.setText("Marca:");

        jLabel_modelo.setText("Modelo:");

        jLabel_anoViatura.setText("Ano:");

        jLabel_largura.setText("Largura:");

        jLabel_cor.setText("Cor:");

        jLabel_comprimento.setText("Comprimento:");

        jLabel_altura.setText("Altura:");

        javax.swing.GroupLayout jPanel_dadosViaturaLayout = new javax.swing.GroupLayout(jPanel_dadosViatura);
        jPanel_dadosViatura.setLayout(jPanel_dadosViaturaLayout);
        jPanel_dadosViaturaLayout.setHorizontalGroup(
            jPanel_dadosViaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel_dadosViaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dadosViaturaLayout.createSequentialGroup()
                        .addComponent(jLabel_matricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                        .addComponent(jLabel_cor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_cor)))
                .addGap(57, 57, 57)
                .addGroup(jPanel_dadosViaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                        .addComponent(jLabel_comprimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_comprimento))
                    .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                        .addComponent(jLabel_marca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(jPanel_dadosViaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                        .addComponent(jLabel_largura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_largura))
                    .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                        .addComponent(jLabel_modelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel_dadosViaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                        .addComponent(jLabel_altura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_altura))
                    .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                        .addComponent(jLabel_anoViatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_dadosViaturaLayout.setVerticalGroup(
            jPanel_dadosViaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dadosViaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dadosViaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_matricula)
                    .addComponent(jLabel_marca)
                    .addComponent(jLabel_modelo)
                    .addComponent(jLabel_anoViatura)
                    .addComponent(jTextField_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel_dadosViaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cor)
                    .addComponent(jLabel_comprimento)
                    .addComponent(jLabel_largura)
                    .addComponent(jLabel_altura)
                    .addComponent(jTextField_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_largura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton_adicionar.setText("Adicionar");

        jButton_cancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel_add_condutorLayout = new javax.swing.GroupLayout(jPanel_add_condutor);
        jPanel_add_condutor.setLayout(jPanel_add_condutorLayout);
        jPanel_add_condutorLayout.setHorizontalGroup(
            jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_condutorLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_dadosCondutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_dadosViatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel_add_condutorLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_adicionar)
                .addGap(50, 50, 50))
        );
        jPanel_add_condutorLayout.setVerticalGroup(
            jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_condutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_dadosCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_dadosViatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancelar)
                    .addComponent(jButton_adicionar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_add_condutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_add_condutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_categoria;
    private javax.swing.JButton jButton_adicionar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_altura;
    private javax.swing.JLabel jLabel_anoViatura;
    private javax.swing.JLabel jLabel_comprimento;
    private javax.swing.JLabel jLabel_cor;
    private javax.swing.JLabel jLabel_dataCondutor;
    private javax.swing.JLabel jLabel_largura;
    private javax.swing.JLabel jLabel_marca;
    private javax.swing.JLabel jLabel_matricula;
    private javax.swing.JLabel jLabel_modelo;
    private javax.swing.JLabel jLabel_nomeCondutor;
    private javax.swing.JPanel jPanel_add_condutor;
    private javax.swing.JPanel jPanel_categoria;
    private javax.swing.JPanel jPanel_dadosCondutor;
    private javax.swing.JPanel jPanel_dadosViatura;
    private javax.swing.JPanel jPanel_detalheCategoria;
    private javax.swing.JRadioButton jRadioButton_estudante;
    private javax.swing.JRadioButton jRadioButton_feminino;
    private javax.swing.JRadioButton jRadioButton_funcionario;
    private javax.swing.JRadioButton jRadioButton_masculino;
    private javax.swing.JRadioButton jRadioButton_professor;
    private javax.swing.JSpinner jSpinner_dia;
    private javax.swing.JTextField jTextField_altura;
    private javax.swing.JTextField jTextField_ano;
    private javax.swing.JTextField jTextField_comprimento;
    private javax.swing.JTextField jTextField_contato;
    private javax.swing.JTextField jTextField_contribuinte;
    private javax.swing.JTextField jTextField_cor;
    private javax.swing.JTextField jTextField_largura;
    private javax.swing.JTextField jTextField_marca;
    private javax.swing.JTextField jTextField_matricula;
    private javax.swing.JTextField jTextField_modelo;
    private javax.swing.JTextField jTextField_nomeCondutor;
    private javax.swing.JTextField jTextField_numeroCarta;
    // End of variables declaration//GEN-END:variables
}
