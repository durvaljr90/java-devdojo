package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Durval Nascimento");
        Consumidor consumidor2 = new Consumidor("Amanda Almeida");

        Manga manga1 = new Manga(5L, "Attack on titan", 19.9, 0);
        Manga manga2 = new Manga(1L, "Berserk", 9.5, 5);
        Manga manga3 = new Manga(4L, "Hellsing Ultimate", 3.2, 0);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20, 2);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99, 0);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga5, manga1);
        Map<Consumidor, List<Manga>> consumidorManda = new HashMap<>();
        consumidorManda.put(consumidor1, mangaConsumidor1List);
        consumidorManda.put(consumidor2, mangaConsumidor2List);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorManda.entrySet()) {
            System.out.print("\n"+entry.getKey().getNome() + ": ");
            for (Manga manga : entry.getValue()) {
                System.out.print(manga.getNome() + " | ");
            }

        }



    }
}