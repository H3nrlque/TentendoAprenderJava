package ListaExerciciosDio.GerenciadorDeCursos.dominio;

public class Informatica extends Curso{
    public Informatica(String nome, int cargaHoraria, String professor, String turma) {
        super(nome, cargaHoraria, professor, turma);
    }

    @Override
    public void inscreverAluno(Aluno aluno) {
        turma.adicionarAluno(aluno);
    }

    @Override
    public void removerAluno(String cpf) {

    }

    @Override
    public void exibirAlunos() {

    }
}
