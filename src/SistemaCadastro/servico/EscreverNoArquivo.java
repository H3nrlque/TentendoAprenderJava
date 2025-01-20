package SistemaCadastro.servico;

import java.io.*;
import java.util.Scanner;

public class EscreverNoArquivo {
    public static void escreverNoArquivo(File file) {
        String[] perguntas = {"1 - Qual seu nome completo?\n2 - Qual seu email de contato?\n3 - Qual sua idade?\n4 - Qual sua altura?\n"};
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
                for (String pergunta : perguntas) {
                    bw.write(pergunta);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void adicionarPergunta(File file) {
        Scanner tc = new Scanner(System.in);
        System.out.println();
        System.out.print("Insira a pergunta: ");
        String pergunta = tc.nextLine();

        int numeroLinhas = 0;
        boolean isDiffent = true;
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr); FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
            while (br.readLine() != null) {
                numeroLinhas++;
            }

            if (isDiffent) {
                bw.write((numeroLinhas + 1) + " - " + pergunta);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deletarPergunta(File file) throws IOException {
        Scanner tc = new Scanner(System.in);
        LerArquivo.lerArquivo(file);
        System.out.println();
        System.out.println("Digite o número da pergunta: ");
        int n = tc.nextInt();
        String linha;
        int linhaAtual = 0;
        File tempFile = new File("src/SistemaCadastro/pastaCadastro/temp.txt");
        tempFile.createNewFile();
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr); FileWriter fw = new FileWriter(tempFile); BufferedWriter bw = new BufferedWriter(fw)) {
            while ((linha = br.readLine()) != null) {
                linhaAtual++;
                if (linhaAtual <= 4) {
                    bw.write(linha);
                    bw.newLine();
                } else if (linhaAtual >= 5 && linhaAtual != n) {
                    bw.write(linha);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean isExists = file.exists();
        boolean isDeleted = file.delete();
        boolean isRenamed = tempFile.renameTo(file.getAbsoluteFile());

        if (isExists && isDeleted && isRenamed) {
            System.out.println("Pergunta deletada com sucesso");
        } else {
            System.out.println("Pergunta não foi encontrada");
        }
    }
}
