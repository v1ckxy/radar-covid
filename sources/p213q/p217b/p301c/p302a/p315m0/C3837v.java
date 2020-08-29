package p213q.p217b.p301c.p302a.p315m0;

import p213q.p217b.p301c.p302a.C3851v;

/* renamed from: q.b.c.a.m0.v */
public final class C3837v implements C3851v {
    public C3837v(byte[] bArr) {
        if (bArr.length == 32) {
            int length = bArr.length;
            System.arraycopy(bArr, 0, new byte[length], 0, length);
            return;
        }
        throw new IllegalArgumentException(String.format("Given public key's length is not %s.", new Object[]{Integer.valueOf(32)}));
    }
}
