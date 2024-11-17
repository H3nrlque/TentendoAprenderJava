package ExerciciosParte01.ExerciciosParaFixacao;

import ExerciciosParte01.dominio.Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Qual o nome do estudantes: ");
        String nomeEstudante = tc.nextLine();
        System.out.print("Qual a Id do estudantes: ");
        int idEstudante = tc.nextInt();
        System.out.print("Qual a nota do estudantes: ");
        double notaEstudante = tc.nextDouble();
        student = new Student(nomeEstudante, idEstudante, notaEstudante);
        System.out.println(student);
    }
}
