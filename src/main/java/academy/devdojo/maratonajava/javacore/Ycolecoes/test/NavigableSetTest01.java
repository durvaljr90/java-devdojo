package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new marcaSmartphoneComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");

        set.add(smartphone);

        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new comparePrecoManga());
        mangas.add(new Manga(5L, "Attack on titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        // métodos para verificar valor numerico que são ou mesmo valor ou o anterior/proximo na sequencia do objeto passado como parametro
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        Manga yuyuHakusho = new Manga(10L, "Yuyu Hakusho", 3.2);

        System.out.println("-----------------------");
        System.out.println(mangas.lower(yuyuHakusho));
        System.out.println(mangas.floor(yuyuHakusho));
        System.out.println(mangas.higher(yuyuHakusho));
        System.out.println(mangas.ceiling(yuyuHakusho));

        System.out.println("-----------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}

class marcaSmartphoneComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class comparePrecoManga implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(), manga2.getPreco());
    }
}
