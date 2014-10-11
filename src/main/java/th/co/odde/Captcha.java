package th.co.odde;

public class Captcha {
    private final int INT_PATTERN = 1;
    private int pattern;
    private int leftOperand;
    public Captcha(int pattern, int leftOperand, int operator, int rightOperand){
        this.pattern = pattern;
        this.leftOperand = leftOperand;
    }

    public Operand getLeftOperand() {
        Operand operand;
        if (this.pattern == INT_PATTERN) {
            operand = new IntegerOperand(1);
        }else{
            operand = new StringOperand(this.leftOperand);
        }
        return operand;
    }
}
