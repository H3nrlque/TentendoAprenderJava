package OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.dominio;

public abstract class Funcionario implements Calculavel{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularSalarioFinal();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+", Cargo: "+getClass().getSimpleName()+", Salário: R$ "+ salario +"\n";
    }
}
