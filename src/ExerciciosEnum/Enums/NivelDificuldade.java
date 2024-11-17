package ExerciciosEnum.Enums;

public enum NivelDificuldade {
    FACIL{
        @Override
        public void imprime() {
            System.out.println("Muito fácil");
        }
    },
    MEDIO {
        @Override
        public void imprime() {
            System.out.println("Mediano");
        }
    },
    DIFICIL {
        @Override
        public void imprime() {
            System.out.println("Díficil");
        }
    },
    EXPERT {
        @Override
        public void imprime() {
            System.out.println("Impossível");
        }
    };

    public abstract void imprime();
}
