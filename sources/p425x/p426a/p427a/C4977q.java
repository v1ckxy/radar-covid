package p425x.p426a.p427a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

/* renamed from: x.a.a.q */
public class C4977q {

    /* renamed from: a */
    public OutputStream f11861a;

    public C4977q(OutputStream outputStream) {
        this.f11861a = outputStream;
    }

    /* renamed from: a */
    public static C4977q m11301a(OutputStream outputStream, String str) {
        return str.equals("DER") ? new C4919a1(outputStream) : str.equals("DL") ? new C4973o1(outputStream) : new C4977q(outputStream);
    }

    /* renamed from: a */
    public C4919a1 mo11554a() {
        return new C4919a1(this.f11861a);
    }

    /* renamed from: a */
    public final void mo11617a(Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            mo11555a(((C4929d) enumeration.nextElement()).mo11569f(), true);
        }
    }

    /* renamed from: a */
    public void mo11618a(C4929d dVar) {
        if (dVar != null) {
            mo11555a(dVar.mo11569f(), true);
            return;
        }
        throw new IOException("null object detected");
    }

    /* renamed from: a */
    public void mo11555a(C4983s sVar, boolean z) {
        sVar.mo11548a(this, z);
    }

    /* renamed from: a */
    public final void mo11619a(boolean z, int i, byte b, byte[] bArr) {
        if (z) {
            this.f11861a.write(i);
        }
        mo11616a(bArr.length + 1);
        this.f11861a.write(b);
        this.f11861a.write(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public C4977q mo11556b() {
        return new C4973o1(this.f11861a);
    }

    /* renamed from: a */
    public final void mo11621a(boolean z, int i, int i2, byte[] bArr) {
        mo11620a(z, i, i2);
        mo11616a(bArr.length);
        this.f11861a.write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final void mo11622a(boolean z, int i, byte[] bArr) {
        if (z) {
            this.f11861a.write(i);
        }
        mo11616a(bArr.length);
        this.f11861a.write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final void mo11623a(boolean z, int i, C4929d[] dVarArr) {
        if (z) {
            this.f11861a.write(i);
        }
        this.f11861a.write(128);
        for (C4929d f : dVarArr) {
            mo11555a(f.mo11569f(), true);
        }
        this.f11861a.write(0);
        this.f11861a.write(0);
    }

    /* renamed from: a */
    public final void mo11616a(int i) {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            this.f11861a.write((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                this.f11861a.write((byte) (i >> i4));
            }
            return;
        }
        this.f11861a.write((byte) i);
    }

    /* renamed from: a */
    public final void mo11620a(boolean z, int i, int i2) {
        if (z) {
            if (i2 < 31) {
                this.f11861a.write(i | i2);
            } else {
                this.f11861a.write(31 | i);
                if (i2 < 128) {
                    this.f11861a.write(i2);
                } else {
                    byte[] bArr = new byte[5];
                    int i3 = 4;
                    bArr[4] = (byte) (i2 & 127);
                    do {
                        i2 >>= 7;
                        i3--;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                    } while (i2 > 127);
                    this.f11861a.write(bArr, i3, 5 - i3);
                }
            }
        }
    }
}
