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
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p445e.p467d.p468a.C5155a;

/* renamed from: x.a.e.a.b */
public class C5028b extends C4964m {

    /* renamed from: e */
    public final int f11972e;

    /* renamed from: f */
    public final int f11973f;

    /* renamed from: g */
    public final C5155a f11974g;

    /* renamed from: h */
    public final C4950a f11975h;

    public C5028b(int i, int i2, C5155a aVar, C4950a aVar2) {
        this.f11972e = i;
        this.f11973f = i2;
        this.f11974g = new C5155a(aVar.mo11898a());
        this.f11975h = aVar2;
    }

    public C5028b(C4986t tVar) {
        this.f11972e = ((C4958k) tVar.mo11628e(0)).mo11593m();
        this.f11973f = ((C4958k) tVar.mo11628e(1)).mo11593m();
        this.f11974g = new C5155a(((C4971o) tVar.mo11628e(2)).f11858e);
        this.f11975h = C4950a.m11200a(tVar.mo11628e(3));
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) new C4958k((long) this.f11972e));
        eVar.mo11573a((C4929d) new C4958k((long) this.f11973f));
        eVar.mo11573a((C4929d) new C5003y0(this.f11974g.mo11898a()));
        eVar.mo11573a((C4929d) this.f11975h);
        return new C4927c1(eVar);
    }
}
