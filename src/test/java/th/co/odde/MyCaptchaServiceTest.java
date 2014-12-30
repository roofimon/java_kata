package th.co.odde;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by roof on 12/30/14 AD.
 */
public class MyCaptchaServiceTest {
    @Test
    public void testLeftOperandShouldBe1() {
        //Arrange
        Randomizer randomizer = getRandomizer();
        CaptchaService captchaService = new MyCaptchaService();
        captchaService.setRandomizer(randomizer);
        //Act
        Captcha captcha = captchaService.getCaptcha();
        //Assert
        assertEquals("1", captcha.getLeftOperand().toString());
    }

    @Test
    public void testLeftOperandShouldBeOne() {
        //Arrange
        Randomizer randomizer = getRandomizerForSecondPattern();
        CaptchaService captchaService = new MyCaptchaService();
        captchaService.setRandomizer(randomizer);
        //Act
        Captcha captcha = captchaService.getCaptcha();
        //Assert
        assertEquals("One", captcha.getLeftOperand().toString());
    }

    private Randomizer getRandomizerForSecondPattern() {
        Randomizer randomizer = mock(MyRandomizer.class);
        when(randomizer.getOperandValue()).thenReturn(1);
        when(randomizer.getPatternValue()).thenReturn(2);
        when(randomizer.getOperatorValue()).thenReturn(1);
        return randomizer;
    }

    private Randomizer getRandomizer() {
        Randomizer randomizer = mock(MyRandomizer.class);
        when(randomizer.getOperandValue()).thenReturn(1);
        when(randomizer.getPatternValue()).thenReturn(1);
        when(randomizer.getOperatorValue()).thenReturn(1);
        return randomizer;
    }
}
