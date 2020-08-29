package p425x.p426a.p434b.p435c;

import p119o.p120a.C0967p0;

/* renamed from: x.a.b.c.d */
public class C5013d extends C5010a {

    /* renamed from: n */
    public static final int[] f11924n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    public int f11925d;

    /* renamed from: e */
    public int f11926e;

    /* renamed from: f */
    public int f11927f;

    /* renamed from: g */
    public int f11928g;

    /* renamed from: h */
    public int f11929h;

    /* renamed from: i */
    public int f11930i;

    /* renamed from: j */
    public int f11931j;

    /* renamed from: k */
    public int f11932k;

    /* renamed from: l */
    public int[] f11933l = new int[64];

    /* renamed from: m */
    public int f11934m;

    public C5013d() {
        mo11669d();
    }

    /* renamed from: a */
    public int mo11659a() {
        return 28;
    }

    /* renamed from: a */
    public final int mo11681a(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: a */
    public final int mo11682a(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: a */
    public int mo11660a(byte[] bArr, int i) {
        mo11666b();
        C0967p0.m2233b(this.f11925d, bArr, i);
        C0967p0.m2233b(this.f11926e, bArr, i + 4);
        C0967p0.m2233b(this.f11927f, bArr, i + 8);
        C0967p0.m2233b(this.f11928g, bArr, i + 12);
        C0967p0.m2233b(this.f11929h, bArr, i + 16);
        C0967p0.m2233b(this.f11930i, bArr, i + 20);
        C0967p0.m2233b(this.f11931j, bArr, i + 24);
        mo11669d();
        return 28;
    }

    /* renamed from: a */
    public void mo11665a(long j) {
        if (this.f11934m > 14) {
            mo11668c();
        }
        int[] iArr = this.f11933l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: b */
    public final int mo11683b(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: b */
    public final int mo11684b(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    /* renamed from: b */
    public void mo11667b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f11933l;
        int i5 = this.f11934m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f11934m = i6;
        if (i6 == 16) {
            mo11668c();
        }
    }

    /* renamed from: c */
    public void mo11668c() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f11933l;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int i5 = this.f11925d;
        int i6 = this.f11926e;
        int i7 = this.f11927f;
        int i8 = this.f11928g;
        int i9 = this.f11929h;
        int i10 = this.f11930i;
        int i11 = this.f11931j;
        int i12 = this.f11932k;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 8) {
            int a = mo11682a(i9, i10, i11) + mo11683b(i9) + f11924n[i14] + this.f11933l[i14] + i12;
            int i15 = i8 + a;
            int b = mo11684b(i5, i6, i7) + mo11681a(i5) + a;
            int i16 = i14 + 1;
            int a2 = mo11682a(i15, i9, i10) + mo11683b(i15) + f11924n[i16] + this.f11933l[i16] + i11;
            int i17 = i7 + a2;
            int b2 = mo11684b(b, i5, i6) + mo11681a(b) + a2;
            int i18 = i16 + 1;
            int a3 = mo11682a(i17, i15, i9) + mo11683b(i17) + f11924n[i18] + this.f11933l[i18] + i10;
            int i19 = i6 + a3;
            int b3 = mo11684b(b2, b, i5) + mo11681a(b2) + a3;
            int i20 = i18 + 1;
            int a4 = mo11682a(i19, i17, i15) + mo11683b(i19) + f11924n[i20] + this.f11933l[i20] + i9;
            int i21 = i5 + a4;
            int b4 = mo11684b(b3, b2, b) + mo11681a(b3) + a4;
            int i22 = i20 + 1;
            int a5 = mo11682a(i21, i19, i17) + mo11683b(i21) + f11924n[i22] + this.f11933l[i22] + i15;
            int i23 = b + a5;
            int b5 = mo11684b(b4, b3, b2) + mo11681a(b4) + a5;
            int i24 = i22 + 1;
            int a6 = mo11682a(i23, i21, i19) + mo11683b(i23) + f11924n[i24] + this.f11933l[i24] + i17;
            int i25 = b2 + a6;
            int b6 = mo11684b(b5, b4, b3) + mo11681a(b5) + a6;
            int i26 = i24 + 1;
            int a7 = mo11682a(i25, i23, i21) + mo11683b(i25) + f11924n[i26] + this.f11933l[i26] + i19;
            int i27 = b3 + a7;
            int b7 = mo11684b(b6, b5, b4) + mo11681a(b6) + a7;
            int i28 = i26 + 1;
            int a8 = mo11682a(i27, i25, i23) + mo11683b(i27) + f11924n[i28] + this.f11933l[i28] + i21;
            int i29 = b4 + a8;
            i14 = i28 + 1;
            i13++;
            int i30 = b5;
            i9 = i29;
            i5 = mo11684b(b7, b6, b5) + mo11681a(b7) + a8;
            i10 = i27;
            i6 = b7;
            i11 = i25;
            i7 = b6;
            i12 = i23;
            i8 = i30;
        }
        this.f11925d += i5;
        this.f11926e += i6;
        this.f11927f += i7;
        this.f11928g += i8;
        this.f11929h += i9;
        this.f11930i += i10;
        this.f11931j += i11;
        this.f11932k += i12;
        this.f11934m = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            this.f11933l[i31] = 0;
        }
    }

    /* renamed from: d */
    public void mo11669d() {
        super.mo11669d();
        this.f11925d = -1056596264;
        this.f11926e = 914150663;
        this.f11927f = 812702999;
        this.f11928g = -150054599;
        this.f11929h = -4191439;
        this.f11930i = 1750603025;
        this.f11931j = 1694076839;
        this.f11932k = -1090891868;
        this.f11934m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f11933l;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public String getAlgorithmName() {
        return "SHA-224";
    }
}
