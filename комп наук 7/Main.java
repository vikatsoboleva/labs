import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Random random = new Random();
        ProductName[] names = ProductName.values();
        int numberOfProducts = 20;

        for(int i = 0; i < numberOfProducts; i++) {
            ProductName name = names[random.nextInt(names.length)];
            double cost = 1 + (20 - 1) * random.nextDouble();
            double weight = 0.1 + (10 - 0.1) * random.nextDouble();
            Product product = new Product(name, cost, weight);
            if(!cart.contains(product)) {
                cart.add(product);
            }
        }

        cart.removeIf(p -> p.getWeight() > 5 || p.getCost() > 10000);
        Product favorite = new Product(ProductName.APPLE, 0, 0);
        cart.remove(favorite);
        cart.add(0, favorite);

        for(Product p : cart) {
            if(p.getCost() < 10 && p.getWeight() > 2) {
                System.out.println(p);
            }
        }
    }
}

class Product {
    private ProductName name;
    private double cost;
    private double weight;

    public Product(ProductName name, double cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public ProductName getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name == product.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}

enum ProductName {
    APPLE, BANANA, ORANGE, MILK, BREAD, CHEESE, EGG, CHICKEN, RICE, PASTA
}
