package mx.ucol;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int firstNumber = 20;
        int secondNumber = 30;

        System.out.println( "Hello World!" );
        System.out.format("The sum of %d and %d is %d\n",
            firstNumber, secondNumber,
            Operations.addition(firstNumber, secondNumber));

        System.out.format("The diferences of %d and %d is %d\n",
            firstNumber, secondNumber,
            Operations.substraction(firstNumber, secondNumber));

        System.out.format("The multiplication between %d and %d is %d\n",
            firstNumber, secondNumber,
            Operations.multiplication(firstNumber, secondNumber));
    }
}
