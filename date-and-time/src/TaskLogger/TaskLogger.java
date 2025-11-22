package TaskLogger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaskLogger {

    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";

        LocalDateTime momentoCriacao = LocalDateTime.now();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS");

        String dataFormatada = momentoCriacao.format(dateFormat);
        String horaFormatada = momentoCriacao.format(timeFormat);

        System.out.println("Tarefa: " + tarefa);
        System.out.println("Data atual: " + dataFormatada);
        System.out.println("Hora atual: " + horaFormatada);
    }
}