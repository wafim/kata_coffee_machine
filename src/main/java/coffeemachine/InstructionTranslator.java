package coffeemachine;

import coffeemachine.items.Item;

/**
 * Created by mwafi on 27/07/2017.
 */
public class InstructionTranslator {

    public String getDrinkMakerCommand(Item item, SugarQuantity sugarQuantity) {


        return item.getCode() + getSugarCode(sugarQuantity);

    }

    private String getSugarCode(SugarQuantity sugar) {
        switch (sugar) {
            case ZERO:
                return "::";
            case ONE:
                return ":1:0";
            case TWO:
                return ":2:0";
            default:
                return "";
        }

    }

    public String getMessageContent(String message) {

        return message.replaceFirst("M:", "");

    }
}
