package coffeemachine.commands;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class OrangeJuice extends Command {

    public OrangeJuice() {
        super.code = "O";
        super.price = new BigDecimal("0.6");

    }
}
