package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: q.b.a.b.g.e.p5 */
public abstract class C2615p5 extends C2383c5 {

    /* renamed from: b */
    public static final Logger f6799b = Logger.getLogger(C2615p5.class.getName());

    /* renamed from: c */
    public static final boolean f6800c = C2366b9.f6346h;

    /* renamed from: a */
    public C2650r5 f6801a = this;

    /* renamed from: q.b.a.b.g.e.p5$a */
    public static class C2616a extends C2615p5 {

        /* renamed from: d */
        public final byte[] f6802d;

        /* renamed from: e */
        public final int f6803e;

        /* renamed from: f */
        public int f6804f;

        public C2616a(byte[] bArr, int i) {
            super(null);
            if (bArr != null) {
                int i2 = i + 0;
                if ((i | 0 | (bArr.length - i2)) >= 0) {
                    this.f6802d = bArr;
                    this.f6804f = 0;
                    this.f6803e = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final int mo7941a() {
            return this.f6803e - this.f6804f;
        }

        /* renamed from: a */
        public final void mo7942a(byte b) {
            try {
                byte[] bArr = this.f6802d;
                int i = this.f6804f;
                this.f6804f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C2617b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6804f), Integer.valueOf(this.f6803e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo7943a(int i) {
            if (i >= 0) {
                mo7946b(i);
            } else {
                mo7945a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo7945a(long j) {
            if (!C2615p5.f6800c || mo7941a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f6802d;
                    int i = this.f6804f;
                    this.f6804f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f6802d;
                    int i2 = this.f6804f;
                    this.f6804f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C2617b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6804f), Integer.valueOf(this.f6803e), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f6802d;
                    int i3 = this.f6804f;
                    this.f6804f = i3 + 1;
                    C2366b9.m5486a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f6802d;
                int i4 = this.f6804f;
                this.f6804f = i4 + 1;
                C2366b9.m5486a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo7949a(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f6802d, this.f6804f, i2);
                this.f6804f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C2617b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6804f), Integer.valueOf(this.f6803e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: b */
        public final void mo7950b(int i, C2435f5 f5Var) {
            mo7946b((i << 3) | 2);
            mo7952b(f5Var);
        }

        /* renamed from: b */
        public final void mo7947b(long j) {
            try {
                byte[] bArr = this.f6802d;
                int i = this.f6804f;
                int i2 = i + 1;
                this.f6804f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f6802d;
                int i3 = i2 + 1;
                this.f6804f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f6802d;
                int i4 = i3 + 1;
                this.f6804f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f6802d;
                int i5 = i4 + 1;
                this.f6804f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f6802d;
                int i6 = i5 + 1;
                this.f6804f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f6802d;
                int i7 = i6 + 1;
                this.f6804f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f6802d;
                int i8 = i7 + 1;
                this.f6804f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f6802d;
                this.f6804f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C2617b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6804f), Integer.valueOf(this.f6803e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: c */
        public final void mo7948c(int i) {
            try {
                byte[] bArr = this.f6802d;
                int i2 = this.f6804f;
                int i3 = i2 + 1;
                this.f6804f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f6802d;
                int i4 = i3 + 1;
                this.f6804f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f6802d;
                int i5 = i4 + 1;
                this.f6804f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f6802d;
                this.f6804f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C2617b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6804f), Integer.valueOf(this.f6803e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: c */
        public final void mo7953c(C2619p7 p7Var) {
            mo7946b(p7Var.mo7765d());
            p7Var.mo7762a(this);
        }

        /* renamed from: f */
        public final void mo7954f(int i, int i2) {
            mo7946b((i << 3) | i2);
        }

        /* renamed from: g */
        public final void mo7955g(int i, int i2) {
            mo7946b((i << 3) | 0);
            mo7946b(i2);
        }

        /* renamed from: a */
        public final void mo7944a(int i, int i2) {
            mo7946b((i << 3) | 0);
            if (i2 >= 0) {
                mo7946b(i2);
            } else {
                mo7945a((long) i2);
            }
        }

        /* renamed from: b */
        public final void mo7952b(C2435f5 f5Var) {
            mo7946b(f5Var.mo7640a());
            C2580n5 n5Var = (C2580n5) f5Var;
            mo7949a(n5Var.f6744h, n5Var.mo7677e(), n5Var.mo7640a());
        }

        /* renamed from: b */
        public final void mo7951b(String str) {
            int i = this.f6804f;
            try {
                int h = C2615p5.m6260h(str.length() * 3);
                int h2 = C2615p5.m6260h(str.length());
                if (h2 == h) {
                    int i2 = i + h2;
                    this.f6804f = i2;
                    int a = C2387c9.f6419a.mo7542a((CharSequence) str, this.f6802d, i2, mo7941a());
                    this.f6804f = i;
                    mo7946b((a - i) - h2);
                    this.f6804f = a;
                    return;
                }
                mo7946b(C2387c9.m5603a((CharSequence) str));
                this.f6804f = C2387c9.f6419a.mo7542a((CharSequence) str, this.f6802d, this.f6804f, mo7941a());
            } catch (C2456g9 e) {
                C2456g9 g9Var = e;
                this.f6804f = i;
                C2615p5.f6799b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", g9Var);
                byte[] bytes = str.getBytes(C2546l6.f6704a);
                try {
                    mo7946b(bytes.length);
                    mo7949a(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e2) {
                    throw new C2617b(e2);
                } catch (C2617b e3) {
                    throw e3;
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new C2617b(e4);
            }
        }

        /* renamed from: b */
        public final void mo7946b(int i) {
            if (!C2615p5.f6800c || C2777z4.m6583a() || mo7941a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f6802d;
                    int i2 = this.f6804f;
                    this.f6804f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f6802d;
                    int i3 = this.f6804f;
                    this.f6804f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C2617b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6804f), Integer.valueOf(this.f6803e), Integer.valueOf(1)}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f6802d;
                int i4 = this.f6804f;
                this.f6804f = i4 + 1;
                C2366b9.m5486a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f6802d;
                int i5 = this.f6804f;
                this.f6804f = i5 + 1;
                C2366b9.m5486a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f6802d;
                    int i7 = this.f6804f;
                    this.f6804f = i7 + 1;
                    C2366b9.m5486a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f6802d;
                int i8 = this.f6804f;
                this.f6804f = i8 + 1;
                C2366b9.m5486a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f6802d;
                    int i10 = this.f6804f;
                    this.f6804f = i10 + 1;
                    C2366b9.m5486a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f6802d;
                int i11 = this.f6804f;
                this.f6804f = i11 + 1;
                C2366b9.m5486a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f6802d;
                    int i13 = this.f6804f;
                    this.f6804f = i13 + 1;
                    C2366b9.m5486a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f6802d;
                int i14 = this.f6804f;
                this.f6804f = i14 + 1;
                C2366b9.m5486a(bArr10, (long) i14, (byte) (i12 | 128));
                int i15 = i12 >>> 7;
                byte[] bArr11 = this.f6802d;
                int i16 = this.f6804f;
                this.f6804f = i16 + 1;
                C2366b9.m5486a(bArr11, (long) i16, (byte) i15);
            }
        }
    }

    /* renamed from: q.b.a.b.g.e.p5$b */
    public static class C2617b extends IOException {
        public C2617b(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }

        public C2617b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public C2615p5() {
    }

    public /* synthetic */ C2615p5(C2634q5 q5Var) {
    }

    /* renamed from: a */
    public static int m6227a(int i, long j) {
        return m6246c(j) + m6256f(i);
    }

    /* renamed from: a */
    public static int m6228a(int i, String str) {
        return m6231a(str) + m6256f(i);
    }

    /* renamed from: a */
    public static int m6229a(int i, C2435f5 f5Var) {
        int f = m6256f(i);
        int a = f5Var.mo7640a();
        return m6260h(a) + a + f;
    }

    /* renamed from: a */
    public static int m6231a(String str) {
        int i;
        try {
            i = C2387c9.m5603a((CharSequence) str);
        } catch (C2456g9 unused) {
            i = str.getBytes(C2546l6.f6704a).length;
        }
        return m6260h(i) + i;
    }

    /* renamed from: a */
    public static int m6232a(C2435f5 f5Var) {
        int a = f5Var.mo7640a();
        return m6260h(a) + a;
    }

    /* renamed from: a */
    public static int m6233a(C2619p7 p7Var) {
        int d = p7Var.mo7765d();
        return m6260h(d) + d;
    }

    /* renamed from: a */
    public static int m6234a(C2619p7 p7Var, C2455g8 g8Var) {
        C2730w4 w4Var = (C2730w4) p7Var;
        int i = ((C2490i6) w4Var).zzc;
        if (i == -1) {
            i = g8Var.mo7686d(w4Var);
            ((C2490i6) w4Var).zzc = i;
        }
        return m6260h(i) + i;
    }

    /* renamed from: a */
    public static int m6235a(C2763y6 y6Var) {
        int a = y6Var.mo8117a();
        return m6260h(a) + a;
    }

    /* renamed from: a */
    public static C2615p5 m6236a(byte[] bArr) {
        return new C2616a(bArr, bArr.length);
    }

    /* renamed from: b */
    public static int m6237b() {
        return 4;
    }

    /* renamed from: b */
    public static int mo7946b(int i) {
        return m6256f(i) + 4;
    }

    /* renamed from: b */
    public static int m6239b(int i, int i2) {
        return m6258g(i2) + m6256f(i);
    }

    /* renamed from: b */
    public static int m6240b(int i, long j) {
        return m6246c(j) + m6256f(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m6241b(C2619p7 p7Var) {
        return p7Var.mo7765d();
    }

    /* renamed from: b */
    public static int m6242b(byte[] bArr) {
        int length = bArr.length;
        return m6260h(length) + length;
    }

    /* renamed from: c */
    public static int m6243c() {
        return 8;
    }

    /* renamed from: c */
    public static int m6244c(int i, int i2) {
        return m6260h(i2) + m6256f(i);
    }

    /* renamed from: c */
    public static int m6245c(int i, long j) {
        return m6246c(m6254e(j)) + m6256f(i);
    }

    /* renamed from: c */
    public static int m6246c(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: d */
    public static int m6247d() {
        return 1;
    }

    /* renamed from: d */
    public static int m6248d(int i) {
        return m6256f(i) + 8;
    }

    /* renamed from: d */
    public static int m6249d(int i, int i2) {
        return m6260h(m6266n(i2)) + m6256f(i);
    }

    /* renamed from: d */
    public static int m6250d(long j) {
        return m6246c(m6254e(j));
    }

    /* renamed from: e */
    public static int m6251e() {
        return 8;
    }

    /* renamed from: e */
    public static int m6252e(int i) {
        return m6256f(i) + 1;
    }

    /* renamed from: e */
    public static int m6253e(int i, int i2) {
        return m6258g(i2) + m6256f(i);
    }

    /* renamed from: e */
    public static long m6254e(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: f */
    public static int m6255f() {
        return 8;
    }

    /* renamed from: f */
    public static int m6256f(int i) {
        return m6260h(i << 3);
    }

    /* renamed from: g */
    public static int m6257g() {
        return 4;
    }

    /* renamed from: g */
    public static int m6258g(int i) {
        if (i >= 0) {
            return m6260h(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m6259h() {
        return 4;
    }

    /* renamed from: h */
    public static int m6260h(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: i */
    public static int m6261i(int i) {
        return m6256f(i) + 8;
    }

    /* renamed from: j */
    public static int m6262j(int i) {
        return m6260h(m6266n(i));
    }

    /* renamed from: k */
    public static int m6263k(int i) {
        return m6256f(i) + 8;
    }

    /* renamed from: l */
    public static int m6264l(int i) {
        return m6256f(i) + 4;
    }

    /* renamed from: m */
    public static int m6265m(int i) {
        return m6256f(i) + 4;
    }

    /* renamed from: n */
    public static int m6266n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract int mo7941a();

    /* renamed from: a */
    public abstract void mo7942a(byte b);

    /* renamed from: a */
    public abstract void mo7943a(int i);

    /* renamed from: a */
    public abstract void mo7944a(int i, int i2);

    /* renamed from: a */
    public abstract void mo7945a(long j);

    /* renamed from: b */
    public abstract void m6272b(int i);

    /* renamed from: b */
    public abstract void mo7947b(long j);

    /* renamed from: c */
    public abstract void mo7948c(int i);

    @Deprecated
    /* renamed from: a */
    public static int m6230a(int i, C2619p7 p7Var, C2455g8 g8Var) {
        int f = m6256f(i) << 1;
        C2730w4 w4Var = (C2730w4) p7Var;
        int i2 = ((C2490i6) w4Var).zzc;
        if (i2 == -1) {
            i2 = g8Var.mo7686d(w4Var);
            ((C2490i6) w4Var).zzc = i2;
        }
        return f + i2;
    }
}
