package p484y.p488j0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: y.j0.n */
public @interface C5318n {
    String encoding() default "binary";

    String value() default "";
}
