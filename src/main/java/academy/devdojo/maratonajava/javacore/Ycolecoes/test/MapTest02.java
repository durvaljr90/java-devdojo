package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Durval Nascimento");
        Consumidor consumidor2 = new Consumidor("Amanda Almeida");

        Manga manga1 = new Manga(5L, "Attack on titan", 19.9, 0);
        Manga manga2 = new Manga(1L, "Berserk", 9.5, 5);
        Manga manga3 = new Manga(4L, "Hellsing Ultimate", 3.2, 0);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20, 2);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99, 0);

        Map<Consumidor, Manga> consumidorManda = new HashMap<>();
        consumidorManda.put(consumidor1, manga1);
        consumidorManda.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManda.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }
    }
}