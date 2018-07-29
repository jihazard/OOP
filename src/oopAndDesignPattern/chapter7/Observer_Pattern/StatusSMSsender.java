package oopAndDesignPattern.chapter7.Observer_Pattern;

public class StatusSMSsender implements StatusObserver {
    @Override
    public void onAbnormalStatus(Status status) {
        sendSMS(status);
    }

    private void sendSMS(Status status) {
        //sms발송 코드
    }
}
