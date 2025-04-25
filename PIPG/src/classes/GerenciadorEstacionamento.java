package classes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;

public class GerenciadorEstacionamento {

    private HashSet<Estacionamento> estacionamentos;
    private LocalDateTime horarioReserva = null;
    private Estacionamento estacionamento;

    public GerenciadorEstacionamento() {
        this.estacionamentos = new HashSet<>();
    }

    // Método para adicionar estacionamentos
    public void adicionarEstacionamento(Estacionamento estacionamento) {
        if (estacionamentos.contains(estacionamento)) {
            System.out.println("O estacionamento com ID " + estacionamento.getIDestacionamento() + " já está na lista.");
        } else {
            estacionamentos.add(estacionamento);
            System.out.println("O estacionamento com ID " + estacionamento.getIDestacionamento() + " adicionado com sucesso.");
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

    public void totalEstacionamento() {
        System.out.println("A lista tem um total de " + estacionamentos.size() + " estacionamento(s)");
    }

    public void estacionarTransporte(Transporte t, Estacionamento e) {
        //FALTA VALIDAR A MATRICULA

        if (e.estado1 == e.estado1.ATIVO && e.estado2 == e.estado2.LIVRE) {
            if (t.getComprimento() <= e.getComprimentoMaximo()
                    && t.getLargura() <= e.getLarguraMaxima()
                    && (!e.getcoberto() || t.getAltura() <= e.getAlturaMaxima())) {

                // Estaciona o transporte e atualiza o estado do estacionamento
                e.setViatura((t instanceof Viatura) ? (Viatura) t : null); // Associar transporte

                e.estado2 = e.estado2.OCUPADO; // Atualiza o estado para ocupado

                System.out.println("O transporte com a matricula: " + t.getMatricula() + " estacionado no ID Estacionamento: " + String.format("%03d", e.getIDestacionamento()));

            } else {
                System.out.println("Dimensões do transporte excedem os limites do estacionamento.");
            }
        } else {
            System.out.println("O estacionamento não está disponível para uso.");
        }
    }

    public void estacionamentoLivre() {
        int contaLivre = 0;
        boolean temLivre = false;

        for (Estacionamento estacionamento : estacionamentos) {
            if (estacionamento.getEstado2() == Estacionamento.Estado2.LIVRE) {
                System.out.println(estacionamento.detalhesEstacionamento());
                contaLivre++;
                temLivre = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("     ----------Total de estacionamento livres: (" + contaLivre + ") ------------");
        System.out.println("----------------------------------------------------------------------------");
        if (!temLivre) {
            System.out.println("Nenhum estacionamento livre no momento!");
        }
    }

    public void estacionamentoOcupado() {
        int contaOcupado = 0;
        boolean temOcupado = false;

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
        if (!temOcupado) {
            System.out.println("Nenhum estacionamento ocupado!");
        }

    }

    public void listarEstacionamentoTransporte() {

    }

    public void enviarNotificacaoSuporte() {
        System.out.println("Notificação enviada ao suporte.");

    }

    public void enviarNotificacaoMotorista() {
        System.out.println("Notificação enviada ao motorista.");
    }

    public void reservarEstacionamento(Transporte t, Estacionamento e) {
        verificarReservaExpirada(); // Verifica antes de tentar reservar
        if (e.estado1 == Estacionamento.Estado1.ATIVO && e.estado2 == Estacionamento.Estado2.LIVRE) {
            if (t.getComprimento() <= e.getComprimentoMaximo()
                    && t.getLargura() <= e.getLarguraMaxima()
                    && (!e.getcoberto() || t.getAltura() <= e.getAlturaMaxima())) {

                e.setViatura((t instanceof Viatura) ? (Viatura) t : null); // Associar transporte
                e.estado2 = Estacionamento.Estado2.RESERVADO;
                horarioReserva = LocalDateTime.now(); // Registra o horário atual
                System.out.println("Estacionamento reservado para o transporte " + t.getMatricula() + " por 20 min...");
            } else {
                System.out.println("Transporte não atende os requisitos do estacionamento.");
            }
        } else {
            System.out.println("Não é possível reservar: estacionamento não está livre.");
        }
    }

    public void verificarReservaExpirada() {
        if (horarioReserva != null && estacionamento.estado2 == Estacionamento.Estado2.RESERVADO) {
            LocalDateTime agora = LocalDateTime.now();
            Duration duracao = Duration.between(horarioReserva, agora);

            if (duracao.toMinutes() > 20) {
                estacionamento.liberar(); // Método que muda o estado para LIVRE
                horarioReserva = null; // Remove o horário da reserva
                System.out.println("A reserva expirou. O estacionamento foi liberado.");
            }
        }
    }

//    public void desocuparEstacionamento(Transporte t, Estacionamento e) {
//        if (estacionamento.estado2 == Estacionamento.Estado2.OCUPADO && t != null && transporte.getMatricula().equals(t.getMatricula())) {
//            estacionamento.estado2 = Estacionamento.Estado2.LIVRE;
//            e.setViatura() = null; // Remove a viatura associada
//            System.out.println("Estacionamento desocupado.");
//        } else {
//            System.out.println("Não é possível desocupar: estacionamento não ocupado por esta viatura.");
//        }
//    }
//
//    public List<Transporte> listarTransportesPorDia(LocalDate data) {
//        return transportes.stream()
//                .filter(transporte -> transporte.getDataEstacionamento() != null
//                && transporte.isEqual(data))
//                .collect(Collectors.toList());
//    }
//    public void mostrarViaturasPorDia(LocalDate data) {
//        List<Transporte> transportesNoDia = listarTransportesPorDia(data);
//
//        if (transportesNoDia.isEmpty()) {
//            System.out.println("**********************MOSTRAR TRANSPORTE POR DIA*************************");
//            System.out.println("Nenhuma viatura estacionada na data " + data);
//        } else {
//            System.out.println("**********************MOSTRAR TRANSPORTE POR DIA*************************");
//            System.out.println("Viaturas estacionadas em " + data + ":");
//            for (Transporte transporte : transportesNoDia) {
//                System.out.println("- " + transporte.getMatricula());
//            }
//        }
//    }
}
