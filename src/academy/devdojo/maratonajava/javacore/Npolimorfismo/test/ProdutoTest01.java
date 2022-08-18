package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Nun10i7", 11000);
        Tomate tomate = new Tomate("vermelho", 10);

        CalcularImposto.calcularImposto(computador);
        CalcularImposto.calcularImposto(tomate);

    }
}
