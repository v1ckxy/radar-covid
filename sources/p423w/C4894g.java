package p423w;

import java.io.OutputStream;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.g */
public final class C4894g extends OutputStream {

    /* renamed from: e */
    public final /* synthetic */ C4892f f11663e;

    public C4894g(C4892f fVar) {
        this.f11663e = fVar;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11663e);
        sb.append(".outputStream()");
        return sb.toString();
    }

    public void write(int i) {
        this.f11663e.writeByte(i);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f11663e.write(bArr, i, i2);
        } else {
            C4638h.m10271a("data");
            throw null;
        }
    }
}
