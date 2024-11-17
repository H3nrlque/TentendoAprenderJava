package ExerciciosPolimorfismo.exercicioFuncionario.dominio;

public class AuxiliarAdministrativo extends Funcionario{
    private static final double SALARIO_BASE = 1600.00;
    private static final double INSS = 180.00;
    private double bonus_Adicional_Por_Cento;

    public AuxiliarAdministrativo(String cargo, String nome, int idade, double bonus_Adicional_Por_Cento) {
        super(cargo, nome, idade);
        this.bonus_Adicional_Por_Cento = bonus_Adicional_Por_Cento;
    }

    @Override
    public double calcularSalario() {
        return this.salario = (SALARIO_BASE - INSS) + SALARIO_BASE * bonus_Adicional_Por_Cento;
    }
}
