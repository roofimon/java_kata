package th.co.odde;

import java.util.Random;

/**
 * Created by roof on 12/29/14 AD.
 */
public class MyRandomizer implements Randomizer {
    Random randomGenerator = new Random();
    @Override
    public Integer getPatternValue() {
        return randomGenerator.nextInt(1)+1;
    }
    @Override
    public Integer getOperandValue() {
        return randomGenerator.nextInt(8)+1;
    }
    @Override
    public Integer getOperatorValue() {
        return randomGenerator.nextInt(2)+1;
    }
}
