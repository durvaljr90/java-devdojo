package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;


public class JogadorTest {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Time time = new Time("Brasil");
        //Jogador[] jogadores = new Jogador[3];
        //Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();

    }
}
