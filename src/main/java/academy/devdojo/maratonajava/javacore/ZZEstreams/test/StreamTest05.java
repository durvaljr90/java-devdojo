package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));
        System.out.println("-------------");

        List<String> letters2 = words.stream()
                .map(l -> words.get(0).split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(letters2);


    }
}
