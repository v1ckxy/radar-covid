package p213q.p217b.p355e.p357v;

import java.lang.reflect.Method;

/* renamed from: q.b.e.v.v */
public final class C4386v extends C4389y {

    /* renamed from: a */
    public final /* synthetic */ Method f10439a;

    /* renamed from: b */
    public final /* synthetic */ int f10440b;

    public C4386v(Method method, int i) {
        this.f10439a = method;
        this.f10440b = i;
    }

    /* renamed from: a */
    public <T> T mo10624a(Class<T> cls) {
        C4389y.m9901b(cls);
        return this.f10439a.invoke(null, new Object[]{cls, Integer.valueOf(this.f10440b)});
    }
}
