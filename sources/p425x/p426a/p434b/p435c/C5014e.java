package p425x.p426a.p434b.p435c;

import p119o.p120a.C0967p0;

/* renamed from: x.a.b.c.e */
public class C5014e extends C5010a {

    /* renamed from: n */
    public static final int[] f11935n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    public int f11936d;

    /* renamed from: e */
    public int f11937e;

    /* renamed from: f */
    public int f11938f;

    /* renamed from: g */
    public int f11939g;

    /* renamed from: h */
    public int f11940h;

    /* renamed from: i */
    public int f11941i;

    /* renamed from: j */
    public int f11942j;

    /* renamed from: k */
    public int f11943k;

    /* renamed from: l */
    public int[] f11944l = new int[64];

    /* renamed from: m */
    public int f11945m;

    public C5014e() {
        mo11669d();
    }

    /* renamed from: a */
    public static int m11452a(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: a */
    public static int m11453a(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: b */
    public static int m11454b(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: b */
    public static int m11455b(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    /* renamed from: a */
    public int mo11659a() {
        return 32;
    }

    /* renamed from: a */
    public int mo11660a(byte[] bArr, int i) {
        mo11666b();
        C0967p0.m2233b(this.f11936d, bArr, i);
        C0967p0.m2233b(this.f11937e, bArr, i + 4);
        C0967p0.m2233b(this.f11938f, bArr, i + 8);
        C0967p0.m2233b(this.f11939g, bArr, i + 12);
        C0967p0.m2233b(this.f11940h, bArr, i + 16);
        C0967p0.m2233b(this.f11941i, bArr, i + 20);
        C0967p0.m2233b(this.f11942j, bArr, i + 24);
        C0967p0.m2233b(this.f11943k, bArr, i + 28);
        mo11669d();
        return 32;
    }

    /* renamed from: a */
    public void mo11665a(long j) {
        if (this.f11945m > 14) {
            mo11668c();
        }
        int[] iArr = this.f11944l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: b */
    public void mo11667b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f11944l;
        int i5 = this.f11945m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f11945m = i6;
        if (i6 == 16) {
            mo11668c();
        }
    }

    /* renamed from: c */
    public void mo11668c() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f11944l;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int i5 = this.f11936d;
        int i6 = this.f11937e;
        int i7 = this.f11938f;
        int i8 = this.f11939g;
        int i9 = this.f11940h;
        int i10 = this.f11941i;
        int i11 = this.f11942j;
        int i12 = this.f11943k;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 8) {
            int a = m11453a(i9, i10, i11) + m11454b(i9) + f11935n[i14] + this.f11944l[i14] + i12;
            int i15 = i8 + a;
            int b = m11455b(i5, i6, i7) + m11452a(i5) + a;
            int i16 = i14 + 1;
            int a2 = m11453a(i15, i9, i10) + m11454b(i15) + f11935n[i16] + this.f11944l[i16] + i11;
            int i17 = i7 + a2;
            int b2 = m11455b(b, i5, i6) + m11452a(b) + a2;
            int i18 = i16 + 1;
            int a3 = m11453a(i17, i15, i9) + m11454b(i17) + f11935n[i18] + this.f11944l[i18] + i10;
            int i19 = i6 + a3;
            int b3 = m11455b(b2, b, i5) + m11452a(b2) + a3;
            int i20 = i18 + 1;
            int a4 = m11453a(i19, i17, i15) + m11454b(i19) + f11935n[i20] + this.f11944l[i20] + i9;
            int i21 = i5 + a4;
            int b4 = m11455b(b3, b2, b) + m11452a(b3) + a4;
            int i22 = i20 + 1;
            int a5 = m11453a(i21, i19, i17) + m11454b(i21) + f11935n[i22] + this.f11944l[i22] + i15;
            int i23 = b + a5;
            int b5 = m11455b(b4, b3, b2) + m11452a(b4) + a5;
            int i24 = i22 + 1;
            int a6 = m11453a(i23, i21, i19) + m11454b(i23) + f11935n[i24] + this.f11944l[i24] + i17;
            int i25 = b2 + a6;
            int b6 = m11455b(b5, b4, b3) + m11452a(b5) + a6;
            int i26 = i24 + 1;
            int a7 = m11453a(i25, i23, i21) + m11454b(i25) + f11935n[i26] + this.f11944l[i26] + i19;
            int i27 = b3 + a7;
            int b7 = m11455b(b6, b5, b4) + m11452a(b6) + a7;
            int i28 = i26 + 1;
            int a8 = m11453a(i27, i25, i23) + m11454b(i27) + f11935n[i28] + this.f11944l[i28] + i21;
            int i29 = b4 + a8;
            i14 = i28 + 1;
            i13++;
            int i30 = b5;
            i9 = i29;
            i5 = m11455b(b7, b6, b5) + m11452a(b7) + a8;
            i10 = i27;
            i6 = b7;
            i11 = i25;
            i7 = b6;
            i12 = i23;
            i8 = i30;
        }
        this.f11936d += i5;
        this.f11937e += i6;
        this.f11938f += i7;
        this.f11939g += i8;
        this.f11940h += i9;
        this.f11941i += i10;
        this.f11942j += i11;
        this.f11943k += i12;
        this.f11945m = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            this.f11944l[i31] = 0;
        }
    }

    /* renamed from: d */
    public void mo11669d() {
        super.mo11669d();
        this.f11936d = 1779033703;
        this.f11937e = -1150833019;
        this.f11938f = 1013904242;
        this.f11939g = -1521486534;
        this.f11940h = 1359893119;
        this.f11941i = -1694144372;
        this.f11942j = 528734635;
        this.f11943k = 1541459225;
        this.f11945m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f11944l;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public String getAlgorithmName() {
        return "SHA-256";
    }
}
