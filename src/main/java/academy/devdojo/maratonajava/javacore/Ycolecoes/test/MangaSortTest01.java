package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on titan", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        System.out.println(mangas);

        for(Manga manga: mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------");

        Collections.sort(mangas);

        for(Manga manga: mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------");

        mangas.sort(new MangaByIdComparaor());
        for(Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}

class MangaByIdComparaor implements Comparator<Manga> {


    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
