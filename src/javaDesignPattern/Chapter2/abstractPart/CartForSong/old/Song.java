package javaDesignPattern.Chapter2.abstractPart.CartForSong.old;

public class Song {
    private double price = 10.0;
    private String discountMode;

    public String getDiscountMode() {
        return discountMode;
    }

    public double getPrice() {
        return price;
    }


    public Song setDiscountMode(String discountMode) {
        this.discountMode = discountMode;
        return this;
    }
}
