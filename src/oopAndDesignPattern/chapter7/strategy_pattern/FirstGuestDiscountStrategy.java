package oopAndDesignPattern.chapter7.strategy_pattern;

public class FirstGuestDiscountStrategy implements  DiscountStrategy{
    @Override
    public int getDiscountPrice(Item item) {
        return (int)(item.getPrice() * 0.9);
    }
}
