package coffeemachine.items;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class Tea extends Item {
    private static int numberOfdrink=0;
    private static BigDecimal totalPrice=new BigDecimal("0");

    public Tea() {
        price = new BigDecimal("0.4");
        code = "T";
        numberOfdrink ++;
        totalPrice=totalPrice.add(price);
    }

    public Tea(boolean isHot) {
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
