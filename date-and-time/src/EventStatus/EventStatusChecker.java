package EventStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EventStatusChecker {

    public static void main(String[] args) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dataEvento = LocalDate.of(2025, 3, 10);

        LocalDate dataAtual = LocalDate.now();

        String statusEvento;

        if (dataEvento.isBefore(dataAtual)) {
            statusEvento = "O evento já ocorreu.";
        } else if (dataEvento.isAfter(dataAtual)) {
            statusEvento = "O evento ainda está por vir.";
        } else {
            statusEvento = "O evento é hoje!";
        }

        System.out.println("Data do evento: " + dataEvento.format(formatador));
        System.out.println("Data atual: " + dataAtual.format(formatador));
        System.out.println(statusEvento);
    }
}