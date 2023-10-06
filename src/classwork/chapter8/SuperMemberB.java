package classwork.chapter8;

public class SuperMemberB extends SuperMember {
    int i;

    SuperMemberB(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Member i in the superclass: " + super.i);
        System.out.println("Member i in the subclass: " + i);
    }
}