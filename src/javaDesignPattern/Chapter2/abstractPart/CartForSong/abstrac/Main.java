package javaDesignPattern.Chapter2.abstractPart.CartForSong.abstrac;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song();
        s1.setMode(new TodaySale());

        Song s2 = new Song();
        s2.setMode(new OnSale());

        Song s3 = new Song();
        s3.setMode(new NonDiscount());

        CartForSong c = new CartForSong();
        c.add(s1);
        c.add(s2);
        c.add(s3);

        System.out.println(c.calculateTotalPrice());

    }
}
