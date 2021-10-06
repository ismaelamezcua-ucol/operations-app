package mx.ucol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperationsTest {

    /**
     * Should return the correct addition of two numbers
     */
    @Test
    public void shouldReturnAddition() {
        int firstNumber = 10;
        int secondNumber = 5;

        assertEquals(15, Operations.addition(firstNumber, secondNumber));
    }

    /**
     * Should return the correct substraction of two numbers
     */
    @Test
    public void shoudlReturnSubstraction() {
        int firstNumber = 10;
        int secondNumber = 5;

        assertEquals(5, Operations.substraction(firstNumber, secondNumber));
    }

    /**
     * Should return the correcto multiplication of two numbers
     */
    @Test
    public void shouldReturnMultiplication() {
        int firstNumber = 10;
        int secondNumber = 5;

        assertEquals(50, Operations.multiplication(firstNumber, secondNumber));
    }

}