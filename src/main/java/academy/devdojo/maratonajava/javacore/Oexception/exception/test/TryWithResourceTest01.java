package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResourceTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
