package oopAndDesignPattern.chapter3.abstrac;

public class FtpLogFileDownloader implements LogCollect {
    @Override
    public void collect() {
        System.out.println("ftplog파일 다운로드 로그수집");
    }
}
