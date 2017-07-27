import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mwafi on 27/07/2017.
 */
public class CoffeeMachine {

    public String getDrinkMakerCommand(DrinkType typeDrink, SugarQuantity sugar) {

        String result = "";

        switch (typeDrink) {

            case TEA:
                result = "T" + getSugarCode(sugar);
                break;
            case CHOCOLATE:
                result = "H" + getSugarCode(sugar);
                break;
            case COFFEE:
                result = "C" + getSugarCode(sugar);
                break;
        }

        return result;
    }

    private String getSugarCode(SugarQuantity sugar) {

        return SugarQuantity.ZERO == sugar ? "::" : (SugarQuantity.ONE == sugar ? ":1:0" : ":2:0");

    }


    public String getMessageContent(String message) {

        return message.replaceFirst("M:","");

    }
}
