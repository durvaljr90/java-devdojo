package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> list = List.of("Goku", "Vegeta", "Kuririn", "Bulma");
        //forEach(list, System.out::println);
        forEach(list, nome -> System.out.println(nome));

    }

    private static <T> void forEach (List<T> list, Consumer<T> consumer){
        for(T e: list) {
            consumer.accept(e);
        }
    }
}
