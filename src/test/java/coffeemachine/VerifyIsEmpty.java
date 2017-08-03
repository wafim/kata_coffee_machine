package coffeemachine;

import coffeemachine.items.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;

/**
 * Created by mwafi on 03/08/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class VerifyIsEmpty {
    @Mock
    Logger logger = LoggerFactory.getLogger(ReportingTest.class);
    @Mock
    EmailNotifier emailNotifier;
    @Mock
    BeverageQuantityChecker beverageQuantityChecker;
  

    @InjectMocks
    DrinkCommander drinkCommander = new DrinkCommander();

    @Test
    public void should_verify_that_notification_is_sended() {

        //given
        Tea t = new Tea();
        when(beverageQuantityChecker.isEmpty(t.getCode())).thenReturn(true);
        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.4"), SugarQuantity.ONE, t);
        Mockito.verify(emailNotifier).notifyMissingDrink(t.getCode());
        Mockito.verify(logger).debug("there is a shortage :notification is sended");

    }
}
