package ExerciciosClasseAbstratas.dominio.Empresas;

public class Gerente extends Funcionario{
    private double salarioBase;

    public Gerente(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
        calcularSalario();
    }

    @Override
    public double calcularSalario() {
        return salarioBase += salarioBase * 0.5;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salarioBase +
                ", nome='" + nome + '\'' +
                '}';
    }
}
