package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        for (int episidio : this.episodios) {
            System.out.print(episidio + " ");
        }
    }
}
