package ReportFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReportFormatter {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = agora.format(formatadorData);

        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = agora.format(formatadorHora);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);
    }
}