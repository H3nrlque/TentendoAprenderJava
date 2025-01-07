package OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.dominio;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
        calcularSalarioFinal();
    }

    @Override
    public void calcularSalarioFinal() {
        this.salario -=  salario * 0.10;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
