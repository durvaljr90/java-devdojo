package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String regex2 = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indece: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

        System.out.println("\n----------------------");

        //O Matcher uma vez que passou pelo indice de uma String ele não volta atrás para fazer a verificação novamente

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);

        System.out.println("texto2: " + texto2);
        System.out.println("indece: 0123456789");
        System.out.println("regex2 " + regex2);
        System.out.println("Posições encontradas");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " ");
        }


    }
}
