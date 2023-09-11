package homeworks.figurepainter;

public class FigurePainter {

    void figureOne(int n, char c) {
        if (n < 1) {
            System.out.println("Incorrect value");
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureTwo(int n, char c) {
        if (n < 1) {
            System.out.println("Incorrect value");
            return;
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureThree(int n, char c) {
        if (n < 1) {
            System.out.println("Incorrect value");
            return;
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureFour(int n, char c) {
        if (n < 1) {
            System.out.println("Incorrect value");
            return;
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureFive(int n, char c) {
        if (n < 1) {
            System.out.println("Incorrect value");
            return;
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}