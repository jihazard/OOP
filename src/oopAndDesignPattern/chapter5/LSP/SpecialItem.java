package oopAndDesignPattern.chapter5.LSP;

public class SpecialItem extends Item{

    @Override
    public boolean isDiscountAvailable() {
        return false;
    }
}
