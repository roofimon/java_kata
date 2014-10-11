package th.co.odde;

public class StringOperand extends Operand {
    private int input;
    private String[] numberString = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    public StringOperand(int input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return numberString[input];
    }
}
