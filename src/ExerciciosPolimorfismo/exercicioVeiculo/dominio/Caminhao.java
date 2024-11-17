package ExerciciosPolimorfismo.exercicioVeiculo.dominio;

public class Caminhao extends Veiculo{
    public Caminhao(String tipo, String ano, String tipoCombustivel, int quantidadeCombustivel) {
        super(tipo, ano, tipoCombustivel, quantidadeCombustivel);
    }

    @Override
    public int abastecer() {
        return quantidadeCombustivel;
    }
}
