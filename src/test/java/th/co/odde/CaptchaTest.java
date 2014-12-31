package th.co.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {
    @Test
    public void leftOperandShouldBe1WhenInPutIs1111(){
        Captcha captcha = new Captcha(1,9,1,1);
        assertEquals("9", captcha.getLeftOperand().toString());
    }

    @Test
    public void rightOperandShouldBeOneWhenInPutIs1111(){
        Captcha captcha = new Captcha(1,1,1,9);
        assertEquals("Nine", captcha.getRightOperand().toString());
    }

    @Test
    public void leftOperandShouldBeOneWhenInPutIs2111(){
        Captcha captcha = new Captcha(2,9,1,1);
        assertEquals("Nine", captcha.getLeftOperand().toString());
    }

    @Test
    public void leftOperandShouldBeTwoWhenInPutIs2211(){
        Captcha captcha = new Captcha(2,2,1,1);
        assertEquals("Two", captcha.getLeftOperand().toString());
    }

    @Test
    public void rightOperandShouldBeTwoWhenInPutIs2212(){
        Captcha captcha = new Captcha(2,2,1,2);
        assertEquals("2", captcha.getRightOperand().toString());
    }


    @Test
    public void rightOperandShouldBeEightWhenInPutIs2218(){
        Captcha captcha = new Captcha(2,2,1,8);
        assertEquals("8", captcha.getRightOperand().toString());
    }

    @Test
    public void operatorShouldBePlusWhenInPutIs2218(){
        Captcha captcha = new Captcha(2,2,1,8);
        assertEquals("+", captcha.getOperator().toString());
    }

    @Test
    public void operatorShouldBeMinusWhenInPutIs2218(){
        Captcha captcha = new Captcha(2,2,2,8);
        assertEquals("-", captcha.getOperator().toString());
    }

}
