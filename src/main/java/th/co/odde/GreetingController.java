package th.co.odde;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by roof on 12/30/14.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/captcha")
    public String captcha() {
        CaptchaService captchaService = new MyCaptchaService();
        captchaService.setRandomizer(new MyRandomizer());
        Captcha captcha = captchaService.getCaptcha();
        return captcha.getLeftOperand().toString()+" "+captcha.getOperator()+" "+captcha.getRightOperand();
    }
}
