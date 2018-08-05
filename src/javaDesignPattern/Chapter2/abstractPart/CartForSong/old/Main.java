package javaDesignPattern.Chapter2.abstractPart.CartForSong.old;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song();

        s1.setDiscountMode("NonDiscount");

        Song s2 = new Song();
        s2.setDiscountMode("OnSale");

        Song s3 = new Song();
        s3.setDiscountMode("TodayEvent");


        CartForSong c = new CartForSong();
        c.add(s1);
        c.add(s2);
        c.add(s3);

        System.out.println("totalprice = " + c.calculateTotalPrice());
    }
}
