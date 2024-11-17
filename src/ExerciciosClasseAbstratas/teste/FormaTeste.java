package ExerciciosClasseAbstratas.teste;

import ExerciciosClasseAbstratas.dominio.FormaGeometrica.Circulo;
import ExerciciosClasseAbstratas.dominio.FormaGeometrica.Retangulo;

public class FormaTeste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área Círculo: "+circulo.calcularArea());
        System.out.println();
        Retangulo retangulo = new Retangulo(6, 8);
        System.out.println("Área Retângulo: "+retangulo.calcularArea());

    }
}
