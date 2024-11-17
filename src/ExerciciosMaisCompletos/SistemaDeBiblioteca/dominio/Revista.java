package ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio;

public class Revista extends Publicacao {
    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        System.out.println("Emprestando o revista: "+titulo);
    }

    @Override
    public void devolver() {
        System.out.println("Devolvendo a revista: "+titulo);
    }

    @Override
    public String toString() {
        return "Revista{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
