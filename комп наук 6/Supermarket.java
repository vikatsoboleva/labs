package Lab_6;

import java.util.Arrays;

public class Supermarket extends Shop {
    private double area;
    private String[] productCategories;

    public Supermarket() {
        super();
        this.area = 0.0;
        this.productCategories = new String[0];
    }

    public Supermarket(int numberOfCashRegisters, Product[] products, int numberOfSellers,
                       double area, String[] productCategories) {
        super(numberOfCashRegisters, products, numberOfSellers);
        this.area = area;
        this.productCategories = productCategories;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setProductCategories(String[] productCategories) {
        this.productCategories = productCategories;
    }

    public double getArea() {
        return area;
    }

    public String[] getProductCategories() {
        return productCategories;
    }

    @Override
    public double calculateEfficiency() {
        if (productCategories.length == 0) {
            return 0;
        }
        double cashRegisterEfficiency = calculateCashRegisterEfficiency();
        double efficiency = (area / productCategories.length) * cashRegisterEfficiency;
        if (efficiency >= 1) {
            return 0.99;
        }
        return efficiency;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "area=" + area +
                ", productCategories=" + Arrays.toString(productCategories) +
                ", numberOfCashRegisters=" + getNumberOfCashRegisters() +
                ", products=" + Arrays.toString(getProducts()) +
                ", numberOfSellers=" + getNumberOfSellers() +
                ", efficiency=" + calculateEfficiency() +
                '}';
    }
}
