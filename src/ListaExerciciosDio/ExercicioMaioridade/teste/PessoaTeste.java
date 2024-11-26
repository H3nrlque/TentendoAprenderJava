package ListaExerciciosDio.ExercicioMaioridade.teste;

import ListaExerciciosDio.ExercicioMaioridade.dominio.Pessoa;
import ListaExerciciosDio.ExercicioMaioridade.servico.VerificandoMaioridade;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Henrique", 20);
        VerificandoMaioridade.verificando(pessoa);
    }
}
