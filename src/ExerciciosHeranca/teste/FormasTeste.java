package ExerciciosHeranca.teste;

import ExerciciosHeranca.dominio.Circulo;
import ExerciciosHeranca.dominio.Quadrado;
import ExerciciosHeranca.dominio.Retangulo;

public class FormasTeste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        System.out.println(circulo);
        System.out.println("------------------");
        Quadrado quadrado = new Quadrado(4);
        quadrado.calcularArea();
        System.out.println(quadrado);
        System.out.println("------------------");
        Retangulo retangulo = new Retangulo(6, 3);
        retangulo.calcularArea();
        System.out.println(retangulo);
    }
}
