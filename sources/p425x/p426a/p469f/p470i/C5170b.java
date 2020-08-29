package p425x.p426a.p469f.p470i;

import java.io.ByteArrayOutputStream;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p469f.C5167h;

/* renamed from: x.a.f.i.b */
public class C5170b {

    /* renamed from: a */
    public static final C5171c f12356a = new C5171c();

    /* renamed from: a */
    public static byte[] m11604a(byte[] bArr) {
        return m11605a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static byte[] m11605a(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C5171c cVar = f12356a;
            if (cVar != null) {
                for (int i3 = i; i3 < i + i2; i3++) {
                    byte b = bArr[i3] & 255;
                    byteArrayOutputStream.write(cVar.f12357a[b >>> 4]);
                    byteArrayOutputStream.write(cVar.f12357a[b & 15]);
                }
                return byteArrayOutputStream.toByteArray();
            }
            throw null;
        } catch (Exception e) {
            StringBuilder a = C1965a.m4756a("exception encoding Hex string: ");
            a.append(e.getMessage());
            throw new C5169a(a.toString(), e);
        }
    }

    /* renamed from: b */
    public static String m11606b(byte[] bArr) {
        return C5167h.m11600a(m11605a(bArr, 0, bArr.length));
    }
}
