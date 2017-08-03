package coffeemachine.items;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class OrangeJuice extends Item {
    private static int numberOfdrink = 0;
    private static BigDecimal totalPrice = new BigDecimal("0");

    public OrangeJuice() {
        super.code = "O";
        super.price = new BigDecimal("0.6");
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
