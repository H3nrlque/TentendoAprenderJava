package ListaExerciciosDio.ExercicioIMC.dominio;

import ListaExerciciosDio.ExercicioIMC.interfaces.Calculavel;

public class Pessoa implements Calculavel {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularImc() {
        return peso / (Math.pow(altura, 2));
    }

    @Override
    public String classificacaoImc() {
        double imc = calcularImc();
        if (imc <= 18.5) {
            return "Abaixo do peso";
        } else if (imc > 18.6 && imc <= 24.9) {
            return "Peso ideal, parabéns";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Levemente acima do peso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II (severa)";
        } else {
            return "Obesidade grau III (mórbida)";
        }
    }
}
