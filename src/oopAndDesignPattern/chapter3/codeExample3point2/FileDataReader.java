package oopAndDesignPattern.chapter3.codeExample3point2;

public class FileDataReader implements ByteSource {

    @Override
    public byte[] read() {
        System.out.println("파일 데이터 리더");
        return new byte[0];
    }
}
