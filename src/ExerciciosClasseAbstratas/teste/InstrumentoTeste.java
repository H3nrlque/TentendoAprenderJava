package ExerciciosClasseAbstratas.teste;

import ExerciciosClasseAbstratas.dominio.Instrumentos.Piano;
import ExerciciosClasseAbstratas.dominio.Instrumentos.Violao;

public class InstrumentoTeste {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.tocar();
        Violao violao = new Violao();
        violao.tocar();
    }
}
