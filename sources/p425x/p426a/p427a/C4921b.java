package p425x.p426a.p427a;

import java.io.IOException;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.b */
public abstract class C4921b extends C4983s {

    /* renamed from: g */
    public static final char[] f11720g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e */
    public final byte[] f11721e;

    /* renamed from: f */
    public final int f11722f;

    public C4921b(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f11721e = C0967p0.m2217a(bArr);
            this.f11722f = i;
        }
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        boolean z = false;
        if (!(sVar instanceof C4921b)) {
            return false;
        }
        C4921b bVar = (C4921b) sVar;
        if (this.f11722f != bVar.f11722f) {
            return false;
        }
        byte[] bArr = this.f11721e;
        byte[] bArr2 = bVar.f11721e;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i = length - 1;
        if (i < 0) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        byte b = bArr[i];
        int i3 = this.f11722f;
        if (((byte) (b & (255 << i3))) == ((byte) (bArr2[i] & (255 << i3)))) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        byte[] bArr = this.f11721e;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b = (byte) (bArr[length] & (255 << this.f11722f));
        int i = 0;
        if (bArr != null) {
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ bArr[0 + length];
            }
            i = i2;
        }
        return ((i * 257) ^ b) ^ this.f11722f;
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return new C4975p0(this.f11721e, this.f11722f);
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return new C4963l1(this.f11721e, this.f11722f);
    }

    /* renamed from: m */
    public byte[] mo11560m() {
        byte[] bArr = this.f11721e;
        int i = this.f11722f;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] a = C0967p0.m2217a(bArr);
        int length = bArr.length - 1;
        a[length] = (byte) ((255 << i) & a[length]);
        return a;
    }

    /* renamed from: o */
    public byte[] mo11561o() {
        if (this.f11722f == 0) {
            return C0967p0.m2217a(this.f11721e);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                stringBuffer.append(f11720g[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(f11720g[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder a = C1965a.m4756a("Internal error encoding BitString: ");
            a.append(e.getMessage());
            throw new C4980r(a.toString(), e);
        }
    }
}
