package ExerciciosPolimorfismo.exercicioFormaGeometrica.servico;

import ExerciciosPolimorfismo.exercicioFormaGeometrica.dominio.Forma;

public class CalculadoraArea {
    public static void CalcularArea(Forma forma) {
        System.out.println("Tipo de forma geométrica: "+forma.getTipo());
        System.out.printf("Área: %.1f",forma.calcularArea());
    }
}
