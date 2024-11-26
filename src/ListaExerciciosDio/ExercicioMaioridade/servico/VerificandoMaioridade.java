package ListaExerciciosDio.ExercicioMaioridade.servico;

import ListaExerciciosDio.ExercicioMaioridade.dominio.Pessoa;

public class VerificandoMaioridade {
    public static void verificando(Pessoa pessoa) {
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());
        System.out.println(pessoa.verificarMaioridade());
    }
}
