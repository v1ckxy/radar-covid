package p213q.p217b.p301c.p302a.p311j0.p312a;

/* renamed from: q.b.c.a.j0.a.d */
public final class C3609d {

    /* renamed from: a */
    public static final Class<?> f8981a;

    /* renamed from: b */
    public static final boolean f8982b;

    static {
        Class<?> cls;
        Class cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f8981a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f8982b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m8184a() {
        return f8981a != null && !f8982b;
    }
}
