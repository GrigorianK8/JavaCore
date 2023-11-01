package classwork.chapter11;


import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Example of an annotation", value = 100)
    public static void meth() {
        Meta ob = new Meta();

        try {
            Class <?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.value());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found!");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}