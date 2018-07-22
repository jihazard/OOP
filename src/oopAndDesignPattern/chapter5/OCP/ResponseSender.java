package oopAndDesignPattern.chapter5.OCP;

import javax.xml.crypto.Data;

public class ResponseSender {

    private Data data;

    public ResponseSender(Data data) {
        this.data = data;
    }

    public void send() {
        sendHeader();
        sendBody();
    }

    protected void sendBody() {
        System.out.println("헤더 데이터 전송");
    }

    protected void sendHeader() {
        System.out.println("텍스트로 데이터 전송");
    }
}
