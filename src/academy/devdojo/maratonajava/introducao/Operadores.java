package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int valor01 = 10;
        int valor02 =20;
        double resultado = valor01 * valor02;
        System.out.println(resultado);

        // resto %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 100;
        bonus *= 2;
        bonus /= 3;
        bonus %= 2;
        System.out.println(bonus);


        // ++ --

    }
}
