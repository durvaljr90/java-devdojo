package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class Teste {
    public static void main(String[] args) {

        Local local01 = new Local("São Paulo");
        Local local02 = new Local("Rio de Janeiro");

        Seminario seminario01 = new Seminario("Matemática");
        Seminario seminario02 = new Seminario("Programação");
        Seminario seminario03 = new Seminario("Java");

        Aluno aluno01 = new Aluno("Naruto", 15);
        Aluno aluno02 = new Aluno("Rock-Lee", 16);

        Professor professor01 = new Professor("Jiraya", "PHD literatura");
        Professor professor02 = new Professor("Kakashi", "Mestre em exatas");

        Seminario[] seminarios = {seminario01, seminario02};
        Seminario[] seminarios02 = {seminario03};

        Aluno[] alunos = {aluno01, aluno02};

        Professor[] professores = {professor01, professor02};


        System.out.println("--- local ---");
        local01.imprimeLocalSeminario();
        local02.imprimeLocalSeminario();

        System.out.println("--- Seminários ---");
        seminario01.imprimeSeminarios();
        seminario02.imprimeSeminarios();
        seminario03.imprimeSeminarios();


        System.out.println("--- Professores ---");
        professor01.imprimeProfessorSeminarios();
        professor02.imprimeProfessorSeminarios();

        System.out.println("--- Alunos ---");
        aluno01.imprimeAlunoSeminarios();
        aluno02.imprimeAlunoSeminarios();

        System.out.println("--- Professores ministram ---");
        professor01.setSeminarios(seminarios);
        professor02.setSeminarios(seminarios02);

        professor01.imprimeProfessorSeminarios();
        professor02.imprimeProfessorSeminarios();

    }
}
