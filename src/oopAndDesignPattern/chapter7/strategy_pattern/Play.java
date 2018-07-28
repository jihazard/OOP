package oopAndDesignPattern.chapter7.strategy_pattern;

public class Play {
    private static DiscountStrategy discountStrategy;

    public static void main(String[] args) {

    }

    public void onfFirstGuestButtonClick () {
        discountStrategy = new FirstGuestDiscountStrategy();
        System.out.println("첫버째 결제자");
    }

    public void onCalculationButtonClick() {
        Calculator cal= new Calculator(discountStrategy);
        //int price  = cal.calculate(items);
    }

    public void init(){

    }

}
