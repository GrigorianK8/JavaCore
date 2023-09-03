package classwork.chapter5;

public class ClassNobody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) ;
        System.out.println("Mean value is " + i);
    }
}
