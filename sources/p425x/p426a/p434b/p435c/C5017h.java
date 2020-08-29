package p425x.p426a.p434b.p435c;

import java.util.Arrays;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p434b.C5008a;
import p425x.p426a.p434b.C5009b;

/* renamed from: x.a.b.c.h */
public class C5017h implements C5009b, C5008a {

    /* renamed from: g */
    public static long[] f11946g = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* renamed from: a */
    public long[] f11947a;

    /* renamed from: b */
    public byte[] f11948b;

    /* renamed from: c */
    public int f11949c;

    /* renamed from: d */
    public int f11950d;

    /* renamed from: e */
    public int f11951e;

    /* renamed from: f */
    public boolean f11952f;

    public C5017h(int i) {
        if (i == 128 || i == 256) {
            this.f11947a = new long[25];
            this.f11948b = new byte[192];
            mo11685a(i);
            return;
        }
        throw new IllegalArgumentException(C1965a.m4762b("'bitLength' ", i, " not supported for SHAKE"));
    }

    /* renamed from: a */
    public int mo11660a(byte[] bArr, int i) {
        int i2 = this.f11951e / 8;
        mo11664b(bArr, i, i2);
        return i2;
    }

    /* renamed from: b */
    public final void mo11688b(byte[] bArr, int i) {
        int i2 = this.f11949c >> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.f11947a;
            jArr[i3] = jArr[i3] ^ C0967p0.m2249d(bArr, i);
            i += 8;
        }
        mo11689c();
    }

    /* renamed from: c */
    public final void mo11689c() {
        long[] jArr = this.f11947a;
        int i = 0;
        long j = jArr[0];
        boolean z = true;
        long j2 = jArr[1];
        long j3 = jArr[2];
        char c = 3;
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        long j15 = jArr[14];
        long j16 = jArr[15];
        long j17 = jArr[16];
        long j18 = jArr[17];
        long j19 = jArr[18];
        long j20 = jArr[19];
        long j21 = jArr[20];
        long j22 = jArr[21];
        long j23 = jArr[22];
        long j24 = jArr[23];
        int i2 = 24;
        long j25 = jArr[24];
        while (i < i2) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 << (z ? 1 : 0)) | (j27 >>> -1)) ^ j30;
            long j32 = ((j28 << z) | (j28 >>> -1)) ^ j26;
            long j33 = ((j29 << z) | (j29 >>> -1)) ^ j27;
            long j34 = ((j30 << z) | (j30 >>> -1)) ^ j28;
            long j35 = ((j26 << z) | (j26 >>> -1)) ^ j29;
            long j36 = j ^ j31;
            long j37 = j6 ^ j31;
            long j38 = j11 ^ j31;
            long j39 = j16 ^ j31;
            long j40 = j21 ^ j31;
            long j41 = j2 ^ j32;
            long j42 = j7 ^ j32;
            long j43 = j12 ^ j32;
            long j44 = j17 ^ j32;
            long j45 = j22 ^ j32;
            long j46 = j3 ^ j33;
            long j47 = j8 ^ j33;
            long j48 = j13 ^ j33;
            long j49 = j18 ^ j33;
            long j50 = j23 ^ j33;
            long j51 = j4 ^ j34;
            long j52 = j9 ^ j34;
            long j53 = j14 ^ j34;
            long j54 = j19 ^ j34;
            long j55 = j24 ^ j34;
            long j56 = j10 ^ j35;
            long j57 = j15 ^ j35;
            long j58 = j20 ^ j35;
            long j59 = j25 ^ j35;
            long j60 = (j41 << z) | (j41 >>> 63);
            long j61 = (j42 << 44) | (j42 >>> 20);
            long j62 = j5 ^ j35;
            long j63 = (j56 << 20) | (j56 >>> 44);
            long j64 = j50 << 61;
            long j65 = j50 >>> c;
            long j66 = j51;
            long j67 = j64 | j65;
            long j68 = j57 << 39;
            long j69 = j57 >>> 25;
            long j70 = (j48 << 43) | (j48 >>> 21);
            long j71 = (j46 << 62) | (j46 >>> 2);
            long j72 = (j53 << 25) | (j53 >>> 39);
            long j73 = j58 << 8;
            long j74 = j58 >>> 56;
            long j75 = j68 | j69;
            long j76 = j73 | j74;
            long j77 = (j40 << 18) | (j40 >>> 46);
            long j78 = j39 << 41;
            long j79 = j39 >>> 23;
            long j80 = (j55 << 56) | (j55 >>> 8);
            long j81 = j78 | j79;
            long j82 = j59 << 14;
            long j83 = j59 >>> 50;
            long j84 = (j62 << 27) | (j62 >>> 37);
            long j85 = j82 | j83;
            long j86 = j45 << 2;
            long j87 = j45 >>> 62;
            long j88 = j76;
            long j89 = j86 | j87;
            long j90 = (j52 << 55) | (j52 >>> 9);
            long j91 = j44 << 45;
            long j92 = j44 >>> 19;
            long j93 = j90;
            long j94 = j91 | j92;
            long j95 = j72;
            long j96 = (j37 << 36) | (j37 >>> 28);
            long j97 = j67;
            long j98 = (j54 << 21) | (j54 >>> 43);
            long j99 = j49 << 15;
            long j100 = j49 >>> 49;
            long j101 = j94;
            long j102 = j99 | j100;
            long j103 = j43 << 10;
            long j104 = j43 >>> 54;
            long j105 = j102;
            long j106 = j103 | j104;
            long j107 = j47 << 6;
            long j108 = j47 >>> 58;
            long j109 = j106;
            long j110 = j107 | j108;
            long j111 = j38 << 3;
            long j112 = j38 >>> 61;
            long j113 = j110;
            long j114 = j111 | j112;
            long j115 = (j66 << 28) | (j66 >>> 36);
            long j116 = ((~j61) & j70) ^ j36;
            long j117 = ((~j70) & j98) ^ j61;
            j3 = ((~j98) & j85) ^ j70;
            long j118 = ((~j85) & j36) ^ j98;
            long j119 = ((~j36) & j61) ^ j85;
            long j120 = j63;
            long j121 = ((~j120) & j114) ^ j115;
            long j122 = ((~j114) & j101) ^ j120;
            long j123 = j118;
            long j124 = j101;
            long j125 = j119;
            long j126 = ((~j124) & j97) ^ j114;
            long j127 = j97;
            long j128 = j126;
            long j129 = ((~j115) & j120) ^ j127;
            long j130 = j113;
            j11 = j60 ^ ((~j130) & j95);
            long j131 = j124 ^ ((~j127) & j115);
            long j132 = j95;
            long j133 = ((~j132) & j88) ^ j130;
            long j134 = j88;
            long j135 = j129;
            long j136 = ((~j134) & j77) ^ j132;
            long j137 = j77;
            long j138 = j136;
            long j139 = j134 ^ ((~j137) & j60);
            long j140 = ((~j60) & j130) ^ j137;
            long j141 = j96;
            long j142 = j84 ^ ((~j141) & j109);
            long j143 = j139;
            long j144 = j109;
            long j145 = j140;
            long j146 = ((~j144) & j105) ^ j141;
            long j147 = j105;
            long j148 = j121;
            long j149 = j80;
            long j150 = j144 ^ ((~j147) & j80);
            long j151 = ((~j149) & j84) ^ j147;
            long j152 = ((~j84) & j141) ^ j149;
            long j153 = j93;
            long j154 = j71 ^ ((~j153) & j75);
            long j155 = j151;
            long j156 = j75;
            j20 = j152;
            long j157 = ((~j156) & j81) ^ j153;
            long j158 = j81;
            long j159 = j154;
            long j160 = j89;
            long j161 = j156 ^ ((~j158) & j89);
            long j162 = ((~j160) & j71) ^ j158;
            long j163 = ((~j71) & j153) ^ j160;
            long j164 = j116 ^ f11946g[i];
            i++;
            j6 = j148;
            j13 = j138;
            j12 = j133;
            j21 = j159;
            j24 = j162;
            j14 = j143;
            jArr = jArr;
            j9 = j131;
            j5 = j125;
            j18 = j150;
            j16 = j142;
            i2 = 24;
            long j165 = j164;
            z = true;
            j2 = j117;
            j19 = j155;
            j17 = j146;
            j23 = j161;
            j10 = j135;
            j22 = j157;
            j25 = j163;
            j = j165;
            long j166 = j122;
            c = 3;
            j4 = j123;
            j15 = j145;
            j8 = j128;
            j7 = j166;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j;
        jArr2[1] = j2;
        jArr2[2] = j3;
        jArr2[3] = j4;
        jArr2[4] = j5;
        jArr2[5] = j6;
        jArr2[6] = j7;
        jArr2[7] = j8;
        jArr2[8] = j9;
        jArr2[9] = j10;
        jArr2[10] = j11;
        jArr2[11] = j12;
        jArr2[12] = j13;
        jArr2[13] = j14;
        jArr2[14] = j15;
        jArr2[15] = j16;
        jArr2[16] = j17;
        jArr2[17] = j18;
        jArr2[18] = j19;
        jArr2[19] = j20;
        jArr2[20] = j21;
        jArr2[21] = j22;
        jArr2[22] = j23;
        jArr2[23] = j24;
        jArr2[24] = j25;
    }

    /* renamed from: d */
    public final void mo11691d() {
        byte[] bArr = this.f11948b;
        int i = this.f11950d;
        int i2 = i >> 3;
        bArr[i2] = (byte) (bArr[i2] | ((byte) ((int) (1 << (i & 7)))));
        int i3 = i + 1;
        this.f11950d = i3;
        if (i3 == this.f11949c) {
            mo11688b(bArr, 0);
            this.f11950d = 0;
        }
        int i4 = this.f11950d;
        int i5 = i4 >> 6;
        int i6 = i4 & 63;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            long[] jArr = this.f11947a;
            jArr[i8] = jArr[i8] ^ C0967p0.m2249d(this.f11948b, i7);
            i7 += 8;
        }
        if (i6 > 0) {
            long j = (1 << i6) - 1;
            long[] jArr2 = this.f11947a;
            jArr2[i5] = jArr2[i5] ^ (C0967p0.m2249d(this.f11948b, i7) & j);
        }
        long[] jArr3 = this.f11947a;
        int i9 = (this.f11949c - 1) >> 6;
        jArr3[i9] = jArr3[i9] ^ Long.MIN_VALUE;
        mo11689c();
        mo11686b();
        this.f11950d = this.f11949c;
        this.f11952f = true;
    }

    public String getAlgorithmName() {
        StringBuilder a = C1965a.m4756a("SHAKE");
        a.append(this.f11951e);
        return a.toString();
    }

    /* renamed from: b */
    public final void mo11686b() {
        long[] jArr = this.f11947a;
        int i = this.f11949c >> 6;
        byte[] bArr = this.f11948b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j = jArr[0 + i3];
            C0967p0.m2244c((int) (4294967295L & j), bArr, i2);
            C0967p0.m2244c((int) (j >>> 32), bArr, i2 + 4);
            i2 += 8;
        }
    }

    /* renamed from: c */
    public void mo11690c(byte[] bArr, int i, int i2) {
        int i3 = this.f11950d;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        } else if (!this.f11952f) {
            int i4 = i3 >> 3;
            int i5 = this.f11949c >> 3;
            int i6 = 0;
            while (i6 < i2) {
                if (i4 == 0) {
                    int i7 = i2 - i5;
                    if (i6 <= i7) {
                        do {
                            mo11688b(bArr, i + i6);
                            i6 += i5;
                        } while (i6 <= i7);
                    }
                }
                int min = Math.min(i5 - i4, i2 - i6);
                System.arraycopy(bArr, i + i6, this.f11948b, i4, min);
                i4 += min;
                i6 += min;
                if (i4 == i5) {
                    mo11688b(this.f11948b, 0);
                    i4 = 0;
                }
            }
            this.f11950d = i4 << 3;
        } else {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    /* renamed from: a */
    public int mo11659a() {
        return this.f11951e / 8;
    }

    /* renamed from: a */
    public final void mo11685a(int i) {
        if (i == 128 || i == 224 || i == 256 || i == 288 || i == 384 || i == 512) {
            mo11687b(1600 - (i << 1));
            return;
        }
        throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
    }

    /* renamed from: a */
    public void mo11661a(byte b) {
        mo11690c(new byte[]{b}, 0, 1);
    }

    /* renamed from: b */
    public int mo11664b(byte[] bArr, int i, int i2) {
        boolean z = this.f11952f;
        if (!z) {
            int i3 = this.f11950d;
            if (i3 % 8 != 0) {
                throw new IllegalStateException("attempt to absorb with odd length queue");
            } else if (!z) {
                this.f11948b[i3 >> 3] = (byte) 15;
                this.f11950d = i3 + 4;
            } else {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
        }
        long j = ((long) i2) * 8;
        if (!this.f11952f) {
            mo11691d();
        }
        long j2 = 0;
        if (j % 8 == 0) {
            while (j2 < j) {
                if (this.f11950d == 0) {
                    mo11689c();
                    mo11686b();
                    this.f11950d = this.f11949c;
                }
                int min = (int) Math.min((long) this.f11950d, j - j2);
                System.arraycopy(this.f11948b, (this.f11949c - this.f11950d) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
                this.f11950d -= min;
                j2 += (long) min;
            }
            mo11685a(this.f11951e);
            return i2;
        }
        throw new IllegalStateException("outputLength not a multiple of 8");
    }

    /* renamed from: a */
    public void mo11662a(byte[] bArr, int i, int i2) {
        mo11690c(bArr, i, i2);
    }

    /* renamed from: b */
    public final void mo11687b(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f11949c = i;
        int i2 = 0;
        while (true) {
            long[] jArr = this.f11947a;
            if (i2 < jArr.length) {
                jArr[i2] = 0;
                i2++;
            } else {
                Arrays.fill(this.f11948b, 0);
                this.f11950d = 0;
                this.f11952f = false;
                this.f11951e = (1600 - i) / 2;
                return;
            }
        }
    }
}
