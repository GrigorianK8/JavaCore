package classwork.chapter9;

public class DefaultMethodDemo {

    public static void main(String[] args) {
        MyIfImp obj = new MyIfImp();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        int defNum = MyIf.getDefaultNumber();
        System.out.println(defNum);
    }
}