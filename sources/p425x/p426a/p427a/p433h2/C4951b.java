package p425x.p426a.p427a.p433h2;

import java.util.Enumeration;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4975p0;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;

/* renamed from: x.a.a.h2.b */
public class C4951b extends C4964m {

    /* renamed from: e */
    public C4950a f11833e;

    /* renamed from: f */
    public C4975p0 f11834f;

    public C4951b(C4950a aVar, C4929d dVar) {
        this.f11834f = new C4975p0(dVar);
        this.f11833e = aVar;
    }

    public C4951b(C4950a aVar, byte[] bArr) {
        this.f11834f = new C4975p0(bArr);
        this.f11833e = aVar;
    }

    public C4951b(C4986t tVar) {
        if (tVar.size() == 2) {
            Enumeration m = tVar.mo11630m();
            this.f11833e = C4950a.m11200a(m.nextElement());
            this.f11834f = C4975p0.m11291a(m.nextElement());
            return;
        }
        StringBuilder a = C1965a.m4756a("Bad sequence size: ");
        a.append(tVar.size());
        throw new IllegalArgumentException(a.toString());
    }

    /* renamed from: a */
    public static C4951b m11202a(Object obj) {
        if (obj instanceof C4951b) {
            return (C4951b) obj;
        }
        if (obj != null) {
            return new C4951b(C4986t.m11342a(obj));
        }
        return null;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(2);
        eVar.mo11573a((C4929d) this.f11833e);
        eVar.mo11573a((C4929d) this.f11834f);
        return new C4927c1(eVar);
    }

    /* renamed from: h */
    public C4983s mo11586h() {
        return C4983s.m11325a(this.f11834f.mo11561o());
    }
}
