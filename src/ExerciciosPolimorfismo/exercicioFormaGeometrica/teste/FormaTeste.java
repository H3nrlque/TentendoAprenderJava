package ExerciciosPolimorfismo.exercicioFormaGeometrica.teste;

import ExerciciosPolimorfismo.exercicioFormaGeometrica.dominio.*;
import ExerciciosPolimorfismo.exercicioFormaGeometrica.servico.CalculadoraArea;

public class FormaTeste {
    public static void main(String[] args) {
        Forma forma = new Circulo("Círculo", 5);
        CalculadoraArea.CalcularArea(forma);
        System.out.println();
        Forma forma2 = new Quadrado("Quadrado", 8);
        CalculadoraArea.CalcularArea(forma2);
        System.out.println();
        Forma forma3 = new Retangulo("Retângulo", 6, 9);
        CalculadoraArea.CalcularArea(forma3);
        System.out.println();
        Forma forma4 = new Triangulo("Triângulo", 4, 8);
        CalculadoraArea.CalcularArea(forma4);
        System.out.println();
    }
}
