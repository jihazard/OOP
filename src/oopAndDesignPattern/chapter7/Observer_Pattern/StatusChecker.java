package oopAndDesignPattern.chapter7.Observer_Pattern;

public class StatusChecker extends StatusSubject {
    public void check() {
        Status status = loadStatus();
        if(status.isNotNormal())super.notifyStatus(status);
    }

    private Status loadStatus() {
        return null;
    }
}
