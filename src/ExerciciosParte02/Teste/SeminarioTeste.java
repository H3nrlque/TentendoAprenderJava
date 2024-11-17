package ExerciciosParte02.Teste;

import ExerciciosParte02.dominio.Estudantes;
import ExerciciosParte02.dominio.Local;
import ExerciciosParte02.dominio.Professores;
import ExerciciosParte02.dominio.Seminarios;

public class SeminarioTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua Maria Feijó, 59");
        Estudantes estudante = new Estudantes("João", 20);
        Professores professor = new Professores("William", "Programação e Machine Learning");
        Seminarios seminario = new Seminarios("IA e a mudança no mundo como conhecemos", local);
        professor.adicionarSeminario(seminario);
        estudante.definirSeminario(seminario);
        seminario.adicionarAluno(estudante);
        Estudantes estudante2 = new Estudantes("Lucas", 21);
        estudante2.definirSeminario(seminario);
        seminario.adicionarAluno(estudante2);
        estudante.imprime();
        System.out.println("--------------");
        System.out.println(professor);
        System.out.println("--------------");
        System.out.println(local);
        System.out.println("--------------");
        seminario.imprime();

    }
}
