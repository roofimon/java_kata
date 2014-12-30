package th.co.odde;

/**
 * Created by roof on 12/30/14 AD.
 */
public interface CaptchaService {
    Captcha getCaptcha();
    void setRandomizer(Randomizer randomizer);
}
