package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("-------------------------");

        Tomate tomate = new Tomate("Tomate pequeno", 12);
        tomate.setDataValidade("11/12/2021");
        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
        System.out.println(tomate.calcularImposto());
        System.out.println(tomate.getDataValidade());


    }
}
