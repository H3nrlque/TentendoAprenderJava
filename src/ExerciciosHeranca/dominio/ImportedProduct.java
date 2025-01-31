package ExerciciosHeranca.dominio;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String toString() {
        return getName() + " $ " + totalPrice() + "(Customs fee: $ " + customsFee;
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
}
