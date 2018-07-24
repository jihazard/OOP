package oopAndDesignPattern.chapter7.strategy_pattern;

import java.util.List;

public class Strategy_Pattern {
    /*public int calculate(boolean firstGuest , List<Item> items) {
        int sum= 0;
        for(Item item : items){
            if (firstGuest){
                sum += (int) (item.getPrice() * 0.9);
            }else if(! item.isFresh()){
                sum += (int) (item.getPrice() * 0.8);
            }else{
                sum += item.getPrice();
            }
        }
        return sum;
    }
    */

    private DiscountStrategy discountStrategy;

    public Strategy_Pattern(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public int calculate(List<Item> items){
        int sum = 0;
        for(Item item : items) {
            sum += discountStrategy.getDiscountPrice(item);
        }
        return sum;
    }

}
