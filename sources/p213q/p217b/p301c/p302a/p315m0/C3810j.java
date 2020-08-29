package p213q.p217b.p301c.p302a.p315m0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.c.a.m0.j */
public abstract class C3810j implements C3796e0 {

    /* renamed from: c */
    public static final int[] f9384c = m9156c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public int[] f9385a;

    /* renamed from: b */
    public final int f9386b;

    public C3810j(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f9385a = m9156c(bArr);
            this.f9386b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    public static int m9152a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: a */
    public static void m9153a(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m9154a(iArr2, 0, 4, 8, 12);
            m9154a(iArr2, 1, 5, 9, 13);
            m9154a(iArr2, 2, 6, 10, 14);
            m9154a(iArr2, 3, 7, 11, 15);
            m9154a(iArr2, 0, 5, 10, 15);
            m9154a(iArr2, 1, 6, 11, 12);
            m9154a(iArr2, 2, 7, 8, 13);
            m9154a(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: a */
    public static void m9154a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m9152a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m9152a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m9152a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m9152a(iArr[i2] ^ iArr[i3], 7);
    }

    /* renamed from: a */
    public static void m9155a(int[] iArr, int[] iArr2) {
        int[] iArr3 = f9384c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, f9384c.length, 8);
    }

    /* renamed from: c */
    public static int[] m9156c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: a */
    public abstract int mo10035a();

    /* renamed from: a */
    public ByteBuffer mo10038a(byte[] bArr, int i) {
        int[] a = mo10036a(m9156c(bArr), i);
        int[] iArr = (int[]) a.clone();
        m9153a(iArr);
        for (int i2 = 0; i2 < a.length; i2++) {
            a[i2] = a[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a, 0, 16);
        return order;
    }

    /* renamed from: a */
    public void mo10039a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo10035a() >= bArr.length) {
            byte[] a = C3806h0.m9148a(mo10035a());
            byteBuffer.put(a);
            mo10040a(a, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: a */
    public final void mo10040a(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer a = mo10038a(bArr, this.f9386b + i2);
            if (i2 == i - 1) {
                C2286e.m5241a(byteBuffer, byteBuffer2, a, remaining % 64);
            } else {
                C2286e.m5241a(byteBuffer, byteBuffer2, a, 64);
            }
        }
    }

    /* renamed from: a */
    public byte[] mo10041a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= mo10035a()) {
            byte[] bArr = new byte[mo10035a()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            mo10040a(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: a */
    public byte[] mo10026a(byte[] bArr) {
        if (bArr.length <= Integer.MAX_VALUE - mo10035a()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo10035a() + bArr.length);
            mo10039a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    public abstract int[] mo10036a(int[] iArr, int i);

    /* renamed from: b */
    public byte[] mo10027b(byte[] bArr) {
        return mo10041a(ByteBuffer.wrap(bArr));
    }
}
