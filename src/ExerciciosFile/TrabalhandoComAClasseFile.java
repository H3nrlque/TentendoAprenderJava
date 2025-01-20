package ExerciciosFile;

import java.io.File;
import java.io.IOException;

public class TrabalhandoComAClasseFile {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        if (fileDiretorio.mkdir()) {
            System.out.println("Diretório criado");
        }
        File file = new File(fileDiretorio, "exemplo.txt");
        File file2 = new File(fileDiretorio,"texto.txt");
        boolean isCreated = false;
        try {
            isCreated = file.createNewFile();
            isCreated = file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (isCreated) {
            System.out.print("Tipo: ");
            if (file.isFile()) {
                System.out.println("arquivo");
            } else {
                System.out.println("diretório");
            }
            System.out.println("Absolute path: "+file.getAbsolutePath());
            System.out.println("Tamanho: "+file.getTotalSpace()+" bytes");

        }

    }
}
