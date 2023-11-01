package classwork.chapter11;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Retention.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {

    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface what {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}