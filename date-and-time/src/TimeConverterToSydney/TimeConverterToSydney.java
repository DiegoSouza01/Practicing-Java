package TimeConverterToSydney;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConverterToSydney {

    public static void main(String[] args) {

        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");

        ZonedDateTime horarioLocal = ZonedDateTime.now();

        ZonedDateTime horarioSydney = horarioLocal.withZoneSameInstant(sydneyZone);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");

        String localFormatado = horarioLocal.format(formatador);
        String sydneyFormatado = horarioSydney.format(formatador);

        System.out.println("Fuso Horário do Sistema: " + horarioLocal.getZone());
        System.out.println("Fuso Horário de Sydney: " + sydneyZone);
        System.out.println("Horário atual no sistema: " + localFormatado);
        System.out.println("Horário atual em Sydney: " + sydneyFormatado);
    }
}