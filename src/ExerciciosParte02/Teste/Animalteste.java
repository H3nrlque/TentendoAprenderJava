package ExerciciosParte02.Teste;

import ExerciciosParte02.dominio.Cachorro;
import ExerciciosParte02.dominio.Gato;
import ExerciciosParte02.dominio.Pato;

public class Animalteste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.reproduzir();
        Gato gato = new Gato();
        gato.reproduzir();
        Pato pato = new Pato();
        pato.reproduzir();
    }

}
