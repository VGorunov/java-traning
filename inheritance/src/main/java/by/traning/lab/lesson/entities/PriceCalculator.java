package by.traning.lab.lesson.entities;

public class PriceCalculator extends AbstractCalculator {
    private int price;

    public PriceCalculator(){
    }

    public PriceCalculator(int price){
        this.price = price;
    }

    @Override
    public int calculatePrice() {  //no discount
        return price;
    }
}

