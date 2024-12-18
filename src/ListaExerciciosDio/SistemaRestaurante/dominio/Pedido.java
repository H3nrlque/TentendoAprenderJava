package ListaExerciciosDio.SistemaRestaurante.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Prato> pratos = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void removerPrato(String nome) {
        pratos.removeIf(prato -> prato.nome.equals(nome));
    }

    public void exibirPratos() {
        for (Prato prato : pratos) {
            System.out.println(prato);
        }
    }

    @Override
    public String toString() {
        return "Pedido"+"\n"
                +"Cliente: "+cliente.getNome()+"\n"
                +"Pratos: "+getPratos()+"\n";
    }
}
