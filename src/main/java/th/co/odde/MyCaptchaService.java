package th.co.odde;

/**
 * Created by roof on 12/30/14 AD.
 */
public class MyCaptchaService implements CaptchaService {
    public Randomizer randomizer;

    private Integer leftOperand;
    private Integer rightOperand;
    private Integer operator;
    private Integer pattern;

    public MyCaptchaService() {

    }

    @Override
    public Captcha getCaptcha() {
        pattern = this.randomizer.getPatternValue();
        leftOperand = this.randomizer.getOperandValue();
        rightOperand = this.randomizer.getOperandValue();
        operator = this.randomizer.getOperandValue();
        return new Captcha(pattern.intValue(), leftOperand.intValue(), operator.intValue(), rightOperand.intValue());
    }

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }
}
