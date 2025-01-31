package ExerciciosHeranca.teste;

import ExerciciosHeranca.dominio.ImportedProduct;
import ExerciciosHeranca.dominio.Product;
import ExerciciosHeranca.dominio.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = tc.nextInt();
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + "data:");
            System.out.print("Common, used or imported(c/u/i): ");
            char res = tc.next().charAt(0);
            productList.add(instaciarProduct(res));
            System.out.println();
        }

        for (Product product : productList) {
            System.out.println(product);
        }

    }

    private static Product instaciarProduct(char res) {
        Scanner tc = new Scanner(System.in);
        if (res == 'c') {
            System.out.print("Name: ");
            String name = tc.nextLine();
            System.out.print("Price: ");
            double price = tc.nextDouble();
            return new Product(name, price);
        } else if (res == 'u') {
            System.out.print("Name: ");
            String name = tc.nextLine();
            System.out.print("Price: ");
            double price = tc.nextDouble();
            System.out.print("Manufacture date(dd/MM/yyyy): ");
            String data = tc.next();
            return new UsedProduct(name, price, data);
        } else if (res == 'i') {
            System.out.print("Name: ");
            String name = tc.nextLine();
            System.out.print("Price: ");
            double price = tc.nextDouble();
            System.out.print("Customs fee: ");
            double customs = tc.nextDouble();
            return new ImportedProduct(name, price, customs);
        }
        return null;
    }
}
