package ExerciciosMaisCompletos.SistemaRestaurante.dominio;

public interface Entregavel {
    default void entregar(String endereco){}
}
