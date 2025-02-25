package Lab_6;

public class Main {
    public static void main(String[] args) {
        Shop.Product p1 = new Shop.Product(1.5, 10.0, "Молоко");
        Shop.Product p2 = new Shop.Product(0.5, 5.0, "Хлеб");
        Shop.Product p3 = new Shop.Product(2.0, 20.0, "Сыр");

        Shop.Product[] products = {p1, p2, p3};

        Shop shop = new Shop(2, products, 4);
        System.out.println(shop);

        String[] categories = {"Продукты", "Бытовая химия", "Товары для дома"};

        Supermarket supermarket = new Supermarket(4, products, 8, 1500.0, categories);
        System.out.println(supermarket);
    }
}
