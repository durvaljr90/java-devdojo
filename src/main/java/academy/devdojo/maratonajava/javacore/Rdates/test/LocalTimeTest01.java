package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 34, 21);
        System.out.println(time);
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }
}
