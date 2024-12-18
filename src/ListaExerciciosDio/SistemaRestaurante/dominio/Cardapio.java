package ListaExerciciosDio.SistemaRestaurante.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private static List<Prato> pratos = new ArrayList<>();

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void removerPrato(String nome) {
        pratos.removeIf(prato -> prato.nome.equals(nome));
    }

    public static Prato escolherPrato(String nome) {
        for (Prato prato : pratos) {
            if (prato.nome.equals(nome)) {
                return prato;
            }
        }
        return null;
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}
