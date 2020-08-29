package p484y;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: y.l */
public final class C5329l {

    /* renamed from: a */
    public final Method f12613a;

    /* renamed from: b */
    public final List<?> f12614b;

    public C5329l(Method method, List<?> list) {
        this.f12613a = method;
        this.f12614b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f12613a.getDeclaringClass().getName(), this.f12613a.getName(), this.f12614b});
    }
}
