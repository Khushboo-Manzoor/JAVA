public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            
            int[] numbers = {1, 2, 3};
            System.out.println("Array element at index 3: " + numbers[3]); 
            try {
               
                String str = null;
                System.out.println("Length of the string: " + str.length()); 
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException inside nested try block: " + e.getMessage());
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException outside nested try block: " + e.getMessage());
        }
    }
}
