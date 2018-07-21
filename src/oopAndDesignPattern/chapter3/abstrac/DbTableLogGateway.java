package oopAndDesignPattern.chapter3.abstrac;

public class DbTableLogGateway implements LogCollect {
    @Override
    public void collect() {
        System.out.println("db로그게이트웨이");
    }
}
