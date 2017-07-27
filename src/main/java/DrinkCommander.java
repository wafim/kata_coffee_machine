
import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class DrinkCommander {

    public InstructionTranslator translator;


    public String getCommand(BigDecimal price, DrinkType type, SugarQuantity quantity) {
        String result = "";

        switch (type) {

            case TEA:
                if (price.compareTo(new BigDecimal("0.4")) != -1 ) {
                    result = translator.getDrinkMakerCommand(type, quantity);
                } else {
                    result = String.valueOf(new BigDecimal("0.4").subtract(price));
                }
                break;
            case CHOCOLATE:
                if (price.compareTo(new BigDecimal("0.5")) != -1) {
                    result = translator.getDrinkMakerCommand(type, quantity);

                } else {
                    result = String.valueOf(new BigDecimal("0.5").subtract(price));
                }
                break;
            case COFFEE:
                if (price.compareTo(new BigDecimal("0.6")) != -1) {
                    result = translator.getDrinkMakerCommand(type, quantity);
                } else {
                    result = String.valueOf(new BigDecimal("0.6").subtract(price));
                }
                break;


        }
        return result;

    }

}
