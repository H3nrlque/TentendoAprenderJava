package ExerciciosFile;

import java.io.*;

public class LendoArquivo {
    public static void main(String[] args) {
        File file = new File("pasta/exemplo.txt");
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
