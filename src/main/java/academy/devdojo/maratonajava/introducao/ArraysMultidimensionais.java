package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        int[][] dias = new int[3][3];

        dias[0][0] = 0;
        dias[0][1] = 1;
        dias[0][2] = 2;

        dias[1][0] = 10;
        dias[1][1] = 11;
        dias[1][2] = 12;

        dias[2][0] = 20;
        dias[2][1] = 21;
        dias[2][2] = 22;


        //vai iterar sobre as dimensões do array
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("---------------------------------------");
        //utilizand o forach para arrays multidimensionais
        for (int[] base : dias) {
            for (int numero : base) {
                System.out.println(numero);
            }
        }
        System.out.println("---------------------------------------");

        int[][] numeros = new int[3][];

        numeros[0] = new int[2];
        numeros[1] = new int[3];
        numeros[2] = new int[6];

        for (int[] base : numeros) {
            System.out.println();
            for (int num: base) {
                System.out.print(num);
            }
        }


    }
}
