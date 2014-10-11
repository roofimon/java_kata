package th.co.odde;

public class IntegerOperand extends Operand{
    private int input;
    public IntegerOperand(int input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return String.valueOf(input);
    }
}
