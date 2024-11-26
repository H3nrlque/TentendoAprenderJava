package ListaExerciciosDio.ExercicioMaioridade.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String verificarMaioridade() {
        if (idade > 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
