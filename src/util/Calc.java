package util;

public class Calc {
    public double a;
    public double b;
    public int opcao;

    public double Calcular() {
        return switch (opcao) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> 0;
        };
    }
}
