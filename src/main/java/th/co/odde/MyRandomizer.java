package th.co.odde;

import java.util.Random;

/**
 * Created by roof on 12/29/14 AD.
 */
public class MyRandomizer implements Randomizer {
    Random randomGenerator = new Random();
    @Override
    public Integer getPatternValue() {
        return randomGenerator.nextInt(2);
    }
    @Override
    public Integer getOperandValue() {
        return randomGenerator.nextInt(9);
    }
    @Override
    public Integer getOperatorValue() {
        return randomGenerator.nextInt(3);
    }
}
