package th.co.odde;

public class Captcha {
    private final int INT_PATTERN = 1;
    private int pattern;
    private Operand left;
    public Captcha(int pattern, int leftOperand, int operator, int rightOperand){
        this.pattern = pattern;
        this.left = Operand.createOperand(pattern, leftOperand);
    }

    public Operand getLeftOperand() {
        return left;
    }
}
