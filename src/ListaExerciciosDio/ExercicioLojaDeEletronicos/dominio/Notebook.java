package ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio;

public class Notebook extends Produto {
    private String tamanhoTela;

    public Notebook(String nome, String marca, double preco, String tamanhoTela) {
        super(nome, marca, preco);
        this.tamanhoTela = tamanhoTela;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }
}
