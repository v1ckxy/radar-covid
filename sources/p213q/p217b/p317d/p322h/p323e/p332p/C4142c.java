package p213q.p217b.p317d.p322h.p323e.p332p;

import java.io.ByteArrayInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: q.b.d.h.e.p.c */
public final class C4142c implements Flushable {

    /* renamed from: e */
    public final byte[] f10025e;

    /* renamed from: f */
    public final int f10026f;

    /* renamed from: g */
    public int f10027g = 0;

    /* renamed from: h */
    public final OutputStream f10028h;

    /* renamed from: q.b.d.h.e.p.c$a */
    public static class C4143a extends IOException {
        public C4143a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public C4142c(OutputStream outputStream, byte[] bArr) {
        this.f10028h = outputStream;
        this.f10025e = bArr;
        this.f10026f = bArr.length;
    }

    /* renamed from: a */
    public static C4142c m9570a(OutputStream outputStream) {
        return new C4142c(outputStream, new byte[4096]);
    }

    /* renamed from: b */
    public static int m9571b(int i, long j) {
        int d = m9575d(i);
        int i2 = (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
        return d + i2;
    }

    /* renamed from: b */
    public static int m9572b(int i, C4139a aVar) {
        return m9575d(i) + m9574c(aVar.f10019a.length) + aVar.f10019a.length;
    }

    /* renamed from: b */
    public static int m9573b(int i, boolean z) {
        return m9575d(i) + 1;
    }

    /* renamed from: c */
    public static int m9574c(int i) {
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

    /* renamed from: d */
    public static int m9575d(int i) {
        return m9574c((i << 3) | 0);
    }

    /* renamed from: d */
    public static int m9576d(int i, int i2) {
        return m9575d(i) + (i2 >= 0 ? m9574c(i2) : 10);
    }

    /* renamed from: e */
    public static int m9577e(int i, int i2) {
        return m9575d(i) + m9574c(i2);
    }

    /* renamed from: a */
    public final void mo10345a() {
        OutputStream outputStream = this.f10028h;
        if (outputStream != null) {
            outputStream.write(this.f10025e, 0, this.f10027g);
            this.f10027g = 0;
            return;
        }
        throw new C4143a();
    }

    /* renamed from: b */
    public void mo10351b(int i) {
        while ((i & -128) != 0) {
            mo10346a((i & 127) | 128);
            i >>>= 7;
        }
        mo10346a(i);
    }

    /* renamed from: b */
    public void mo10352b(int i, int i2) {
        mo10351b((i << 3) | i2);
    }

    /* renamed from: b */
    public void mo10353b(long j) {
        while ((-128 & j) != 0) {
            mo10346a((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo10346a((int) j);
    }

    /* renamed from: c */
    public void mo10354c(int i, int i2) {
        mo10351b((i << 3) | 0);
        mo10351b(i2);
    }

    public void flush() {
        if (this.f10028h != null) {
            mo10345a();
        }
    }

    /* renamed from: a */
    public void mo10350a(int i, boolean z) {
        mo10351b((i << 3) | 0);
        mo10346a(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo10349a(int i, C4139a aVar) {
        mo10351b((i << 3) | 2);
        mo10351b(aVar.f10019a.length);
        byte[] bArr = aVar.f10019a;
        int length = bArr.length;
        int i2 = this.f10026f;
        int i3 = this.f10027g;
        int i4 = i2 - i3;
        if (i4 >= length) {
            System.arraycopy(bArr, 0, this.f10025e, i3, length);
            this.f10027g += length;
            return;
        }
        System.arraycopy(bArr, 0, this.f10025e, i3, i4);
        int i5 = i4 + 0;
        int i6 = length - i4;
        this.f10027g = this.f10026f;
        mo10345a();
        if (i6 <= this.f10026f) {
            System.arraycopy(aVar.f10019a, i5, this.f10025e, 0, i6);
            this.f10027g = i6;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(aVar.f10019a);
        long j = (long) i5;
        if (j == byteArrayInputStream.skip(j)) {
            while (i6 > 0) {
                int min = Math.min(i6, this.f10026f);
                int read = byteArrayInputStream.read(this.f10025e, 0, min);
                if (read == min) {
                    this.f10028h.write(this.f10025e, 0, read);
                    i6 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    /* renamed from: a */
    public void mo10347a(int i, int i2) {
        mo10351b((i << 3) | 0);
        if (i2 >= 0) {
            mo10351b(i2);
        } else {
            mo10353b((long) i2);
        }
    }

    /* renamed from: a */
    public void mo10346a(int i) {
        byte b = (byte) i;
        if (this.f10027g == this.f10026f) {
            mo10345a();
        }
        byte[] bArr = this.f10025e;
        int i2 = this.f10027g;
        this.f10027g = i2 + 1;
        bArr[i2] = b;
    }

    /* renamed from: a */
    public void mo10348a(int i, long j) {
        mo10351b((i << 3) | 0);
        mo10353b(j);
    }
}
