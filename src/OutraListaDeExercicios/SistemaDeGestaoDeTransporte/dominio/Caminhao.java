package OutraListaDeExercicios.SistemaDeGestaoDeTransporte.dominio;

public class Caminhao extends Transporte {
    private final int CUSTO_FIXO_POR_KM = 10;
    private final double CUSTO_POR_KG_CARGA = 0.05;

    public Caminhao(String modelo, int capacidadeCarga, Status status) {
        super(modelo, capacidadeCarga, status);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return CUSTO_FIXO_POR_KM * distancia + CUSTO_POR_KG_CARGA * capacidadeCarga;
    }

    @Override
    public void realizarViagem(double distancia) {
        status = Status.EM_USO;
        System.out.println("Viagenm sendo realizada...");
        System.out.println("Chegou ao destino!");

    }
}
