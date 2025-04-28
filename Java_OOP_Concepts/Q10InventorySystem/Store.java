package Java_OOP_Concepts.Q10InventorySystem;

import java.util.ArrayList;

public class Store {
ArrayList<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void add(Product product) {
        this.products.add(product);
    }

    void displayAllProducts() {
        System.out.println("Available products: ");
        for (Product product : products) {
            product.display();
        }
    }

    public void getHighestPriceProduct(){
        int highestPriceProduct = products.get(0).price;
        Product highestProduct = products.get(0);

        for (Product product : products) {
            if (product.price > highestPriceProduct) {
                highestProduct = product;
                highestPriceProduct = product.price;
            }
        }
        System.out.println( "Highest price book is " + highestProduct.name +" " + highestPriceProduct);
    }

    void searchProduct(String productName){
        for (Product product : products) {
            if (product.name.equals(productName)) {
                product.display();
            }
        }
    }
}
