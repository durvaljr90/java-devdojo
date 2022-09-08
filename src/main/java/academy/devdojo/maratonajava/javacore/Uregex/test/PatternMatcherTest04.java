package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        // . 1.3 = 123, 133, 1@3, 1A3


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, ¨@!%zoro@mail.br, teste@gmail.com.br, sakura@mail";

        System.out.println("¨@!%zoro@mail.br".matches(regex));

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
