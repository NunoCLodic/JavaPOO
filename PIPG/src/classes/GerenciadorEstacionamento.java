package classes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorEstacionamento {

    private HashSet<Estacionamento> estacionamentos;
    private HashSet<Transporte> transportes;
    private LocalDateTime horarioReserva = null;
    private Estacionamento estacionamento;
    boolean temOcupado;
    boolean temLivre;
    boolean temInativo;
    boolean temAtivo;
    boolean temReservado;

    public GerenciadorEstacionamento() {
        this.estacionamentos = new HashSet<>();
    }

    // Método para adicionar estacionamentos
    public void adicionarEstacionamento(Estacionamento estacionamento) {
        if (estacionamentos.contains(estacionamento)) {
            System.out.println("O estacionamento com ID (" + String.format("%03d", estacionamento.getIDestacionamento()) + ") já está na lista.");
        } else {
            estacionamentos.add(estacionamento);
            System.out.println("O estacionamento com ID (" + String.format("%03d", estacionamento.getIDestacionamento()) + ") adicionado com sucesso.");
        }
    }

    // Método para listar estacionamentos
    public void listarEstacionamentos() {
        if (estacionamentos.isEmpty()) {
            System.out.println("Nenhum estacionamento cadastrado.");
        } else {
            for (Estacionamento estacionamento : estacionamentos) {
                System.out.println(estacionamento.detalhesEstacionamento());
            }
        }
    }

    //metodo para contar todos estacionamentos
    public void totalEstacionamento() {
        System.out.println("A lista tem um total de " + estacionamentos.size() + " estacionamento(s)");
    }

    public void inativarEstacionamento(Estacionamento e) {
        e.estado1 = e.estado1.INATIVO;
    }

    //metodo para estacionar um transporte
    public void estacionarTransporte(Transporte t, Estacionamento e) {
        //FALTA VALIDAR A MATRICULA
        if (e.estado1 == e.estado1.ATIVO && e.estado2 == e.estado2.LIVRE) {
            if (t.getComprimento() <= e.getComprimentoMaximo()
                    && t.getLargura() <= e.getLarguraMaxima()
                    && (!e.getcoberto() || t.getAltura() <= e.getAlturaMaxima())) {

                LocalDateTime dataE = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy (HH:mm:ss)");
                String dataHoraFormatada = dataE.format(formatter);
                e.setDataHoraEstacionamento(dataHoraFormatada);

                // Estaciona o transporte e atualiza o estado do estacionamento
                e.setTransporte((t instanceof Viatura) ? (Viatura) t : null); // Associar transporte
                e.ocupar();// Atualiza o estado para ocupado
                System.out.println("O transporte com a matricula: " + t.getMatricula() + " estacionado no Estacionamento: " + String.format("%03d", e.getIDestacionamento()));
            } else {
                System.out.println("Falha! dimensões do transporte " + t.getMatricula() + " excedem os limites do estacionamento (" + String.format("%03d", e.getIDestacionamento()) + ")");
            }
        } else {
            System.out.println("O estacionamento (" + String.format("%03d", e.getIDestacionamento()) + ") não está disponível para uso, tente mais tarde!");
        }
    }

    //metodo que mostra a lista de estacionamentos ativos
    public void estacionamentosAtivo() {
        int contaAtivo = 0;
        temAtivo = false;
        for (Estacionamento estacionamento : estacionamentos) {
            if (estacionamento.getEstado1() == Estacionamento.Estado1.ATIVO) {
                System.out.println(estacionamento.detalhesEstacionamento());
                contaAtivo++;
                temAtivo = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("     ----------Total de estacionamento ativo: (" + contaAtivo + ") ------------");
        System.out.println("----------------------------------------------------------------------------");
    }

    //metodo que mostra mostra a lista de estacionamentos inativos
    public void estacionamentosInativo() {
        int contaInativo = 0;
        temInativo = false;
        for (Estacionamento estacionamento : estacionamentos) {
            if (estacionamento.getEstado1() == Estacionamento.Estado1.INATIVO) {
                System.out.println(estacionamento.detalhesEstacionamento());
                contaInativo++;
                temInativo = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("     ----------Total de estacionamento inativo: (" + contaInativo + ") ------------");
        System.out.println("----------------------------------------------------------------------------");
    }

    //metodo que mostra os estacionamentos livres
    public void estacionamentosLivre() {
        int contaLivre = 0;
        temLivre = false;

        for (Estacionamento estacionamento : estacionamentos) {
            if (estacionamento.getEstado1() == Estacionamento.Estado1.ATIVO && estacionamento.getEstado2() == Estacionamento.Estado2.LIVRE) {
                System.out.println(estacionamento.detalhesEstacionamento());
                contaLivre++;
                temLivre = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("     ----------Total de estacionamento livres: (" + contaLivre + ") ------------");
        System.out.println("----------------------------------------------------------------------------");
    }

    ///metodos que mostra os estacionamentos ocupados
    public void estacionamentosOcupado() {
        int contaOcupado = 0;
        temOcupado = false;

        for (Estacionamento estacionamento : estacionamentos) {
            if (estacionamento.getEstado2() == Estacionamento.Estado2.OCUPADO) {
                System.out.println(estacionamento.detalhesEstacionamento());
                contaOcupado++;
                temOcupado = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("     ----------Total de estacionamento ocupados: (" + contaOcupado + ") ------------");
        System.out.println("----------------------------------------------------------------------------");
    }

    public void estacionamentosReservados() {
        int contaReservado = 0;
        temReservado = false;

        for (Estacionamento estacionamento : estacionamentos) {
            if (estacionamento.getEstado2() == Estacionamento.Estado2.RESERVADO) {
                System.out.println(estacionamento.detalhesEstacionamento());
                contaReservado++;
                temReservado = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("     ----------Total de estacionamento reservados: (" + contaReservado + ") ------------");
        System.out.println("----------------------------------------------------------------------------");
    }

    public void listarEstacionamentos_Transportes() {
        int contaET = 0;
        if (temOcupado == true) {
            for (Estacionamento estacionamento : estacionamentos) {
                System.out.println("-> (" + String.format("%03d", estacionamento.getIDestacionamento()) + ")"); // falta add viatura e motorista
                contaET++;
            }
            System.out.println("Total estacionamento ocupado: (" + contaET + ")");
        } else {
            System.out.println("Nenhum estacionamento ocupado.");
        }
    }

    public void enviarNotificacaoSuporte() {
        System.out.println("Notificação enviada ao suporte.");

    }

    public void enviarNotificacaoMotorista() {
        System.out.println("Notificação enviada ao motorista.");
    }

    public void reservarEstacionamento(Transporte t, Estacionamento e) {
        LocalDateTime dataHoraInicioReserva = LocalDateTime.now();
        int tempoReserva = 20;
        LocalDateTime dataHoraFimReserva = dataHoraInicioReserva.plusMinutes(tempoReserva);

        if (e.estado1 == Estacionamento.Estado1.ATIVO && e.estado2 == Estacionamento.Estado2.LIVRE) {
            if (t.getComprimento() <= e.getComprimentoMaximo()
                    && t.getLargura() <= e.getLarguraMaxima()
                    && (!e.getcoberto() || t.getAltura() <= e.getAlturaMaxima())) {
                //captura a hora da reserva

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy (HH:mm:ss)");
                String dataHoraInicioReservaFormatada = dataHoraInicioReserva.format(formatter);
                e.setDataHoraEstacionamento(dataHoraInicioReservaFormatada);

                e.setTransporte((t instanceof Viatura) ? (Viatura) t : null); // Associar transporte
                e.estado2 = Estacionamento.Estado2.RESERVADO;
                horarioReserva = LocalDateTime.now(); // Registra o horário atual
                System.out.println("Estacionamento " + String.format("%03d", e.getIDestacionamento()) + " esta reservado para o transporte " + t.getMatricula() + " por 20 min...");
            } else {
                System.out.println("Transporte não atende os requisitos do estacionamento.");
            }
        } else {
            System.out.println("Não é possível reservar: estacionamento não está livre.");
        }
    }

    public void desocuparEstacionamento(Estacionamento e) {
        // Verifica se o estacionamento está ocupado
        if (e.getEstado2() == Estacionamento.Estado2.OCUPADO && e.getTransporte() != null) {
            // Atualiza o estado do estacionamento para LIVRE
            System.out.println("- O transporte com a matrícula " + e.getTransporte().getMatricula()
                    + " foi removido do estacionamento com ID " + String.format("%03d", e.getIDestacionamento()) + ".");
            e.liberar();
            e.setTransporte(null); // Remove a viatura associada
        } else {
            System.out.println("- Não é possível desocupar: o estacionamento (" + String.format("%03d", e.getIDestacionamento()) + ") já está livre!");
        }
    }

//    public void listarMatriculasPorDiaEstacionamento(LocalDate data, Estacionamento estacionamento) {
//        if (data == null || estacionamento == null) {
//            throw new IllegalArgumentException("A data e o estacionamento fornecidos não podem ser nulos.");
//        }
//
//        // Filtrar transportes estacionados no estacionamento na data especificada
//        List<String> matriculas = estacionamento.getTransportes().stream()
//                .filter(transporte -> transporte.getDataEstacionamento() != null
//                && estacionamento.getDataHoraEstacionamento().toLocalDate().isEqual(data))
//                .map(Transporte::getMatricula) // Extrai apenas a matrícula
//                .collect(Collectors.toList());
//
//        // Imprimir as matrículas filtradas
//        if (matriculas.isEmpty()) {
//            System.out.println("Nenhuma transporte foi estacionada na data especificada no estacionamento (" + estacionamento.getIDestacionamento() +")");
//        } else {
//            System.out.println("Matrículas estacionadas na data " + data + ":");
//            matriculas.forEach(System.out::println);
//        }
//    }
}
