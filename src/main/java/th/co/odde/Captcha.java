package th.co.odde;

public class Captcha {
    private Operand left;
    private Operand right;
    private Operator operator;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.left = Operand.createLeftOperand(pattern, leftOperand);
        this.right = Operand.createRightOperand(pattern, rightOperand);
        this.operator = new Operator(operator);
    }

    public Operand getLeftOperand() {
        return left;
    }

    public Operand getRightOperand() {
        return right;
    }

    public Operator getOperator() {
        return this.operator;
    }
}
