package calculator;

import java.util.InputMismatchException;

public class NoOperationFound implements Operation {
    private char operation;
    
    private char getOperation() {
    	return operation;
    }
    
    NoOperationFound(char operation){
        this.operation = operation;
	}

    @Override
    public double calculateResult(double left, double right) {
    	throw new InputMismatchException("Invalid operator sign: " + getOperation());
    }
}