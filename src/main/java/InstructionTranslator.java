import commands.Command;

/**
 * Created by mwafi on 27/07/2017.
 */
public class InstructionTranslator {

    public String getDrinkMakerCommand(Command command, SugarQuantity sugarQuantity) {


        return command.getCode() + getSugarCode(sugarQuantity);

    }

    private String getSugarCode(SugarQuantity sugar) {

        return SugarQuantity.ZERO.equals(sugar) ? "::" : (SugarQuantity.ONE.equals(sugar) ? ":1:0" : ":2:0");

    }


    public String getMessageContent(String message) {

        return message.replaceFirst("M:", "");

    }
}
