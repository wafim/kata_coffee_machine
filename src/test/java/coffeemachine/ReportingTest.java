package coffeemachine;

import coffeemachine.items.Tea;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Created by mwafi on 28/07/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class ReportingTest {

    @Mock
    Logger logger = LoggerFactory.getLogger(ReportingTest.class);
    @Mock
    InstructionTranslator instructionTranslator;
    @InjectMocks
    DrinkCommander drinkCommander = new DrinkCommander();

    @Test
    public void should_report_number_of_sold_tea() {

        //given
        Tea t = new Tea();
        when(instructionTranslator.getDrinkMakerCommand(t, SugarQuantity.ONE)).thenReturn("T:1:0");
        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.4"), SugarQuantity.ONE, t);
        Mockito.verify(logger).debug(anyString());

    }
}
