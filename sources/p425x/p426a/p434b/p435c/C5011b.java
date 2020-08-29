package p425x.p426a.p434b.p435c;

import p119o.p120a.C0967p0;
import p425x.p426a.p434b.C5008a;

/* renamed from: x.a.b.c.b */
public abstract class C5011b implements C5008a {

    /* renamed from: o */
    public static final long[] f11902o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: a */
    public byte[] f11903a = new byte[8];

    /* renamed from: b */
    public int f11904b = 0;

    /* renamed from: c */
    public long f11905c;

    /* renamed from: d */
    public long f11906d;

    /* renamed from: e */
    public long f11907e;

    /* renamed from: f */
    public long f11908f;

    /* renamed from: g */
    public long f11909g;

    /* renamed from: h */
    public long f11910h;

    /* renamed from: i */
    public long f11911i;

    /* renamed from: j */
    public long f11912j;

    /* renamed from: k */
    public long f11913k;

    /* renamed from: l */
    public long f11914l;

    /* renamed from: m */
    public long[] f11915m = new long[80];

    /* renamed from: n */
    public int f11916n;

    public C5011b() {
        mo11678e();
    }

    /* renamed from: a */
    public final long mo11670a(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    /* renamed from: a */
    public final long mo11671a(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    /* renamed from: a */
    public void mo11661a(byte b) {
        byte[] bArr = this.f11903a;
        int i = this.f11904b;
        int i2 = i + 1;
        this.f11904b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            mo11675b(bArr, 0);
            this.f11904b = 0;
        }
        this.f11905c++;
    }

    /* renamed from: a */
    public void mo11662a(byte[] bArr, int i, int i2) {
        while (this.f11904b != 0 && i2 > 0) {
            mo11661a(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f11903a.length) {
            mo11675b(bArr, i);
            byte[] bArr2 = this.f11903a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f11905c += (long) bArr2.length;
        }
        while (i2 > 0) {
            mo11661a(bArr[i]);
            i++;
            i2--;
        }
    }

    /* renamed from: b */
    public final long mo11672b(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    /* renamed from: b */
    public final long mo11673b(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    /* renamed from: b */
    public final void mo11674b() {
        long j = this.f11905c;
        if (j > 2305843009213693951L) {
            this.f11906d += j >>> 61;
            this.f11905c = j & 2305843009213693951L;
        }
    }

    /* renamed from: b */
    public void mo11675b(byte[] bArr, int i) {
        long[] jArr = this.f11915m;
        int i2 = this.f11916n;
        int b = C0967p0.m2225b(bArr, i);
        jArr[i2] = (((long) C0967p0.m2225b(bArr, i + 4)) & 4294967295L) | ((((long) b) & 4294967295L) << 32);
        int i3 = this.f11916n + 1;
        this.f11916n = i3;
        if (i3 == 16) {
            mo11677d();
        }
    }

    /* renamed from: c */
    public void mo11676c() {
        mo11674b();
        long j = this.f11905c << 3;
        long j2 = this.f11906d;
        byte b = Byte.MIN_VALUE;
        while (true) {
            mo11661a(b);
            if (this.f11904b == 0) {
                break;
            }
            b = 0;
        }
        if (this.f11916n > 14) {
            mo11677d();
        }
        long[] jArr = this.f11915m;
        jArr[14] = j2;
        jArr[15] = j;
        mo11677d();
    }

    /* renamed from: d */
    public void mo11677d() {
        mo11674b();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f11915m;
            long j = jArr[i - 2];
            long j2 = ((j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)))) + jArr[i - 7];
            long j3 = jArr[i - 15];
            jArr[i] = j2 + ((j3 >>> 7) ^ (((j3 << 63) | (j3 >>> 1)) ^ ((j3 << 56) | (j3 >>> 8)))) + jArr[i - 16];
        }
        long j4 = this.f11907e;
        long j5 = this.f11908f;
        long j6 = this.f11909g;
        long j7 = this.f11910h;
        long j8 = this.f11911i;
        long j9 = this.f11912j;
        long j10 = j7;
        long j11 = this.f11913k;
        long j12 = j4;
        long j13 = j9;
        long j14 = j10;
        int i2 = 0;
        long j15 = j5;
        long j16 = j6;
        long j17 = j8;
        int i3 = 0;
        long j18 = this.f11914l;
        long j19 = j11;
        long j20 = j12;
        long j21 = j19;
        while (i3 < 10) {
            int i4 = i3;
            long j22 = j17;
            int i5 = i2 + 1;
            long b = mo11672b(j17) + mo11671a(j17, j13, j21) + f11902o[i2] + this.f11915m[i2] + j18;
            long j23 = j14 + b;
            long a = mo11670a(j20) + mo11673b(j20, j15, j16) + b;
            long j24 = j23;
            long j25 = a;
            int i6 = i5 + 1;
            long b2 = mo11672b(j23) + mo11671a(j23, j22, j13) + f11902o[i5] + this.f11915m[i5] + j21;
            long j26 = j20;
            long j27 = j20;
            long j28 = j16 + b2;
            long a2 = mo11670a(j25) + mo11673b(j25, j26, j15) + b2;
            long b3 = mo11672b(j28);
            long j29 = j28;
            long j30 = a2;
            int i7 = i6 + 1;
            long a3 = b3 + mo11671a(j28, j24, j22) + f11902o[i6] + this.f11915m[i6] + j13;
            long j31 = j15 + a3;
            long j32 = j31;
            long a4 = mo11670a(j30) + mo11673b(j30, j25, j27) + a3;
            int i8 = i7 + 1;
            long b4 = mo11672b(j31) + mo11671a(j31, j29, j24) + f11902o[i7] + this.f11915m[i7] + j22;
            long j33 = j30;
            long j34 = j30;
            long j35 = j27 + b4;
            long a5 = mo11670a(a4) + mo11673b(a4, j33, j25) + b4;
            long b5 = mo11672b(j35);
            long j36 = j35;
            long j37 = a5;
            int i9 = i8 + 1;
            long a6 = b5 + mo11671a(j35, j32, j29) + f11902o[i8] + this.f11915m[i8] + j24;
            long j38 = j25 + a6;
            long a7 = mo11670a(j37) + mo11673b(j37, a4, j34) + a6;
            int i10 = i9 + 1;
            long b6 = mo11672b(j38) + mo11671a(j38, j36, j32) + f11902o[i9] + this.f11915m[i9] + j29;
            long j39 = j37;
            long j40 = j37;
            long j41 = j34 + b6;
            long a8 = mo11670a(a7) + mo11673b(a7, j39, a4) + b6;
            long j42 = j38;
            long j43 = j38;
            long j44 = a8;
            int i11 = i10 + 1;
            long b7 = mo11672b(j41) + mo11671a(j41, j42, j36) + f11902o[i10] + this.f11915m[i10] + j32;
            long j45 = a4 + b7;
            long j46 = j41;
            long j47 = j41;
            long a9 = mo11670a(j44) + mo11673b(j44, a7, j40) + b7;
            long b8 = mo11672b(j45) + mo11671a(j45, j46, j43) + f11902o[i11] + this.f11915m[i11] + j36;
            long j48 = j40 + b8;
            long a10 = mo11670a(a9) + mo11673b(a9, j44, a7) + b8;
            i3 = i4 + 1;
            j16 = j44;
            i2 = i11 + 1;
            j17 = j48;
            long j49 = j43;
            j21 = j47;
            j13 = j45;
            j14 = a7;
            j18 = j49;
            j15 = a9;
            j20 = a10;
        }
        long j50 = j17;
        this.f11907e += j20;
        this.f11908f += j15;
        this.f11909g += j16;
        this.f11910h += j14;
        this.f11911i += j50;
        this.f11912j += j13;
        this.f11913k += j21;
        this.f11914l += j18;
        this.f11916n = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            this.f11915m[i12] = 0;
        }
    }

    /* renamed from: e */
    public void mo11678e() {
        this.f11905c = 0;
        this.f11906d = 0;
        int i = 0;
        this.f11904b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f11903a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f11916n = 0;
        while (true) {
            long[] jArr = this.f11915m;
            if (i != jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }
}
