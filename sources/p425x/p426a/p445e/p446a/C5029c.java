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
import p425x.p426a.p445e.p467d.p468a.C5156b;
import p425x.p426a.p445e.p467d.p468a.C5158d;
import p425x.p426a.p445e.p467d.p468a.C5159e;

/* renamed from: x.a.e.a.c */
public class C5029c extends C4964m {

    /* renamed from: e */
    public int f11976e;

    /* renamed from: f */
    public int f11977f;

    /* renamed from: g */
    public byte[] f11978g;

    /* renamed from: h */
    public byte[] f11979h;

    /* renamed from: i */
    public byte[] f11980i;

    /* renamed from: j */
    public byte[] f11981j;

    /* renamed from: k */
    public byte[] f11982k;

    public C5029c(int i, int i2, C5156b bVar, C5159e eVar, C5158d dVar, C5158d dVar2, C5155a aVar) {
        this.f11976e = i;
        this.f11977f = i2;
        this.f11978g = bVar.mo11904a();
        this.f11979h = eVar.mo11920c();
        this.f11980i = aVar.mo11898a();
        this.f11981j = dVar.mo11909a();
        this.f11982k = dVar2.mo11909a();
    }

    public C5029c(C4986t tVar) {
        this.f11976e = ((C4958k) tVar.mo11628e(0)).mo11593m();
        this.f11977f = ((C4958k) tVar.mo11628e(1)).mo11593m();
        this.f11978g = ((C4971o) tVar.mo11628e(2)).f11858e;
        this.f11979h = ((C4971o) tVar.mo11628e(3)).f11858e;
        this.f11981j = ((C4971o) tVar.mo11628e(4)).f11858e;
        this.f11982k = ((C4971o) tVar.mo11628e(5)).f11858e;
        this.f11980i = ((C4971o) tVar.mo11628e(6)).f11858e;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) new C4958k((long) this.f11976e));
        eVar.mo11573a((C4929d) new C4958k((long) this.f11977f));
        eVar.mo11573a((C4929d) new C5003y0(this.f11978g));
        eVar.mo11573a((C4929d) new C5003y0(this.f11979h));
        eVar.mo11573a((C4929d) new C5003y0(this.f11981j));
        eVar.mo11573a((C4929d) new C5003y0(this.f11982k));
        eVar.mo11573a((C4929d) new C5003y0(this.f11980i));
        return new C4927c1(eVar);
    }
}
