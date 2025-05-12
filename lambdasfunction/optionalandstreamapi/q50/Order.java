package lambdasfunction.optionalandstreamapi.q50;

import java.time.LocalDate;
import java.util.List;

class Order {
    private int id;
    private LocalDate date;
    private List<Double> itemPrices;

    public Order(int id, LocalDate date, List<Double> itemPrices) {
        this.id = id;
        this.date = date;
        this.itemPrices = itemPrices;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotalAmount() {
        return itemPrices.stream().mapToDouble(Double::doubleValue).sum();
    }
}

