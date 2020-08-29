package p213q.p217b.p301c.p302a.p311j0.p312a;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.c.a.j0.a.k0 */
public final class C3662k0 implements C3628h1 {

    /* renamed from: b */
    public static final C3699r0 f9096b = new C3663a();

    /* renamed from: a */
    public final C3699r0 f9097a;

    /* renamed from: q.b.c.a.j0.a.k0$a */
    public class C3663a implements C3699r0 {
        /* renamed from: a */
        public C3690q0 mo9788a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo9789b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: q.b.c.a.j0.a.k0$b */
    public static class C3664b implements C3699r0 {

        /* renamed from: a */
        public C3699r0[] f9098a;

        public C3664b(C3699r0... r0VarArr) {
            this.f9098a = r0VarArr;
        }

        /* renamed from: a */
        public C3690q0 mo9788a(Class<?> cls) {
            C3699r0[] r0VarArr;
            for (C3699r0 r0Var : this.f9098a) {
                if (r0Var.mo9789b(cls)) {
                    return r0Var.mo9788a(cls);
                }
            }
            StringBuilder a = C1965a.m4756a("No factory is available for message type: ");
            a.append(cls.getName());
            throw new UnsupportedOperationException(a.toString());
        }

        /* renamed from: b */
        public boolean mo9789b(Class<?> cls) {
            for (C3699r0 b : this.f9098a) {
                if (b.mo9789b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C3662k0() {
        C3699r0 r0Var;
        C3699r0[] r0VarArr = new C3699r0[2];
        r0VarArr[0] = C3729y.f9282a;
        try {
            r0Var = (C3699r0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            r0Var = f9096b;
        }
        r0VarArr[1] = r0Var;
        C3664b bVar = new C3664b(r0VarArr);
        C3594b0.m8166a(bVar, "messageInfoFactory");
        this.f9097a = bVar;
    }
}
