package p425x.p426a.p445e.p447b.p451d;

import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p434b.p436d.C5018a;

/* renamed from: x.a.e.b.d.b */
public final class C5064b extends C5018a {

    /* renamed from: a */
    public int f12126a;

    /* renamed from: b */
    public byte[] f12127b;

    public C5064b(int i, byte[] bArr) {
        int i2;
        super(false);
        int length = bArr.length;
        if (i == 5) {
            i2 = 14880;
        } else if (i == 6) {
            i2 = 38432;
        } else {
            throw new IllegalArgumentException(C1965a.m4761b("unknown security category: ", i));
        }
        if (length == i2) {
            this.f12126a = i;
            this.f12127b = C0967p0.m2217a(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    /* renamed from: a */
    public byte[] mo11729a() {
        return C0967p0.m2217a(this.f12127b);
    }
}
