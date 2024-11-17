package ExerciciosParte01.ExerciciosParaFixacao;

import ExerciciosParte01.dominio.Initializer;

public class InitializerTeste {
    public static void main(String[] args) {
            Initializer initializer  = new Initializer();
        Initializer.setInitialValue(500);
        System.out.println(Initializer.getInitialValue());
    }
}
