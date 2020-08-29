package p213q.p217b.p355e.p357v;

import java.lang.reflect.Modifier;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.e.v.y */
public abstract class C4389y {
    /* renamed from: b */
    public static void m9901b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder a = C1965a.m4756a("Interface can't be instantiated! Interface name: ");
            a.append(cls.getName());
            throw new UnsupportedOperationException(a.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder a2 = C1965a.m4756a("Abstract class can't be instantiated! Class name: ");
            a2.append(cls.getName());
            throw new UnsupportedOperationException(a2.toString());
        }
    }

    /* renamed from: a */
    public abstract <T> T mo10624a(Class<T> cls);
}
