package CollectionsFrameWork.Q5ProductCatlog;

public class Product {
    int id;
    String name;
    double price;
    double rating;
    int stock;

    Product(int id, String name, double price, double rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }
}
