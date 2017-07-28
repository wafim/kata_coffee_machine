package coffeemachine;

import coffeemachine.commands.Command;

import java.math.BigDecimal;

/**
 * Created by mwafi on 27/07/2017.
 */
public class DrinkCommander {

    public InstructionTranslator translator;


    public String getCommand(BigDecimal money, SugarQuantity quantity, Command command) {
        String result = "";


        if (money.compareTo(command.getPrice()) != -1) {
            result = translator.getDrinkMakerCommand(command, quantity);
        } else {
            result = String.valueOf(command.getRest(money));
        }

        return result;

    }

}
