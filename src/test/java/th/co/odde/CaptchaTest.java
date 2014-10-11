package th.co.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by roof on 10/11/14 AD.
 */
public class CaptchaTest {
    @Test
    public void leftOperandShouldBe1WhenInPutIs1111(){
        Captcha captcha = new Captcha(1,1,1,1);
        assertEquals("1", captcha.getLeftOperand().toString());
    }
}
