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

    @Test
    public void leftOperandShouldBeOneWhenInPutIs2111(){
        Captcha captcha = new Captcha(2,1,1,1);
        assertEquals("One", captcha.getLeftOperand().toString());
    }

    @Test
    public void leftOperandShouldBeTwoWhenInPutIs2211(){
        Captcha captcha = new Captcha(2,2,1,1);
        assertEquals("Two", captcha.getLeftOperand().toString());
    }

    @Test
    public void rightOperandShouldBeTwoWhenInPutIs2212(){
        Captcha captcha = new Captcha(2,2,1,2);
        assertEquals("Two", captcha.getRightOperand().toString());
    }

    @Test
    public void rightOperandShouldBeEightWhenInPutIs2218(){
        Captcha captcha = new Captcha(2,2,1,8);
        assertEquals("Eight", captcha.getRightOperand().toString());
    }
}
