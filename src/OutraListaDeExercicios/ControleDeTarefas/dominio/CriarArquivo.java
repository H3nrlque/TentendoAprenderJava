package OutraListaDeExercicios.ControleDeTarefas.dominio;

import java.io.*;

public class CriarArquivo {
    public static void guardarTarefas(Tarefa tarefa) throws IOException {
        File file = new File("C:\\Users\\israe\\IdeaProjects\\Pratica\\src\\OutraListaDeExercicios\\ControleDeTarefas\\dominio\\tarefas.txt");
        file.createNewFile();
        if (file.exists()) {
            try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("Título: ".concat(tarefa.getTitulo()));
                bw.newLine();
                bw.write("Descrição: ".concat(tarefa.getDescricao()));
                bw.newLine();
                bw.write("Data de conclusão: ".concat(tarefa.getDataConclusao()));
                bw.newLine();
                bw.write("Prioridade: " + (tarefa.getPrioridade()));
                bw.newLine();
                bw.write("Status: " + tarefa.getStatus());
                bw.newLine();
                bw.write(" ");
            }
        }
    }

    public static void atualizarArquivo(String titulo) {
        File file = new File("C:\\Users\\israe\\IdeaProjects\\Pratica\\src\\OutraListaDeExercicios\\ControleDeTarefas\\dominio\\tarefas.txt");
        File tempFile = new File("C:\\Users\\israe\\IdeaProjects\\Pratica\\src\\OutraListaDeExercicios\\ControleDeTarefas\\dominio\\temp.txt");
        String linha;
        try {
            tempFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (tempFile.exists()) {
            try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr); FileWriter fw = new FileWriter(tempFile); BufferedWriter bw = new BufferedWriter(fw)) {
                while (br.readLine() == null) {
                    linha = br.readLine();
                    if (!linha.contains(titulo)) {
                        bw.write(linha);
                    }
                }
                file.delete();
                tempFile.renameTo(file.getAbsoluteFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
