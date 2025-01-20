package ExerciciosFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Scanner;

public class EscrevendoEmUmArquivo {
    public static void main(String[] args) {
        File file = new File("pasta/exemplo.txt");
        Scanner tc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
            System.out.print("Digite uma frase: ");
            bw.write(tc.nextLine());
            bw.newLine();
            System.out.println("Arquivo salvo: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
