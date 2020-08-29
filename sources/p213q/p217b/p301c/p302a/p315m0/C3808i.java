package p213q.p217b.p301c.p302a.p315m0;

/* renamed from: q.b.c.a.m0.i */
public class C3808i extends C3810j {
    public C3808i(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public int mo10035a() {
        return 12;
    }

    /* renamed from: a */
    public int[] mo10036a(int[] iArr, int i) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            C3810j.m9155a(iArr2, this.f9385a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }
}
