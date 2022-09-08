package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = findName("Durval");
        System.out.println(o1);


        String nameFind = o1.orElse("EMPTY");
        System.out.println(nameFind);

        o1.ifPresent(name -> System.out.println(name.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Durval", "Nascimento");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
