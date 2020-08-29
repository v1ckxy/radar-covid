package p425x.p426a.p427a;

import java.io.IOException;
import java.util.Arrays;
import p119o.p120a.C0967p0;

/* renamed from: x.a.a.h1 */
public class C4949h1 extends C4983s {

    /* renamed from: f */
    public static final char[] f11829f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e */
    public final byte[] f11830e;

    public C4949h1(byte[] bArr) {
        this.f11830e = C0967p0.m2217a(bArr);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 28, this.f11830e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4949h1)) {
            return false;
        }
        return Arrays.equals(this.f11830e, ((C4949h1) sVar).f11830e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11830e.length) + 1 + this.f11830e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11830e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                stringBuffer.append(f11829f[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(f11829f[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new C4980r("internal error encoding UniversalString");
        }
    }
}
