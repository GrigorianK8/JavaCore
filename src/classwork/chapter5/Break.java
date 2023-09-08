package classwork.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println(
                            "Preceeds the break statement.");
                    if (t) break second;
                    System.out.println("This statement will not be executed.");
                }
                System.out.println("This statement will not be executed.");
            }
            System.out.println("This statement follows the secon block.");
        }
    }
}
