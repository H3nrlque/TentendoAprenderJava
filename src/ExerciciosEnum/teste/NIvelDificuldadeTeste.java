package ExerciciosEnum.teste;

import ExerciciosEnum.Enums.NivelDificuldade;

public class NIvelDificuldadeTeste {
    public static void main(String[] args) {
        for (NivelDificuldade nivelDificuldade : NivelDificuldade.values()) {
                    nivelDificuldade.imprime();
        }

    }
}
