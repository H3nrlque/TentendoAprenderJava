package ExerciciosEnum.Enums;

public enum Clima {
    ENSOLARADO("Ensolarado") {
        @Override
        public void recomendarAtividade() {
            System.out.println("Clima: "+getClima());
            System.out.println("Atividades Recomendadas");
            System.out.println("Praia ou Piscina");
            System.out.println("Trilha");
        }
    }, NUBLADO("Nublado") {
        @Override
        public void recomendarAtividade() {
            System.out.println("Clima: "+getClima());
            System.out.println("Atividades Recomendadas");
            System.out.println("Museus");
        }
    }, CHUVOSO("Chuvoso") {
        @Override
        public void recomendarAtividade() {
            System.out.println("Clima: "+getClima());
            System.out.println("Atividades Recomendadas");
            System.out.println("Assistir filmes");
        }
    }, TEMPESTUOSO("Tempestuoso") {
        @Override
        public void recomendarAtividade() {
            System.out.println("Clima: "+getClima());
            System.out.println("Atividades Recomendadas");
            System.out.println("Meditar");
        }
    };

    private final String clima;

    Clima(String clima) {
        this.clima = clima;
    }

    public abstract void recomendarAtividade();

    public static void verificarClima(String clima) {
        for (Clima climas : values()) {
            if (climas.getClima().equals(clima)) {
                climas.recomendarAtividade();
            }
        }

    }

    public String getClima() {
        return clima;
    }
}
