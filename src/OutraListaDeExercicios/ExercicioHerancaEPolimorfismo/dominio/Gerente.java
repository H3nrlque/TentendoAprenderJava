package OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
        calcularSalarioFinal();
    }

    @Override
    public void calcularSalarioFinal() {
        this.salario += salario * 0.20;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
