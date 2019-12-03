package nofunny;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnn {
    String version();
    String author();
    String date() default "01.01.2019";
}

public class MyClass {
    private String version = "0.0.1";
    private String author = "Anton Alexeevich";
    private String date = "04.12.2019";
}
