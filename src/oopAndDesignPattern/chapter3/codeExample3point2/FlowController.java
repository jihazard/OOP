package oopAndDesignPattern.chapter3.codeExample3point2;

public class FlowController {
    private boolean useFile;

    public FlowController(boolean useFile) {
        this.useFile = useFile;
    }

    public  void process(){
       ByteSource source = ByteSourceFactory.getInstance().create();
        byte[] data = source.read();


        Encryptor encryptor = new Encryptor();
        byte[] encredata = encryptor.read();

        FileDataWriter writer = new FileDataWriter();
        writer.write(encredata);

    }
}
