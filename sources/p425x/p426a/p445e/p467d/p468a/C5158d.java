package p425x.p426a.p445e.p467d.p468a;

import p116io.jsonwebtoken.lang.Objects;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.e.d.a.d */
public class C5158d {

    /* renamed from: a */
    public int[] f12344a;

    public C5158d(byte[] bArr) {
        String str = "invalid encoding";
        if (bArr.length > 4) {
            boolean z = false;
            int a = C0967p0.m2173a(bArr, 0);
            int a2 = C5157c.m11588a(a - 1);
            if (bArr.length == (a * a2) + 4) {
                this.f12344a = new int[a];
                for (int i = 0; i < a; i++) {
                    int[] iArr = this.f12344a;
                    int i2 = (i * a2) + 4;
                    int i3 = 0;
                    for (int i4 = a2 - 1; i4 >= 0; i4--) {
                        i3 |= (bArr[i2 + i4] & 255) << (i4 * 8);
                    }
                    iArr[i] = i3;
                }
                int[] iArr2 = this.f12344a;
                int length = iArr2.length;
                boolean[] zArr = new boolean[length];
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (iArr2[i5] < 0 || iArr2[i5] >= length || zArr[iArr2[i5]]) {
                            break;
                        }
                        zArr[iArr2[i5]] = true;
                        i5++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException(str);
                }
                return;
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public byte[] mo11909a() {
        int length = this.f12344a.length;
        int a = C5157c.m11588a(length - 1);
        byte[] bArr = new byte[((length * a) + 4)];
        C0967p0.m2196a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            int i2 = this.f12344a[i];
            int i3 = (i * a) + 4;
            for (int i4 = a - 1; i4 >= 0; i4--) {
                bArr[i3 + i4] = (byte) (i2 >>> (i4 * 8));
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5158d)) {
            return false;
        }
        return C0967p0.m2211a(this.f12344a, ((C5158d) obj).f12344a);
    }

    public int hashCode() {
        return C0967p0.m2226b(this.f12344a);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("[");
        a.append(this.f12344a[0]);
        String sb = a.toString();
        for (int i = 1; i < this.f12344a.length; i++) {
            StringBuilder b = C1965a.m4763b(sb, Objects.ARRAY_ELEMENT_SEPARATOR);
            b.append(this.f12344a[i]);
            sb = b.toString();
        }
        return C1965a.m4751a(sb, "]");
    }
}
