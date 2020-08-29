package p425x.p426a.p427a;

import java.io.IOException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.z */
public abstract class C5005z extends C4983s implements C4918a0 {

    /* renamed from: e */
    public final int f11893e;

    /* renamed from: f */
    public final boolean f11894f;

    /* renamed from: g */
    public final C4929d f11895g;

    public C5005z(boolean z, int i, C4929d dVar) {
        if (dVar != null) {
            this.f11893e = i;
            this.f11894f = z;
            this.f11895g = dVar;
            return;
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    /* renamed from: a */
    public static C5005z m11401a(Object obj) {
        if (obj == null || (obj instanceof C5005z)) {
            return (C5005z) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m11401a((Object) C4983s.m11325a((byte[]) obj));
            } catch (IOException e) {
                StringBuilder a = C1965a.m4756a("failed to construct tagged object from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            StringBuilder a2 = C1965a.m4756a("unknown object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        boolean z = false;
        if (!(sVar instanceof C5005z)) {
            return false;
        }
        C5005z zVar = (C5005z) sVar;
        if (this.f11893e == zVar.f11893e && this.f11894f == zVar.f11894f) {
            C4983s f = this.f11895g.mo11569f();
            C4983s f2 = zVar.f11895g.mo11569f();
            if (f == f2 || f.mo11549a(f2)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: g */
    public C4983s mo11570g() {
        return this;
    }

    public int hashCode() {
        return (this.f11893e ^ (this.f11894f ? 15 : 240)) ^ this.f11895g.mo11569f().hashCode();
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return new C4940f1(this.f11894f, this.f11893e, this.f11895g);
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return new C4989t1(this.f11894f, this.f11893e, this.f11895g);
    }

    /* renamed from: m */
    public C4983s mo11656m() {
        return this.f11895g.mo11569f();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("[");
        a.append(this.f11893e);
        a.append("]");
        a.append(this.f11895g);
        return a.toString();
    }
}
