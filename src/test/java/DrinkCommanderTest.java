import commands.Chocolate;
import commands.Coffee;
import commands.Tea;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by mwafi on 27/07/2017.
 */
public class DrinkCommanderTest {

    @Mock
    InstructionTranslator instructionTranslator;
    @InjectMocks
    DrinkCommander drinkCommander = new DrinkCommander();


    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_get_1_tea_with_1_sugar_and_a_stick() {

        //given
        Tea t = new Tea();
        when(instructionTranslator.getDrinkMakerCommand(t, SugarQuantity.ONE)).thenReturn("T:1:0");
        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.4"), SugarQuantity.ONE, t);

        //then
        assertThat(result).isEqualTo("T:1:0");


    }

    @Test
    public void should_get_1_chocolate_with_1_sugar_and_a_stick() {
        Chocolate chocolate = new Chocolate();

        //given
        when(instructionTranslator.getDrinkMakerCommand(chocolate, SugarQuantity.ONE)).thenReturn("H:1:0");
        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.5"), SugarQuantity.ONE, chocolate);
        //then
        assertThat(result).isEqualTo("H:1:0");


    }

    @Test
    public void should_get_1_coffee_with_1_sugar_and_a_stick() {

        Coffee coffee = new Coffee();

        //given
        when(instructionTranslator.getDrinkMakerCommand(coffee, SugarQuantity.ONE)).thenReturn("C:1:0");
        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.6"), SugarQuantity.ONE, coffee);
        //then
        assertThat(result).isEqualTo("C:1:0");


    }

    @Test
    public void should_get_price_messing() {

        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.5"), SugarQuantity.ONE, new Coffee());
        //then
        assertThat(result).isEqualTo("0.1");


    }

}
