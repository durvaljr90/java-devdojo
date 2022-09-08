package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepositorio.findByTitle("Boku no Hero");

        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepositorio.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        Manga mangaByTitle2 = MangaRepositorio.findByTitle("Dragon Ball Z")
                .orElse(new Manga(3, "Dragon Ball Z", 291));
        //.orElseGet(() -> new Manga(3, "Dragon Ball Z", 291));

        System.out.println(mangaByTitle2);

    }
}
