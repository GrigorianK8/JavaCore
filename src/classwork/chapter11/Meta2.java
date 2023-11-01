package classwork.chapter11;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@what(description = "test method annotation")
@MyAnno(str = "Testing", value = 100)
public class Meta2 {

    @what(description = "test method annotation")
    @MyAnno(str = "Testing", value = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("All annotations for class Meta2");
            for (Annotation a : annos) {
                System.out.println(a);
                System.out.println();
            }
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}