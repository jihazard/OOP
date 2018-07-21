package oopAndDesignPattern.chapter3.codeExample3point2;

public class SocketDataReader implements ByteSource {

    @Override
    public byte[] read() {
        System.out.println("소켓데이터리더");
        return new byte[0];
    }
}
