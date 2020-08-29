package p213q.p217b.p301c.p302a.p311j0.p312a;

import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;

/* renamed from: q.b.c.a.j0.a.b */
public abstract class C3593b<MessageType extends C3706s0> implements C3739z0<MessageType> {
    static {
        C3697r.m8878a();
    }

    /* renamed from: a */
    public Object mo9529a(C3635j jVar, C3697r rVar) {
        try {
            C3656k f = jVar.mo9667f();
            C3706s0 s0Var = (C3706s0) mo10010a(f, rVar);
            f.mo9733a(0);
            if (s0Var == null || s0Var.isInitialized()) {
                return s0Var;
            }
            C3669l1 newUninitializedMessageException = s0Var instanceof C3588a ? ((C3588a) s0Var).newUninitializedMessageException() : new C3669l1();
            if (newUninitializedMessageException != null) {
                throw new C3606c0(newUninitializedMessageException.getMessage());
            }
            throw null;
        } catch (C3606c0 e) {
            throw e;
        } catch (C3606c0 e2) {
            throw e2;
        }
    }
}
