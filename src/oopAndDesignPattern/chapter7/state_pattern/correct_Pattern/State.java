package oopAndDesignPattern.chapter7.state_pattern.correct_Pattern;

public interface State {
    public void increaseCoin(int coin, VendingMachine vendingMachine) ;


    public void select(int productId, VendingMachine vendingMachine) ;
}
