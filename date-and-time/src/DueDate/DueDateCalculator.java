package DueDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DueDateCalculator {

    public static void main(String[] args) {

        LocalDate dataVencimentoOriginal = LocalDate.of(2025, 3, 20);

        long mesesAdicionados = 1;

        LocalDate novoVencimento = dataVencimentoOriginal.plusMonths(mesesAdicionados);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataFinalFormatada = novoVencimento.format(formatador);

        System.out.println("Data de Vencimento Original: " + dataVencimentoOriginal.format(formatador));
        System.out.println("Meses de Adiamento: " + mesesAdicionados);
        System.out.println("Nova data de vencimento: " + dataFinalFormatada);
    }
}