package OutraListaDeExercicios.ControleDeTarefas.enums;

public enum Status {
    CONCLUIDA("Concluída"), PENDENTE("Pendente");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public static Status procurar(String s) {
        for (Status value : values()) {
            if (value.status.equalsIgnoreCase(s)) {
                return value;
            }
        }
        return null;
    }
}
