package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
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

        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        System.out.println();
        System.out.println("d01 = " + d01.toString());
        System.out.println("d01 = " + d02.toString());
        System.out.println("d01 = " + d03.toString());
        System.out.println("d01 = " + d04.toString());
        System.out.println("d01 = " + d05.toString());
        System.out.println("d01 = " + d06.toString());
        System.out.println("d01 = " + d07.toString());
        System.out.println("d01 = " + d08.toString());
        System.out.println("d01 = " + d09.toString());
        System.out.println("d01 = " + d10.toString());
        System.out.println("d01 = " + d11.toString());
        System.out.println();

    }

    public int getTime() {
        return 0;
    }
}
