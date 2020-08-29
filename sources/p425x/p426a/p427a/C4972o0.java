package p425x.p426a.p427a;

import java.util.Arrays;

/* renamed from: x.a.a.o0 */
public class C4972o0 extends C4983s {

    /* renamed from: e */
    public final char[] f11859e;

    public C4972o0(char[] cArr) {
        if (cArr != null) {
            this.f11859e = cArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4972o0)) {
            return false;
        }
        return Arrays.equals(this.f11859e, ((C4972o0) sVar).f11859e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return (this.f11859e.length * 2) + C4924b2.m11131a(this.f11859e.length * 2) + 1;
    }

    public int hashCode() {
        char[] cArr = this.f11859e;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    public String toString() {
        return new String(this.f11859e);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        int length = this.f11859e.length;
        if (z) {
            qVar.f11861a.write(30);
        }
        qVar.mo11616a(length * 2);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.f11859e;
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> 8);
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> 8);
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> 8);
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> 8);
            bArr[7] = (byte) c4;
            qVar.f11861a.write(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = this.f11859e[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> 8);
                i3 = i4 + 1;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            qVar.f11861a.write(bArr, 0, i3);
        }
    }
}
