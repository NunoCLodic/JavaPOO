package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Add_condutor extends javax.swing.JPanel {

    // Agrupar os botões em um ButtonGroup
    public Add_condutor() {
        initComponents();

        JInternalFrame addCondutorFrame = new JInternalFrame("Adicionar Condutor", true, true, true, true);
        addCondutorFrame.setSize(1365, 710);
        addCondutorFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        ButtonGroup sexoCondutor = new ButtonGroup();
        sexoCondutor.add(jRadioButton_feminino);
        sexoCondutor.add(jRadioButton_masculino);

        ButtonGroup categoriaCondutor = new ButtonGroup();
        categoriaCondutor.add(jRadioButton_professor);
        categoriaCondutor.add(jRadioButton_estudante);
        categoriaCondutor.add(jRadioButton_funcionario);

        ButtonGroup transporte = new ButtonGroup();
        transporte.add(jRadioButton_ligeiro);
        transporte.add(jRadioButton_motociclo);

        Color verdeClaro = new Color(144, 238, 144);
        Color amareloClaro = new Color(255, 255, 102);
        Color vermelhroClaro = new Color(255, 102, 102);
        Color azulClaro = new Color(150, 216, 230);
        Color rosaClaro = new Color(255, 150, 180);
        Color laranjaClaro = new Color(255, 200, 100);
        Color castanhoClaro = new Color(210, 180, 140);
        
        jRadioButton_professor.setSelected(true);
        jPanel_categoria.setBackground(verdeClaro);

        jPanel_detalheCategoria.add(new JLabel("ID do professor:"));
        jPanel_detalheCategoria.add(new JTextField(30));
        jPanel_detalheCategoria.add(new JLabel("Nome do Professor:"));
        jPanel_detalheCategoria.add(new JTextField(30));
        jPanel_detalheCategoria.add(new JLabel("Cadeira:"));
        jPanel_detalheCategoria.add(new JComboBox());//adicionar as opcoes

        // Adicionar ActionListeners para alternar formulários
        jRadioButton_professor.addActionListener((ActionEvent e) -> {
            jPanel_categoria.setBackground(verdeClaro);
            atualizarFormulario(jPanel_detalheCategoria, "Professor");
        });
        jRadioButton_estudante.addActionListener((ActionEvent e) -> {
            jPanel_categoria.setBackground(amareloClaro);
            atualizarFormulario(jPanel_detalheCategoria, "Estudante");
        });
        jRadioButton_funcionario.addActionListener((ActionEvent e) -> {
            jPanel_categoria.setBackground(vermelhroClaro);
            atualizarFormulario(jPanel_detalheCategoria, "Formulario");
        });

        ActionListener listenerSexo = (ActionEvent e) -> {
            if (jRadioButton_masculino.isSelected()) {
                jPanel_dadosCondutor.setBackground(azulClaro);
            } else {
                jPanel_dadosCondutor.setBackground(rosaClaro);
            }
        };

        ActionListener listenerTransporte = (ActionEvent e) -> {
            if (jRadioButton_ligeiro.isSelected()) {
                jPanel_dadosTransporte.setBackground(laranjaClaro);
            } else {
                jPanel_dadosTransporte.setBackground(castanhoClaro);
            }
        };
        
        jRadioButton_ligeiro.addActionListener(listenerTransporte);
        jRadioButton_motociclo.addActionListener(listenerTransporte);
        
        jRadioButton_masculino.addActionListener(listenerSexo);
        jRadioButton_feminino.addActionListener(listenerSexo);

        // Adicionar os painéis ao JFrame e mostrar
        addCondutorFrame.setLayout(new BorderLayout());
        jPanel_detalheCategoria.setLayout(new BoxLayout(jPanel_detalheCategoria, BoxLayout.Y_AXIS));
        addCondutorFrame.setVisible(true);
    }

    private void atualizarFormulario(JPanel jPanel_detalheCategoria, String tipo) {

        jPanel_detalheCategoria.removeAll();

        if ("Professor".equals(tipo)) {
            jPanel_detalheCategoria.add(new JLabel("ID do professor:"));
            jPanel_detalheCategoria.add(new JTextField(30));
            jPanel_detalheCategoria.add(new JLabel("Nome do Professor:"));
            jPanel_detalheCategoria.add(new JTextField(30));
            jPanel_detalheCategoria.add(new JLabel("Cadeira:"));
            jPanel_detalheCategoria.add(new JComboBox());//adicionar as opcoes
        } else if ("Estudante".equals(tipo)) {
            jPanel_detalheCategoria.add(new JLabel("Nº de Aluno:"));
            jPanel_detalheCategoria.add(new JTextField(30));
            jPanel_detalheCategoria.add(new JLabel("Nome do Estudante:"));
            jPanel_detalheCategoria.add(new JTextField(30));
            jPanel_detalheCategoria.add(new JLabel("Categoria"));
            jPanel_detalheCategoria.add(new JComboBox());//adicionar as opcoes
        } else {
            jPanel_detalheCategoria.add(new JLabel("ID do Funcionário:"));
            jPanel_detalheCategoria.add(new JTextField(30));
            jPanel_detalheCategoria.add(new JLabel("Nome do Funcionário:"));
            jPanel_detalheCategoria.add(new JTextField(30));
            jPanel_detalheCategoria.add(new JLabel("Seção:"));
            jPanel_detalheCategoria.add(new JComboBox());//adicionar as opcoes
        }

        // Atualizar o layout e repintar o painel
        jPanel_detalheCategoria.setVisible(true);
        jPanel_detalheCategoria.revalidate();
        jPanel_detalheCategoria.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_categoriaCondutor = new javax.swing.ButtonGroup();
        buttonGroup_sexoCondutor = new javax.swing.ButtonGroup();
        jPanel_add_condutor = new javax.swing.JPanel();
        jPanel_categoria = new javax.swing.JPanel();
        jRadioButton_estudante = new javax.swing.JRadioButton();
        jRadioButton_funcionario = new javax.swing.JRadioButton();
        jPanel_detalheCategoria = new javax.swing.JPanel();
        jRadioButton_professor = new javax.swing.JRadioButton();
        jPanel_dadosCondutor = new javax.swing.JPanel();
        jLabel_nomeCondutor = new javax.swing.JLabel();
        jLabel_dataCondutor = new javax.swing.JLabel();
        jLabel_sexo = new javax.swing.JLabel();
        jLabel_contribuinte = new javax.swing.JLabel();
        jLabel_contato = new javax.swing.JLabel();
        jTextField_nomeCondutor = new javax.swing.JTextField();
        jSpinner_dia = new javax.swing.JSpinner();
        jTextField_contribuinte = new javax.swing.JTextField();
        jTextField_contato = new javax.swing.JTextField();
        jRadioButton_masculino = new javax.swing.JRadioButton();
        jRadioButton_feminino = new javax.swing.JRadioButton();
        jLabel_Nconducao = new javax.swing.JLabel();
        jTextField_numeroCarta = new javax.swing.JTextField();
        jLabel_email = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jPanel_dadosTransporte = new javax.swing.JPanel();
        jLabel_matricula = new javax.swing.JLabel();
        jLabel_marca = new javax.swing.JLabel();
        jLabel_modelo = new javax.swing.JLabel();
        jLabel_anoViatura = new javax.swing.JLabel();
        jLabel_largura = new javax.swing.JLabel();
        jLabel_cor = new javax.swing.JLabel();
        jLabel_comprimento = new javax.swing.JLabel();
        jLabel_altura = new javax.swing.JLabel();
        jTextField_matricula = new javax.swing.JTextField();
        jTextField_altura = new javax.swing.JTextField();
        jTextField_largura = new javax.swing.JTextField();
        jTextField_comprimento = new javax.swing.JTextField();
        jSpinner_anoveiculo = new javax.swing.JSpinner();
        jComboBox_marca = new javax.swing.JComboBox<>();
        jComboBox_modelo = new javax.swing.JComboBox<>();
        jComboBox_cor = new javax.swing.JComboBox<>();
        jRadioButton_ligeiro = new javax.swing.JRadioButton();
        jRadioButton_motociclo = new javax.swing.JRadioButton();
        jButton_adicionar = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();

        jPanel_add_condutor.setBackground(new java.awt.Color(249, 249, 249));
        jPanel_add_condutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria:"));

        jRadioButton_estudante.setText("Estudante");

        jRadioButton_funcionario.setText("Funcionario");

        jPanel_detalheCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes categoria:"));

        javax.swing.GroupLayout jPanel_detalheCategoriaLayout = new javax.swing.GroupLayout(jPanel_detalheCategoria);
        jPanel_detalheCategoria.setLayout(jPanel_detalheCategoriaLayout);
        jPanel_detalheCategoriaLayout.setHorizontalGroup(
            jPanel_detalheCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jPanel_detalheCategoriaLayout.setVerticalGroup(
            jPanel_detalheCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jRadioButton_professor.setText("Professor");
        jRadioButton_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_professorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_categoriaLayout = new javax.swing.GroupLayout(jPanel_categoria);
        jPanel_categoria.setLayout(jPanel_categoriaLayout);
        jPanel_categoriaLayout.setHorizontalGroup(
            jPanel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_categoriaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_funcionario)
                    .addComponent(jRadioButton_estudante)
                    .addComponent(jRadioButton_professor))
                .addGap(36, 36, 36)
                .addComponent(jPanel_detalheCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_categoriaLayout.setVerticalGroup(
            jPanel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_categoriaLayout.createSequentialGroup()
                .addGroup(jPanel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_categoriaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jRadioButton_professor)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_estudante)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_funcionario))
                    .addGroup(jPanel_categoriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_detalheCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel_dadosCondutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Condutor"));

        jLabel_nomeCondutor.setText("Nome Completo:");

        jLabel_dataCondutor.setText("Data Nascimento:");

        jLabel_sexo.setText("Sexo:");

        jLabel_contribuinte.setText("Contribuinte:");

        jLabel_contato.setText("Contacto:");

        jSpinner_dia.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1742513364176L), new java.util.Date(-3600000L), new java.util.Date(), java.util.Calendar.YEAR));

        jRadioButton_masculino.setText("M");

        jRadioButton_feminino.setText("F");

        jLabel_Nconducao.setText("Nº Carta Condução:");

        jLabel_email.setText("Email:");

        javax.swing.GroupLayout jPanel_dadosCondutorLayout = new javax.swing.GroupLayout(jPanel_dadosCondutor);
        jPanel_dadosCondutor.setLayout(jPanel_dadosCondutorLayout);
        jPanel_dadosCondutorLayout.setHorizontalGroup(
            jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_dataCondutor)
                    .addComponent(jLabel_email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_nomeCondutor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nomeCondutor)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_sexo)
                .addGap(7, 7, 7)
                .addComponent(jRadioButton_masculino)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton_feminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                        .addComponent(jLabel_contribuinte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_contribuinte, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_contato)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                        .addComponent(jLabel_Nconducao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_numeroCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel_dadosCondutorLayout.setVerticalGroup(
            jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dadosCondutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nomeCondutor)
                    .addComponent(jTextField_nomeCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_contribuinte)
                    .addComponent(jTextField_contribuinte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_contato)
                    .addComponent(jTextField_contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dataCondutor)
                    .addComponent(jSpinner_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_sexo)
                    .addComponent(jRadioButton_masculino)
                    .addComponent(jRadioButton_feminino)
                    .addComponent(jLabel_Nconducao)
                    .addComponent(jTextField_numeroCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_dadosCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_email))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel_dadosTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Transporte"));

        jLabel_matricula.setText("Matricula:");

        jLabel_marca.setText("Marca:");

        jLabel_modelo.setText("Modelo:");

        jLabel_anoViatura.setText("Ano:");

        jLabel_largura.setText("Largura:");

        jLabel_cor.setText("Cor:");

        jLabel_comprimento.setText("Comprimento:");

        jLabel_altura.setText("Altura:");

        jSpinner_anoveiculo.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(631152000000L), new java.util.Date(), java.util.Calendar.YEAR));

        jComboBox_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---escolha a marca---", "Acura", "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "BMW", "Bugatti", "Buick", "Cadillac", "Chery", "Chevrolet", "Chrysler", "Citroën", "Dacia", "Daewoo", "Daihatsu", "Dodge", "Ferrari", "Fiat", "Fisker", "Ford", "Geely", "GMC", "Genesis", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Jaguar", "Jeep", "Kia", "Koenigsegg", "Lamborghini", "Lancia", "Land Rover", "Lexus", "Lincoln", "Lotus", "Maserati", "Mazda", "McLaren", "Mercedes-Benz", "Mini", "Mitsubishi", "Nissan", "Opel", "Pagani", "Peugeot", "Polestar", "Porsche", "RAM", "Renault", "Rivian", "Rolls-Royce", "Saab", "SEAT", "Škoda", "Subaru", "Suzuki", "Tata", "Tesla", "Toyota", "Volkswagen", "Volvo", "Wuling" }));

        jComboBox_modelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---escolha o modelo---" }));

        jComboBox_cor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---escolha a cor---", "Branco", "Preto", "Cinza", "Prata", "Vermelho", "Azul", "Verde", "Amarelo", "Prata Metálico", "Dourado", "Bronze", "Cobre", "Azul Metálico", "Verde Perolado", "Vermelho Perolado", "Preto Perolado", "Roxo", "Laranja", "Bege", "Castanho", "Rosa", "Turquesa", "Cinza Grafite" }));

        jRadioButton_ligeiro.setText("Ligueiro");

        jRadioButton_motociclo.setText("Motociclo");

        javax.swing.GroupLayout jPanel_dadosTransporteLayout = new javax.swing.GroupLayout(jPanel_dadosTransporte);
        jPanel_dadosTransporte.setLayout(jPanel_dadosTransporteLayout);
        jPanel_dadosTransporteLayout.setHorizontalGroup(
            jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dadosTransporteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_motociclo)
                    .addComponent(jRadioButton_ligeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_matricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_cor)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_matricula)
                    .addComponent(jComboBox_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_comprimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_marca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_modelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_largura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_largura, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_anoViatura)
                    .addComponent(jLabel_altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_altura, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jSpinner_anoveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel_dadosTransporteLayout.setVerticalGroup(
            jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_matricula)
                    .addComponent(jLabel_marca)
                    .addComponent(jLabel_modelo)
                    .addComponent(jLabel_anoViatura)
                    .addComponent(jTextField_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_anoveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_ligeiro))
                .addGap(16, 16, 16)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_cor)
                        .addComponent(jLabel_comprimento)
                        .addComponent(jLabel_altura)
                        .addComponent(jTextField_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton_motociclo))
                    .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_largura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_largura)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton_adicionar.setText("Adicionar");

        jButton_limpar.setText("Limpar");

        javax.swing.GroupLayout jPanel_add_condutorLayout = new javax.swing.GroupLayout(jPanel_add_condutor);
        jPanel_add_condutor.setLayout(jPanel_add_condutorLayout);
        jPanel_add_condutorLayout.setHorizontalGroup(
            jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_condutorLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton_limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 859, Short.MAX_VALUE)
                .addComponent(jButton_adicionar)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_add_condutorLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_dadosTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_dadosCondutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel_add_condutorLayout.setVerticalGroup(
            jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_condutorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_dadosCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_dadosTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_limpar)
                    .addComponent(jButton_adicionar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_add_condutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_add_condutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_professorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_professorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_categoriaCondutor;
    private javax.swing.ButtonGroup buttonGroup_sexoCondutor;
    private javax.swing.JButton jButton_adicionar;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JComboBox<String> jComboBox_cor;
    private javax.swing.JComboBox<String> jComboBox_marca;
    private javax.swing.JComboBox<String> jComboBox_modelo;
    private javax.swing.JLabel jLabel_Nconducao;
    private javax.swing.JLabel jLabel_altura;
    private javax.swing.JLabel jLabel_anoViatura;
    private javax.swing.JLabel jLabel_comprimento;
    private javax.swing.JLabel jLabel_contato;
    private javax.swing.JLabel jLabel_contribuinte;
    private javax.swing.JLabel jLabel_cor;
    private javax.swing.JLabel jLabel_dataCondutor;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_largura;
    private javax.swing.JLabel jLabel_marca;
    private javax.swing.JLabel jLabel_matricula;
    private javax.swing.JLabel jLabel_modelo;
    private javax.swing.JLabel jLabel_nomeCondutor;
    private javax.swing.JLabel jLabel_sexo;
    private javax.swing.JPanel jPanel_add_condutor;
    private javax.swing.JPanel jPanel_categoria;
    private javax.swing.JPanel jPanel_dadosCondutor;
    private javax.swing.JPanel jPanel_dadosTransporte;
    private javax.swing.JPanel jPanel_detalheCategoria;
    private javax.swing.JRadioButton jRadioButton_estudante;
    private javax.swing.JRadioButton jRadioButton_feminino;
    private javax.swing.JRadioButton jRadioButton_funcionario;
    private javax.swing.JRadioButton jRadioButton_ligeiro;
    private javax.swing.JRadioButton jRadioButton_masculino;
    private javax.swing.JRadioButton jRadioButton_motociclo;
    private javax.swing.JRadioButton jRadioButton_professor;
    private javax.swing.JSpinner jSpinner_anoveiculo;
    private javax.swing.JSpinner jSpinner_dia;
    private javax.swing.JTextField jTextField_altura;
    private javax.swing.JTextField jTextField_comprimento;
    private javax.swing.JTextField jTextField_contato;
    private javax.swing.JTextField jTextField_contribuinte;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_largura;
    private javax.swing.JTextField jTextField_matricula;
    private javax.swing.JTextField jTextField_nomeCondutor;
    private javax.swing.JTextField jTextField_numeroCarta;
    // End of variables declaration//GEN-END:variables
}
