package OutraListaDeExercicios.SistemaDeGestaoDeTransporte.dominio;

public interface GestorDeTransporte {
    void adicionarTransporte(Transporte transporte);
    void listarTransportesDisponiveis();
    void IniciarViagem(String modelo, double distancia, int carga);
}
