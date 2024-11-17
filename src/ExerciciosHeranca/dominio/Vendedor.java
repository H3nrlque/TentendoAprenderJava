package ExerciciosHeranca.dominio;

public class Vendedor extends Funcionarios{
    private double salarioFinal;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        salarioFinal = salarioBase + comissao;
    }

    @Override
    public String toString() {
        return "Vendedor:\n"
                +"Salário: "+salarioFinal;
    }
}
