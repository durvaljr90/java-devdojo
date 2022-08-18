package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class Teste01 {
    public static void main(String[] args) {

        DatabaseLoader dataLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataLoader.load();
        fileLoader.load();

        System.out.println("-------");

        dataLoader.remove();
        fileLoader.remove();

        System.out.println("-------");

        dataLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
