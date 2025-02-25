package Lab_6;

import java.util.Arrays;

public class Shop {
    private int numberOfCashRegisters;
    private Product[] products;
    private int numberOfSellers;

    public static class Product {
        private double weight;
        private double price;
        private String name;

        public Product() {
            this.weight = 0.0;
            this.price = 0.0;
            this.name = "";
        }

        public Product(double weight, double price, String name) {
            this.weight = weight;
            this.price = price;
            this.name = name;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "', weight=" + weight + ", price=" + price + "}";
        }
    }

    public Shop() {
        this.numberOfCashRegisters = 0;
        this.products = new Product[0];
        this.numberOfSellers = 0;
    }

    public Shop(int numberOfCashRegisters, Product[] products, int numberOfSellers) {
        this.numberOfCashRegisters = numberOfCashRegisters;
        this.products = products;
        this.numberOfSellers = numberOfSellers;
    }

    public void setNumberOfCashRegisters(int numberOfCashRegisters) {
        this.numberOfCashRegisters = numberOfCashRegisters;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setNumberOfSellers(int numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }

    public int getNumberOfCashRegisters() {
        return numberOfCashRegisters;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getNumberOfSellers() {
        return numberOfSellers;
    }

    public double calculateCashRegisterEfficiency() {
        if (numberOfCashRegisters == 0) {
            return 0;
        }
        double efficiency = (double) numberOfSellers / numberOfCashRegisters;
        return efficiency < 1 ? efficiency : 1.0;
    }

    public double calculateAverageProductWeight() {
        if (products.length == 0) {
            return 0;
        }
        double totalWeight = 0.0;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        double averageWeight = totalWeight / products.length;
        return averageWeight;
    }

    public double calculateEfficiency() {
        double averageWeight = calculateAverageProductWeight();
        double cashRegisterEfficiency = calculateCashRegisterEfficiency();
        if (cashRegisterEfficiency == 0) {
            return 0;
        }
        double efficiency = averageWeight / cashRegisterEfficiency;
        return efficiency < 1 ? efficiency : 1.0;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "numberOfCashRegisters=" + numberOfCashRegisters +
                ", products=" + Arrays.toString(products) +
                ", numberOfSellers=" + numberOfSellers +
                ", efficiency=" + calculateEfficiency() +
                '}';
    }
}
