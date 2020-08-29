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
import p425x.p426a.p445e.p467d.p468a.C5156b;
import p425x.p426a.p445e.p467d.p468a.C5158d;
import p425x.p426a.p445e.p467d.p468a.C5159e;

/* renamed from: x.a.e.a.a */
public class C5027a extends C4964m {

    /* renamed from: e */
    public int f11966e;

    /* renamed from: f */
    public int f11967f;

    /* renamed from: g */
    public byte[] f11968g;

    /* renamed from: h */
    public byte[] f11969h;

    /* renamed from: i */
    public byte[] f11970i;

    /* renamed from: j */
    public C4950a f11971j;

    public C5027a(int i, int i2, C5156b bVar, C5159e eVar, C5158d dVar, C4950a aVar) {
        this.f11966e = i;
        this.f11967f = i2;
        this.f11968g = bVar.mo11904a();
        this.f11969h = eVar.mo11920c();
        this.f11970i = dVar.mo11909a();
        this.f11971j = aVar;
    }

    public C5027a(C4986t tVar) {
        this.f11966e = ((C4958k) tVar.mo11628e(0)).mo11593m();
        this.f11967f = ((C4958k) tVar.mo11628e(1)).mo11593m();
        this.f11968g = ((C4971o) tVar.mo11628e(2)).f11858e;
        this.f11969h = ((C4971o) tVar.mo11628e(3)).f11858e;
        this.f11970i = ((C4971o) tVar.mo11628e(4)).f11858e;
        this.f11971j = C4950a.m11200a(tVar.mo11628e(5));
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) new C4958k((long) this.f11966e));
        eVar.mo11573a((C4929d) new C4958k((long) this.f11967f));
        eVar.mo11573a((C4929d) new C5003y0(this.f11968g));
        eVar.mo11573a((C4929d) new C5003y0(this.f11969h));
        eVar.mo11573a((C4929d) new C5003y0(this.f11970i));
        eVar.mo11573a((C4929d) this.f11971j);
        return new C4927c1(eVar);
    }
}
