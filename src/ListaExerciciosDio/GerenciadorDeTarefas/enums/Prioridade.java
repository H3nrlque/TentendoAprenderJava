package ListaExerciciosDio.GerenciadorDeTarefas.enums;

public enum Prioridade {
    URGENTE(1, "Urgente"),
    DA_PRA_ADIAR(2, "Dá pra adiar"),
    NAO_E_IMPORTANTE(3, "Não é importante");

    private int valor;
    private String nome;

    Prioridade(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public static Prioridade procurarPorNome(String nome) {
        for (Prioridade prioridade : values()) {
            if (prioridade.nome.equals(nome)) {
                return prioridade;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
