package classwork.chapter9;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Object of type String by default";
    }

    static int getDefaultNumber() {
        return 0;
    }
}