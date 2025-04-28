package Java_OOP_Concepts.Q10InventorySystem;

public class Product {
    int id;
    String name;
    int price;

    Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void display(){
        System.out.println("ID: " + id + " Name: " + name + " Price: " + price);
    }
}
