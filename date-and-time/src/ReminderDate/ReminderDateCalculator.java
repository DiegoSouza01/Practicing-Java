package ReminderDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReminderDateCalculator {

    public static void main(String[] args) {

        LocalDate dataVencimento = LocalDate.of(2025, 3, 30);

        long diasAntecedencia = 5;

        LocalDate dataLembrete = dataVencimento.minusDays(diasAntecedencia);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataLembreteFormatada = dataLembrete.format(formatador);

        System.out.println("Data de Vencimento: " + dataVencimento.format(formatador));
        System.out.println("Antecedência de Lembrete (dias): " + diasAntecedencia);
        System.out.println("Data do lembrete: " + dataLembreteFormatada);
    }
}