package ExerciciosInterfaces.dominio;

import ExerciciosInterfaces.Interfaces.Medidas;

public class CalculoArea implements Medidas {
    public double areaCirculo(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
