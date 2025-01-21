package OutraListaDeExercicios.ControleDeTarefas.enums;

public enum Prioridade {
    A("A"), B("B"), C("C");

    private String classificacao;

    Prioridade(String classificacao) {
        this.classificacao = classificacao;
    }

    public static Prioridade procurar(String c) {
        for (Prioridade value : values()) {
            if (value.classificacao.equalsIgnoreCase(c)) {
                return value;
            }
        }
        return null;
    }
}
