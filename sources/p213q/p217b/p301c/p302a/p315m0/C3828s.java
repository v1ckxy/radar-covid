package p213q.p217b.p301c.p302a.p315m0;

import java.security.MessageDigest;
import java.util.Arrays;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.c.a.m0.s */
public final class C3828s {

    /* renamed from: a */
    public static final C3829a f9400a = new C3829a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: b */
    public static final C3830b f9401b = new C3830b(new C3831c(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: q.b.c.a.m0.s$a */
    public static class C3829a {

        /* renamed from: a */
        public final long[] f9402a;

        /* renamed from: b */
        public final long[] f9403b;

        /* renamed from: c */
        public final long[] f9404c;

        public C3829a() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            this.f9402a = new long[10];
            this.f9403b = jArr;
            this.f9404c = jArr2;
        }

        public C3829a(C3829a aVar) {
            this.f9402a = Arrays.copyOf(aVar.f9402a, 10);
            this.f9403b = Arrays.copyOf(aVar.f9403b, 10);
            this.f9404c = Arrays.copyOf(aVar.f9404c, 10);
        }

        public C3829a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f9402a = jArr;
            this.f9403b = jArr2;
            this.f9404c = jArr3;
        }

        /* renamed from: a */
        public void mo10046a(C3829a aVar, int i) {
            C3816m.m9173a(this.f9402a, aVar.f9402a, i);
            C3816m.m9173a(this.f9403b, aVar.f9403b, i);
            C3816m.m9173a(this.f9404c, aVar.f9404c, i);
        }
    }

    /* renamed from: q.b.c.a.m0.s$b */
    public static class C3830b {

        /* renamed from: a */
        public final C3831c f9405a;

        /* renamed from: b */
        public final long[] f9406b;

        public C3830b(C3830b bVar) {
            this.f9405a = new C3831c(bVar.f9405a);
            this.f9406b = Arrays.copyOf(bVar.f9406b, 10);
        }

        public C3830b(C3831c cVar, long[] jArr) {
            this.f9405a = cVar;
            this.f9406b = jArr;
        }
    }

    /* renamed from: q.b.c.a.m0.s$c */
    public static class C3831c {

        /* renamed from: a */
        public final long[] f9407a;

        /* renamed from: b */
        public final long[] f9408b;

        /* renamed from: c */
        public final long[] f9409c;

        public C3831c() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            this.f9407a = new long[10];
            this.f9408b = jArr;
            this.f9409c = jArr2;
        }

        public C3831c(C3831c cVar) {
            this.f9407a = Arrays.copyOf(cVar.f9407a, 10);
            this.f9408b = Arrays.copyOf(cVar.f9408b, 10);
            this.f9409c = Arrays.copyOf(cVar.f9409c, 10);
        }

        public C3831c(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f9407a = jArr;
            this.f9408b = jArr2;
            this.f9409c = jArr3;
        }

        /* renamed from: a */
        public static C3831c m9190a(C3831c cVar, C3830b bVar) {
            C3794d0.m9129a(cVar.f9407a, bVar.f9405a.f9407a, bVar.f9406b);
            long[] jArr = cVar.f9408b;
            C3831c cVar2 = bVar.f9405a;
            C3794d0.m9129a(jArr, cVar2.f9408b, cVar2.f9409c);
            C3794d0.m9129a(cVar.f9409c, bVar.f9405a.f9409c, bVar.f9406b);
            return cVar;
        }
    }

    /* renamed from: q.b.c.a.m0.s$d */
    public static class C3832d {

        /* renamed from: a */
        public final C3831c f9410a = new C3831c();

        /* renamed from: b */
        public final long[] f9411b;

        public C3832d() {
            long[] jArr = new long[10];
            this.f9411b = jArr;
        }

        /* renamed from: a */
        public static /* synthetic */ C3832d m9191a(C3832d dVar, C3830b bVar) {
            C3794d0.m9129a(dVar.f9410a.f9407a, bVar.f9405a.f9407a, bVar.f9406b);
            long[] jArr = dVar.f9410a.f9408b;
            C3831c cVar = bVar.f9405a;
            C3794d0.m9129a(jArr, cVar.f9408b, cVar.f9409c);
            C3794d0.m9129a(dVar.f9410a.f9409c, bVar.f9405a.f9409c, bVar.f9406b);
            long[] jArr2 = dVar.f9411b;
            C3831c cVar2 = bVar.f9405a;
            C3794d0.m9129a(jArr2, cVar2.f9407a, cVar2.f9408b);
            return dVar;
        }
    }

    /* renamed from: a */
    public static int m9182a(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return ((i5 & (i5 << 1)) >> 7) & 1;
    }

    /* renamed from: a */
    public static /* synthetic */ int m9183a(long[] jArr) {
        return C3794d0.m9130a(jArr)[0] & 1;
    }

    /* renamed from: a */
    public static void m9185a(C3830b bVar, C3831c cVar) {
        long[] jArr = new long[10];
        C3794d0.m9132b(bVar.f9405a.f9407a, cVar.f9407a);
        C3794d0.m9132b(bVar.f9405a.f9409c, cVar.f9408b);
        C3794d0.m9132b(bVar.f9406b, cVar.f9409c);
        long[] jArr2 = bVar.f9406b;
        C3794d0.m9134c(jArr2, jArr2, jArr2);
        C3794d0.m9134c(bVar.f9405a.f9408b, cVar.f9407a, cVar.f9408b);
        C3794d0.m9132b(jArr, bVar.f9405a.f9408b);
        C3831c cVar2 = bVar.f9405a;
        C3794d0.m9134c(cVar2.f9408b, cVar2.f9409c, cVar2.f9407a);
        C3831c cVar3 = bVar.f9405a;
        long[] jArr3 = cVar3.f9409c;
        C3794d0.m9133b(jArr3, jArr3, cVar3.f9407a);
        C3831c cVar4 = bVar.f9405a;
        C3794d0.m9133b(cVar4.f9407a, jArr, cVar4.f9408b);
        long[] jArr4 = bVar.f9406b;
        C3794d0.m9133b(jArr4, jArr4, bVar.f9405a.f9409c);
    }

    /* renamed from: a */
    public static byte[] m9187a(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) C3778a0.f9326i.mo10023a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        digest[31] = (byte) (digest[31] & Byte.MAX_VALUE);
        digest[31] = (byte) (digest[31] | 64);
        return digest;
    }

    /* renamed from: b */
    public static byte[] m9188b(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 * 2;
            bArr2[i3 + 0] = (byte) (((bArr[i2] & 255) >> 0) & 15);
            bArr2[i3 + 1] = (byte) (((bArr[i2] & 255) >> 4) & 15);
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 63; i5++) {
            bArr2[i5] = (byte) (bArr2[i5] + i4);
            i4 = (bArr2[i5] + 8) >> 4;
            bArr2[i5] = (byte) (bArr2[i5] - (i4 << 4));
        }
        bArr2[63] = (byte) (bArr2[63] + i4);
        C3830b bVar = new C3830b(f9401b);
        C3832d dVar = new C3832d();
        for (i = 1; i < 64; i += 2) {
            C3829a aVar = new C3829a(f9400a);
            m9184a(aVar, i / 2, bArr2[i]);
            C3832d.m9191a(dVar, bVar);
            m9186a(bVar, dVar, aVar);
        }
        C3831c cVar = new C3831c();
        C3831c.m9190a(cVar, bVar);
        m9185a(bVar, cVar);
        C3831c.m9190a(cVar, bVar);
        m9185a(bVar, cVar);
        C3831c.m9190a(cVar, bVar);
        m9185a(bVar, cVar);
        C3831c.m9190a(cVar, bVar);
        m9185a(bVar, cVar);
        for (int i6 = 0; i6 < 64; i6 += 2) {
            C3829a aVar2 = new C3829a(f9400a);
            m9184a(aVar2, i6 / 2, bArr2[i6]);
            C3832d.m9191a(dVar, bVar);
            m9186a(bVar, dVar, aVar2);
        }
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        C3794d0.m9129a(jArr, bVar.f9405a.f9407a, bVar.f9406b);
        C3831c cVar2 = bVar.f9405a;
        C3794d0.m9129a(jArr2, cVar2.f9408b, cVar2.f9409c);
        C3794d0.m9129a(jArr3, bVar.f9405a.f9409c, bVar.f9406b);
        long[] jArr4 = new long[10];
        C3794d0.m9132b(jArr4, jArr);
        long[] jArr5 = new long[10];
        C3794d0.m9132b(jArr5, jArr2);
        long[] jArr6 = new long[10];
        C3794d0.m9132b(jArr6, jArr3);
        long[] jArr7 = new long[10];
        C3794d0.m9132b(jArr7, jArr6);
        long[] jArr8 = new long[10];
        C3794d0.m9133b(jArr8, jArr5, jArr4);
        C3794d0.m9129a(jArr8, jArr8, jArr6);
        long[] jArr9 = new long[10];
        C3794d0.m9129a(jArr9, jArr4, jArr5);
        C3794d0.m9129a(jArr9, jArr9, C3833t.f9412a);
        C3794d0.m9134c(jArr9, jArr9, jArr7);
        C3794d0.m9128a(jArr9, jArr9);
        if (C2286e.m5301b(C3794d0.m9130a(jArr8), C3794d0.m9130a(jArr9))) {
            long[] jArr10 = new long[10];
            long[] jArr11 = new long[10];
            long[] jArr12 = new long[10];
            long[] jArr13 = new long[10];
            long[] jArr14 = new long[10];
            long[] jArr15 = new long[10];
            long[] jArr16 = new long[10];
            long[] jArr17 = new long[10];
            long[] jArr18 = new long[10];
            long[] jArr19 = new long[10];
            long[] jArr20 = new long[10];
            long[] jArr21 = new long[10];
            long[] jArr22 = jArr2;
            long[] jArr23 = new long[10];
            C3794d0.m9132b(jArr13, jArr3);
            C3794d0.m9132b(jArr23, jArr13);
            C3794d0.m9132b(jArr21, jArr23);
            C3794d0.m9129a(jArr14, jArr21, jArr3);
            C3794d0.m9129a(jArr15, jArr14, jArr13);
            C3794d0.m9132b(jArr21, jArr15);
            C3794d0.m9129a(jArr16, jArr21, jArr14);
            C3794d0.m9132b(jArr21, jArr16);
            C3794d0.m9132b(jArr23, jArr21);
            C3794d0.m9132b(jArr21, jArr23);
            C3794d0.m9132b(jArr23, jArr21);
            C3794d0.m9132b(jArr21, jArr23);
            C3794d0.m9129a(jArr17, jArr21, jArr16);
            C3794d0.m9132b(jArr21, jArr17);
            C3794d0.m9132b(jArr23, jArr21);
            for (int i7 = 2; i7 < 10; i7 += 2) {
                C3794d0.m9132b(jArr21, jArr23);
                C3794d0.m9132b(jArr23, jArr21);
            }
            C3794d0.m9129a(jArr18, jArr23, jArr17);
            C3794d0.m9132b(jArr21, jArr18);
            C3794d0.m9132b(jArr23, jArr21);
            for (int i8 = 2; i8 < 20; i8 += 2) {
                C3794d0.m9132b(jArr21, jArr23);
                C3794d0.m9132b(jArr23, jArr21);
            }
            C3794d0.m9129a(jArr21, jArr23, jArr18);
            C3794d0.m9132b(jArr23, jArr21);
            C3794d0.m9132b(jArr21, jArr23);
            for (int i9 = 2; i9 < 10; i9 += 2) {
                C3794d0.m9132b(jArr23, jArr21);
                C3794d0.m9132b(jArr21, jArr23);
            }
            C3794d0.m9129a(jArr19, jArr21, jArr17);
            C3794d0.m9132b(jArr21, jArr19);
            C3794d0.m9132b(jArr23, jArr21);
            for (int i10 = 2; i10 < 50; i10 += 2) {
                C3794d0.m9132b(jArr21, jArr23);
                C3794d0.m9132b(jArr23, jArr21);
            }
            C3794d0.m9129a(jArr20, jArr23, jArr19);
            C3794d0.m9132b(jArr23, jArr20);
            C3794d0.m9132b(jArr21, jArr23);
            for (int i11 = 2; i11 < 100; i11 += 2) {
                C3794d0.m9132b(jArr23, jArr21);
                C3794d0.m9132b(jArr21, jArr23);
            }
            C3794d0.m9129a(jArr23, jArr21, jArr20);
            C3794d0.m9132b(jArr21, jArr23);
            C3794d0.m9132b(jArr23, jArr21);
            for (int i12 = 2; i12 < 50; i12 += 2) {
                C3794d0.m9132b(jArr21, jArr23);
                C3794d0.m9132b(jArr23, jArr21);
            }
            C3794d0.m9129a(jArr21, jArr23, jArr19);
            C3794d0.m9132b(jArr23, jArr21);
            C3794d0.m9132b(jArr21, jArr23);
            C3794d0.m9132b(jArr23, jArr21);
            C3794d0.m9132b(jArr21, jArr23);
            C3794d0.m9132b(jArr23, jArr21);
            C3794d0.m9129a(jArr10, jArr23, jArr15);
            C3794d0.m9129a(jArr11, jArr, jArr10);
            C3794d0.m9129a(jArr12, jArr22, jArr10);
            byte[] a = C3794d0.m9130a(jArr12);
            a[31] = (byte) (a[31] ^ (m9183a(jArr11) << 7));
            return a;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    /* renamed from: a */
    public static void m9186a(C3830b bVar, C3832d dVar, C3829a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = bVar.f9405a.f9407a;
        C3831c cVar = dVar.f9410a;
        C3794d0.m9134c(jArr2, cVar.f9408b, cVar.f9407a);
        long[] jArr3 = bVar.f9405a.f9408b;
        C3831c cVar2 = dVar.f9410a;
        C3794d0.m9133b(jArr3, cVar2.f9408b, cVar2.f9407a);
        long[] jArr4 = bVar.f9405a.f9408b;
        C3794d0.m9129a(jArr4, jArr4, aVar.f9403b);
        C3831c cVar3 = bVar.f9405a;
        C3794d0.m9129a(cVar3.f9409c, cVar3.f9407a, aVar.f9402a);
        C3794d0.m9129a(bVar.f9406b, dVar.f9411b, aVar.f9404c);
        System.arraycopy(dVar.f9410a.f9409c, 0, bVar.f9405a.f9407a, 0, 10);
        long[] jArr5 = bVar.f9405a.f9407a;
        C3794d0.m9134c(jArr, jArr5, jArr5);
        C3831c cVar4 = bVar.f9405a;
        C3794d0.m9133b(cVar4.f9407a, cVar4.f9409c, cVar4.f9408b);
        C3831c cVar5 = bVar.f9405a;
        long[] jArr6 = cVar5.f9408b;
        C3794d0.m9134c(jArr6, cVar5.f9409c, jArr6);
        C3794d0.m9134c(bVar.f9405a.f9409c, jArr, bVar.f9406b);
        long[] jArr7 = bVar.f9406b;
        C3794d0.m9133b(jArr7, jArr, jArr7);
    }

    /* renamed from: a */
    public static void m9184a(C3829a aVar, int i, byte b) {
        int i2 = (b & 255) >> 7;
        int i3 = b - (((-i2) & b) << 1);
        aVar.mo10046a(C3833t.f9413b[i][0], m9182a(i3, 1));
        aVar.mo10046a(C3833t.f9413b[i][1], m9182a(i3, 2));
        aVar.mo10046a(C3833t.f9413b[i][2], m9182a(i3, 3));
        aVar.mo10046a(C3833t.f9413b[i][3], m9182a(i3, 4));
        aVar.mo10046a(C3833t.f9413b[i][4], m9182a(i3, 5));
        aVar.mo10046a(C3833t.f9413b[i][5], m9182a(i3, 6));
        aVar.mo10046a(C3833t.f9413b[i][6], m9182a(i3, 7));
        aVar.mo10046a(C3833t.f9413b[i][7], m9182a(i3, 8));
        long[] copyOf = Arrays.copyOf(aVar.f9403b, 10);
        long[] copyOf2 = Arrays.copyOf(aVar.f9402a, 10);
        long[] copyOf3 = Arrays.copyOf(aVar.f9404c, 10);
        for (int i4 = 0; i4 < copyOf3.length; i4++) {
            copyOf3[i4] = -copyOf3[i4];
        }
        aVar.mo10046a(new C3829a(copyOf, copyOf2, copyOf3), i2);
    }
}
