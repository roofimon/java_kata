package th.co.odde;

public class Captcha {
    private Operand left;
    private Operand right;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.left = Operand.createOperand(pattern, leftOperand);
        this.right = Operand.createOperand(pattern, rightOperand);
    }

    public Operand getLeftOperand() {
        return left;
    }

    public Operand getRightOperand() {
        return right;
    }
}
