package oopAndDesignPattern.chapter7.decorator_pattern;

public class EncryptionOut extends Decorator {

    public EncryptionOut(FileOut delegate) {
        super(delegate);
    }

    @Override
    public void write(byte[] data) {
        byte[] encryptDat = encrypt(data);
        super.doDelegate(encryptDat);
    }

    private byte[] encrypt(byte[] data) {
     return null;
    }

}
