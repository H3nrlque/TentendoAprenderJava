package ExerciciosHeranca.dominio;

public class Gerente extends Funcionarios {
    private double salarioFinal;
    private double bonusAdicional;

    public Gerente(String nome, double salarioBase, double bonusAdicional) {
        super(nome, salarioBase);
        this.bonusAdicional = bonusAdicional;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public double getBonusAdicional() {
        return bonusAdicional;
    }

    public void setBonusAdicional(double bonusAdicional) {
        this.bonusAdicional = bonusAdicional;
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        salarioFinal = salarioBase + bonusAdicional;
    }

    @Override
    public String toString() {
        return "Gerente: \n"
                +"Salário: R$"+salarioFinal;
    }
}
