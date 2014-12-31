package th.co.odde;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by roof on 12/30/14.
 */
public class CaptchaControllerTest {
    @Test
    public void testCaptcha() {
        //CaptchaService captchaService = mock(MyCaptchaService.class);
        //when(captchaService.getCaptcha()).thenReturn(new Captcha(1,1,1,1));

        Captcha captcha = new Captcha(1, 1, 1, 9);//captchaService.getCaptcha();
        System.out.print(captcha.getLeftOperand().toString()+" "+captcha.getOperator()+" "+captcha.getRightOperand());
        //assertEquals("1", captcha.getLeftOperand().toString());
        //assertEquals("One", captcha.getRightOperand().toString());
        //CaptchaController captchaController = new CaptchaController(captchaService);
        //assertEquals("1 + One", captchaController.captcha());
    }
}
