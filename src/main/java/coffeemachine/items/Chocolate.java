package coffeemachine.items;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class Chocolate extends Item {
    public static int numberOfdrink = 0;
    public static BigDecimal totalPrice = new BigDecimal("0");


    public Chocolate() {
        code = "H";
        price = new BigDecimal("0.5");
        numberOfdrink++;
        totalPrice = totalPrice.add(price);
    }

    public Chocolate(boolean isHot) {
        this();
        this.isHot = isHot;
        numberOfdrink++;
        totalPrice = totalPrice.add(price);
    }

    @Override
    public int getNumberOfdrink() {
        return this.numberOfdrink;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }
}
