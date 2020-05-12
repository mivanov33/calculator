package calculator;

public class Subtraction implements Operation {
    @Override
    public double calculateResult(double firstVal, double secondVal) {
        return firstVal - secondVal;
    }
}