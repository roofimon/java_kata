package th.co.odde;

public class Operand {
    public static Operand createOperand(int pattern, int value) {
        Operand operand;
        if (pattern == 1) {
            operand = new IntegerOperand(value);
        } else {
            operand = new StringOperand(value);
        }
        return operand;
    }
}
