package oopAndDesignPattern.chapter7.strategy_pattern;

public class Item {
    private double price;
    private String name;
    private boolean fresh;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public boolean isFresh() {
        return fresh;
    }
}
