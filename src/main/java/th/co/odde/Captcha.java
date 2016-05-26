package th.co.odde;

public class Captcha {
    private int left;
    private int pattern;
    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.pattern = pattern;
    }

    public String getLeft() {
        String[] intToString = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        if (this.pattern == 2) {
            if (left == 2) {
                return "2";
            } else if(left == 9) {
                return "9";
            }
            return "1";
        }
        return intToString[this.left-1];
    }
}
