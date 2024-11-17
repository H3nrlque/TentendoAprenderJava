package ExerciciosParte02.dominio;

public class Estudantes {
    private String nome;
    private final int idade;
    private Seminarios seminario;

    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }


    public Seminarios getSeminario() {
        return seminario;
    }

    public void definirSeminario(Seminarios seminario) {
        if (this.seminario == null) {
            this.seminario = seminario;
        } else {
            System.out.println("Este aluno já está em outro seminário");
        }
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println(this.seminario);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + "\n";
    }
}

