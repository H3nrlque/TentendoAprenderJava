package OutraListaDeExercicios.ExercicioFuncionarios.dominio;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String dataNascimento, String cpf, String cargo, double salario) {
        super(nome, dataNascimento, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\n"+
                "CPF: "+cpf+"\n"+
                "Data de Nascimento: "+dataNascimento+"\n"+
                "Cargo: "+cargo+"\n"+
                "Salário: R$ "+salario+"\n";
    }
}
