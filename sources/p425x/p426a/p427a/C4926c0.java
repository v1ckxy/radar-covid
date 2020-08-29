package p425x.p426a.p427a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: x.a.a.c0 */
public class C4926c0 extends C4917a {
    public C4926c0(int i, C4933e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 != eVar.f11772b) {
            try {
                byteArrayOutputStream.write(((C4964m) eVar.mo11572a(i2)).mo11599a("BER"));
                i2++;
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("malformed object: ");
                sb.append(e);
                throw new C4980r(sb.toString(), e);
            }
        }
        super(true, i, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        int i = this.f11715e ? 96 : 64;
        int i2 = this.f11716f;
        byte[] bArr = this.f11717g;
        qVar.mo11620a(z, i, i2);
        qVar.f11861a.write(128);
        qVar.f11861a.write(bArr, 0, bArr.length);
        qVar.f11861a.write(0);
        qVar.f11861a.write(0);
    }
}
