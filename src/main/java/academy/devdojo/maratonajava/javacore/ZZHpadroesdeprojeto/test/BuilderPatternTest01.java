package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {

        Person build = new Person.PersonBuilder()
                .firstName("Durval")
                .lastName("Nascimento")
                .username("durval-nascimento")
                .email("durval@devdojoacademy")
                .build();

        System.out.println(build);


    }
}
