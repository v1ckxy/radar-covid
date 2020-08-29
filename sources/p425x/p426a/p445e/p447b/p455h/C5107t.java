package p425x.p426a.p445e.p447b.p455h;

import p119o.p120a.C0967p0;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.e.b.h.t */
public final class C5107t extends C5102q implements C5162c {

    /* renamed from: f */
    public final C5103r f12242f;

    /* renamed from: g */
    public final int f12243g;

    /* renamed from: h */
    public final byte[] f12244h;

    /* renamed from: i */
    public final byte[] f12245i;

    /* renamed from: x.a.e.b.h.t$b */
    public static class C5109b {

        /* renamed from: a */
        public final C5103r f12246a;

        /* renamed from: b */
        public byte[] f12247b = null;

        /* renamed from: c */
        public byte[] f12248c = null;

        /* renamed from: d */
        public byte[] f12249d = null;

        public C5109b(C5103r rVar) {
            this.f12246a = rVar;
        }
    }

    public /* synthetic */ C5107t(C5109b bVar, C5108a aVar) {
        super(false, bVar.f12246a.f12222b.f12258f);
        C5103r rVar = bVar.f12246a;
        this.f12242f = rVar;
        if (rVar != null) {
            int i = rVar.f12222b.f12259g;
            byte[] bArr = bVar.f12249d;
            if (bArr == null) {
                C5111v vVar = rVar.f12221a;
                if (vVar != null) {
                    this.f12243g = vVar.mo11741a();
                } else {
                    this.f12243g = 0;
                }
                byte[] bArr2 = bVar.f12247b;
                if (bArr2 == null) {
                    this.f12244h = new byte[i];
                } else if (bArr2.length == i) {
                    this.f12244h = bArr2;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                byte[] bArr3 = bVar.f12248c;
                if (bArr3 == null) {
                    this.f12245i = new byte[i];
                } else if (bArr3.length == i) {
                    this.f12245i = bArr3;
                } else {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
            } else if (bArr.length == i + i) {
                this.f12243g = 0;
                this.f12244h = C0967p0.m2246c(bArr, 0, i);
                this.f12245i = C0967p0.m2246c(bArr, i + 0, i);
            } else {
                int i2 = i + 4;
                if (bArr.length == i2 + i) {
                    this.f12243g = C0967p0.m2225b(bArr, 0);
                    this.f12244h = C0967p0.m2246c(bArr, 4, i);
                    this.f12245i = C0967p0.m2246c(bArr, i2, i);
                    return;
                }
                throw new IllegalArgumentException("public key has wrong size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: a */
    public byte[] mo11760a() {
        byte[] bArr;
        int i = this.f12242f.f12222b.f12259g;
        int i2 = 0;
        int i3 = this.f12243g;
        if (i3 != 0) {
            bArr = new byte[(i + 4 + i)];
            C0967p0.m2233b(i3, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[(i + i)];
        }
        C0967p0.m2206a(bArr, this.f12244h, i2);
        C0967p0.m2206a(bArr, this.f12245i, i2 + i);
        return bArr;
    }

    public byte[] getEncoded() {
        return mo11760a();
    }
}
