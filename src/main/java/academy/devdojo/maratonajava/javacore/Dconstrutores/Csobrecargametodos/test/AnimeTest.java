package academy.devdojo.maratonajava.javacore.Dconstrutores.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama drive", "TV", 12);
        anime.init("Dragon ball", "TV", 175, "Ação");
        anime.imprime();


    }
}
