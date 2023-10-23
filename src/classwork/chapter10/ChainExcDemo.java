package classwork.chapter10;

public class ChainExcDemo {

    static void demoProc() {
        NullPointerException e = new NullPointerException("Upper level");
        e.initCause(new ArithmeticException("Reason"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Exception intercepted : " + e);
            System.out.println("Root cause :" + e.getCause());
        }
    }
}