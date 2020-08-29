package p213q.p217b.p355e.p357v;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.e.v.h */
public class C4365h implements C4383s<T> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f10409a;

    public C4365h(C4362g gVar, Constructor constructor) {
        this.f10409a = constructor;
    }

    /* renamed from: a */
    public T mo10576a() {
        String str = " with no args";
        String str2 = "Failed to invoke ";
        try {
            return this.f10409a.newInstance(null);
        } catch (InstantiationException e) {
            StringBuilder a = C1965a.m4756a(str2);
            a.append(this.f10409a);
            a.append(str);
            throw new RuntimeException(a.toString(), e);
        } catch (InvocationTargetException e2) {
            StringBuilder a2 = C1965a.m4756a(str2);
            a2.append(this.f10409a);
            a2.append(str);
            throw new RuntimeException(a2.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
