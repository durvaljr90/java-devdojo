package academy.devdojo.maratonajava.introducao;

public class ExercicioEstruturasDeRepeticao {

    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 até 10000

        //Utilizando o for
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println("Valor par dentro do for: " + i);
            }
        }

        //Utilizando o while
        int count = 0;

        while (count <= 10000) {
            if (count % 2 == 0) {
                System.out.println("Valor par dentro do while: " + count);
            }
            count++;
        }

        //Utilizando o do-while
        int countDoWhile = 0;

        do {
            if (countDoWhile % 2 == 0) {
                System.out.println("Valor par dentro do Do-While " + countDoWhile);
            }
            countDoWhile++;
        } while (countDoWhile <= 10000);


        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000;

        int valorTotalCarro = 45000;


        for (int i = 1; i <= valorTotalCarro; i++) {

            double valorParcela = valorTotalCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Valor da parcela: " + valorParcela + " RS em " + i + " vezes");
        }

    }

}
