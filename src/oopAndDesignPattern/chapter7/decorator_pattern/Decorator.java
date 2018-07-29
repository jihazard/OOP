package oopAndDesignPattern.chapter7.decorator_pattern;

public abstract  class Decorator implements FileOut {
    private FileOut delegate;

    public Decorator(FileOut delegate) {
        this.delegate = delegate;
    }

    protected void doDelegate(byte[] data){
        delegate.write(data);
    }
}
