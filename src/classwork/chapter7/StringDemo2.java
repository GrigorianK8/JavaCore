package classwork.chapter7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strob1 = "first line";
        String strob2 = "second line";
        String strob3 = strob1;

        System.out.println("String length strob1: " +
                strob1.length());
        System.out.println("ymbol by index 3 " +
                "in string strob1: " + strob1.charAt(3));

        if (strob1.equals(strob2))
            System.out.println("strob1 == strob2");
        else
            System.out.println("strob1 != strob2");

        if (strob1.equals(strob3))
            System.out.println("strob1 == strob3");
        else
            System.out.println("strob1 != strob3");
    }
}