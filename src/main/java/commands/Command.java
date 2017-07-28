package commands;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public abstract class Command {

    protected String code;
    protected BigDecimal price;

    public String getCode() {
        return code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getRest(BigDecimal money) {
        return this.price.subtract(money);
    }
}
