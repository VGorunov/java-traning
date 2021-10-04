package by.traning.lab.lesson;


import by.traning.lab.lesson.entities.AbstractCalculator;
import by.traning.lab.lesson.entities.DiscountCalculator;
import by.traning.lab.lesson.entities.PercentageDiscountCalculator;
import by.traning.lab.lesson.entities.PriceCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a price: ");
        int price = in.nextInt();

        System.out.print("Input a discount: ");
        int discount = in.nextInt();


        System.out.print("Input a type of discount: ");
        String typeOfDiscount = in.next();
        AbstractCalculator result = getAbstractCalculator(price, discount, typeOfDiscount);
        System.out.println(result.calculatePrice());
    }

    private static AbstractCalculator getAbstractCalculator(int price, int discount, String typeOfDiscount) {
        AbstractCalculator result = null;
        if (typeOfDiscount.equals("PriceCalculator")) {
           result = new PriceCalculator(price);
        } else if (typeOfDiscount.equals("DiscountCalculator")) {
           result = new DiscountCalculator(price, discount);
        } else if (typeOfDiscount.equals("PercentageDiscountCalculator")) {
            result = new PercentageDiscountCalculator(price, discount);
        }
        return result;
    }
}




