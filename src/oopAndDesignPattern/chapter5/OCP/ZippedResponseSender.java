package oopAndDesignPattern.chapter5.OCP;

import javax.xml.crypto.Data;

public class ZippedResponseSender extends ResponseSender {
    public ZippedResponseSender(Data data) {
        super(data);
    }



    @Override
    protected void sendBody() {
        super.sendBody();
        System.out.println("확장된 텍스트로 데이터 전송");
    }
}
