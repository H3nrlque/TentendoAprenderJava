package ListaExerciciosDio.GerenciadorDeTarefas.enums;

public enum Status {
    PENDENTE(1, "Pendente"),
    EM_ANDAMENTO(2, "Em Andamento"),
    CONCLUIDA(3, "Concluída");

    private int valor;
    private String nome;

    Status(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public static Status procurarPorNome(String nome) {
        for (Status status : values()) {
            if (status.nome.equals(nome)) {
                return status;
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
