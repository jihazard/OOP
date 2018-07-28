package oopAndDesignPattern.chapter7.state_pattern.correct_Pattern;

public class VendingMachine {
    private State state;

    public VendingMachine(State state) {
        this.state = state;
    }

    public void insertCoin(int coin){
        state.increaseCoin(coin,this);
    }

    public void select(int productId) {
        state.select(productId,this);
    }

    public void increaseCoin(int coin) {
    }

    public s changeState(SelectableState selectableState) {
    }
}
