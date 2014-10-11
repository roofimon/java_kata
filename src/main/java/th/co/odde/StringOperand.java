package th.co.odde;

public class StringOperand extends Operand {
    private int input;

    public StringOperand(int input) {
        this.input = input;
    }

    @Override
    public String toString() {
        if (input == 1) {
            return "One";
        } else {
            return "Two";
        }
    }
}
