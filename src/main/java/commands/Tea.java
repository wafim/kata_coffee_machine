package commands;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class Tea extends Command {

    public Tea() {
        price = new BigDecimal("0.4");
        code = "T";
    }

    public Tea(boolean isHot) {
        this();
        if (isHot)
            code = "Th";
    }
}
