package lambdasfunction.customtype.q36;


import java.util.List;

class Order {
    private List<Item> items;

    Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() { return items; }
}