package p425x.p426a.p445e.p446a;

import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.p433h2.C4950a;

/* renamed from: x.a.e.a.j */
public class C5036j extends C4964m {

    /* renamed from: e */
    public final C4958k f12023e;

    /* renamed from: f */
    public final int f12024f;

    /* renamed from: g */
    public final int f12025g;

    /* renamed from: h */
    public final C4950a f12026h;

    public C5036j(int i, int i2, C4950a aVar) {
        this.f12023e = new C4958k(0);
        this.f12024f = i;
        this.f12025g = i2;
        this.f12026h = aVar;
    }

    public C5036j(C4986t tVar) {
        this.f12023e = C4958k.m11231a((Object) tVar.mo11628e(0));
        this.f12024f = C4958k.m11231a((Object) tVar.mo11628e(1)).mo11593m();
        this.f12025g = C4958k.m11231a((Object) tVar.mo11628e(2)).mo11593m();
        this.f12026h = C4950a.m11200a(tVar.mo11628e(3));
    }

    /* renamed from: a */
    public static C5036j m11493a(Object obj) {
        if (obj instanceof C5036j) {
            return (C5036j) obj;
        }
        if (obj != null) {
            return new C5036j(C4986t.m11342a(obj));
        }
        return null;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) this.f12023e);
        eVar.mo11573a((C4929d) new C4958k((long) this.f12024f));
        eVar.mo11573a((C4929d) new C4958k((long) this.f12025g));
        eVar.mo11573a((C4929d) this.f12026h);
        return new C4927c1(eVar);
    }
}
