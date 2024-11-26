package ListaExerciciosDio.ExercicioTriangulo.teste;

import ListaExerciciosDio.ExercicioTriangulo.dominio.Triangulo;
import ListaExerciciosDio.ExercicioTriangulo.servico.MaoNaMassa;

public class TrianguloTeste {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4,12,12);
        MaoNaMassa.tiposDeTriangulos(triangulo);
    }
}
