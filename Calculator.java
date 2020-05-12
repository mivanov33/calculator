package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	private Map<Character, Operation> operations = new HashMap<>();
    
	Calculator() {
        operations.put('+', new Addition());
        operations.put('-', new Subtraction());
        operations.put('*', new Multiplication());
        operations.put('/', new Division());
    }

    double calculate(double firstVal, double secondVal, char operation) {
        Operation currentOperand = operations.getOrDefault(operation, new NoOperationFound(operation));
        return currentOperand.calculateResult(firstVal, secondVal);
    }
}