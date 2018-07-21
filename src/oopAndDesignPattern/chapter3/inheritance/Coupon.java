package oopAndDesignPattern.chapter3.inheritance;

public class Coupon {
    private int discountAmount;

    public Coupon(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public int calculateDiscountPirce(int price) {
        if( price < discountAmount)
            return 0;
            return price - discountAmount;
    }
}
