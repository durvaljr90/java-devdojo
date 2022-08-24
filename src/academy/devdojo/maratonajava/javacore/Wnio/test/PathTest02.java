package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("pasta");
        if (Files.notExists(folderPath)) {
            Path fileDirectory = Files.createDirectory(folderPath);
        }
        Path subFolderPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subFolderDirectory = Files.createDirectories(subFolderPath);
        Path filePath = Paths.get(subFolderPath.toString(), "texto.txt");

        if (Files.notExists(filePath)) {
            Path filaPathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "renamed_texto.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
