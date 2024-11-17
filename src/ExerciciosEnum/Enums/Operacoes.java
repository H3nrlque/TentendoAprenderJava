package ExerciciosEnum.Enums;

public enum Operacoes {
    SOMA("Soma") {
        @Override
        public void Calcular(double a, double b) {
            double soma = a + b;
            System.out.printf("%.0f + %.0f = %.0f", a, b, soma);
        }
    },
    SUBTRACAO("Subtração") {
        @Override
        public void Calcular(double a, double b) {
            double sub = a - b;
            System.out.printf("%.0f - %.0f = %.0f",a, b, sub);
        }
    },
    MULTIPLICACAO("Multiplicação"){
        @Override
        public void Calcular(double a, double b) {
            double mult = a * b;
            System.out.printf("%.0f x %.0f = %.0f",a, b, mult);
        }
    },
    DIVISAO("Divisão"){
        @Override
        public void Calcular(double a, double b) {
            double div = a / b;
            System.out.printf("%.0f / %.0f = %.1f",a, b, div);
        }
    };

    private final String operacao;

    Operacoes(String operacao) {
        this.operacao = operacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public static void verificarOperacao(String operacao, double a, double b) {
        for (Operacoes operacoes : values()) {
            if (operacoes.getOperacao().equals(operacao)) {
                operacoes.Calcular(a, b);
            }
        }

    }

    public abstract void Calcular(double a, double b);
}
