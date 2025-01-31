package ExerciciosHeranca.dominio;

public class OutsoucerdEmployee extends Employee {
    private double additiobalCharge;

    public OutsoucerdEmployee(String name, int hours, double valuePerHours, double additiobalCharge) {
        super(name, hours, valuePerHours);
        this.additiobalCharge = additiobalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additiobalCharge * 1.1;
    }

    public double getAdditiobalCharge() {
        return additiobalCharge;
    }

    public void setAdditiobalCharge(double additiobalCharge) {
        this.additiobalCharge = additiobalCharge;
    }
}
