package p213q.p217b.p301c.p302a.p315m0;

import java.util.Arrays;

/* renamed from: q.b.c.a.m0.n0 */
public class C3819n0 extends C3810j {
    public C3819n0(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public int mo10035a() {
        return 24;
    }

    /* renamed from: a */
    public int[] mo10036a(int[] iArr, int i) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            C3810j.m9155a(iArr3, this.f9385a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            C3810j.m9153a(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            C3810j.m9155a(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }
}
