package classwork.chapter10;

public class ThrowDemo {

    static void demoProc() {
        try {
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e) {
            System.out.println("Exception intercepted in the body " +
                    "method demoProc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Re-intercept: " + e);
        }
    }
}