package ListaExerciciosDio.ExercicioIMC.teste;

import ListaExerciciosDio.ExercicioIMC.dominio.Pessoa;
import ListaExerciciosDio.ExercicioIMC.servico.CalculandoImc;

public class ImcTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 85, 1.83);
        CalculandoImc.calculando(pessoa);
    }
}
