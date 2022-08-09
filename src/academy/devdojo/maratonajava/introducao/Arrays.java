package academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {

        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        /*valores padrão para inicialização de variaveis não primitivas
        byte, short, int, long, float e double = 0
        char '\u0000' = ' '
        boolean = false
        String = null
         */

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //outra forma de criar um array
        int[] numeros = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //outra forma de iniciar um array
        int[] numeros2 = new int[]{1,2,3,4,5};

        //utilizando o foreach
        for(int num : numeros2){
            System.out.println(num);
        }

    }
}
