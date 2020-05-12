package calculator;

public class Multiplication implements Operation {
    @Override
    public double calculateResult(double firstVal, double secondVal) {
        return firstVal * secondVal;
    }
}