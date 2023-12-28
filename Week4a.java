class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Week4a {
    static void performOperation(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        } else {
            System.out.println("Operation performed successfully!");
        }
    }
    public static void main(String[] args) {
        try {
            int Input = -5;
            performOperation(Input);
        } catch (CustomException e) {
            System.err.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
