package classwork.chapter13;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) {
            System.out.println("The number 2 is contained in the array nums.");
        }
        if (isIn(7, nums)) {
            System.out.println("The number 7 is missing from the nums array.");
        }
        System.out.println();


        String[] strs = {"one", "two", "three", "four", "five"};
        if (isIn("two", strs)) {
            System.out.println("The two is contained in the array strs.");
        }
        if (isIn("seven", strs)) {
            System.out.println("The seven is missing from the strs array.");
        }
        System.out.println();

//        Will not compile!  Types must be compatible
//        if (isIn("twu", nums)) {
//            System.out.println("The two is contained in the array strs.");
//        }
    }
}