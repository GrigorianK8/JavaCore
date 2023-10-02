package homeworks.bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "Hell(o {{(from) {java})";
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}