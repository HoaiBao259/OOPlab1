package Question4;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private List<Item> items;


    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public void addItem(Item item) {
        this.items.add(item);
    }


    public double calculateAverageCost() {
        if (items.isEmpty()) {
            return 0;
        }
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        return totalCost / items.size();
    }
}
