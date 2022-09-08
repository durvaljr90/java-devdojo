package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Eleve ", "o ", "seu ", "Conhecimento ", "ao cosmo")
                .map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println();

        int[] nums = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        Arrays.stream(nums)
                .average()
                .ifPresent(n -> System.out.printf("%.2f", n));

        System.out.println();

        try (Stream<String> lines = Files.lines(Paths.get("pasta/teste.txt"))) {
            lines.filter(l -> l.contains("Java")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
