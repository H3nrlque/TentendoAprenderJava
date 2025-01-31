package ExerciciosHeranca.dominio;

public class UsedProduct extends Product {
    private String manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return getName() + " (used) " + " $ " + getPrice() + " (Manufacture date: " + manufactureDate + ")";
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
