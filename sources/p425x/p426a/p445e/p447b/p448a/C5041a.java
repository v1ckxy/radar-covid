package p425x.p426a.p445e.p447b.p448a;

import java.io.ByteArrayOutputStream;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.e.b.a.a */
public class C5041a {

    /* renamed from: a */
    public final ByteArrayOutputStream f12047a = new ByteArrayOutputStream();

    /* renamed from: a */
    public C5041a mo11701a(int i) {
        this.f12047a.write((byte) (i >>> 24));
        this.f12047a.write((byte) (i >>> 16));
        this.f12047a.write((byte) (i >>> 8));
        this.f12047a.write((byte) i);
        return this;
    }

    /* renamed from: a */
    public C5041a mo11702a(C5162c cVar) {
        try {
            this.f12047a.write(cVar.getEncoded());
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public C5041a mo11703a(byte[] bArr) {
        try {
            this.f12047a.write(bArr);
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public byte[] mo11704a() {
        return this.f12047a.toByteArray();
    }
}
