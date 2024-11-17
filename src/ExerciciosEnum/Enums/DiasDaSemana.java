package ExerciciosEnum.Enums;

public enum DiasDaSemana {
    DOMINGO("Domingo"), SEGUNDA("Segunda"), TERCA("Terça"), QUARTA("Quarta"), QUINTA("Quinta"), SEXTA("Sexta"), SABADO("Sábado");
    private final String dia;

    DiasDaSemana(String dia) {
        this.dia = dia;
    }

    public static DiasDaSemana diasDaSemana(String dia) {
        for (DiasDaSemana diasDaSemana : values()) {
            if (diasDaSemana.getDia().equals(dia)) {
                return diasDaSemana;
            }
        }
        return null;
    }

    public String getDia() {
        return dia;
    }
}
