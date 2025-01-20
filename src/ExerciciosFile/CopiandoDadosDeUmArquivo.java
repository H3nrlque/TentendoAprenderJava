package ExerciciosFile;

import java.io.*;

public class CopiandoDadosDeUmArquivo {
    public static void main(String[] args) {
        File file = new File("pasta/exemplo.txt");
        File file2 = new File("pasta/texto.txt");

        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr); FileWriter fw = new FileWriter(file2); BufferedWriter bw = new BufferedWriter(fw)) {
            System.out.println("Dentro do arquivo: " + file.getName());
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
                bw.write(linha);
                bw.newLine();
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
