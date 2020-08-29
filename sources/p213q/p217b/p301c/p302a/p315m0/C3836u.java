package p213q.p217b.p301c.p302a.p315m0;

import p213q.p217b.p301c.p302a.C3850u;

/* renamed from: q.b.c.a.m0.u */
public final class C3836u implements C3850u {

    /* renamed from: a */
    public final byte[] f9421a;

    public C3836u(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] a = C3828s.m9187a(bArr);
            this.f9421a = a;
            C3828s.m9188b(a);
            return;
        }
        throw new IllegalArgumentException(String.format("Given private key's length is not %s", new Object[]{Integer.valueOf(32)}));
    }
}
