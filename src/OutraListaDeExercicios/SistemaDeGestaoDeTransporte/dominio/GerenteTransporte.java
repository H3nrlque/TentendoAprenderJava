package OutraListaDeExercicios.SistemaDeGestaoDeTransporte.dominio;

import java.util.ArrayList;
import java.util.List;

public class GerenteTransporte implements GestorDeTransporte {
    private List<Transporte> transportes = new ArrayList<>();

    @Override
    public void adicionarTransporte(Transporte transporte) {
        transportes.add(transporte);
    }

    @Override
    public void listarTransportesDisponiveis() {
        for (Transporte transporte : transportes) {
            System.out.println(transporte);
        }
    }

    @Override
    public void IniciarViagem(String modelo, double distancia, int carga) {
        double custo = 0;
        for (Transporte transporte : transportes) {
            if (transporte.modelo.equals(modelo) && transporte.capacidadeCarga >= carga) {
                transporte.realizarViagem(distancia);
                custo = transporte.calcularCustoViagem(distancia);
                transporte.status = Status.DISPONIVEL;
            }
        }
        System.out.println("Custo da viagem: R$ "+custo);
    }

    public List<Transporte> getTransportes() {
        return transportes;
    }
}
