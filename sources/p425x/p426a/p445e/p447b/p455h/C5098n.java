package p425x.p426a.p445e.p447b.p455h;

import p119o.p120a.C0967p0;

/* renamed from: x.a.e.b.h.n */
public final class C5098n {

    /* renamed from: a */
    public final byte[][] f12209a;

    public C5098n(C5097m mVar, byte[][] bArr) {
        if (mVar == null) {
            throw new NullPointerException("params == null");
        } else if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        } else if (C0967p0.m2245c(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        } else if (bArr.length == mVar.f12205d) {
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i].length == mVar.f12203b) {
                    i++;
                } else {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
            }
            this.f12209a = C0967p0.m2221a(bArr);
        } else {
            throw new IllegalArgumentException("wrong publicKey size");
        }
    }
}
