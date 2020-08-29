package p425x.p426a.p445e.p447b.p451d;

import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p434b.p436d.C5018a;

/* renamed from: x.a.e.b.d.a */
public final class C5063a extends C5018a {

    /* renamed from: a */
    public int f12124a;

    /* renamed from: b */
    public byte[] f12125b;

    public C5063a(int i, byte[] bArr) {
        int i2;
        super(true);
        int length = bArr.length;
        if (i == 5) {
            i2 = 5184;
        } else if (i == 6) {
            i2 = 12352;
        } else {
            throw new IllegalArgumentException(C1965a.m4761b("unknown security category: ", i));
        }
        if (length == i2) {
            this.f12124a = i;
            this.f12125b = C0967p0.m2217a(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    /* renamed from: a */
    public byte[] mo11728a() {
        return C0967p0.m2217a(this.f12125b);
    }
}
