package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os espaços em branco
        // \w = tudo de a-z A-Z, digitos, _
        // \W = Caracetres especiais e em branco
        // [] range de caracteres
        // ? Zero ou uma ocorrência
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0x 0xFFABC 0x19G 0x32";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indece: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
