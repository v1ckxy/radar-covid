package p425x.p426a.p445e.p446a;

import java.math.BigInteger;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4971o;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.C5003y0;

/* renamed from: x.a.e.a.n */
public class C5040n extends C4964m {

    /* renamed from: e */
    public final byte[] f12045e;

    /* renamed from: f */
    public final byte[] f12046f;

    public C5040n(C4986t tVar) {
        if (C4958k.m11231a((Object) tVar.mo11628e(0)).mo11592a(BigInteger.valueOf(0))) {
            this.f12045e = C0967p0.m2217a(C4971o.m11277a((Object) tVar.mo11628e(1)).f11858e);
            this.f12046f = C0967p0.m2217a(C4971o.m11277a((Object) tVar.mo11628e(2)).f11858e);
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public C5040n(byte[] bArr, byte[] bArr2) {
        this.f12045e = C0967p0.m2217a(bArr);
        this.f12046f = C0967p0.m2217a(bArr2);
    }

    /* renamed from: a */
    public static C5040n m11498a(Object obj) {
        if (obj instanceof C5040n) {
            return (C5040n) obj;
        }
        if (obj != null) {
            return new C5040n(C4986t.m11342a(obj));
        }
        return null;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) new C4958k(0));
        eVar.mo11573a((C4929d) new C5003y0(this.f12045e));
        eVar.mo11573a((C4929d) new C5003y0(this.f12046f));
        return new C4927c1(eVar);
    }
}
