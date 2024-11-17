package util;

public class Conversao {
    private double temperatura;

    public Conversao(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double Conversor() {
        return (9*temperatura+160) / 5;
    }

    @Override
    public String toString() {
        return "Temperatura em Fahrenheit: "
               +String.format("%.1f°F\n",Conversor());
    }
}
