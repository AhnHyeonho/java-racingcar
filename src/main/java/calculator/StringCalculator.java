package calculator;

import calculator.enums.Operator;
import calculator.utils.Validator;

public class StringCalculator {

    public int calculate(String[] expression) {
        Validator.validateNull(expression);
        Validator.validateEmpty(expression);
        Validator.validateLength(expression);
        int sum = Integer.parseInt(expression[0]);

        for (int i = 1; i < expression.length; i += 2) {
            Operator operator = Operator.findBySymbol(expression[i]);
            int number1 = sum;
            int number2 = Integer.parseInt(expression[i + 1]);
            sum = operator.calculate(number1, number2);
        }

        return sum;
    }
}
