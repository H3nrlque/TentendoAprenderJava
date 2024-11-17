package ExerciciosMaisCompletos.SistemaDeTransporte.dominio;

public class Trem extends Transporte{
    public Trem(int capacidade, String destino) {
        super(capacidade, destino);
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Iniciando a viagem de Trem");
        System.out.println("Destino: "+destino);
    }
}
