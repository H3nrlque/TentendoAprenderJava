package ExerciciosInterfaces.dominio;

import ExerciciosInterfaces.Interfaces.Operacao;

public class Multiplicacao implements Operacao {
    @Override
    public String descricao() {
        return Operacao.super.descricao()+"\n"
                +"Multiplicação\n";
    }

    @Override
    public int executa(int a, int b) {
        return a * b;
    }
}
