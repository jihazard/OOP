package oopAndDesignPattern.chapter3.abstrac;

public class SocketLogReader implements LogCollect {
    @Override
    public void collect() {
        System.out.println(" 소켓리더 콜렉트");
    }
}
