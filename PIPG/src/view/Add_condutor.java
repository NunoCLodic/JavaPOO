package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Add_condutor extends javax.swing.JPanel {

// Agrupar os botões em um ButtonGroup
    public Add_condutor() {
        initComponents();

        JDesktopPane jDesktopPane = new JDesktopPane();

        JInternalFrame addCondutorFrame = new JInternalFrame("Adicionar Condutor", true, true, true, true);
        addCondutorFrame.setSize(jDesktopPane.getWidth(), jDesktopPane.getHeight());

        addCondutorFrame.setSize(1365, 710);
        addCondutorFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        jDesktopPane.add(addCondutorFrame);

// Centralizar o frame
        addCondutorFrame.setLocation(
                (jDesktopPane.getWidth() - addCondutorFrame.getWidth()) / 2,
                (jDesktopPane.getHeight() - addCondutorFrame.getHeight()) / 2
        );

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

//        jRadioButton_professor.setSelected(true);
//        jPanel_categoria.setBackground(verdeClaro);
//        jPanel_detalheCategoria.add(new JLabel("ID do professor:"));
//        jPanel_detalheCategoria.add(new JTextField(30));
//        jPanel_detalheCategoria.add(new JLabel("Nome do Professor:"));
//        jPanel_detalheCategoria.add(new JTextField(30));
//        jPanel_detalheCategoria.add(new JLabel("Cadeira:"));
//        jPanel_detalheCategoria.add(new JComboBox());//adicionar as opcoes
        jPanel_detalheCategoria.setPreferredSize(new Dimension(500, 180));

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

// Configurar o layout para o painel detalheCategoria
        jPanel_detalheCategoria.setLayout(new BoxLayout(jPanel_detalheCategoria, BoxLayout.Y_AXIS));

// Adicionar o painel ao frame principal
        addCondutorFrame.add(jPanel_detalheCategoria, BorderLayout.CENTER);

// Após configurar os componentes
        jPanel_detalheCategoria.revalidate();
        jPanel_detalheCategoria.repaint();

    }

    private void atualizarFormulario(JPanel jPanel_detalheCategoria, String tipo) {
// Remover todos os componentes existentes
        jPanel_detalheCategoria.removeAll();

// Configurar o painel com GridBagLayout
        jPanel_detalheCategoria.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

// Configurações comuns para o layout
        gbc.insets = new Insets(5, 5, 10, 10); // Margens entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL; // Expande os campos horizontalmente
        gbc.weightx = 1.0; // Permitir que o componente ocupe mais espaço
//        gbc.anchor = GridBagConstraints.EAST; // Alinhar à direita por padrão
//        gbc.fill = GridBagConstraints.NONE;//evita expandir os jlabel

// Verificar o tipo e adicionar os campos
        if ("Professor".equals(tipo)) {
            // Linha 1: ID do Professor
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0; // O JLabel não ocupa mais espaço
            jPanel_detalheCategoria.add(new JLabel("ID do Professor:"), gbc);

            gbc.gridx = 1;
            gbc.weightx = 1; // O JTextField pode expandir
            JTextField textFieldIdP = new JTextField(10);
            textFieldIdP.setPreferredSize(new Dimension(100, 30));
            jPanel_detalheCategoria.add(textFieldIdP, gbc);

            // Linha 2: Nome do Professor
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0;
            jPanel_detalheCategoria.add(new JLabel("Nome do professor:"), gbc);

            gbc.gridx = 1;
            gbc.weightx = 1; // O JTextField pode expandir
            JTextField textFieldNp = new JTextField(20);
            textFieldNp.setPreferredSize(new Dimension(200, 30));
            jPanel_detalheCategoria.add(textFieldNp, gbc);

            // Linha 3: Cadeira
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.weightx = 0;
            jPanel_detalheCategoria.add(new JLabel("Cadeira:"), gbc);
            
            gbc.gridx = 1;
            jPanel_detalheCategoria.add(new JComboBox<>(), gbc);

        } else if ("Estudante".equals(tipo)) {
            // Linha 1: Nº de Aluno
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0;
            jPanel_detalheCategoria.add(new JLabel("Nº do estudante:"), gbc);

            gbc.gridx = 1;
            gbc.weightx = 1; // O JTextField pode expandir
            JTextField textFieldIdA = new JTextField(20);
            textFieldIdA.setPreferredSize(new Dimension(200, 30));
            jPanel_detalheCategoria.add(textFieldIdA, gbc);

            // Linha 2: Nome do Estudante
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0;
            jPanel_detalheCategoria.add(new JLabel("Nome do estudante:"), gbc);

            gbc.gridx = 1;
            gbc.weightx = 1; // O JTextField pode expandir
            JTextField textFieldIdNe = new JTextField(20);
            textFieldIdNe.setPreferredSize(new Dimension(200, 30));
            jPanel_detalheCategoria.add(textFieldIdNe, gbc);

            // Linha 3: Categoria
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.weightx = 0;
            jPanel_detalheCategoria.add(new JLabel("Categoria:"), gbc);

            gbc.gridx = 1;
            jPanel_detalheCategoria.add(new JComboBox<>(), gbc);

        } else { // Funcionário
            // Linha 1: Nº de Funcionário
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0;
            jPanel_detalheCategoria.add(new JLabel("Nº de funcionario:"), gbc);
            

            gbc.gridx = 1;
            gbc.weightx = 1; // O JTextField pode expandir
            JTextField textFieldIdNe = new JTextField(20);
            textFieldIdNe.setPreferredSize(new Dimension(200, 30));
            jPanel_detalheCategoria.add(textFieldIdNe, gbc);

            // Linha 2: Nome do Funcionário
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0;
            jPanel_detalheCategoria.add(new JLabel("Nome do funcionario:"), gbc);
            

            gbc.gridx = 1;
            gbc.weightx = 1; // O JTextField pode expandir
            JTextField textFieldIdNf = new JTextField(20);
            textFieldIdNf.setPreferredSize(new Dimension(200, 30));
            jPanel_detalheCategoria.add(textFieldIdNf, gbc);

            // Linha 3: Seção
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.weightx = 0;
            jPanel_detalheCategoria.add(new JLabel("Secção:"), gbc);
            
            gbc.gridx = 1;
            jPanel_detalheCategoria.add(new JComboBox<>(), gbc);
        }

// Atualizar o painel
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
        jSpinner_anoveiculo = new javax.swing.JSpinner();
        jComboBox_marca = new javax.swing.JComboBox<>();
        jComboBox_modelo = new javax.swing.JComboBox<>();
        jComboBox_cor = new javax.swing.JComboBox<>();
        jRadioButton_ligeiro = new javax.swing.JRadioButton();
        jRadioButton_motociclo = new javax.swing.JRadioButton();
        jSpinner_comp = new javax.swing.JSpinner();
        jSpinner_larg = new javax.swing.JSpinner();
        jSpinner_alt = new javax.swing.JSpinner();
        jButton_adicionar = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();

        jPanel_add_condutor.setBackground(new java.awt.Color(249, 249, 249));
        jPanel_add_condutor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_comprimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_marca)
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_modelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_dadosTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel_largura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner_larg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_anoViatura)
                    .addComponent(jLabel_altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner_anoveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(13, 13, 13)
                .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_cor)
                        .addComponent(jLabel_comprimento)
                        .addComponent(jLabel_altura)
                        .addComponent(jComboBox_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton_motociclo)
                        .addComponent(jSpinner_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner_alt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dadosTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_largura)
                        .addComponent(jSpinner_larg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton_adicionar.setText("Adicionar");

        jButton_limpar.setText("Limpar");

        javax.swing.GroupLayout jPanel_add_condutorLayout = new javax.swing.GroupLayout(jPanel_add_condutor);
        jPanel_add_condutor.setLayout(jPanel_add_condutorLayout);
        jPanel_add_condutorLayout.setHorizontalGroup(
            jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_add_condutorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_add_condutorLayout.createSequentialGroup()
                        .addGroup(jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_dadosTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_dadosCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel_add_condutorLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel_add_condutorLayout.setVerticalGroup(
            jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_condutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_dadosCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_dadosTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_add_condutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_limpar)
                    .addComponent(jButton_adicionar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel_add_condutor, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel_add_condutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
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
    private javax.swing.JSpinner jSpinner_alt;
    private javax.swing.JSpinner jSpinner_anoveiculo;
    private javax.swing.JSpinner jSpinner_comp;
    private javax.swing.JSpinner jSpinner_dia;
    private javax.swing.JSpinner jSpinner_larg;
    private javax.swing.JTextField jTextField_contato;
    private javax.swing.JTextField jTextField_contribuinte;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_matricula;
    private javax.swing.JTextField jTextField_nomeCondutor;
    private javax.swing.JTextField jTextField_numeroCarta;
    // End of variables declaration//GEN-END:variables
}
