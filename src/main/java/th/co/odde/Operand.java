package th.co.odde;

public class Operand {
    private static final int INTEGER_STRING_PATTERN = 1;
    public static Operand createLeftOperand(int pattern, int value) {
        Operand operand;
        if (pattern == INTEGER_STRING_PATTERN) {
            operand = new IntegerOperand(value);
        } else {
            operand = new StringOperand(value);
        }
        return operand;
    }

    public static Operand createRightOperand(int pattern, int value) {
        Operand operand;
        if (pattern == INTEGER_STRING_PATTERN) {
            operand = new StringOperand(value);
        } else {
            operand = new IntegerOperand(value);
        }
        return operand;
    }
}
