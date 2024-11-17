package ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio;

public class Livro extends Publicacao{
    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        System.out.println("Emprestando o livro: "+titulo);

    }

    @Override
    public void devolver() {
        System.out.println("Devolvendo o livro: "+titulo);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
