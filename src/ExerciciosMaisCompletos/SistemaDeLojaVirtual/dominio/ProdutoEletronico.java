package ExerciciosMaisCompletos.SistemaDeLojaVirtual.dominio;

public class ProdutoEletronico extends Produto{
    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void calcularDesconto() {
        this.preco -= preco * 0.1;
    }

    @Override
    public void vender() {
        calcularDesconto();
        System.out.println("Venda concluída: ");
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço: "+preco);
    }

    @Override
    public String toString() {
        return "ProdutoEletronico{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
