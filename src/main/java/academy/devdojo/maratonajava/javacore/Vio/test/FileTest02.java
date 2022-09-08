package academy.devdojo.maratonajava.javacore.Vio.test;


import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("folder");
        boolean isDirectoryCreate = directory.mkdir();
        System.out.println(isDirectoryCreate);

        //File fileDirectory = new File("C:\\Users\\Durva\\Documents\\Cursos\\devDojo\\maratona-java\\folder\\text.txt");
        File fileDirectory = new File(directory,"text.txt");
        boolean isCreateNewFile = fileDirectory.createNewFile();
        System.out.println(isCreateNewFile);

        File fileRenamed = new File(directory, "renamed_text.txt");
        boolean isRenamed = fileDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File directoryRenamed = new File("folder_2");
        boolean isDirectoryRenamed = directory.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);
    }
}
