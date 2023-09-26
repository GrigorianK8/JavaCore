package homeworks.bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "Hello (from) [java}";
        BraceChecker bc = new BraceChecker("Hello (from) [java}");
        bc.check();
    }
}