package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for

        int count = 0;

        //contando de 0 até 9
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        System.out.println();
        count = 0;

        //contando de 1 até 10
        while (count < 10) {
            ++count;
            System.out.println(count);
        }

        count = 12;
        do {
            System.out.println("Entrou dentro do do-while");

        } while (count < 10);


        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }

        //Imprima os primeiros 25 numeros de um dado valor. Por exemplo 50.
        for (int i = 0; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("Valor de i " + i);
        }
    }
}
