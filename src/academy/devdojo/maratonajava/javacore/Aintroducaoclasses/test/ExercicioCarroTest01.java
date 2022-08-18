package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class ExercicioCarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ford";
        carro1.modelo = "Fiesta";
        carro1.ano = 2006;

        carro2.nome = "Toyota";
        carro2.modelo = "Corrola";
        carro2.ano = 2004;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
