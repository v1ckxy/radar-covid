package p425x.p426a.p427a;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: x.a.a.w1 */
public class C4998w1 extends C5007z1 {

    /* renamed from: g */
    public int f11882g;

    /* renamed from: h */
    public int f11883h;

    /* renamed from: i */
    public boolean f11884i = false;

    /* renamed from: j */
    public boolean f11885j = true;

    public C4998w1(InputStream inputStream, int i) {
        super(inputStream, i);
        this.f11882g = inputStream.read();
        int read = inputStream.read();
        this.f11883h = read;
        if (read >= 0) {
            mo11645a();
            return;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public final boolean mo11645a() {
        if (!this.f11884i && this.f11885j && this.f11882g == 0 && this.f11883h == 0) {
            this.f11884i = true;
            mo11658a(true);
        }
        return this.f11884i;
    }

    public int read() {
        if (mo11645a()) {
            return -1;
        }
        int read = this.f11897e.read();
        if (read >= 0) {
            int i = this.f11882g;
            this.f11882g = this.f11883h;
            this.f11883h = read;
            return i;
        }
        throw new EOFException();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f11885j || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f11884i) {
            return -1;
        }
        int read = this.f11897e.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.f11882g;
            bArr[i + 1] = (byte) this.f11883h;
            this.f11882g = this.f11897e.read();
            int read2 = this.f11897e.read();
            this.f11883h = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
