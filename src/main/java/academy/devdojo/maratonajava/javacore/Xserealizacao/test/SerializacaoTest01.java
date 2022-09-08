package academy.devdojo.maratonajava.javacore.Xserealizacao.test;

import academy.devdojo.maratonajava.javacore.Xserealizacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserealizacao.dominio.Turma;

import javax.management.ValueExp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Durval Nascimento", "12345678");
        Turma turma = new Turma("Maratona Java virado no Jiraya em breve ricos");
        aluno.setTurma(turma);
        serializar(aluno);
//        deserializar();
    }

    public static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
