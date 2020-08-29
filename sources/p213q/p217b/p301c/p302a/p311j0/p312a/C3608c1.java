package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: q.b.c.a.j0.a.c1 */
public final class C3608c1 {

    /* renamed from: c */
    public static final C3608c1 f8978c = new C3608c1();

    /* renamed from: a */
    public final C3628h1 f8979a = new C3662k0();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C3625g1<?>> f8980b = new ConcurrentHashMap();

    /* renamed from: a */
    public <T> C3625g1<T> mo9537a(Class<T> cls) {
        C3625g1<T> g1Var;
        C3679n0 n0Var;
        C3705s sVar;
        C3677m1 m1Var;
        C3630i0 i0Var;
        C3726w0 w0Var;
        C3630i0 i0Var2;
        C3726w0 w0Var2;
        C3705s sVar2;
        C3677m1 m1Var2;
        C3625g1<T> v0Var;
        String str = "messageType";
        C3594b0.m8166a(cls, str);
        C3625g1<T> g1Var2 = (C3625g1) this.f8980b.get(cls);
        if (g1Var2 != null) {
            return g1Var2;
        }
        C3662k0 k0Var = (C3662k0) this.f8979a;
        if (k0Var != null) {
            Class<C3731z> cls2 = C3731z.class;
            C3634i1.m8347a(cls);
            C3690q0 a = k0Var.f9097a.mo9788a(cls);
            String str2 = "Protobuf runtime is not correctly loaded.";
            if (a.mo9556a()) {
                if (cls2.isAssignableFrom(cls)) {
                    v0Var = new C3721v0<>(C3634i1.f9033d, C3716u.f9175a, a.mo9558c());
                } else {
                    C3677m1<?, ?> m1Var3 = C3634i1.f9031b;
                    C3705s<?> sVar3 = C3716u.f9176b;
                    if (sVar3 != null) {
                        v0Var = new C3721v0<>(m1Var3, sVar3, a.mo9558c());
                    } else {
                        throw new IllegalStateException(str2);
                    }
                }
                g1Var = v0Var;
            } else {
                boolean isAssignableFrom = cls2.isAssignableFrom(cls);
                boolean z = true;
                if (isAssignableFrom) {
                    if (a.mo9557b() != C3604b1.PROTO2) {
                        z = false;
                    }
                    if (z) {
                        w0Var2 = C3730y0.f9284b;
                        i0Var2 = C3630i0.f9028b;
                        m1Var2 = C3634i1.f9033d;
                        sVar2 = C3716u.f9175a;
                    } else {
                        w0Var2 = C3730y0.f9284b;
                        C3630i0 i0Var3 = C3630i0.f9028b;
                        sVar2 = null;
                        i0Var2 = i0Var3;
                        m1Var2 = C3634i1.f9033d;
                    }
                    m1Var = m1Var2;
                    sVar = sVar2;
                    n0Var = C3685p0.f9127b;
                } else {
                    if (a.mo9557b() != C3604b1.PROTO2) {
                        z = false;
                    }
                    if (z) {
                        w0Var2 = C3730y0.f9283a;
                        i0Var2 = C3630i0.f9027a;
                        C3677m1<?, ?> m1Var4 = C3634i1.f9031b;
                        C3705s<?> sVar4 = C3716u.f9176b;
                        if (sVar4 != null) {
                            m1Var = m1Var4;
                            n0Var = C3685p0.f9126a;
                            sVar = sVar4;
                        } else {
                            throw new IllegalStateException(str2);
                        }
                    } else {
                        C3726w0 w0Var3 = C3730y0.f9283a;
                        C3630i0 i0Var4 = C3630i0.f9027a;
                        sVar = null;
                        m1Var = C3634i1.f9032c;
                        n0Var = C3685p0.f9126a;
                        w0Var = w0Var3;
                        i0Var = i0Var4;
                        g1Var = C3717u0.m8916a(a, w0Var, i0Var, m1Var, sVar, n0Var);
                    }
                }
                w0Var = w0Var2;
                i0Var = i0Var2;
                g1Var = C3717u0.m8916a(a, w0Var, i0Var, m1Var, sVar, n0Var);
            }
            C3594b0.m8166a(cls, str);
            C3594b0.m8166a(g1Var, "schema");
            C3625g1 g1Var3 = (C3625g1) this.f8980b.putIfAbsent(cls, g1Var);
            if (g1Var3 != null) {
                return g1Var3;
            }
            return g1Var;
        }
        throw null;
    }

    /* renamed from: a */
    public <T> C3625g1<T> mo9538a(T t) {
        return mo9537a(t.getClass());
    }
}
