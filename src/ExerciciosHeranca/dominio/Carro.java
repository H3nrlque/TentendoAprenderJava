package ExerciciosHeranca.dominio;

public class Carro extends Veiculo {
    private static final int maximoCombustilel;
    static {
        maximoCombustilel = 16;
    }
    public Carro(int nivelCombustivel) {
        super(nivelCombustivel);
    }

    public void abastecer(int litrosGasolina) {
        super.abastecer();
        if (nivelCombustivel < maximoCombustilel) {
            nivelCombustivel = litrosGasolina;
        }
    }

    @Override
    public String toString() {
        return "Cobustível: "+nivelCombustivel;
    }
}
