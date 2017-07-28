package coffeemachine.commands;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class Chocolate extends Command {

    public Chocolate() {
        code = "H";
        price = new BigDecimal("0.5");
    }

    public Chocolate(boolean isHot) {
        this();
        this.isHot = isHot;
    }

}
