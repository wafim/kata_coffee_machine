package coffeemachine.items;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public abstract class Item {

    protected String code;
    protected BigDecimal price;
    protected boolean isHot = false;


    public String getCode() {
        if (isHot) {
            return code + "h";
        }
        return code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getRest(BigDecimal money) {
        return this.price.subtract(money);
    }

    public abstract int getNumberOfdrink();

    public abstract BigDecimal getTotalPrice();


}
