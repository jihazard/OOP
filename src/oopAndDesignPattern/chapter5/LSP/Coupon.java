package oopAndDesignPattern.chapter5.LSP;

public class Coupon {
    private int discountRate = 3;
    public int calculateDiscountAmount(SpecialItem item) {
        if(!item.isDiscountAvailable()){
            return 0;
        }
        return item.getPrice() * discountRate;
    }
}
