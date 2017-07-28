package coffeemachine;

import coffeemachine.commands.Command;

/**
 * Created by mwafi on 27/07/2017.
 */
public class InstructionTranslator {

    public String getDrinkMakerCommand(Command command, SugarQuantity sugarQuantity) {


        return command.getCode() + getSugarCode(sugarQuantity);

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
