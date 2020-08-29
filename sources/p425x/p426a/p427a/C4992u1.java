package p425x.p426a.p427a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p469f.p471j.C5173a;

/* renamed from: x.a.a.u1 */
public class C4992u1 extends C5007z1 {

    /* renamed from: i */
    public static final byte[] f11872i = new byte[0];

    /* renamed from: g */
    public final int f11873g;

    /* renamed from: h */
    public int f11874h;

    public C4992u1(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i >= 0) {
            this.f11873g = i;
            this.f11874h = i;
            if (i == 0) {
                mo11658a(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* renamed from: a */
    public byte[] mo11637a() {
        int i = this.f11874h;
        if (i == 0) {
            return f11872i;
        }
        int i2 = this.f11898f;
        if (i < i2) {
            byte[] bArr = new byte[i];
            int a = i - C5173a.m11609a(this.f11897e, bArr, 0, i);
            this.f11874h = a;
            if (a == 0) {
                mo11658a(true);
                return bArr;
            }
            StringBuilder a2 = C1965a.m4756a("DEF length ");
            a2.append(this.f11873g);
            a2.append(" object truncated by ");
            a2.append(this.f11874h);
            throw new EOFException(a2.toString());
        }
        StringBuilder a3 = C1965a.m4756a("corrupted stream - out of bounds length found: ");
        a3.append(this.f11874h);
        a3.append(" >= ");
        a3.append(i2);
        throw new IOException(a3.toString());
    }

    public int read() {
        if (this.f11874h == 0) {
            return -1;
        }
        int read = this.f11897e.read();
        if (read >= 0) {
            int i = this.f11874h - 1;
            this.f11874h = i;
            if (i == 0) {
                mo11658a(true);
            }
            return read;
        }
        StringBuilder a = C1965a.m4756a("DEF length ");
        a.append(this.f11873g);
        a.append(" object truncated by ");
        a.append(this.f11874h);
        throw new EOFException(a.toString());
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f11874h;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f11897e.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f11874h - read;
            this.f11874h = i4;
            if (i4 == 0) {
                mo11658a(true);
            }
            return read;
        }
        StringBuilder a = C1965a.m4756a("DEF length ");
        a.append(this.f11873g);
        a.append(" object truncated by ");
        a.append(this.f11874h);
        throw new EOFException(a.toString());
    }
}
