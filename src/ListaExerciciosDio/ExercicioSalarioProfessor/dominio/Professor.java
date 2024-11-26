package ListaExerciciosDio.ExercicioSalarioProfessor.dominio;

public class Professor implements Calculavel{
    private String nome;
    private int idade;
    private static final double valorAula = 23.00;
    private int aulasNoMes;

    public Professor(String nome, int idade, int aulasNoMes) {
        this.nome = nome;
        this.idade = idade;
        this.aulasNoMes = aulasNoMes;
    }

    @Override
    public double salarioLiquido() {
        double salarioFinal;
        double percentualINSS = 0.08;
        salarioFinal = valorAula * aulasNoMes;
        return salarioFinal - salarioFinal * percentualINSS;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
