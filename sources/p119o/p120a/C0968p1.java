package p119o.p120a;

/* renamed from: o.a.p1 */
public final class C0968p1 {

    /* renamed from: a */
    public static final ThreadLocal<C0955m0> f2583a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C0968p1 f2584b = null;

    /* renamed from: a */
    public static final C0955m0 m2253a() {
        C0955m0 m0Var = (C0955m0) f2583a.get();
        if (m0Var != null) {
            return m0Var;
        }
        C0936g gVar = new C0936g(Thread.currentThread());
        f2583a.set(gVar);
        return gVar;
    }
}
