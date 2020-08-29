package p425x.p426a.p445e.p446a;

import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4940f1;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4971o;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.C5003y0;
import p425x.p426a.p427a.C5005z;
import p425x.p426a.p469f.C5161b;

/* renamed from: x.a.e.a.m */
public class C5039m extends C4964m {

    /* renamed from: e */
    public final int f12037e;

    /* renamed from: f */
    public final int f12038f;

    /* renamed from: g */
    public final byte[] f12039g;

    /* renamed from: h */
    public final byte[] f12040h;

    /* renamed from: i */
    public final byte[] f12041i;

    /* renamed from: j */
    public final byte[] f12042j;

    /* renamed from: k */
    public final int f12043k;

    /* renamed from: l */
    public final byte[] f12044l;

    public C5039m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f12037e = 0;
        this.f12038f = i;
        this.f12039g = C0967p0.m2217a(bArr);
        this.f12040h = C0967p0.m2217a(bArr2);
        this.f12041i = C0967p0.m2217a(bArr3);
        this.f12042j = C0967p0.m2217a(bArr4);
        this.f12044l = C0967p0.m2217a(bArr5);
        this.f12043k = -1;
    }

    public C5039m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.f12037e = 1;
        this.f12038f = i;
        this.f12039g = C0967p0.m2217a(bArr);
        this.f12040h = C0967p0.m2217a(bArr2);
        this.f12041i = C0967p0.m2217a(bArr3);
        this.f12042j = C0967p0.m2217a(bArr4);
        this.f12044l = C0967p0.m2217a(bArr5);
        this.f12043k = i2;
    }

    public C5039m(C4986t tVar) {
        int i;
        C4958k a = C4958k.m11231a((Object) tVar.mo11628e(0));
        if (a.mo11592a(C5161b.f12350a) || a.mo11592a(C5161b.f12351b)) {
            this.f12037e = a.mo11593m();
            if (tVar.size() == 2 || tVar.size() == 3) {
                C4986t a2 = C4986t.m11342a((Object) tVar.mo11628e(1));
                this.f12038f = C4958k.m11231a((Object) a2.mo11628e(0)).mo11593m();
                this.f12039g = C0967p0.m2217a(C4971o.m11277a((Object) a2.mo11628e(1)).f11858e);
                this.f12040h = C0967p0.m2217a(C4971o.m11277a((Object) a2.mo11628e(2)).f11858e);
                this.f12041i = C0967p0.m2217a(C4971o.m11277a((Object) a2.mo11628e(3)).f11858e);
                this.f12042j = C0967p0.m2217a(C4971o.m11277a((Object) a2.mo11628e(4)).f11858e);
                if (a2.size() == 6) {
                    C5005z a3 = C5005z.m11401a((Object) a2.mo11628e(5));
                    if (a3.f11893e == 0) {
                        i = C4958k.m11232a(a3, false).mo11593m();
                    } else {
                        throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                    }
                } else if (a2.size() == 5) {
                    i = -1;
                } else {
                    throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
                }
                this.f12043k = i;
                if (tVar.size() == 3) {
                    this.f12044l = C0967p0.m2217a(C4971o.m11278a(C5005z.m11401a((Object) tVar.mo11628e(2)), true).f11858e);
                } else {
                    this.f12044l = null;
                }
            } else {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        } else {
            throw new IllegalArgumentException("unknown version of sequence");
        }
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) this.f12043k >= 0 ? new C4958k(1) : new C4958k(0));
        C4933e eVar2 = new C4933e(10);
        eVar2.mo11573a((C4929d) new C4958k((long) this.f12038f));
        eVar2.mo11573a((C4929d) new C5003y0(this.f12039g));
        eVar2.mo11573a((C4929d) new C5003y0(this.f12040h));
        eVar2.mo11573a((C4929d) new C5003y0(this.f12041i));
        eVar2.mo11573a((C4929d) new C5003y0(this.f12042j));
        int i = this.f12043k;
        if (i >= 0) {
            eVar2.mo11573a((C4929d) new C4940f1(false, 0, new C4958k((long) i)));
        }
        eVar.mo11573a((C4929d) new C4927c1(eVar2));
        eVar.mo11573a((C4929d) new C4940f1(true, 0, new C5003y0(this.f12044l)));
        return new C4927c1(eVar);
    }
}
