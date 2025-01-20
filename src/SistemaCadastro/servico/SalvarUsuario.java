package SistemaCadastro.servico;

import SistemaCadastro.dominio.Usuario;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class SalvarUsuario {
    public static void salvarUsuarioComoArquivo(Usuario usuario) throws IOException {
        int n = usuario.getUsuarios().size();


        File fileArqivoUsuario = new File("src/SistemaCadastro/pastaCadastro",n+"-".concat(usuario.getNome().toUpperCase(Locale.ROOT)).concat(".txt").replaceAll("\\s+", ""));
        fileArqivoUsuario.createNewFile();
        if (fileArqivoUsuario.exists()) {
            try (FileWriter fw = new FileWriter(fileArqivoUsuario); BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("Nome: ".concat(usuario.getNome()));
                bw.newLine();
                bw.write("Email: ".concat(usuario.getEmail()));
                bw.newLine();
                bw.write("Idade: ".concat(usuario.getIdade()));
                bw.newLine();
                bw.write("Altura: ".concat(usuario.getAltura()));
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
