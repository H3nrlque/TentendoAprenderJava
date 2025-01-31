package ExerciosPacoteNio.ExercicioSerializable;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long seriaVersionUID = 1L;
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome:" + nome + '\''+
                "idade: " + idade + '\'';
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

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
