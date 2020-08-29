package p213q.p217b.p301c.p302a.p315m0;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3843o;

/* renamed from: q.b.c.a.m0.z */
public final class C3841z implements C3499a {

    /* renamed from: a */
    public final C3796e0 f9433a;

    /* renamed from: b */
    public final C3843o f9434b;

    /* renamed from: c */
    public final int f9435c;

    public C3841z(C3796e0 e0Var, C3843o oVar, int i) {
        this.f9433a = e0Var;
        this.f9434b = oVar;
        this.f9435c = i;
    }

    /* renamed from: a */
    public byte[] mo9453a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f9433a.mo10026a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return C2286e.m5270a(a, this.f9434b.mo9478a(C2286e.m5270a(bArr2, a, copyOf)));
    }

    /* renamed from: b */
    public byte[] mo9454b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f9435c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f9435c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f9434b.mo9477a(copyOfRange2, C2286e.m5270a(bArr2, copyOfRange, copyOf));
            return this.f9433a.mo10027b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
