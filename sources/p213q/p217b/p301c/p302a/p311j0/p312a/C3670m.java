package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.C3703c;

/* renamed from: q.b.c.a.j0.a.m */
public abstract class C3670m extends C3626h {

    /* renamed from: b */
    public static final Logger f9103b = Logger.getLogger(C3670m.class.getName());

    /* renamed from: c */
    public static final boolean f9104c = C3691q1.f9142h;

    /* renamed from: a */
    public C3678n f9105a = this;

    /* renamed from: q.b.c.a.j0.a.m$b */
    public static abstract class C3672b extends C3670m {

        /* renamed from: d */
        public final byte[] f9106d;

        /* renamed from: e */
        public final int f9107e;

        /* renamed from: f */
        public int f9108f;

        /* renamed from: g */
        public int f9109g;

        public C3672b(int i) {
            super(null);
            if (i >= 0) {
                int max = Math.max(i, 20);
                this.f9106d = new byte[max];
                this.f9107e = max;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: a */
        public final int mo9797a() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: f */
        public final void mo9817f(long j) {
            byte[] bArr = this.f9106d;
            int i = this.f9108f;
            int i2 = i + 1;
            this.f9108f = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.f9108f = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.f9108f = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.f9108f = i5;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            this.f9108f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f9108f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f9108f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f9108f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f9109g += 8;
        }

        /* renamed from: g */
        public final void mo9818g(long j) {
            if (C3670m.f9104c) {
                long j2 = (long) this.f9108f;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f9106d;
                    int i = this.f9108f;
                    this.f9108f = i + 1;
                    C3691q1.m8815a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f9106d;
                int i2 = this.f9108f;
                this.f9108f = i2 + 1;
                C3691q1.m8815a(bArr2, (long) i2, (byte) ((int) j));
                this.f9109g += (int) (((long) this.f9108f) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f9106d;
                int i3 = this.f9108f;
                this.f9108f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f9109g++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f9106d;
            int i4 = this.f9108f;
            this.f9108f = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f9109g++;
        }

        /* renamed from: k */
        public final void mo9819k(int i) {
            byte[] bArr = this.f9106d;
            int i2 = this.f9108f;
            int i3 = i2 + 1;
            this.f9108f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f9108f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f9108f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f9108f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f9109g += 4;
        }

        /* renamed from: l */
        public final void mo9820l(int i) {
            if (C3670m.f9104c) {
                long j = (long) this.f9108f;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f9106d;
                    int i2 = this.f9108f;
                    this.f9108f = i2 + 1;
                    C3691q1.m8815a(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f9106d;
                int i3 = this.f9108f;
                this.f9108f = i3 + 1;
                C3691q1.m8815a(bArr2, (long) i3, (byte) i);
                this.f9109g += (int) (((long) this.f9108f) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f9106d;
                int i4 = this.f9108f;
                this.f9108f = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f9109g++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f9106d;
            int i5 = this.f9108f;
            this.f9108f = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f9109g++;
        }
    }

    /* renamed from: q.b.c.a.j0.a.m$c */
    public static class C3673c extends C3670m {

        /* renamed from: d */
        public final byte[] f9110d;

        /* renamed from: e */
        public final int f9111e;

        /* renamed from: f */
        public int f9112f;

        public C3673c(byte[] bArr, int i, int i2) {
            super(null);
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f9110d = bArr;
                    this.f9112f = i;
                    this.f9111e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final int mo9797a() {
            return this.f9111e - this.f9112f;
        }

        /* renamed from: a */
        public final void mo9798a(byte b) {
            try {
                byte[] bArr = this.f9110d;
                int i = this.f9112f;
                this.f9112f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C3674d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9112f), Integer.valueOf(this.f9111e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo9799a(int i) {
            try {
                byte[] bArr = this.f9110d;
                int i2 = this.f9112f;
                int i3 = i2 + 1;
                this.f9112f = i3;
                bArr[i2] = (byte) (i & 255);
                byte[] bArr2 = this.f9110d;
                int i4 = i3 + 1;
                this.f9112f = i4;
                bArr2[i3] = (byte) ((i >> 8) & 255);
                byte[] bArr3 = this.f9110d;
                int i5 = i4 + 1;
                this.f9112f = i5;
                bArr3[i4] = (byte) ((i >> 16) & 255);
                byte[] bArr4 = this.f9110d;
                this.f9112f = i5 + 1;
                bArr4[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C3674d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9112f), Integer.valueOf(this.f9111e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo9806a(int i, boolean z) {
            mo9814c((i << 3) | 0);
            mo9798a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo9807a(long j) {
            try {
                byte[] bArr = this.f9110d;
                int i = this.f9112f;
                int i2 = i + 1;
                this.f9112f = i2;
                bArr[i] = (byte) (((int) j) & 255);
                byte[] bArr2 = this.f9110d;
                int i3 = i2 + 1;
                this.f9112f = i3;
                bArr2[i2] = (byte) (((int) (j >> 8)) & 255);
                byte[] bArr3 = this.f9110d;
                int i4 = i3 + 1;
                this.f9112f = i4;
                bArr3[i3] = (byte) (((int) (j >> 16)) & 255);
                byte[] bArr4 = this.f9110d;
                int i5 = i4 + 1;
                this.f9112f = i5;
                bArr4[i4] = (byte) (((int) (j >> 24)) & 255);
                byte[] bArr5 = this.f9110d;
                int i6 = i5 + 1;
                this.f9112f = i6;
                bArr5[i5] = (byte) (((int) (j >> 32)) & 255);
                byte[] bArr6 = this.f9110d;
                int i7 = i6 + 1;
                this.f9112f = i7;
                bArr6[i6] = (byte) (((int) (j >> 40)) & 255);
                byte[] bArr7 = this.f9110d;
                int i8 = i7 + 1;
                this.f9112f = i8;
                bArr7[i7] = (byte) (((int) (j >> 48)) & 255);
                byte[] bArr8 = this.f9110d;
                this.f9112f = i8 + 1;
                bArr8[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C3674d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9112f), Integer.valueOf(this.f9111e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo9652a(byte[] bArr, int i, int i2) {
            mo9823b(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo9809b(int i) {
            if (i >= 0) {
                mo9814c(i);
            } else {
                mo9813b((long) i);
            }
        }

        /* renamed from: b */
        public final void mo9810b(int i, int i2) {
            mo9814c((i << 3) | 0);
            if (i2 >= 0) {
                mo9814c(i2);
            } else {
                mo9813b((long) i2);
            }
        }

        /* renamed from: b */
        public final void mo9812b(int i, C3635j jVar) {
            mo9815c(1, 3);
            mo9816d(2, i);
            mo9803a(3, jVar);
            mo9815c(1, 4);
        }

        /* renamed from: b */
        public final void mo9821b(String str) {
            int a;
            int i = this.f9112f;
            try {
                int i2 = C3670m.m8671i(str.length() * 3);
                int i3 = C3670m.m8671i(str.length());
                if (i3 == i2) {
                    int i4 = i + i3;
                    this.f9112f = i4;
                    a = C3700r1.m8885a(str, this.f9110d, i4, mo9797a());
                    this.f9112f = i;
                    mo9814c((a - i) - i3);
                } else {
                    mo9814c(C3700r1.m8884a((CharSequence) str));
                    a = C3700r1.m8885a(str, this.f9110d, this.f9112f, mo9797a());
                }
                this.f9112f = a;
            } catch (C3703c e) {
                this.f9112f = i;
                mo9808a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C3674d(e2);
            }
        }

        /* renamed from: b */
        public final void mo9822b(C3635j jVar) {
            mo9814c(jVar.size());
            jVar.mo9661a((C3626h) this);
        }

        /* renamed from: b */
        public final void mo9823b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f9110d, this.f9112f, i2);
                this.f9112f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C3674d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9112f), Integer.valueOf(this.f9111e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c */
        public final void mo9814c(int i) {
            if (!C3670m.f9104c || C3609d.m8184a() || mo9797a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f9110d;
                    int i2 = this.f9112f;
                    this.f9112f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f9110d;
                    int i3 = this.f9112f;
                    this.f9112f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C3674d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9112f), Integer.valueOf(this.f9111e), Integer.valueOf(1)}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f9110d;
                int i4 = this.f9112f;
                this.f9112f = i4 + 1;
                C3691q1.m8815a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f9110d;
                int i5 = this.f9112f;
                this.f9112f = i5 + 1;
                C3691q1.m8815a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f9110d;
                    int i7 = this.f9112f;
                    this.f9112f = i7 + 1;
                    C3691q1.m8815a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f9110d;
                int i8 = this.f9112f;
                this.f9112f = i8 + 1;
                C3691q1.m8815a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f9110d;
                    int i10 = this.f9112f;
                    this.f9112f = i10 + 1;
                    C3691q1.m8815a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f9110d;
                int i11 = this.f9112f;
                this.f9112f = i11 + 1;
                C3691q1.m8815a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f9110d;
                    int i13 = this.f9112f;
                    this.f9112f = i13 + 1;
                    C3691q1.m8815a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f9110d;
                int i14 = this.f9112f;
                this.f9112f = i14 + 1;
                C3691q1.m8815a(bArr10, (long) i14, (byte) (i12 | 128));
                int i15 = i12 >>> 7;
                byte[] bArr11 = this.f9110d;
                int i16 = this.f9112f;
                this.f9112f = i16 + 1;
                C3691q1.m8815a(bArr11, (long) i16, (byte) i15);
            }
        }

        /* renamed from: c */
        public final void mo9815c(int i, int i2) {
            mo9814c((i << 3) | i2);
        }

        /* renamed from: d */
        public final void mo9816d(int i, int i2) {
            mo9814c((i << 3) | 0);
            mo9814c(i2);
        }

        /* renamed from: a */
        public final void mo9803a(int i, C3635j jVar) {
            mo9814c((i << 3) | 2);
            mo9822b(jVar);
        }

        /* renamed from: b */
        public final void mo9811b(int i, long j) {
            mo9814c((i << 3) | 0);
            mo9813b(j);
        }

        /* renamed from: a */
        public final void mo9800a(int i, int i2) {
            mo9814c((i << 3) | 5);
            mo9799a(i2);
        }

        /* renamed from: b */
        public final void mo9813b(long j) {
            if (!C3670m.f9104c || mo9797a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f9110d;
                    int i = this.f9112f;
                    this.f9112f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f9110d;
                    int i2 = this.f9112f;
                    this.f9112f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C3674d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9112f), Integer.valueOf(this.f9111e), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f9110d;
                    int i3 = this.f9112f;
                    this.f9112f = i3 + 1;
                    C3691q1.m8815a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f9110d;
                int i4 = this.f9112f;
                this.f9112f = i4 + 1;
                C3691q1.m8815a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo9801a(int i, long j) {
            mo9814c((i << 3) | 1);
            mo9807a(j);
        }

        /* renamed from: a */
        public final void mo9805a(int i, C3706s0 s0Var, C3625g1 g1Var) {
            mo9814c((i << 3) | 2);
            mo9814c(((C3588a) s0Var).getSerializedSize(g1Var));
            g1Var.mo9646a(s0Var, (C3722v1) this.f9105a);
        }

        /* renamed from: a */
        public final void mo9804a(int i, C3706s0 s0Var) {
            mo9815c(1, 3);
            mo9816d(2, i);
            mo9814c(26);
            mo9814c(s0Var.getSerializedSize());
            s0Var.writeTo(this);
            mo9815c(1, 4);
        }

        /* renamed from: a */
        public final void mo9802a(int i, String str) {
            mo9814c((i << 3) | 2);
            mo9821b(str);
        }
    }

    /* renamed from: q.b.c.a.j0.a.m$d */
    public static class C3674d extends IOException {
        public C3674d(String str, Throwable th) {
            super(C1965a.m4751a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public C3674d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: q.b.c.a.j0.a.m$e */
    public static final class C3675e extends C3672b {

        /* renamed from: h */
        public final OutputStream f9113h;

        public C3675e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f9113h = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: a */
        public void mo9798a(byte b) {
            if (this.f9108f == this.f9107e) {
                mo9827i();
            }
            byte[] bArr = this.f9106d;
            int i = this.f9108f;
            this.f9108f = i + 1;
            bArr[i] = b;
            this.f9109g++;
        }

        /* renamed from: a */
        public void mo9799a(int i) {
            mo9828m(4);
            mo9819k(i);
        }

        /* renamed from: a */
        public void mo9807a(long j) {
            mo9828m(8);
            mo9817f(j);
        }

        /* renamed from: a */
        public void mo9652a(byte[] bArr, int i, int i2) {
            mo9826b(bArr, i, i2);
        }

        /* renamed from: b */
        public void mo9810b(int i, int i2) {
            mo9828m(20);
            mo9820l((i << 3) | 0);
            if (i2 >= 0) {
                mo9820l(i2);
            } else {
                mo9818g((long) i2);
            }
        }

        /* renamed from: b */
        public void mo9812b(int i, C3635j jVar) {
            mo9815c(1, 3);
            mo9816d(2, i);
            mo9803a(3, jVar);
            mo9815c(1, 4);
        }

        /* renamed from: b */
        public void mo9813b(long j) {
            mo9828m(10);
            mo9818g(j);
        }

        /* renamed from: b */
        public void mo9825b(C3635j jVar) {
            mo9814c(jVar.size());
            jVar.mo9661a((C3626h) this);
        }

        /* renamed from: b */
        public void mo9826b(byte[] bArr, int i, int i2) {
            int i3 = this.f9107e;
            int i4 = this.f9108f;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f9106d, i4, i2);
                this.f9108f += i2;
            } else {
                int i5 = i3 - i4;
                System.arraycopy(bArr, i, this.f9106d, i4, i5);
                int i6 = i + i5;
                i2 -= i5;
                this.f9108f = this.f9107e;
                this.f9109g += i5;
                mo9827i();
                if (i2 <= this.f9107e) {
                    System.arraycopy(bArr, i6, this.f9106d, 0, i2);
                    this.f9108f = i2;
                } else {
                    this.f9113h.write(bArr, i6, i2);
                }
            }
            this.f9109g += i2;
        }

        /* renamed from: c */
        public void mo9814c(int i) {
            mo9828m(5);
            mo9820l(i);
        }

        /* renamed from: c */
        public void mo9815c(int i, int i2) {
            mo9814c((i << 3) | i2);
        }

        /* renamed from: d */
        public void mo9816d(int i, int i2) {
            mo9828m(20);
            mo9820l((i << 3) | 0);
            mo9820l(i2);
        }

        /* renamed from: i */
        public final void mo9827i() {
            this.f9113h.write(this.f9106d, 0, this.f9108f);
            this.f9108f = 0;
        }

        /* renamed from: m */
        public final void mo9828m(int i) {
            if (this.f9107e - this.f9108f < i) {
                mo9827i();
            }
        }

        /* renamed from: a */
        public void mo9806a(int i, boolean z) {
            mo9828m(11);
            mo9820l((i << 3) | 0);
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = this.f9106d;
            int i2 = this.f9108f;
            this.f9108f = i2 + 1;
            bArr[i2] = b;
            this.f9109g++;
        }

        /* renamed from: b */
        public void mo9809b(int i) {
            if (i >= 0) {
                mo9828m(5);
                mo9820l(i);
                return;
            }
            mo9813b((long) i);
        }

        /* renamed from: a */
        public void mo9803a(int i, C3635j jVar) {
            mo9814c((i << 3) | 2);
            mo9825b(jVar);
        }

        /* renamed from: b */
        public void mo9824b(String str) {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int i3 = C3670m.m8671i(length);
                int i4 = i3 + length;
                if (i4 > this.f9107e) {
                    byte[] bArr = new byte[length];
                    int a = C3700r1.m8885a(str, bArr, 0, length);
                    mo9814c(a);
                    mo9826b(bArr, 0, a);
                    return;
                }
                if (i4 > this.f9107e - this.f9108f) {
                    mo9827i();
                }
                int i5 = C3670m.m8671i(str.length());
                i = this.f9108f;
                if (i5 == i3) {
                    int i6 = i + i5;
                    this.f9108f = i6;
                    int a2 = C3700r1.m8885a(str, this.f9106d, i6, this.f9107e - i6);
                    this.f9108f = i;
                    i2 = (a2 - i) - i5;
                    mo9820l(i2);
                    this.f9108f = a2;
                } else {
                    i2 = C3700r1.m8884a((CharSequence) str);
                    mo9820l(i2);
                    this.f9108f = C3700r1.m8885a(str, this.f9106d, this.f9108f, i2);
                }
                this.f9109g += i2;
            } catch (C3703c e) {
                this.f9109g -= this.f9108f - i;
                this.f9108f = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C3674d(e2);
            } catch (C3703c e3) {
                mo9808a(str, e3);
            }
        }

        /* renamed from: a */
        public void mo9800a(int i, int i2) {
            mo9828m(14);
            mo9820l((i << 3) | 5);
            mo9819k(i2);
        }

        /* renamed from: b */
        public void mo9811b(int i, long j) {
            mo9828m(20);
            mo9820l((i << 3) | 0);
            mo9818g(j);
        }

        /* renamed from: a */
        public void mo9801a(int i, long j) {
            mo9828m(18);
            mo9820l((i << 3) | 1);
            mo9817f(j);
        }

        /* renamed from: a */
        public void mo9805a(int i, C3706s0 s0Var, C3625g1 g1Var) {
            mo9814c((i << 3) | 2);
            mo9814c(((C3588a) s0Var).getSerializedSize(g1Var));
            g1Var.mo9646a(s0Var, (C3722v1) this.f9105a);
        }

        /* renamed from: a */
        public void mo9804a(int i, C3706s0 s0Var) {
            mo9815c(1, 3);
            mo9816d(2, i);
            mo9814c(26);
            mo9814c(s0Var.getSerializedSize());
            s0Var.writeTo(this);
            mo9815c(1, 4);
        }

        /* renamed from: a */
        public void mo9802a(int i, String str) {
            mo9814c((i << 3) | 2);
            mo9824b(str);
        }
    }

    public C3670m() {
    }

    public /* synthetic */ C3670m(C3671a aVar) {
    }

    /* renamed from: a */
    public static int m8634a(int i, double d) {
        return m8669h(i) + 8;
    }

    /* renamed from: a */
    public static int m8635a(int i, float f) {
        return m8669h(i) + 4;
    }

    /* renamed from: a */
    public static int m8636a(String str) {
        int i;
        try {
            i = C3700r1.m8884a((CharSequence) str);
        } catch (C3703c unused) {
            i = str.getBytes(C3594b0.f8972a).length;
        }
        return m8656e(i);
    }

    /* renamed from: a */
    public static int m8637a(C3621f0 f0Var) {
        int i;
        if (f0Var.f9018c != null) {
            i = f0Var.f9018c.size();
        } else {
            C3635j jVar = f0Var.f9016a;
            i = jVar != null ? jVar.size() : f0Var.f9017b != null ? f0Var.f9017b.getSerializedSize() : 0;
        }
        return m8656e(i);
    }

    /* renamed from: a */
    public static int m8638a(C3635j jVar) {
        return m8656e(jVar.size());
    }

    @Deprecated
    /* renamed from: a */
    public static int m8639a(C3706s0 s0Var) {
        return s0Var.getSerializedSize();
    }

    /* renamed from: a */
    public static int m8640a(byte[] bArr) {
        return m8656e(bArr.length);
    }

    /* renamed from: b */
    public static int m8641b() {
        return 1;
    }

    /* renamed from: b */
    public static int m8642b(int i, String str) {
        return m8636a(str) + m8669h(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m8643b(int i, C3706s0 s0Var, C3625g1 g1Var) {
        return (m8669h(i) * 2) + ((C3588a) s0Var).getSerializedSize(g1Var);
    }

    /* renamed from: b */
    public static int m8644b(int i, boolean z) {
        return m8669h(i) + 1;
    }

    /* renamed from: b */
    public static int m8645b(C3706s0 s0Var) {
        return m8656e(s0Var.getSerializedSize());
    }

    /* renamed from: c */
    public static int m8647c() {
        return 8;
    }

    /* renamed from: c */
    public static int m8648c(int i, long j) {
        return m8669h(i) + 8;
    }

    /* renamed from: c */
    public static int m8649c(int i, C3635j jVar) {
        return m8669h(i) + m8656e(jVar.size());
    }

    /* renamed from: c */
    public static int m8650c(long j) {
        return m8654d(m8659e(j));
    }

    /* renamed from: d */
    public static int m8651d() {
        return 4;
    }

    /* renamed from: d */
    public static int m8652d(int i) {
        if (i >= 0) {
            return m8671i(i);
        }
        return 10;
    }

    /* renamed from: d */
    public static int m8653d(int i, long j) {
        return m8669h(i) + m8654d(j);
    }

    /* renamed from: d */
    public static int m8654d(long j) {
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

    /* renamed from: e */
    public static int m8655e() {
        return 8;
    }

    /* renamed from: e */
    public static int m8656e(int i) {
        return m8671i(i) + i;
    }

    /* renamed from: e */
    public static int m8657e(int i, int i2) {
        return m8669h(i) + m8652d(i2);
    }

    /* renamed from: e */
    public static int m8658e(int i, long j) {
        return m8669h(i) + 8;
    }

    /* renamed from: e */
    public static long m8659e(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: f */
    public static int m8660f() {
        return 4;
    }

    /* renamed from: f */
    public static int m8661f(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: f */
    public static int m8662f(int i, int i2) {
        return m8669h(i) + 4;
    }

    /* renamed from: f */
    public static int m8663f(int i, long j) {
        return m8650c(j) + m8669h(i);
    }

    /* renamed from: g */
    public static int m8664g() {
        return 4;
    }

    /* renamed from: g */
    public static int m8665g(int i) {
        return m8671i(m8673j(i));
    }

    /* renamed from: g */
    public static int m8666g(int i, int i2) {
        return m8652d(i2) + m8669h(i);
    }

    /* renamed from: g */
    public static int m8667g(int i, long j) {
        return m8654d(j) + m8669h(i);
    }

    /* renamed from: h */
    public static int m8668h() {
        return 8;
    }

    /* renamed from: h */
    public static int m8669h(int i) {
        return m8671i((i << 3) | 0);
    }

    /* renamed from: h */
    public static int m8670h(int i, int i2) {
        return m8669h(i) + 4;
    }

    /* renamed from: i */
    public static int m8671i(int i) {
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
    public static int m8672i(int i, int i2) {
        return m8665g(i2) + m8669h(i);
    }

    /* renamed from: j */
    public static int m8673j(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: j */
    public static int m8674j(int i, int i2) {
        return m8671i(i2) + m8669h(i);
    }

    /* renamed from: a */
    public abstract int mo9797a();

    /* renamed from: a */
    public abstract void mo9798a(byte b);

    /* renamed from: a */
    public abstract void mo9799a(int i);

    /* renamed from: a */
    public abstract void mo9800a(int i, int i2);

    /* renamed from: a */
    public abstract void mo9801a(int i, long j);

    /* renamed from: a */
    public abstract void mo9802a(int i, String str);

    /* renamed from: a */
    public abstract void mo9803a(int i, C3635j jVar);

    /* renamed from: a */
    public abstract void mo9804a(int i, C3706s0 s0Var);

    /* renamed from: a */
    public abstract void mo9805a(int i, C3706s0 s0Var, C3625g1 g1Var);

    /* renamed from: a */
    public abstract void mo9806a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo9807a(long j);

    /* renamed from: a */
    public final void mo9808a(String str, C3703c cVar) {
        f9103b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", cVar);
        byte[] bytes = str.getBytes(C3594b0.f8972a);
        try {
            mo9814c(bytes.length);
            mo9652a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3674d(e);
        } catch (C3674d e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public abstract void mo9809b(int i);

    /* renamed from: b */
    public abstract void mo9810b(int i, int i2);

    /* renamed from: b */
    public abstract void mo9811b(int i, long j);

    /* renamed from: b */
    public abstract void mo9812b(int i, C3635j jVar);

    /* renamed from: b */
    public abstract void mo9813b(long j);

    /* renamed from: c */
    public abstract void mo9814c(int i);

    /* renamed from: c */
    public abstract void mo9815c(int i, int i2);

    /* renamed from: d */
    public abstract void mo9816d(int i, int i2);

    /* renamed from: b */
    public static C3670m m8646b(byte[] bArr) {
        return new C3673c(bArr, 0, bArr.length);
    }
}
