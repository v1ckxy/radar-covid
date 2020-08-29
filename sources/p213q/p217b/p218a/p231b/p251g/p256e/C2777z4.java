package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.z4 */
public final class C2777z4 {

    /* renamed from: a */
    public static final Class<?> f7007a;

    /* renamed from: b */
    public static final boolean f7008b;

    static {
        Class<?> cls;
        Class cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f7007a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f7008b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m6583a() {
        return f7007a != null && !f7008b;
    }
}
