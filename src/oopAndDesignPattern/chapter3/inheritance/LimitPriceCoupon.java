package oopAndDesignPattern.chapter3.inheritance;

import oopAndDesignPattern.chapter3.inheritance.Coupon;

public class LimitPriceCoupon extends Coupon {
    private int limitPrice;
    public LimitPriceCoupon(int discountAmount) {
        super(discountAmount);
        this.limitPrice = discountAmount;
    }

    public int getLimitPrice() {
        return limitPrice;
    }

    @Override
    public int calculateDiscountPirce(int price) {
        if(price < limitPrice){
            return price;
        }
        return super.calculateDiscountPirce(price);
    }
}
