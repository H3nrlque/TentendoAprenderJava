package ExerciciosEnum.dominio;

import ExerciciosEnum.Enums.DiasDaSemana;

public class Semana {
    private DiasDaSemana diasDaSemana;

    public void mensagem(String dia) {
        for (DiasDaSemana diaDaSemana : DiasDaSemana.values()) {
            if (diaDaSemana.getDia().equals(dia)) {
                System.out.println("Bom(a) "+diaDaSemana.getDia());
            }
        }

    }
}
