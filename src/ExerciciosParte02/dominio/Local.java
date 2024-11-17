package ExerciciosParte02.dominio;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return getEndereco();
    }
}
