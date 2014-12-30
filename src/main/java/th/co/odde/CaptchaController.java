package th.co.odde;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by roof on 12/30/14.
 */
@RestController
public class CaptchaController {

    private CaptchaService captchaService;

    @Autowired
    public CaptchaController(CaptchaService captchaService) {
        this.captchaService = captchaService;
    }

    @RequestMapping("/captcha")
    public String captcha() {
        Captcha captcha = captchaService.getCaptcha();
        return captcha.getLeftOperand().toString()+" "+captcha.getOperator()+" "+captcha.getRightOperand();
    }
}
