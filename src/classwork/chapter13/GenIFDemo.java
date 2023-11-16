package classwork.chapter13;

public class GenIFDemo {

    public static void main(String[] args) {

        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("The maximum value in the inums array: " + iob.max());
        System.out.println("Minimum value in the inums array: " + iob.min());
        System.out.println("The maximum value in the chs array: " + cob.max());
        System.out.println("Minimum value in the chs array: " + cob.min());
    }
}