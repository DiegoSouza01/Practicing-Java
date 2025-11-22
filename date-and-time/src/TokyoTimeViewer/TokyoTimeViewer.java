package TokyoTimeViewer;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TokyoTimeViewer {

    public static void main(String[] args) {
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime tokyoTime = ZonedDateTime.now(tokyoZone);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");

        String horarioFormatado = tokyoTime.format(formatador);

        System.out.println("Fuso Horário Local do Programa: " + ZonedDateTime.now().getZone());
        System.out.println("Horário atual em Tóquio: " + horarioFormatado);
    }
}