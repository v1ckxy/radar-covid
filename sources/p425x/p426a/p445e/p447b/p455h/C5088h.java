package p425x.p426a.p445e.p447b.p455h;

import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p434b.C5008a;
import p425x.p426a.p434b.C5009b;

/* renamed from: x.a.e.b.h.h */
public final class C5088h {

    /* renamed from: a */
    public final C5008a f12181a;

    /* renamed from: b */
    public final int f12182b;

    public C5088h(C4967n nVar, int i) {
        if (nVar != null) {
            this.f12181a = C5084f.m11550a(nVar);
            this.f12182b = i;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    /* renamed from: a */
    public final byte[] mo11747a(int i, byte[] bArr, byte[] bArr2) {
        byte[] a = C0967p0.m2215a((long) i, this.f12182b);
        this.f12181a.mo11662a(a, 0, a.length);
        this.f12181a.mo11662a(bArr, 0, bArr.length);
        this.f12181a.mo11662a(bArr2, 0, bArr2.length);
        int i2 = this.f12182b;
        byte[] bArr3 = new byte[i2];
        C5008a aVar = this.f12181a;
        if (aVar instanceof C5009b) {
            ((C5009b) aVar).mo11664b(bArr3, 0, i2);
        } else {
            aVar.mo11660a(bArr3, 0);
        }
        return bArr3;
    }

    /* renamed from: a */
    public byte[] mo11748a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f12182b) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return mo11747a(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }
}
