package oopAndDesignPattern.chapter3.abstrac;

public class AbstractPlay  {
    public static void main(String[] args) {
        LogCollect log = new FtpLogFileDownloader();
        log.collect();
        log = new DbTableLogGateway();
        log.collect();
    }
}
