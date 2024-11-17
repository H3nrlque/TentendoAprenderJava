package ExerciciosPolimorfismo.exercicioFuncionario.dominio;

public class Gerente extends Funcionario{
    private static final double SALARIO_BASE = 3000;
    private static final double INSS = 250.00;
    private double bonus_Adicional_Por_Cento;

    public Gerente(String cargo, String nome, int idade, double bonus_Adicional_Por_Cento) {
        super(cargo, nome, idade);
        this.bonus_Adicional_Por_Cento = bonus_Adicional_Por_Cento;
    }

    @Override
    public double calcularSalario() {
        return this.salario = (SALARIO_BASE - INSS) + SALARIO_BASE * bonus_Adicional_Por_Cento;
    }
}
