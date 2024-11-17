package ExerciciosEnum.Enums;

public enum Planeta {
    Mercurio(2.439,330.107*Math.pow(10, 18)),
    Venus(6.051, 4867.320*Math.pow(10,18)),
    Terra(6.371, 5972.190*Math.pow(10,18)),
    Marte(3.389,641.693*Math.pow(10,18)),
    Jupiter(69.911, 1898.130*Math.pow(10,21)),
    Saturno(58.238, Math.pow(10,21)),
    Urano(25.362, 86810.300*Math.pow(10,18)),
    Netuno(24.622, 102.412*Math.pow(10,21));

    private double raio;
    private double massa;

    Planeta(double raio, double massa) {
        this.raio = raio;
        this.massa = massa;
    }

    public void calcularGravidade() {
        double gravidade = 6.67408* massa / Math.pow(raio, 2);
        System.out.println(gravidade);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }
}
