package ExerciciosEnum.dominio;

import ExerciciosEnum.Enums.Operacoes;

public class OperacaoMatematica {
    private Operacoes operacoes;

    public OperacaoMatematica() {
    }

    public OperacaoMatematica(Operacoes operacoes) {
        this.operacoes = operacoes;
    }

    public Operacoes getOperacoes() {
        return operacoes;
    }

    @Override
    public String toString() {
        return "OperacaoMatematica{" +
                "operacoes=" + operacoes +
                '}';
    }
}
