package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalDate date = LocalDate.of(2022, 12,12);
//        LocalTime time = LocalTime.of(13, 18,39);
        LocalDate date = LocalDate.parse("2022-03-19");
        LocalTime time = LocalTime.parse("04:21:23");

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
