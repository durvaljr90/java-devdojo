package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon ball", "TV", 175, "Ação");
        Anime anime2 = new Anime("Dragon ball", "TV", 175, "Ação", "Estudio IG");

//        anime("Dragon ball", "TV", 175, "Ação");
        anime.imprime();
        System.out.println("-------------------");
        anime2.imprime();


    }
}
