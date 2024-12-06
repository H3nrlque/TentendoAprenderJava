package ListaExerciciosDio.GerenciadorDeCursos.dominio;

public class Aluno {
    protected String nome;
    protected String cpf;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
