package ExerciciosMaisCompletos.SistemaDeTransporte.dominio;

import java.util.ArrayList;
import java.util.List;

public class CompanhiaTransporte {
    private List<Transporte> transportes = new ArrayList<>();

    public void adicionarTransporte(Transporte transporte) {
        if (transportes.contains(transporte)){
            return;
        }
        transportes.add(transporte);
    }

    public void removerTransporte(Transporte transporte) {
        if (!transportes.contains(transporte)) {
            return;
        }
        transportes.remove(transporte);
    }

    public void listarTransportes() {
        for (Transporte transporte : transportes) {
            System.out.println("Transporte: "+transporte.getClass().getSimpleName());
            System.out.println("Capacidade: "+transporte.getCapacidade());
            System.out.println("Destino: "+transporte.getDestino());
        }
        System.out.println("------------------------------");
    }

    public void listarViegensComOMesmoDestino(String destino) {
        for (Transporte transporte : transportes) {
            if (transporte.getDestino().equals(destino)) {
                System.out.println(transporte);
            }
        }
    }

    public void calcularCapacidadeTotal() {
        int soma = 0;
        for (Transporte transporte : transportes) {
            soma += transporte.getCapacidade();
        }
        System.out.println("Capacidade total: "+soma);
    }
}
