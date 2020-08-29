package p425x.p426a.p434b.p435c;

import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.b.c.c */
public class C5012c extends C5010a {

    /* renamed from: d */
    public int f11917d;

    /* renamed from: e */
    public int f11918e;

    /* renamed from: f */
    public int f11919f;

    /* renamed from: g */
    public int f11920g;

    /* renamed from: h */
    public int f11921h;

    /* renamed from: i */
    public int[] f11922i = new int[80];

    /* renamed from: j */
    public int f11923j;

    public C5012c() {
        mo11669d();
    }

    /* renamed from: a */
    public int mo11659a() {
        return 20;
    }

    /* renamed from: a */
    public final int mo11679a(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: a */
    public int mo11660a(byte[] bArr, int i) {
        mo11666b();
        C0967p0.m2233b(this.f11917d, bArr, i);
        C0967p0.m2233b(this.f11918e, bArr, i + 4);
        C0967p0.m2233b(this.f11919f, bArr, i + 8);
        C0967p0.m2233b(this.f11920g, bArr, i + 12);
        C0967p0.m2233b(this.f11921h, bArr, i + 16);
        mo11669d();
        return 20;
    }

    /* renamed from: a */
    public void mo11665a(long j) {
        if (this.f11923j > 14) {
            mo11668c();
        }
        int[] iArr = this.f11922i;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    /* renamed from: b */
    public final int mo11680b(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    /* renamed from: b */
    public void mo11667b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f11922i;
        int i5 = this.f11923j;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f11923j = i6;
        if (i6 == 16) {
            mo11668c();
        }
    }

    /* renamed from: c */
    public void mo11668c() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f11922i;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.f11917d;
        int i4 = this.f11918e;
        int i5 = this.f11919f;
        int i6 = this.f11920g;
        int i7 = this.f11921h;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int i10 = i9 + 1;
            int a = C1965a.m4742a(mo11679a(i4, i5, i6) + ((i3 << 5) | (i3 >>> 27)), this.f11922i[i9], 1518500249, i7);
            int i11 = (i4 >>> 2) | (i4 << 30);
            int i12 = i10 + 1;
            int a2 = C1965a.m4742a(mo11679a(i3, i11, i5) + ((a << 5) | (a >>> 27)), this.f11922i[i10], 1518500249, i6);
            int i13 = (i3 >>> 2) | (i3 << 30);
            int i14 = i12 + 1;
            int a3 = C1965a.m4742a(mo11679a(a, i13, i11) + ((a2 << 5) | (a2 >>> 27)), this.f11922i[i12], 1518500249, i5);
            i7 = (a >>> 2) | (a << 30);
            int i15 = i14 + 1;
            i4 = C1965a.m4742a(mo11679a(a2, i7, i13) + ((a3 << 5) | (a3 >>> 27)), this.f11922i[i14], 1518500249, i11);
            i6 = (a2 >>> 2) | (a2 << 30);
            int i16 = i15 + 1;
            i3 = C1965a.m4742a(mo11679a(a3, i6, i7) + ((i4 << 5) | (i4 >>> 27)), this.f11922i[i15], 1518500249, i13);
            i5 = (a3 >>> 2) | (a3 << 30);
            i8++;
            i9 = i16;
        }
        int i17 = 0;
        while (i17 < 4) {
            int i18 = ((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6);
            int[] iArr2 = this.f11922i;
            int i19 = i9 + 1;
            int a4 = C1965a.m4742a(i18, iArr2[i9], 1859775393, i7);
            int i20 = (i4 >>> 2) | (i4 << 30);
            int i21 = i19 + 1;
            int a5 = C1965a.m4742a(((a4 << 5) | (a4 >>> 27)) + ((i3 ^ i20) ^ i5), iArr2[i19], 1859775393, i6);
            int i22 = (i3 >>> 2) | (i3 << 30);
            int i23 = i21 + 1;
            int a6 = C1965a.m4742a(((a5 << 5) | (a5 >>> 27)) + ((a4 ^ i22) ^ i20), iArr2[i21], 1859775393, i5);
            i7 = (a4 >>> 2) | (a4 << 30);
            int i24 = i23 + 1;
            i4 = C1965a.m4742a(((a6 << 5) | (a6 >>> 27)) + ((a5 ^ i7) ^ i22), iArr2[i23], 1859775393, i20);
            i6 = (a5 >>> 2) | (a5 << 30);
            int i25 = i24 + 1;
            i3 = C1965a.m4742a(((i4 << 5) | (i4 >>> 27)) + ((a6 ^ i6) ^ i7), iArr2[i24], 1859775393, i22);
            i5 = (a6 >>> 2) | (a6 << 30);
            i17++;
            i9 = i25;
        }
        int i26 = 0;
        while (i26 < 4) {
            int i27 = i9 + 1;
            int a7 = C1965a.m4742a(mo11680b(i4, i5, i6) + ((i3 << 5) | (i3 >>> 27)), this.f11922i[i9], -1894007588, i7);
            int i28 = (i4 >>> 2) | (i4 << 30);
            int i29 = i27 + 1;
            int a8 = C1965a.m4742a(mo11680b(i3, i28, i5) + ((a7 << 5) | (a7 >>> 27)), this.f11922i[i27], -1894007588, i6);
            int i30 = (i3 >>> 2) | (i3 << 30);
            int i31 = i29 + 1;
            int a9 = C1965a.m4742a(mo11680b(a7, i30, i28) + ((a8 << 5) | (a8 >>> 27)), this.f11922i[i29], -1894007588, i5);
            i7 = (a7 >>> 2) | (a7 << 30);
            int i32 = i31 + 1;
            i4 = C1965a.m4742a(mo11680b(a8, i7, i30) + ((a9 << 5) | (a9 >>> 27)), this.f11922i[i31], -1894007588, i28);
            i6 = (a8 >>> 2) | (a8 << 30);
            int i33 = i32 + 1;
            i3 = C1965a.m4742a(mo11680b(a9, i6, i7) + ((i4 << 5) | (i4 >>> 27)), this.f11922i[i32], -1894007588, i30);
            i5 = (a9 >>> 2) | (a9 << 30);
            i26++;
            i9 = i33;
        }
        int i34 = 0;
        while (i34 <= 3) {
            int i35 = ((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6);
            int[] iArr3 = this.f11922i;
            int i36 = i9 + 1;
            int a10 = C1965a.m4742a(i35, iArr3[i9], -899497514, i7);
            int i37 = (i4 >>> 2) | (i4 << 30);
            int i38 = i36 + 1;
            int a11 = C1965a.m4742a(((a10 << 5) | (a10 >>> 27)) + ((i3 ^ i37) ^ i5), iArr3[i36], -899497514, i6);
            int i39 = (i3 >>> 2) | (i3 << 30);
            int i40 = i38 + 1;
            int a12 = C1965a.m4742a(((a11 << 5) | (a11 >>> 27)) + ((a10 ^ i39) ^ i37), iArr3[i38], -899497514, i5);
            i7 = (a10 >>> 2) | (a10 << 30);
            int i41 = i40 + 1;
            i4 = C1965a.m4742a(((a12 << 5) | (a12 >>> 27)) + ((a11 ^ i7) ^ i39), iArr3[i40], -899497514, i37);
            i6 = (a11 >>> 2) | (a11 << 30);
            int i42 = i41 + 1;
            i3 = C1965a.m4742a(((i4 << 5) | (i4 >>> 27)) + ((a12 ^ i6) ^ i7), iArr3[i41], -899497514, i39);
            i5 = (a12 >>> 2) | (a12 << 30);
            i34++;
            i9 = i42;
        }
        this.f11917d += i3;
        this.f11918e += i4;
        this.f11919f += i5;
        this.f11920g += i6;
        this.f11921h += i7;
        this.f11923j = 0;
        for (int i43 = 0; i43 < 16; i43++) {
            this.f11922i[i43] = 0;
        }
    }

    /* renamed from: d */
    public void mo11669d() {
        super.mo11669d();
        this.f11917d = 1732584193;
        this.f11918e = -271733879;
        this.f11919f = -1732584194;
        this.f11920g = 271733878;
        this.f11921h = -1009589776;
        this.f11923j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f11922i;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public String getAlgorithmName() {
        return "SHA-1";
    }
}
