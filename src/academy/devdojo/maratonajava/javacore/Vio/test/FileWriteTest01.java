package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O DevDojo é o melhor curso de java do Brasil!!!\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
