package th.co.odde;

public class Captcha {
    private Operand left;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.left = Operand.createOperand(pattern, leftOperand);
    }

    public Operand getLeftOperand() {
        return left;
    }
}
