package th.co.odde;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerOperandTest {
    @Test
    public void itShouldReturn1WhenInputIs1() {
        IntegerOperand operand = new IntegerOperand(1);
        assertEquals("1", operand.toString());
    }
    @Test
    public void itShouldReturn2WhenInputIs2() {
        IntegerOperand operand = new IntegerOperand(2);
        assertEquals("2", operand.toString());
    }
}
