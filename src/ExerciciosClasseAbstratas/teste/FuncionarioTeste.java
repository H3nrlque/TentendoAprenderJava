package ExerciciosClasseAbstratas.teste;

import ExerciciosClasseAbstratas.dominio.Empresas.Gerente;
import ExerciciosClasseAbstratas.dominio.Empresas.Operario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luís", 5000);
        System.out.println(gerente);
        Operario operario = new Operario("João", 8, 15);
        System.out.println(operario);
    }
}
