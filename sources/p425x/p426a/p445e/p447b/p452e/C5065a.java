package p425x.p426a.p445e.p447b.p452e;

import p119o.p120a.C0967p0;

/* renamed from: x.a.e.b.e.a */
public class C5065a {

    /* renamed from: a */
    public int f12128a;

    /* renamed from: b */
    public int f12129b;

    /* renamed from: c */
    public int f12130c;

    /* renamed from: d */
    public short[][][] f12131d;

    /* renamed from: e */
    public short[][][] f12132e;

    /* renamed from: f */
    public short[][] f12133f;

    /* renamed from: g */
    public short[] f12134g;

    public C5065a(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        byte b3 = b & 255;
        this.f12128a = b3;
        byte b4 = b2 & 255;
        this.f12129b = b4;
        this.f12130c = b4 - b3;
        this.f12131d = sArr;
        this.f12132e = sArr2;
        this.f12133f = sArr3;
        this.f12134g = sArr4;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5065a)) {
            C5065a aVar = (C5065a) obj;
            if (this.f12128a == aVar.f12128a && this.f12129b == aVar.f12129b && this.f12130c == aVar.f12130c && C0967p0.m2214a(this.f12131d, aVar.f12131d) && C0967p0.m2214a(this.f12132e, aVar.f12132e) && C0967p0.m2213a(this.f12133f, aVar.f12133f) && C0967p0.m2212a(this.f12134g, aVar.f12134g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C0967p0.m2242c(this.f12134g) + ((C0967p0.m2227b(this.f12133f) + ((C0967p0.m2228b(this.f12132e) + ((C0967p0.m2228b(this.f12131d) + (((((this.f12128a * 37) + this.f12129b) * 37) + this.f12130c) * 37)) * 37)) * 37)) * 37);
    }
}
