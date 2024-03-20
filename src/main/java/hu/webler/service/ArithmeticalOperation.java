package hu.webler.service;

import hu.webler.exception.CustomException;

public class ArithmeticalOperation {

    public double perform(double numerator, double denominator) throws CustomException {
        double result;
        try {
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }
            result = numerator / denominator;
        } catch (ArithmeticException e) {
            throw new CustomException("Encountered Arithmeticexception: " + e.getMessage(), e);
        }
        return result;
    }
}
