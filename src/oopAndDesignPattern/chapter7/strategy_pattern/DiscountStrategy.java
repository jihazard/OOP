package oopAndDesignPattern.chapter7.strategy_pattern;

public interface DiscountStrategy {
    int getDiscountPrice(Item item);
    //int getDiscountPrice(int totalPrice);
}

 interface TotalPriceDiscountStrategy {
    int getDiscountPrice(int totalprice);
}
