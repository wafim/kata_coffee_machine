package coffeemachine.items;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class Coffee extends Item {
    private static int numberOfdrink = 0;
    private static BigDecimal totalPrice = new BigDecimal("0");


    public Coffee() {
        code = "C";
        price = new BigDecimal("0.6");
        numberOfdrink++;
        totalPrice = totalPrice.add(price);
    }

    public Coffee(boolean isHot) {
        this();
        this.isHot = isHot;

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
