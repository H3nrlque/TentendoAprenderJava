package util;

public class Vendedor {
    private String nome;
    private double salario;
    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        this.nome = nome;
        this.salario = salario;
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double SalarioFinal() {
        return salario + (totalVendas * 0.15);
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\n"
               +"Salário Fixo: R$ "+String.format("%.2f\n",salario)
               +"Salário final: R$ "+String.format("%.2f\n",SalarioFinal());
    }
}
