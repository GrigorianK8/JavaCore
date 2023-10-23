package classwork.chapter10;

public class FinallyDemo {

    static void procA() {
        try {
            System.out.println("In body of the procA() method.");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("Finally statement block in procA() method.");
        }
    }

    static void procB() {
        try {
            System.out.println("In body of the procB() method.");
            return;
        } finally {
            System.out.println("Finally statement block in the procB() method.");
        }
    }

    static void procC() {
        try {
            System.out.println("In body of the procC() method.");
        } finally {
            System.out.println("Finally statement block in the procA() method.");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception intercepted: ");
        }
        procB();
        procC();
    }
}