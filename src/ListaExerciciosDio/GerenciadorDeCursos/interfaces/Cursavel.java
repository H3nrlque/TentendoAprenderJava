package ListaExerciciosDio.GerenciadorDeCursos.interfaces;

import ListaExerciciosDio.GerenciadorDeCursos.dominio.Aluno;

public interface Cursavel {
    void inscreverAluno(Aluno aluno);

    void removerAluno(String cpf);

    void exibirAlunos();
}
