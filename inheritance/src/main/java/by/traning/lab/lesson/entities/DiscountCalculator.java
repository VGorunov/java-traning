package by.traning.lab.lesson.entities;

public class DiscountCalculator extends AbstractCalculator {
    private int price;
    private int discount;

    public DiscountCalculator() {

    }

    public DiscountCalculator(int price, int discount) {
        this.price = price;
        this.discount = discount;
    }

    @Override
    public int calculatePrice() { // return the size of the discount from the price
        return price - discount;
    }
}
