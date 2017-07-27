import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by mwafi on 27/07/2017.
 */
public class CoffeeMachineTest {

    CoffeeMachine coffeeMachine = new CoffeeMachine();

    @Test
    public void should_get_1_tea_with_1_sugar_and_a_stick() {

        //when
        String result = coffeeMachine.getDrinkMakerCommand(DrinkType.TEA, SugarQuantity.ONE);

        //then
        assertThat(result).isEqualTo("T:1:0");


    }

    @Test
    public void should_get_1_tea_without_sugar() {

        //when
        String result = coffeeMachine.getDrinkMakerCommand(DrinkType.TEA, SugarQuantity.ZERO);

        //then
        assertThat(result).isEqualTo("T::");


    }

    @Test
    public void should_get_1_chocolate_with_no_sugar__and_therefore_no_stick() {

        //when
        String result = coffeeMachine.getDrinkMakerCommand(DrinkType.CHOCOLATE, SugarQuantity.ZERO);

        //then
        assertThat(result).isEqualTo("H::");


    }

    @Test
    public void should_get_1_coffee_with_2_sugars_and_a_stick() {

        //when
        String result = coffeeMachine.getDrinkMakerCommand(DrinkType.COFFEE, SugarQuantity.TWO);

        //then
        assertThat(result).isEqualTo("C:2:0");


    }

    @Test
    public void should_get_message_content_from_drink_maker() {

        //when
        String result = coffeeMachine.getMessageContent("M:message-content");

        //then
        assertThat(result).isEqualTo("message-content");


    }

}
