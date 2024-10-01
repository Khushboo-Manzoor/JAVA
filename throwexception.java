class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result of division: " + result);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
    
    public static int divideNumbers(int dividend, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
