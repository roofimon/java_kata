package th.co.odde;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
/**
 * Created by roof on 12/26/14 AD.
 */
public class RandomizerTest {
    Randomizer randomizer = new MyRandomizer();
    @Test
    public void testGetOperandNumber(){
        Integer operandValue;
        operandValue = randomizer.getOperandValue();
        assertThat(operandValue, allOf(greaterThan(1), lessThanOrEqualTo(9)));
    }

    @Test
    public void testGetOperatorNumber(){
        Integer operatorValue;
        operatorValue = randomizer.getOperatorValue();
        assertThat(operatorValue, allOf(greaterThanOrEqualTo(1), lessThanOrEqualTo(3)));
    }
}
