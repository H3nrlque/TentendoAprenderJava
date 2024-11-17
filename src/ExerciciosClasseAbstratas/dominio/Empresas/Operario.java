package ExerciciosClasseAbstratas.dominio.Empresas;

public class Operario extends Funcionario {
    private double salario;
    private int horasTrabalhadas;
    private double valorHora;

    public Operario(String nome, int horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        calcularSalario();
    }

    @Override
    public double calcularSalario() {
       return salario = valorHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "salario=" + salario +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", nome='" + nome + '\'' +
                '}';
    }
}
