import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;
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
        when(instructionTranslator.getDrinkMakerCommand(DrinkType.TEA, SugarQuantity.ONE)).thenReturn("T:1:0");
        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.4"), DrinkType.TEA, SugarQuantity.ONE);
        //then
        assertThat(result).isEqualTo("T:1:0");


    }

    @Test
    public void should_get_1_chocolate_with_1_sugar_and_a_stick() {

        //given
        when(instructionTranslator.getDrinkMakerCommand(DrinkType.CHOCOLATE, SugarQuantity.ONE)).thenReturn("H:1:0");
        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.5"), DrinkType.CHOCOLATE, SugarQuantity.ONE);
        //then
        assertThat(result).isEqualTo("H:1:0");


    }

    @Test
    public void should_get_1_coffee_with_1_sugar_and_a_stick() {

        //given
        when(instructionTranslator.getDrinkMakerCommand(DrinkType.COFFEE, SugarQuantity.ONE)).thenReturn("C:1:0");
        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.6"), DrinkType.COFFEE, SugarQuantity.ONE);
        //then
        assertThat(result).isEqualTo("C:1:0");


    }
    @Test
    public void should_get_price_messing() {

        //when
        String result = drinkCommander.getCommand(new BigDecimal("0.5"), DrinkType.COFFEE, SugarQuantity.ONE);
        //then
        assertThat(result).isEqualTo("0.1");


    }

}
