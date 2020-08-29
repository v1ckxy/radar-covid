package p425x.p426a.p445e.p467d.p468a;

import java.lang.reflect.Array;
import p119o.p120a.C0967p0;

/* renamed from: x.a.e.d.a.a */
public class C5155a {

    /* renamed from: a */
    public int f12338a;

    /* renamed from: b */
    public int f12339b;

    /* renamed from: c */
    public int[][] f12340c;

    /* renamed from: d */
    public int f12341d;

    public C5155a(int i, int[][] iArr) {
        if (iArr[0].length == ((i + 31) >> 5)) {
            this.f12339b = i;
            this.f12338a = iArr.length;
            this.f12341d = iArr[0].length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < this.f12338a; i4++) {
                int[] iArr2 = iArr[i4];
                int i5 = this.f12341d - 1;
                iArr2[i5] = iArr2[i5] & i3;
            }
            this.f12340c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    /* renamed from: a */
    public byte[] mo11898a() {
        int i = (this.f12339b + 7) >>> 3;
        int i2 = this.f12338a;
        int i3 = 8;
        byte[] bArr = new byte[((i * i2) + 8)];
        C0967p0.m2196a(i2, bArr, 0);
        C0967p0.m2196a(this.f12339b, bArr, 4);
        int i4 = this.f12339b;
        int i5 = i4 >>> 5;
        int i6 = i4 & 31;
        for (int i7 = 0; i7 < this.f12338a; i7++) {
            int i8 = 0;
            while (i8 < i5) {
                C0967p0.m2196a(this.f12340c[i7][i8], bArr, i3);
                i8++;
                i3 += 4;
            }
            int i9 = 0;
            while (i9 < i6) {
                int i10 = i3 + 1;
                bArr[i3] = (byte) ((this.f12340c[i7][i5] >>> i9) & 255);
                i9 += 8;
                i3 = i10;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5155a)) {
            return false;
        }
        C5155a aVar = (C5155a) obj;
        if (this.f12338a != aVar.f12338a || this.f12339b != aVar.f12339b || this.f12341d != aVar.f12341d) {
            return false;
        }
        for (int i = 0; i < this.f12338a; i++) {
            if (!C0967p0.m2211a(this.f12340c[i], aVar.f12340c[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((this.f12338a * 31) + this.f12339b) * 31) + this.f12341d;
        for (int i2 = 0; i2 < this.f12338a; i2++) {
            i = (i * 31) + C0967p0.m2226b(this.f12340c[i2]);
        }
        return i;
    }

    public String toString() {
        int i = this.f12339b & 31;
        int i2 = this.f12341d;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.f12338a; i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append(": ");
            stringBuffer.append(sb.toString());
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.f12340c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.f12340c[i3][this.f12341d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }

    public C5155a(C5155a aVar) {
        this.f12339b = aVar.f12339b;
        this.f12338a = aVar.f12338a;
        this.f12341d = aVar.f12341d;
        this.f12340c = new int[aVar.f12340c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.f12340c;
            if (i < iArr.length) {
                iArr[i] = C0967p0.m2219a(aVar.f12340c[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public C5155a(byte[] bArr) {
        String str = "given array is not an encoded matrix over GF(2)";
        if (bArr.length >= 9) {
            this.f12338a = C0967p0.m2173a(bArr, 0);
            int a = C0967p0.m2173a(bArr, 4);
            this.f12339b = a;
            int i = (a + 7) >>> 3;
            int i2 = this.f12338a;
            int i3 = i * i2;
            if (i2 > 0) {
                int i4 = 8;
                if (i3 == bArr.length - 8) {
                    int i5 = (a + 31) >>> 5;
                    this.f12341d = i5;
                    int[] iArr = new int[2];
                    iArr[1] = i5;
                    iArr[0] = i2;
                    this.f12340c = (int[][]) Array.newInstance(int.class, iArr);
                    int i6 = this.f12339b;
                    int i7 = i6 >> 5;
                    int i8 = i6 & 31;
                    for (int i9 = 0; i9 < this.f12338a; i9++) {
                        int i10 = 0;
                        while (i10 < i7) {
                            this.f12340c[i9][i10] = C0967p0.m2173a(bArr, i4);
                            i10++;
                            i4 += 4;
                        }
                        int i11 = 0;
                        while (i11 < i8) {
                            int[] iArr2 = this.f12340c[i9];
                            int i12 = i4 + 1;
                            iArr2[i7] = ((bArr[i4] & 255) << i11) ^ iArr2[i7];
                            i11 += 8;
                            i4 = i12;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException(str);
        }
        throw new ArithmeticException(str);
    }
}
