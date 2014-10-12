package th.co.odde;

public class Operator {
    private final int PLUS = 1;
    private final int MINUS = 2;
    private String operator;

    public Operator(int value) {
        switch(value) {
            case PLUS:  this.operator = "+";
                        break;
            case MINUS: this.operator = "-";
                        break;
            default:    this.operator = "*";
                        break;
        }
    }

    @Override
    public String toString() {
        return this.operator;
    }
}
