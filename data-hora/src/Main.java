import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("INSTANCIANDO DATA-HORA:");
        System.out.println("d01:  " + d01);
        System.out.println("d02:  " + d02);
        System.out.println("d03:  " + d03);
        System.out.println("d04:  " + d04);
        System.out.println("d05:  " + d05);
        System.out.println("d06:  " + d06);
        System.out.println("d07:  " + d07);
        System.out.println("d08:  " + d08);
        System.out.println("d09:  " + d09);
        System.out.println("d010: " + d10);
        System.out.println("d011: " + d11);

        System.out.println("\nCONVERTENDO DATA-HORA P/ TEXTO");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04);
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));

        //Nao possui format direto
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));

        System.out.println("\nCONVERTENDO DATA-HORA GLOBAL PARA LOCAL:"); 
        LocalDate d12 = LocalDate.parse("2022-07-20");
        LocalDateTime d13 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d14 =Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d14, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d14, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d14, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d14, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d12 dia = " + d12.getDayOfMonth());
        System.out.println("d12 mês = " + d12.getMonthValue());
        System.out.println("d12 ano = " + d12.getYear());

        System.out.println("d13 hora = " + d13.getHour());
        System.out.println("d13 minuto = " + d13.getMinute());

        System.out.println("\nCÁLCULOS COM DATA-HORA");
        LocalDate pastWeekLocalDate = d12.minusDays(7);
        LocalDate nextWeekLocalDate = d12.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d13.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d13.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d14.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d14.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalDateTime = " + pastWeekInstant);
        System.out.println("nextWeekLocalDateTime = " + nextWeekInstant);

        //Pra realizar between LocalDate deve ser convertido para LocalDateTime
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d12.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d13);
        Duration t3 = Duration.between(pastWeekInstant, d14);
        Duration t4 = Duration.between(d14, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
