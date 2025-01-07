package OutraListaDeExercicios.SistemaDeGestaoDeTransporte.teste;

import OutraListaDeExercicios.SistemaDeGestaoDeTransporte.dominio.*;

public class TransporteTeste {
    public static void main(String[] args) {
        Transporte transporte = new Caminhao("Caminhão", 100, Status.DISPONIVEL);
        Transporte transporte2 = new Aviao("Avião", 90, Status.DISPONIVEL);
        GerenteTransporte gerenteTransporte = new GerenteTransporte();
        gerenteTransporte.adicionarTransporte(transporte);
        gerenteTransporte.adicionarTransporte(transporte2);
        gerenteTransporte.listarTransportesDisponiveis();
        gerenteTransporte.IniciarViagem("Avião", 300, 80);

    }
}
