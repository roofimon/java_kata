package th.co.odde;

public class Operand {
    private static final int INTEGER_STRING_PATTERN = 1;
    public static Operand createOperand(int pattern, int value) {
        Operand operand;
        if (pattern == INTEGER_STRING_PATTERN) {
            operand = new IntegerOperand(value);
        } else {
            operand = new StringOperand(value);
        }
        return operand;
    }
}
