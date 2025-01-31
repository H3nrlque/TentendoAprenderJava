package ExerciosPacoteNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.ZoneId;

public class ExercicioBasicFileAttributes1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/arquivo.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Tmanho do arquivo: "+basicFileAttributes.fileKey());
        System.out.println("Data de criação: "+basicFileAttributes.creationTime().toInstant().atZone(ZoneId.systemDefault()));
        System.out.println("Data de última modificação: "+basicFileAttributes.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()));

    }
}
