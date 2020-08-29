package p213q.p217b.p355e.p356u;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: q.b.e.u.a */
public @interface C4346a {
    boolean nullSafe() default true;

    Class<?> value();
}
