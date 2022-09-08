package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();

        calculadora.multiplicaDoisNumeros(4, 7);

        double result = calculadora.divideDoisNumeros(4, 2);

        System.out.println(result);

        calculadora.divideDoisNumeros02(19, 3);

        int[] numerosArray = {2, 4, 6, 8, 10, 12};

        calculadora.somaArray(numerosArray);

        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
