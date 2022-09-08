package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Carro("BWM"));
        List<Carro> carros = retornaListaComObjeo(new Carro("Fusca"));

        System.out.println(carros);

    }

    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }

    private static <T> List<T> retornaListaComObjeo(T t) {
        return List.of(t);
    }
}
