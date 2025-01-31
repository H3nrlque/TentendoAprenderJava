package ExerciosPacoteNio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivoZipar = Paths.get("pasta/subpasta");
        try {
            zip(arquivoZip, arquivoZipar);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void zip(Path arquivoZip, Path arquivoZipar) throws IOException {
        try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(arquivoZip)); DirectoryStream<Path> ds = Files.newDirectoryStream(arquivoZipar)) {
            for (Path file: ds ) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zos.putNextEntry(zipEntry);
                Files.copy(arquivoZip, zos);
                zos.closeEntry();
            }
        }
    }
}
