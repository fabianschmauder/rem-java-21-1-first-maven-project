import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckStringLengthTest {

    @Test
    public void greaterThan20ReturnsTrueWhenTextIsGreaterThan20(){
        //GIVEN
        String text = "123456789010345678842114";

        //WHEN
        boolean result = CheckStringLengthApp.greaterThan20(text);

        //THEN
        assertEquals(true, result);
    }

    @Test
    public void greaterThan20ReturnsFalseWhenTextIsGreaterSmallerThan20(){
        //GIVEN
        String text = "1234562114";

        //WHEN
        boolean result = CheckStringLengthApp.greaterThan20(text);

        //THEN
        assertEquals(false, result);
    }

}
