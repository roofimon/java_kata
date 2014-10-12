package th.co.odde;

public class StringOperand extends Operand {
    private String value;
    private String[] numberString = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    public StringOperand(int input) {
        this.value = numberString[input];
    }

    @Override
    public String toString() {
        return value;
    }
}
