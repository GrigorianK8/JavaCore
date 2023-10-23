//package classwork.chapter10;
//
//public class SuperSubCatch {
//
//    public static void main(String[] args) {
//        try {
//            int a = 0;
//            int b = 42 / a;
//        } catch (Exception e) {
//            System.out.println("Interception of exceptions of the general class Exception.");
//        }
//        /* This catch statement will not be reached at all,
//        because the ArithmeticException subclass is
//        derived from the Exception class. */
//        catch (ArithmeticException e) {
//            // Error, an unattainable code!
//            System.out.println("This code is not achievable at all.");
//        }
//    }
//}