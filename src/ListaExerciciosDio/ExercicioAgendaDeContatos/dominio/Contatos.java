package ListaExerciciosDio.ExercicioAgendaDeContatos.dominio;

public class Contatos {
    private String nome;
    private String numero;

    public Contatos(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
