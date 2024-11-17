package ExerciciosHeranca.dominio;

public class Veiculo {
    protected int nivelCombustivel;

    public Veiculo(int nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public int getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(int nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public void abastecer() {

    }


}
