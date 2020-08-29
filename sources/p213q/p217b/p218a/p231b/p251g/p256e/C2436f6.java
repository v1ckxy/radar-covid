package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.f6 */
public final class C2436f6 implements C2636q7 {

    /* renamed from: a */
    public static final C2436f6 f6528a = new C2436f6();

    /* renamed from: a */
    public final boolean mo7648a(Class<?> cls) {
        return C2490i6.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final C2582n7 mo7649b(Class<?> cls) {
        Class<C2490i6> cls2 = C2490i6.class;
        if (!cls2.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? str.concat(name) : new String(str));
        }
        try {
            return (C2582n7) C2490i6.m5944a(cls.asSubclass(cls2)).mo7350a(3, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? str2.concat(name2) : new String(str2), e);
        }
    }
}
