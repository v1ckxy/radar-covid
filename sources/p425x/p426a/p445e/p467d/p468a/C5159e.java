package p425x.p426a.p445e.p467d.p468a;

import p116io.jsonwebtoken.lang.Objects;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.e.d.a.e */
public class C5159e {

    /* renamed from: a */
    public C5156b f12345a;

    /* renamed from: b */
    public int f12346b;

    /* renamed from: c */
    public int[] f12347c;

    public C5159e(C5156b bVar, int i) {
        this.f12345a = bVar;
        this.f12346b = i;
        int[] iArr = new int[(i + 1)];
        this.f12347c = iArr;
        iArr[i] = 1;
    }

    public C5159e(C5156b bVar, byte[] bArr) {
        this.f12345a = bVar;
        int i = 8;
        int i2 = 1;
        while (bVar.f12342a > i) {
            i2++;
            i += 8;
        }
        String str = " Error: byte array is not encoded polynomial over given finite field GF2m";
        if (bArr.length % i2 == 0) {
            this.f12347c = new int[(bArr.length / i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f12347c;
                if (i3 < iArr.length) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.f12347c;
                        int i6 = i4 + 1;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4 = i6;
                    }
                    if (this.f12345a.mo11905b(this.f12347c[i3])) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    mo11914a();
                    return;
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public C5159e(C5159e eVar) {
        this.f12345a = eVar.f12345a;
        this.f12346b = eVar.f12346b;
        this.f12347c = C0967p0.m2219a(eVar.f12347c);
    }

    /* renamed from: a */
    public static int m11590a(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    /* renamed from: a */
    public int mo11913a(int i) {
        if (i < 0 || i > this.f12346b) {
            return 0;
        }
        return this.f12347c[i];
    }

    /* renamed from: a */
    public final void mo11914a() {
        int length = this.f12347c.length;
        do {
            this.f12346b = length - 1;
            length = this.f12346b;
            if (length < 0) {
                return;
            }
        } while (this.f12347c[length] == 0);
    }

    /* renamed from: a */
    public final int[] mo11916a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return iArr3;
            }
            C5156b bVar = this.f12345a;
            int i = iArr3[length];
            int i2 = iArr[length];
            if (bVar != null) {
                iArr3[length] = i ^ i2;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: b */
    public int mo11917b() {
        int[] iArr = this.f12347c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    /* renamed from: b */
    public void mo11918b(int i) {
        if (this.f12345a.mo11905b(i)) {
            this.f12347c = mo11915a(this.f12347c, i);
            mo11914a();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* renamed from: c */
    public C5159e mo11919c(int i) {
        if (this.f12345a.mo11905b(i)) {
            return new C5159e(this.f12345a, mo11915a(this.f12347c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* renamed from: c */
    public byte[] mo11920c() {
        int i = 8;
        int i2 = 1;
        while (this.f12345a.f12342a > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.f12347c.length * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f12347c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                int i6 = i3 + 1;
                bArr[i3] = (byte) (this.f12347c[i4] >>> i5);
                i5 += 8;
                i3 = i6;
            }
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x003c
            boolean r1 = r8 instanceof p425x.p426a.p445e.p467d.p468a.C5159e
            if (r1 != 0) goto L_0x0008
            goto L_0x003c
        L_0x0008:
            x.a.e.d.a.e r8 = (p425x.p426a.p445e.p467d.p468a.C5159e) r8
            x.a.e.d.a.b r1 = r7.f12345a
            x.a.e.d.a.b r2 = r8.f12345a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            int r1 = r7.f12346b
            int r2 = r8.f12346b
            if (r1 != r2) goto L_0x003c
            int[] r1 = r7.f12347c
            int[] r8 = r8.f12347c
            int r2 = m11590a(r1)
            int r3 = m11590a(r8)
            r4 = 1
            if (r2 == r3) goto L_0x002b
        L_0x0029:
            r8 = r0
            goto L_0x0039
        L_0x002b:
            r3 = r0
        L_0x002c:
            if (r3 > r2) goto L_0x0038
            r5 = r1[r3]
            r6 = r8[r3]
            if (r5 == r6) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0038:
            r8 = r4
        L_0x0039:
            if (r8 == 0) goto L_0x003c
            return r4
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p467d.p468a.C5159e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = this.f12345a.f12343b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f12347c;
            if (i2 >= iArr.length) {
                return i;
            }
            i = (i * 31) + iArr[i2];
            i2++;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb;
        StringBuilder a = C1965a.m4756a(" Polynomial over ");
        a.append(this.f12345a.toString());
        a.append(": \n");
        String sb2 = a.toString();
        for (int i = 0; i < this.f12347c.length; i++) {
            StringBuilder a2 = C1965a.m4756a(sb2);
            C5156b bVar = this.f12345a;
            int i2 = this.f12347c[i];
            String str2 = Objects.EMPTY_STRING;
            for (int i3 = 0; i3 < bVar.f12342a; i3++) {
                if ((((byte) i2) & 1) == 0) {
                    sb = new StringBuilder();
                    str = "0";
                } else {
                    sb = new StringBuilder();
                    str = "1";
                }
                str2 = C1965a.m4754a(sb, str, str2);
                i2 >>>= 1;
            }
            a2.append(str2);
            a2.append("Y^");
            a2.append(i);
            a2.append("+");
            sb2 = a2.toString();
        }
        return C1965a.m4751a(sb2, ";");
    }

    /* renamed from: a */
    public final int[] mo11915a(int[] iArr, int i) {
        int a = m11590a(iArr);
        if (a == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        int[] iArr3 = new int[(a + 1)];
        while (a >= 0) {
            iArr3[a] = this.f12345a.mo11903a(iArr[a], i);
            a--;
        }
        return iArr3;
    }

    public C5159e(C5156b bVar, int[] iArr) {
        int[] iArr2;
        this.f12345a = bVar;
        int a = m11590a(iArr);
        if (a == -1) {
            iArr2 = new int[1];
        } else {
            int i = a + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.f12347c = iArr2;
        mo11914a();
    }
}
