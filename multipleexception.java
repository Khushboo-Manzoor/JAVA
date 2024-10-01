public class MultipleExceptionHandling {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Trying to access element at index 3: " + numbers[3]); 
            System.out.println("Length of the string: " + str.length()); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Trying to access length of null string.");
        } catch (Exception e) {
            System.out.println("Generic Exception caught.");
        } finally {
            System.out.println("Inside finally block.");
        }

        
        System.out.println("Program continues after try-catch-finally blocks.");
    }
}
