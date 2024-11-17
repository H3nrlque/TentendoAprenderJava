package ExerciciosInterfaces.Interfaces;

public interface Operacao {
    default String descricao() {
        return "Operação Matemática";
    }

    int executa(int a, int b);
}
