package oopAndDesignPattern.chapter7.state_pattern.correct_Pattern;

public class NoCoinState implements State{

    @Override
    public void increaseCoin(int coin, VendingMachine vendingMachine) {
        vendingMachine.increaseCoin(coin);
        vendingMachine.changeState(new SelectableState());
    }

    @Override
    public void select(int productId, VendingMachine vendingMachine) {
        SoundUtil.beep();
    }

    private static class SoundUtil {
        public static void beep() {
            System.out.println("beeeeep beeeeeep!");
        }
    }
}
