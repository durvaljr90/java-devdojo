package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.MediaSalarioFuncionario;

public class FuncionariosTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        MediaSalarioFuncionario media = new MediaSalarioFuncionario();


        funcionario.setNome("Pedro");
        funcionario.setIdade(22);
        funcionario.setSalario(new double[]{800.0, 1230.0, 1500});

        funcionario.imprimeDados();
        media.mediaSalarioFuncionario(funcionario);

    }
}
