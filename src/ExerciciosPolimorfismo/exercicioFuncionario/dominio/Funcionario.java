package ExerciciosPolimorfismo.exercicioFuncionario.dominio;

public abstract class Funcionario implements CalcularPagamento {
    protected String cargo;
    protected String nome;
    protected int idade;
    protected double salario;

    public Funcionario(String cargo, String nome, int idade) {
        this.cargo = cargo;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }
}
