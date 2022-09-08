package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.servico.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodRefrenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
//        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
//        animeBiFunction.apply("Digimon", 73);
        System.out.println(animeBiFunction.apply("Digimon", 73));
    }
}
