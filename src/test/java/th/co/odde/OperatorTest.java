package th.co.odde;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class OperatorTest {
    @Test
    public void ItShouldReturnPlusWhenInputIs1(){
        Operator operator = new Operator(1);
        assertEquals("+", operator.toString());
    }
    @Test
    public void ItShouldReturnMinusWhenInputIs2(){
        Operator operator = new Operator(2);
        assertEquals("-", operator.toString());
    }
    @Test
    public void ItShouldReturnMultiplyWhenInputIs3(){
        Operator operator = new Operator(3);
        assertEquals("*", operator.toString());
    }
}
