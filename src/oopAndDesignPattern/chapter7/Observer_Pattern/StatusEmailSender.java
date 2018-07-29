package oopAndDesignPattern.chapter7.Observer_Pattern;

public class StatusEmailSender implements  StatusObserver {
    @Override
    public void onAbnormalStatus(Status status) {
        sendEmail(status);
    }

    private void sendEmail(Status status) {
        //이메일전송코드
    }
}
