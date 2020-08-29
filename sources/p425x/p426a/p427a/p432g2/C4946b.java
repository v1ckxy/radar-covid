package p425x.p426a.p427a.p432g2;

import java.util.Enumeration;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4921b;
import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4940f1;
import p425x.p426a.p427a.C4956j0;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4962l0;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4971o;
import p425x.p426a.p427a.C4975p0;
import p425x.p426a.p427a.C4982r1;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.C4996w;
import p425x.p426a.p427a.C5003y0;
import p425x.p426a.p427a.C5005z;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p469f.C5161b;

/* renamed from: x.a.a.g2.b */
public class C4946b extends C4964m {

    /* renamed from: e */
    public C4958k f11819e;

    /* renamed from: f */
    public C4950a f11820f;

    /* renamed from: g */
    public C4971o f11821g;

    /* renamed from: h */
    public C4996w f11822h;

    /* renamed from: i */
    public C4921b f11823i;

    public C4946b(C4950a aVar, C4929d dVar, C4996w wVar, byte[] bArr) {
        this.f11819e = new C4958k(bArr != null ? C5161b.f12351b : C5161b.f12350a);
        this.f11820f = aVar;
        this.f11821g = new C5003y0(dVar);
        this.f11822h = wVar;
        this.f11823i = bArr == null ? null : new C4975p0(bArr);
    }

    public C4946b(C4986t tVar) {
        C4996w wVar;
        C4975p0 p0Var;
        Enumeration m = tVar.mo11630m();
        C4958k a = C4958k.m11231a(m.nextElement());
        this.f11819e = a;
        int m2 = a.mo11593m();
        if (m2 < 0 || m2 > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        this.f11820f = C4950a.m11200a(m.nextElement());
        this.f11821g = C4971o.m11277a(m.nextElement());
        int i = -1;
        while (m.hasMoreElements()) {
            C5005z zVar = (C5005z) m.nextElement();
            int i2 = zVar.f11893e;
            if (i2 > i) {
                if (i2 == 0) {
                    C4983s m3 = zVar.mo11656m();
                    if (zVar.f11894f) {
                        wVar = zVar instanceof C4962l0 ? new C4956j0((C4929d) m3) : new C4982r1((C4929d) m3);
                    } else if (m3 instanceof C4996w) {
                        wVar = (C4996w) m3;
                        if (!(zVar instanceof C4962l0)) {
                            wVar = (C4996w) wVar.mo11559l();
                        }
                    } else if (m3 instanceof C4986t) {
                        C4929d[] o = ((C4986t) m3).mo11631o();
                        wVar = zVar instanceof C4962l0 ? new C4956j0(false, o) : new C4982r1(false, o);
                    } else {
                        StringBuilder a2 = C1965a.m4756a("unknown object in getInstance: ");
                        a2.append(zVar.getClass().getName());
                        throw new IllegalArgumentException(a2.toString());
                    }
                    this.f11822h = wVar;
                } else if (i2 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                } else if (m2 >= 1) {
                    C4983s m4 = zVar.mo11656m();
                    if (m4 instanceof C4975p0) {
                        p0Var = C4975p0.m11291a(m4);
                    } else {
                        byte[] bArr = C4971o.m11277a((Object) m4).f11858e;
                        if (bArr.length >= 1) {
                            byte b = bArr[0];
                            int length = bArr.length - 1;
                            byte[] bArr2 = new byte[length];
                            if (length != 0) {
                                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
                            }
                            p0Var = new C4975p0(bArr2, b);
                        } else {
                            throw new IllegalArgumentException("truncated BIT STRING detected");
                        }
                    }
                    this.f11823i = p0Var;
                } else {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                i = i2;
            } else {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
        }
    }

    /* renamed from: a */
    public static C4946b m11184a(Object obj) {
        if (obj instanceof C4946b) {
            return (C4946b) obj;
        }
        if (obj != null) {
            return new C4946b(C4986t.m11342a(obj));
        }
        return null;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(5);
        eVar.mo11573a((C4929d) this.f11819e);
        eVar.mo11573a((C4929d) this.f11820f);
        eVar.mo11573a((C4929d) this.f11821g);
        C4996w wVar = this.f11822h;
        if (wVar != null) {
            eVar.mo11573a((C4929d) new C4940f1(false, 0, wVar));
        }
        C4921b bVar = this.f11823i;
        if (bVar != null) {
            eVar.mo11573a((C4929d) new C4940f1(false, 1, bVar));
        }
        return new C4927c1(eVar);
    }

    /* renamed from: h */
    public C4929d mo11582h() {
        return C4983s.m11325a(this.f11821g.f11858e);
    }
}
