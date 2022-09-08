package academy.devdojo.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 3)); // exclusivo o ultimo elemento não inclui no resultado
        System.out.println(numeros.substring(4)); // da posição informada até o final do elemento
        System.out.println(nome.trim()); // remove os valores em branco no inicio e no final


    }
}
