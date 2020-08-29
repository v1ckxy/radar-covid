package p425x.p426a.p445e.p456c.p458b.p463g;

import java.security.PublicKey;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4997w0;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p446a.C5033g;
import p425x.p426a.p445e.p456c.p466c.C5154b;

/* renamed from: x.a.e.c.b.g.b */
public class C5142b implements PublicKey {

    /* renamed from: e */
    public short[][] f12309e;

    /* renamed from: f */
    public short[][] f12310f;

    /* renamed from: g */
    public short[] f12311g;

    /* renamed from: h */
    public int f12312h;

    public C5142b(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f12312h = i;
        this.f12309e = sArr;
        this.f12310f = sArr2;
        this.f12311g = sArr3;
    }

    public C5142b(C5154b bVar) {
        int i = bVar.f12337h;
        short[][] sArr = bVar.f12334e;
        short[][] sArr2 = bVar.f12335f;
        short[] sArr3 = bVar.f12336g;
        this.f12312h = i;
        this.f12309e = sArr;
        this.f12310f = sArr2;
        this.f12311g = sArr3;
    }

    /* renamed from: a */
    public short[][] mo11844a() {
        short[][] sArr = new short[this.f12310f.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.f12310f;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = C0967p0.m2220a(sArr2[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5142b)) {
            C5142b bVar = (C5142b) obj;
            if (this.f12312h == bVar.f12312h && C0967p0.m2213a(this.f12309e, bVar.f12309e) && C0967p0.m2213a(this.f12310f, bVar.mo11844a()) && C0967p0.m2212a(this.f12311g, C0967p0.m2220a(bVar.f12311g))) {
                return true;
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public byte[] getEncoded() {
        try {
            return new C4951b(new C4950a(C5031e.f11986a, C4997w0.f11880e), (C4929d) new C5033g(this.f12312h, this.f12309e, this.f12310f, this.f12311g)).mo11599a("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return C0967p0.m2242c(this.f12311g) + ((C0967p0.m2227b(this.f12310f) + ((C0967p0.m2227b(this.f12309e) + (this.f12312h * 37)) * 37)) * 37);
    }
}
