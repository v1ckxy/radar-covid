package p425x.p426a.p427a.p433h2;

import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;

/* renamed from: x.a.a.h2.a */
public class C4950a extends C4964m {

    /* renamed from: e */
    public C4967n f11831e;

    /* renamed from: f */
    public C4929d f11832f;

    public C4950a(C4967n nVar) {
        this.f11831e = nVar;
    }

    public C4950a(C4967n nVar, C4929d dVar) {
        this.f11831e = nVar;
        this.f11832f = dVar;
    }

    public C4950a(C4986t tVar) {
        if (tVar.size() < 1 || tVar.size() > 2) {
            StringBuilder a = C1965a.m4756a("Bad sequence size: ");
            a.append(tVar.size());
            throw new IllegalArgumentException(a.toString());
        }
        this.f11831e = C4967n.m11262a((Object) tVar.mo11628e(0));
        this.f11832f = tVar.size() == 2 ? tVar.mo11628e(1) : null;
    }

    /* renamed from: a */
    public static C4950a m11200a(Object obj) {
        if (obj instanceof C4950a) {
            return (C4950a) obj;
        }
        if (obj != null) {
            return new C4950a(C4986t.m11342a(obj));
        }
        return null;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(2);
        eVar.mo11573a((C4929d) this.f11831e);
        C4929d dVar = this.f11832f;
        if (dVar != null) {
            eVar.mo11573a(dVar);
        }
        return new C4927c1(eVar);
    }
}
