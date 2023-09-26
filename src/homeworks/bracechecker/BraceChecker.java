package homeworks.bracechecker;

import java.util.Stack;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public boolean check() {
        Stack stack = new Stack<Character>();
        int tos = -1;
        if (tos == stack.size()) {
            extend();
        }

        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if (s == '(' || s == '[' || s == '{') {
                System.out.println("Balanced ");
                stack.push(s);
                continue;
            }
            char check;
            switch (s) {

                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[')
                        System.out.println("Error: opened " + check + " but closed " +
                                text.charAt(i) + " " + " " + text.indexOf(check));
                    break;

                case '}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[')
                        System.out.println("Error: opened " + check + " but closed " +
                                text.charAt(i) + " " + text.indexOf(check));
                    break;

                case ']':
                    check = (char) stack.pop();
                    if (check == '(' || check == '{') ;
                    System.out.println("Error: opened " + check + " but closed " +
                            text.charAt(i) + " " + text.indexOf(check));
            }
        }
        return (stack.isEmpty());
    }

    public void extend() {
    }
}