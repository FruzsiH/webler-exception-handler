package hu.webler.service;

import hu.webler.exception.CustomException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticalOperationTest {
    @Test
    void testPerform() {
        ArithmeticalOperation operation = new ArithmeticalOperation();

        double numerator = 10;
        double denuminator = 2;
        double expectedResult = 5;
        try {
            double result = operation.perform(numerator, denuminator);
            assertEquals(expectedResult, result);
        } catch (CustomException e) {
            fail("CustomException should not have been thrown for a valid division operation.");
        }

        denuminator = 0;
        String expectedErrorMessage = "Encountered Arithmeticexception: Division by zero";
        try{
            double result = operation.perform(numerator, denuminator);
            fail("CustomException should have been thrown for division by zero");
        } catch(CustomException e) {
            assertEquals(expectedErrorMessage, e.getMessage());
        }

        double copyDenuminator = denuminator;
        CustomException customException = assertThrows(CustomException.class, () -> operation.perform(numerator, copyDenuminator));
    }
}