package ExerciosPacoteNio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class encontrarArquivos extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*.txt");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class ExercicioPathMatcher1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");
        Files.walkFileTree(path,new encontrarArquivos());

    }
}
