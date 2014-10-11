package th.co.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by roof on 10/11/14 AD.
 */
public class StringOperandTest {
    @Test
    public void itShouldReturnOneWhenInputIs1() {
        StringOperand stringOperand = new StringOperand(1);
        assertEquals("One", stringOperand.toString());
    }
    @Test
    public void itShouldReturnTwoWhenInputIs2() {
        StringOperand stringOperand = new StringOperand(2);
        assertEquals("Two", stringOperand.toString());
    }
}
