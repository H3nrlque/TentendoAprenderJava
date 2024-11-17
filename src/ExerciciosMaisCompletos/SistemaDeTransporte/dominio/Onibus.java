package ExerciciosMaisCompletos.SistemaDeTransporte.dominio;

public class Onibus extends Transporte{
    public Onibus(int capacidade, String destino) {
        super(capacidade, destino);
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Iniciando a viagem de Ônibus");
        System.out.println("Destino: "+destino);
    }
}
