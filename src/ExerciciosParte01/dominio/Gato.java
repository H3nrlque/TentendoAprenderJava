package ExerciciosParte01.dominio;

public class Gato {
    private String nome;
    private String cor;

    public Gato() {

    }

    public Gato(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return STR."Gato{nome='\{nome}\{'\''}, cor='\{cor}\{'\''}\{'}'}";
    }
}
