package SistemaCadastro.servico;

import java.io.File;
import java.io.IOException;

public class CriarArquivo {
    public static File criarArquivo() {
        File fileDiretorio = new File("src/SistemaCadastro/pastaCadastro");
        fileDiretorio.mkdir();
        File file = new File(fileDiretorio, "formulário.txt");
        try {
            if (file.createNewFile()) {
                EscreverNoArquivo.escreverNoArquivo(file);
            }
        } catch (IOException e) {
            throw new RuntimeException("Não foi possível criar o arquivo");
        }
        return file;
    }
}
