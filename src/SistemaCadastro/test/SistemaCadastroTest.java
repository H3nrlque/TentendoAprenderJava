package SistemaCadastro.test;

import SistemaCadastro.dominio.Usuario;
import SistemaCadastro.servico.*;

import java.io.*;
import java.util.Scanner;

public class SistemaCadastroTest {
    public static void main(String[] args) throws IOException {
        Scanner tc = new Scanner(System.in);
        System.out.println("Iniciando sistema...");
        File file = CriarArquivo.criarArquivo();
        LerArquivo.lerArquivo(file);
        Usuario usuario = CadastrarUsuario.cadastrarUsuario();
        SalvarUsuario.salvarUsuarioComoArquivo(usuario);
        System.out.println("Usuário cadastrado com sucesso");
        int opcao;
        do {
            opcoes();
            opcao = tc.nextInt();
            switch (opcao) {
                case 1:
                    LerArquivo.lerArquivo(file);
                    usuario = CadastrarUsuario.cadastrarUsuario();
                    SalvarUsuario.salvarUsuarioComoArquivo(usuario);
                    System.out.println("Usuário cadastrado com sucesso");
                    break;

                case 2:
                    Usuario.listarUsuariosCadastrados();
                    break;

                case 3:
                    EscreverNoArquivo.adicionarPergunta(file);
                    break;

                case 4:
                    EscreverNoArquivo.deletarPergunta(file);
                    break;

                case 5:
                    Usuario.procurarUsuario();
                    break;

                default:
                    System.out.println("Encerrando o sistema...");
            }

        } while (opcao != 6);
    }

    private static void opcoes() {
        System.out.println();
        Scanner tc = new Scanner(System.in);
        System.out.println("[1] Cadastrar o usuário");
        System.out.println("[2] Listar todos usuários cadastrados");
        System.out.println("[3] Cadastrar nova pergunta no formulário");
        System.out.println("[4] Deletar pergunta do formulário");
        System.out.println("[5] Pesquisar usuário por nome ou idade ou email");
        System.out.println("[6] Sair");
    }
}
