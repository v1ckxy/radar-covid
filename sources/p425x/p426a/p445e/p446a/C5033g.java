package p425x.p426a.p445e.p446a;

import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.C4971o;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.C5003y0;

/* renamed from: x.a.e.a.g */
public class C5033g extends C4964m {

    /* renamed from: e */
    public C4958k f12012e;

    /* renamed from: f */
    public C4967n f12013f;

    /* renamed from: g */
    public C4958k f12014g;

    /* renamed from: h */
    public byte[][] f12015h;

    /* renamed from: i */
    public byte[][] f12016i;

    /* renamed from: j */
    public byte[] f12017j;

    public C5033g(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f12012e = new C4958k(0);
        this.f12014g = new C4958k((long) i);
        this.f12015h = C0967p0.m2222a(sArr);
        this.f12016i = C0967p0.m2222a(sArr2);
        this.f12017j = C0967p0.m2238b(sArr3);
    }

    public C5033g(C4986t tVar) {
        if (tVar.mo11628e(0) instanceof C4958k) {
            this.f12012e = C4958k.m11231a((Object) tVar.mo11628e(0));
        } else {
            this.f12013f = C4967n.m11262a((Object) tVar.mo11628e(0));
        }
        this.f12014g = C4958k.m11231a((Object) tVar.mo11628e(1));
        C4986t a = C4986t.m11342a((Object) tVar.mo11628e(2));
        this.f12015h = new byte[a.size()][];
        for (int i = 0; i < a.size(); i++) {
            this.f12015h[i] = C4971o.m11277a((Object) a.mo11628e(i)).f11858e;
        }
        C4986t tVar2 = (C4986t) tVar.mo11628e(3);
        this.f12016i = new byte[tVar2.size()][];
        for (int i2 = 0; i2 < tVar2.size(); i2++) {
            this.f12016i[i2] = C4971o.m11277a((Object) tVar2.mo11628e(i2)).f11858e;
        }
        this.f12017j = C4971o.m11277a((Object) ((C4986t) tVar.mo11628e(4)).mo11628e(0)).f11858e;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        C4929d dVar = this.f12012e;
        if (dVar == null) {
            dVar = this.f12013f;
        }
        eVar.mo11573a(dVar);
        eVar.mo11573a((C4929d) this.f12014g);
        C4933e eVar2 = new C4933e(10);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.f12015h;
            if (i2 >= bArr.length) {
                break;
            }
            eVar2.mo11573a((C4929d) new C5003y0(bArr[i2]));
            i2++;
        }
        eVar.mo11573a((C4929d) new C4927c1(eVar2));
        C4933e eVar3 = new C4933e(10);
        while (true) {
            byte[][] bArr2 = this.f12016i;
            if (i < bArr2.length) {
                eVar3.mo11573a((C4929d) new C5003y0(bArr2[i]));
                i++;
            } else {
                eVar.mo11573a((C4929d) new C4927c1(eVar3));
                C4933e eVar4 = new C4933e(10);
                eVar4.mo11573a((C4929d) new C5003y0(this.f12017j));
                eVar.mo11573a((C4929d) new C4927c1(eVar4));
                return new C4927c1(eVar);
            }
        }
    }
}
