package ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio;

public class Televisao extends Produto {
    private String resolucao;

    public Televisao(String nome, String marca, double preco, String resolucao) {
        super(nome, marca, preco);
        this.resolucao = resolucao;
    }

    public String getResolucao() {
        return resolucao;
    }
}
