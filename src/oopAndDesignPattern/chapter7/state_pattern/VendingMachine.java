package oopAndDesignPattern.chapter7.state_pattern;

public class VendingMachine {
        public static enum State {NOCOIN , SELECTABLE}

        private State state = State.NOCOIN;

        public void insertCoin(int coin){
            switch(state) {
                case NOCOIN:
                    increaseCoin(coin);
                    state = State.SELECTABLE;
                    break;
                case SELECTABLE:
                    increaseCoin(coin);
            }
        }

        public void select(int productId) {
            switch(state) {
                case NOCOIN:
                    break;
                case SELECTABLE:
                    provideProduct(productId);
                    decreaseCoin();
                    //if(hasNoCoin()) state = State.NOCOIN;
            }
        }

    private void decreaseCoin() {
    }

    private void provideProduct(int productId) {
    }

    private void increaseCoin(int coin) {
    }
}
