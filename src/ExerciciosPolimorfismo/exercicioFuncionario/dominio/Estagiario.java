package ExerciciosPolimorfismo.exercicioFuncionario.dominio;

public class Estagiario extends Funcionario{
    private static final double SALARIO_MINIMO = 1412.00;
    private static final double INSS = 160.00;

    public Estagiario(String cargo, String nome, int idade) {
        super(cargo, nome, idade);
    }

    @Override
    public double calcularSalario() {
        return this.salario = SALARIO_MINIMO - INSS;
    }
}
