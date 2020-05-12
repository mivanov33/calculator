package calculator;

public class Addition implements Operation {
	@Override
    public double calculateResult(double firstVal, double secondVal) {
        return firstVal + secondVal;
    }
}