package p425x.p426a.p445e.p446a;

import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4971o;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.C5003y0;
import p425x.p426a.p445e.p467d.p468a.C5155a;

/* renamed from: x.a.e.a.d */
public class C5030d extends C4964m {

    /* renamed from: e */
    public final int f11983e;

    /* renamed from: f */
    public final int f11984f;

    /* renamed from: g */
    public final C5155a f11985g;

    public C5030d(int i, int i2, C5155a aVar) {
        this.f11983e = i;
        this.f11984f = i2;
        this.f11985g = new C5155a(aVar);
    }

    public C5030d(C4986t tVar) {
        this.f11983e = ((C4958k) tVar.mo11628e(0)).mo11593m();
        this.f11984f = ((C4958k) tVar.mo11628e(1)).mo11593m();
        this.f11985g = new C5155a(((C4971o) tVar.mo11628e(2)).f11858e);
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) new C4958k((long) this.f11983e));
        eVar.mo11573a((C4929d) new C4958k((long) this.f11984f));
        eVar.mo11573a((C4929d) new C5003y0(this.f11985g.mo11898a()));
        return new C4927c1(eVar);
    }
}
