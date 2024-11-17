package ExerciciosMaisCompletos.SistemaDeTransporte.dominio;

public class Aviao extends Transporte {
    public Aviao(int capacidade, String destino) {
        super(capacidade, destino);
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Iniciando a viagem de Avião");
        System.out.println("Destino: "+destino);
    }
}
