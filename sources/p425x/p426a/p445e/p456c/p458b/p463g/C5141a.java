package p425x.p426a.p445e.p456c.p458b.p463g;

import java.security.PrivateKey;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p445e.p447b.p452e.C5065a;
import p425x.p426a.p445e.p456c.p466c.C5153a;

/* renamed from: x.a.e.c.b.g.a */
public class C5141a implements PrivateKey {

    /* renamed from: e */
    public short[][] f12303e;

    /* renamed from: f */
    public short[] f12304f;

    /* renamed from: g */
    public short[][] f12305g;

    /* renamed from: h */
    public short[] f12306h;

    /* renamed from: i */
    public C5065a[] f12307i;

    /* renamed from: j */
    public int[] f12308j;

    public C5141a(C5153a aVar) {
        short[][] sArr = aVar.f12328e;
        short[] sArr2 = aVar.f12329f;
        short[][] sArr3 = aVar.f12330g;
        short[] sArr4 = aVar.f12331h;
        int[] iArr = aVar.f12332i;
        C5065a[] aVarArr = aVar.f12333j;
        this.f12303e = sArr;
        this.f12304f = sArr2;
        this.f12305g = sArr3;
        this.f12306h = sArr4;
        this.f12308j = iArr;
        this.f12307i = aVarArr;
    }

    public C5141a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C5065a[] aVarArr) {
        this.f12303e = sArr;
        this.f12304f = sArr2;
        this.f12305g = sArr3;
        this.f12306h = sArr4;
        this.f12308j = iArr;
        this.f12307i = aVarArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5141a)) {
            return false;
        }
        C5141a aVar = (C5141a) obj;
        boolean z = (((C0967p0.m2213a(this.f12303e, aVar.f12303e) && C0967p0.m2213a(this.f12305g, aVar.f12305g)) && C0967p0.m2212a(this.f12304f, aVar.f12304f)) && C0967p0.m2212a(this.f12306h, aVar.f12306h)) && Arrays.equals(this.f12308j, aVar.f12308j);
        C5065a[] aVarArr = this.f12307i;
        if (aVarArr.length != aVar.f12307i.length) {
            return false;
        }
        for (int length = aVarArr.length - 1; length >= 0; length--) {
            z &= this.f12307i[length].equals(aVar.f12307i[length]);
        }
        return z;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r8 = this;
            x.a.e.a.f r7 = new x.a.e.a.f
            short[][] r1 = r8.f12303e
            short[] r2 = r8.f12304f
            short[][] r3 = r8.f12305g
            short[] r4 = r8.f12306h
            int[] r5 = r8.f12308j
            x.a.e.b.e.a[] r6 = r8.f12307i
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            x.a.a.h2.a r1 = new x.a.a.h2.a     // Catch:{ IOException -> 0x0025 }
            x.a.a.n r2 = p425x.p426a.p445e.p446a.C5031e.f11986a     // Catch:{ IOException -> 0x0025 }
            x.a.a.w0 r3 = p425x.p426a.p427a.C4997w0.f11880e     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0025 }
            x.a.a.g2.b r2 = new x.a.a.g2.b     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r1, r7, r0, r0)     // Catch:{ IOException -> 0x0025 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p456c.p458b.p463g.C5141a.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int b = C0967p0.m2226b(this.f12308j) + ((C0967p0.m2242c(this.f12306h) + ((C0967p0.m2227b(this.f12305g) + ((C0967p0.m2242c(this.f12304f) + ((C0967p0.m2227b(this.f12303e) + (this.f12307i.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = this.f12307i.length - 1; length >= 0; length--) {
            b = (b * 37) + this.f12307i[length].hashCode();
        }
        return b;
    }
}
