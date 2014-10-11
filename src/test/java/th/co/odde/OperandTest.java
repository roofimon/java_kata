package th.co.odde;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperandTest {
    @Test
    public void itShouldReturn1WhenInputIs1() {
        Operand operand = new Operand(1);
        assertEquals("1", operand.toString());
    }
}
