package ProjectDeadline;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProjectDeadlineCalculator {

    public static void main(String[] args) {

        LocalDate dataInicio = LocalDate.of(2025, 3, 15);

        long prazoDias = 15;

        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataFinalFormatada = dataEntrega.format(formatador);

        System.out.println("Data de Início: " + dataInicio.format(formatador));
        System.out.println("Prazo em Dias: " + prazoDias);
        System.out.println("Data de entrega: " + dataFinalFormatada);
    }
}