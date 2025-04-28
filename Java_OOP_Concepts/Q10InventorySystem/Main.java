package Java_OOP_Concepts.Q10InventorySystem;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.add(new Product(1, "Laptop", 10000));
        store.add(new Product(2, "Mobile", 5000));
        store.add(new Product(3, "Tablet", 300));
        store.add(new Product(4, "Monitor", 400));

        store.displayAllProducts();
        store.getHighestPriceProduct();
        store.searchProduct("Tablet");
    }
}

