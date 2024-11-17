package ExerciciosPolimorfismo.exercicioVeiculo.dominio;

public abstract class Veiculo implements Abastecer{
    protected String tipo;
    protected String ano;
    protected String tipoCombustivel;
    protected int quantidadeCombustivel;

    public Veiculo(String tipo, String ano, String tipoCombustivel, int quantidadeCombustivel) {
        this.tipo = tipo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAno() {
        return ano;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}

