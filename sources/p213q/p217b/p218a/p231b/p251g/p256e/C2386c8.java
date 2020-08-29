package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: q.b.a.b.g.e.c8 */
public final class C2386c8 {

    /* renamed from: c */
    public static final C2386c8 f6416c = new C2386c8();

    /* renamed from: a */
    public final C2438f8 f6417a = new C2454g7();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C2455g8<?>> f6418b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C2455g8<T> mo7487a(Class<T> cls) {
        C2455g8<T> g8Var;
        C2564m7 m7Var;
        C2731w5 w5Var;
        C2702u8 u8Var;
        C2779z6 z6Var;
        C2717v7 v7Var;
        C2731w5 w5Var2;
        C2702u8<?, ?> u8Var2;
        C2779z6 z6Var2;
        C2717v7 v7Var2;
        C2731w5 w5Var3;
        C2702u8 u8Var3;
        C2779z6 z6Var3;
        C2455g8<T> u7Var;
        String str = "messageType";
        C2546l6.m6114a(cls, str);
        C2455g8<T> g8Var2 = (C2455g8) this.f6418b.get(cls);
        if (g8Var2 != null) {
            return g8Var2;
        }
        C2454g7 g7Var = (C2454g7) this.f6417a;
        if (g7Var != null) {
            Class<C2490i6> cls2 = C2490i6.class;
            C2498i8.m5985a(cls);
            C2582n7 b = g7Var.f6549a.mo7649b(cls);
            String str2 = "Protobuf runtime is not correctly loaded.";
            if (b.mo7624b()) {
                if (cls2.isAssignableFrom(cls)) {
                    u7Var = new C2701u7<>(C2498i8.f6625d, C2762y5.f6990a, b.mo7625c());
                } else {
                    C2702u8<?, ?> u8Var4 = C2498i8.f6623b;
                    C2731w5<?> w5Var4 = C2762y5.f6991b;
                    if (w5Var4 != null) {
                        u7Var = new C2701u7<>(u8Var4, w5Var4, b.mo7625c());
                    } else {
                        throw new IllegalStateException(str2);
                    }
                }
                g8Var = u7Var;
            } else {
                boolean isAssignableFrom = cls2.isAssignableFrom(cls);
                boolean z = false;
                if (isAssignableFrom) {
                    if (b.mo7623a() == 1) {
                        z = true;
                    }
                    if (z) {
                        v7Var = C2748x7.f6964b;
                        z6Var3 = C2779z6.f7010b;
                        u8Var3 = C2498i8.f6625d;
                        w5Var3 = C2762y5.f6990a;
                    } else {
                        v7Var = C2748x7.f6964b;
                        C2779z6 z6Var4 = C2779z6.f7010b;
                        w5Var3 = null;
                        z6Var3 = z6Var4;
                        u8Var3 = C2498i8.f6625d;
                    }
                    z6Var = z6Var3;
                    u8Var = u8Var3;
                    w5Var = w5Var3;
                    m7Var = C2599o7.f6763b;
                } else {
                    if (b.mo7623a() == 1) {
                        z = true;
                    }
                    if (z) {
                        v7Var2 = C2748x7.f6963a;
                        z6Var2 = C2779z6.f7009a;
                        u8Var2 = C2498i8.f6623b;
                        w5Var2 = C2762y5.f6991b;
                        if (w5Var2 == null) {
                            throw new IllegalStateException(str2);
                        }
                    } else {
                        v7Var2 = C2748x7.f6963a;
                        w5Var2 = null;
                        z6Var2 = C2779z6.f7009a;
                        u8Var2 = C2498i8.f6624c;
                    }
                    z6Var = z6Var2;
                    u8Var = u8Var2;
                    m7Var = C2599o7.f6762a;
                    w5Var = w5Var2;
                }
                g8Var = C2684t7.m6400a(cls, b, v7Var, z6Var, u8Var, w5Var, m7Var);
            }
            C2546l6.m6114a(cls, str);
            C2546l6.m6114a(g8Var, "schema");
            C2455g8 g8Var3 = (C2455g8) this.f6418b.putIfAbsent(cls, g8Var);
            if (g8Var3 != null) {
                return g8Var3;
            }
            return g8Var;
        }
        throw null;
    }

    /* renamed from: a */
    public final <T> C2455g8<T> mo7488a(T t) {
        return mo7487a(t.getClass());
    }
}
