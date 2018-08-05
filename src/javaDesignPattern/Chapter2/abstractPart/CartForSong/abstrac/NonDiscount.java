package javaDesignPattern.Chapter2.abstractPart.CartForSong.abstrac;

public class NonDiscount extends DiscountMode {
    @Override
    public double sale() {
        return 0.0;
    }
}
