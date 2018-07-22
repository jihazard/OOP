package oopAndDesignPattern.chapter5.OCP;

import javax.xml.crypto.Data;

public class Play {
    public static void main(String[] args) {
        Data data = null;

        ZippedResponseSender zip = new ZippedResponseSender(data);
        zip.sendBody();
    }
}
