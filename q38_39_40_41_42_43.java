public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Null pointer exception
            String str = null;
            System.out.println(str.length());
            
            // Number format exception
            String numStr = "abc";
            int num = Integer.parseInt(numStr);

            // Arithmetic exception
            int result = 10 / 0;

            // Array index out of bounds exception
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("This block is always executed");
        }

        try {
            // Using throw keyword
            throw new Exception("This is an example of using throw keyword");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            // Using throws keyword
            methodWithException();
        } catch (Exception e) {
            System.out.println("Caught exception using throws keyword: " + e.getMessage());
        }
    }

    public static void methodWithException() throws Exception {
        throw new Exception("Exception thrown from methodWithException");
    }
}
