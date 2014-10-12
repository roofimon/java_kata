package th.co.odde;
import static org.junit.Assert.assertEquals;
public class OperatorTest {
    public void ItShouldReturnPlusWhenInputIs1(){
        Operator operator = new Operator(1);
        assertEquals("+", operator.toString());
    }
}
