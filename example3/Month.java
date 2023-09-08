package example3;

public enum Month {
    JAN, FEB, MAR, APR, MAY, JUN,JUL, AUG, SEP, OCT, NOV, DEC;

    Month(int number) {
        this.number = number;
    }

    private int number;
    Month() {
    }
}
