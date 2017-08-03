package coffeemachine;

import coffeemachine.items.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mwafi on 27/07/2017.
 */
public class DrinkCommander {

    Logger logger = LoggerFactory.getLogger(DrinkCommander.class);

    public InstructionTranslator translator;
    public EmailNotifier emailNotifier;
    public BeverageQuantityChecker beverageQuantityChecker;


    public String getCommand(BigDecimal money, SugarQuantity quantity, Item item) {
        String result = "";

        //verify water
        if (beverageQuantityChecker != null && beverageQuantityChecker.isEmpty(item.getCode())) {
            emailNotifier.notifyMissingDrink(item.getCode());
            logger.debug("there is a shortage :notification is sended");
        } else {

            if (money.compareTo(item.getPrice()) != -1) {
                result = translator.getDrinkMakerCommand(item, quantity);
                logger.debug(item.getCode() + ":" + item.getNumberOfdrink() + ":" + item.getTotalPrice());


            } else {
                result = String.valueOf(item.getRest(money));
            }
        }


        return result;


    }


}
