package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Durval"; //String constant pool
        String nome2 = "Durval";
        nome = nome.concat(" Nascimento"); // nome += " Nascimento"
        System.out.println(nome);
        System.out.println(nome == nome2); // verificando se o valor de referencia é igual e não comparando os valores da string
        String nome3 = new String("Durval");
        System.out.println(nome == nome3);
        System.out.println(nome == nome3.intern());

    }
}
