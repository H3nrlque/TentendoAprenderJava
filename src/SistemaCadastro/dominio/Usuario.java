package SistemaCadastro.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private String email;
    private String idade;
    private String altura;
    private static List<Usuario> usuarios = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String email, String idade, String altura) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.altura = altura;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void listarUsuariosCadastrados() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado");
        } else {
            System.out.println("Usuários cadastrados");
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println((i + 1) + " " + usuarios.get(i).getNome());
            }
        }
    }

    public static void procurarUsuario() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Você deseja procurar por: ");
        System.out.println("[1] Nome");
        System.out.println("[2] Email");
        System.out.println("[3] Idade");
        int opcao2 = tc.nextInt();
        switch (opcao2) {
            case 1:
                ProcurarUsuario.procurarPorNome(usuarios);
                break;

            case 2:
                ProcurarUsuario.procurarPorEmail(usuarios);
                break;

            case 3:
                ProcurarUsuario.procurarPorIdade(usuarios);
                break;

            default:
                break;
        }
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\n"
                +"Email: "+email+"\n"
                +"Idade: "+idade+" anos\n"
                +"Altura: "+altura+"m\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
