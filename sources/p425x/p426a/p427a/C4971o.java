package p425x.p426a.p427a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p469f.C5167h;
import p425x.p426a.p469f.p470i.C5170b;

/* renamed from: x.a.a.o */
public abstract class C4971o extends C4983s implements C4974p {

    /* renamed from: e */
    public byte[] f11858e;

    public C4971o(byte[] bArr) {
        if (bArr != null) {
            this.f11858e = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    /* renamed from: a */
    public static C4971o m11277a(Object obj) {
        if (obj == null || (obj instanceof C4971o)) {
            return (C4971o) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m11277a((Object) C4983s.m11325a((byte[]) obj));
            } catch (IOException e) {
                StringBuilder a = C1965a.m4756a("failed to construct OCTET STRING from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            if (obj instanceof C4929d) {
                C4983s f = ((C4929d) obj).mo11569f();
                if (f instanceof C4971o) {
                    return (C4971o) f;
                }
            }
            StringBuilder a2 = C1965a.m4756a("illegal object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4971o)) {
            return false;
        }
        return Arrays.equals(this.f11858e, ((C4971o) sVar).f11858e);
    }

    /* renamed from: c */
    public InputStream mo11580c() {
        return new ByteArrayInputStream(this.f11858e);
    }

    /* renamed from: g */
    public C4983s mo11570g() {
        return this;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11858e);
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return new C5003y0(this.f11858e);
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return new C5003y0(this.f11858e);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("#");
        a.append(C5167h.m11600a(C5170b.m11604a(this.f11858e)));
        return a.toString();
    }

    /* renamed from: a */
    public static C4971o m11278a(C5005z zVar, boolean z) {
        if (!z) {
            C4983s m = zVar.mo11656m();
            if (zVar.f11894f) {
                C4971o a = m11277a((Object) m);
                if (zVar instanceof C4962l0) {
                    return new C4938f0(new C4971o[]{a});
                }
                return (C4971o) new C4938f0(new C4971o[]{a}).mo11559l();
            } else if (m instanceof C4971o) {
                C4971o oVar = (C4971o) m;
                return zVar instanceof C4962l0 ? oVar : (C4971o) oVar.mo11559l();
            } else if (m instanceof C4986t) {
                C4986t tVar = (C4986t) m;
                return zVar instanceof C4962l0 ? C4938f0.m11167a(tVar) : (C4971o) C4938f0.m11167a(tVar).mo11559l();
            } else {
                StringBuilder a2 = C1965a.m4756a("unknown object in getInstance: ");
                a2.append(zVar.getClass().getName());
                throw new IllegalArgumentException(a2.toString());
            }
        } else if (zVar.f11894f) {
            return m11277a((Object) zVar.mo11656m());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }
}
