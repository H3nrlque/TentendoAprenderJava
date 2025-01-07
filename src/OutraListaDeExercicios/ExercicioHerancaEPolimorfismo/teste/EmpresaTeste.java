package OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.teste;

import OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.dominio.Empresa;
import OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.dominio.Estagiario;
import OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.dominio.Funcionario;
import OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.dominio.Gerente;

public class EmpresaTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("João", 10000);
        Funcionario funcionario2 = new Estagiario("Lucas", 2000);
        Empresa empresa = new Empresa("Lojão Figueredo");
        empresa.contratarFuncionario(funcionario);
        empresa.contratarFuncionario(funcionario2);
        empresa.listarFuncionarios();
    }
}
