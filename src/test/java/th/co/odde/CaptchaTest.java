package th.co.odde;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    public static final int DUMMY_OPERATOR = 1;
    public static final int DUMMY_RIGHT = 1;

    @Test
    public void leftOperandShouldBeONEWhenPatternIs1AndLeftIs1(){
        Captcha captcha = new Captcha(1, 1, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("ONE", captcha.getLeft());
    }
    @Test
    public void leftOperandShouldBeTWOWhenPatternIs1AndLeftIs6() {
        Captcha captcha = new Captcha(1, 6, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("SIX", captcha.getLeft());
    }
    @Test
    public void leftOperandShouldBeNINEWhenPatternIs1AndLeftIs9() {
        Captcha captcha = new Captcha(1, 9, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("NINE", captcha.getLeft());
    }

    @Test
    public void leftOperandShouldBe1WhenPatternIs2AndLeftIs1() {
        Captcha captcha = new Captcha(2, 1, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("1", captcha.getLeft());
    }

    @Test
    public void leftOperandShoudBe2WhenPatternIs2AndLeftIs2() {
        Captcha captcha = new Captcha(2, 2, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("2", captcha.getLeft());
    }

    @Test
    public void leftOperandShouldBe9WhenPatternIs2AndLeftIs() {
        Captcha captcha = new Captcha(2, 9, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("9", captcha.getLeft());
    }

    @Test
    public void operatorShouldBeAddWhenOperatorIs1() {
        Captcha captcha  = new Captcha(1, 1, 1, DUMMY_RIGHT);
        assertEquals("+", captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMinusWhenOperatorIs3() {
        Captcha captcha = new Captcha(1,1,3,DUMMY_RIGHT);
        assertEquals("-",captcha.getOperator());
    }

}
