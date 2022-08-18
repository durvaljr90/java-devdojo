package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class Teste {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua principal", "01234-567");
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Vegeta");
        pessoa.setCpf("12312345676");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----------");

        funcionario.setNome("Goku");
        funcionario.setCpf("0092123212");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(15000);

        funcionario.imprime();



    }
}
