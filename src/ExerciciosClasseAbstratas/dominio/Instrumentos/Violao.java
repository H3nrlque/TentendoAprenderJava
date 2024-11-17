package ExerciciosClasseAbstratas.dominio.Instrumentos;

public class Violao extends Instrumento{
    @Override
    public void tocar() {
        System.out.println("Tocando Violão");
    }
}
