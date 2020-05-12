package calculator;

public class Division implements Operation {
    @Override
    public double calculateResult(double firstVal, double secondVal) {
        return firstVal / secondVal;
    }
}