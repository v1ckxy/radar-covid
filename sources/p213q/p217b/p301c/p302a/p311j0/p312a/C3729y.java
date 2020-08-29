package p213q.p217b.p301c.p302a.p311j0.p312a;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.c.a.j0.a.y */
public class C3729y implements C3699r0 {

    /* renamed from: a */
    public static final C3729y f9282a = new C3729y();

    /* renamed from: a */
    public C3690q0 mo9788a(Class<?> cls) {
        Class<C3731z> cls2 = C3731z.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C3690q0) C3731z.getDefaultInstance(cls.asSubclass(cls2)).buildMessageInfo();
            } catch (Exception e) {
                StringBuilder a = C1965a.m4756a("Unable to get message info for ");
                a.append(cls.getName());
                throw new RuntimeException(a.toString(), e);
            }
        } else {
            StringBuilder a2 = C1965a.m4756a("Unsupported message type: ");
            a2.append(cls.getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: b */
    public boolean mo9789b(Class<?> cls) {
        return C3731z.class.isAssignableFrom(cls);
    }
}
