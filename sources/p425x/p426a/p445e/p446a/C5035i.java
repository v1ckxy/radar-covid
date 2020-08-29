package p425x.p426a.p445e.p446a;

import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.p433h2.C4950a;

/* renamed from: x.a.e.a.i */
public class C5035i extends C4964m {

    /* renamed from: e */
    public final C4958k f12020e;

    /* renamed from: f */
    public final int f12021f;

    /* renamed from: g */
    public final C4950a f12022g;

    public C5035i(int i, C4950a aVar) {
        this.f12020e = new C4958k(0);
        this.f12021f = i;
        this.f12022g = aVar;
    }

    public C5035i(C4986t tVar) {
        this.f12020e = C4958k.m11231a((Object) tVar.mo11628e(0));
        this.f12021f = C4958k.m11231a((Object) tVar.mo11628e(1)).mo11593m();
        this.f12022g = C4950a.m11200a(tVar.mo11628e(2));
    }

    /* renamed from: a */
    public static C5035i m11491a(Object obj) {
        if (obj instanceof C5035i) {
            return (C5035i) obj;
        }
        if (obj != null) {
            return new C5035i(C4986t.m11342a(obj));
        }
        return null;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) this.f12020e);
        eVar.mo11573a((C4929d) new C4958k((long) this.f12021f));
        eVar.mo11573a((C4929d) this.f12022g);
        return new C4927c1(eVar);
    }
}
