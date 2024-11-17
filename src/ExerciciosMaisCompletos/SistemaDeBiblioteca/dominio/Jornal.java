package ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio;

public class Jornal extends Publicacao{
    public Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        System.out.println("Emprestando o jornal: "+titulo);
    }

    @Override
    public void devolver() {
        System.out.println("Devolvendo o jornal: "+titulo);
    }

    @Override
    public String toString() {
        return "Jornal{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
