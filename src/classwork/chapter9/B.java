package classwork.chapter9;

// Class B implements a nested interface
public class B implements A.nestedIF {

    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}