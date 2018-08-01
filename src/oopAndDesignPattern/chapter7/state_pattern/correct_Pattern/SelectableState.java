package oopAndDesignPattern.chapter7.state_pattern.correct_Pattern;

public class SelectableState implements State{
    @Override
    public void increaseCoin(int coin, VendingMachine vendingMachine) {
        vendingMachine.increaseCoin(coin);
    }

    @Override
    public void select(int productId, VendingMachine vendingMachine) {
        vendingMachine.provideProduct(productId);
        vendingMachine.decreseCoin();
        //if(vendingMachine.hasNoCoin()) vendingMachine.changeState(new NoCoinState());
    }
}
