package coffeemachine.commands;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class Coffee extends Command {

    public Coffee() {
        code = "C";
        price = new BigDecimal("0.6");
    }
    public Coffee(boolean isHot) {
        this();
        this.isHot = isHot;
    }

}
