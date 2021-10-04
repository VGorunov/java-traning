package by.traning.lab.lesson.entities;

public class PercentageDiscountCalculator extends AbstractCalculator {
    private int price;
    private int discount;

    public PercentageDiscountCalculator() {

    }

    public PercentageDiscountCalculator(int price, int discount){
        this.price = price;
        this.discount = discount;
    }

    @Override
    public int calculatePrice() { //discount percentage
        return (price - (price * discount) / 100);
    }
}
