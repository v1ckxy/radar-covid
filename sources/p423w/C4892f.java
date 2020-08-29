package p423w;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p116io.jsonwebtoken.lang.Objects;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4674a;
import p423w.p424c0.C4889a;

/* renamed from: w.f */
public final class C4892f implements C4896i, C4895h, Cloneable, ByteChannel {

    /* renamed from: g */
    public static final byte[] f11659g;

    /* renamed from: e */
    public C4912v f11660e;

    /* renamed from: f */
    public long f11661f;

    /* renamed from: w.f$a */
    public static final class C4893a extends InputStream {

        /* renamed from: e */
        public final /* synthetic */ C4892f f11662e;

        public C4893a(C4892f fVar) {
            this.f11662e = fVar;
        }

        public int available() {
            return (int) Math.min(this.f11662e.f11661f, (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            C4892f fVar = this.f11662e;
            if (fVar.f11661f > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f11662e);
            sb.append(".inputStream()");
            return sb.toString();
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr != null) {
                return this.f11662e.read(bArr, i, i2);
            }
            C4638h.m10271a("sink");
            throw null;
        }
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C4674a.f10859a);
        C4638h.m10270a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        f11659g = bytes;
    }

    /* renamed from: a */
    public C4892f mo11439a(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C4912v a = mo11444a(numberOfTrailingZeros);
        byte[] bArr = a.f11701a;
        int i = a.f11703c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f11659g[(int) (15 & j)];
            j >>>= 4;
        }
        a.f11703c += numberOfTrailingZeros;
        this.f11661f += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: a */
    public final C4892f mo11442a(C4892f fVar, long j, long j2) {
        if (fVar != null) {
            C0967p0.m2197a(this.f11661f, j, j2);
            if (j2 == 0) {
                return this;
            }
            fVar.f11661f += j2;
            C4912v vVar = this.f11660e;
            while (vVar != null) {
                int i = vVar.f11703c;
                int i2 = vVar.f11702b;
                if (j >= ((long) (i - i2))) {
                    j -= (long) (i - i2);
                    vVar = vVar.f11706f;
                } else {
                    while (j2 > 0) {
                        if (vVar != null) {
                            C4912v b = vVar.mo11544b();
                            int i3 = b.f11702b + ((int) j);
                            b.f11702b = i3;
                            b.f11703c = Math.min(i3 + ((int) j2), b.f11703c);
                            C4912v vVar2 = fVar.f11660e;
                            if (vVar2 == null) {
                                b.f11707g = b;
                                b.f11706f = b;
                                fVar.f11660e = b;
                            } else if (vVar2 != null) {
                                C4912v vVar3 = vVar2.f11707g;
                                if (vVar3 != null) {
                                    vVar3.mo11542a(b);
                                } else {
                                    C4638h.m10269a();
                                    throw null;
                                }
                            } else {
                                C4638h.m10269a();
                                throw null;
                            }
                            j2 -= (long) (b.f11703c - b.f11702b);
                            vVar = vVar.f11706f;
                            j = 0;
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    }
                    return this;
                }
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("out");
        throw null;
    }

    /* renamed from: a */
    public final C4912v mo11444a(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C4912v vVar = this.f11660e;
            if (vVar == null) {
                C4912v a = C4913w.m11090a();
                this.f11660e = a;
                a.f11707g = a;
                a.f11706f = a;
                return a;
            } else if (vVar != null) {
                C4912v vVar2 = vVar.f11707g;
                if (vVar2 != null) {
                    if (vVar2.f11703c + i > 8192 || !vVar2.f11705e) {
                        C4912v a2 = C4913w.m11090a();
                        vVar2.mo11542a(a2);
                        vVar2 = a2;
                    }
                    return vVar2;
                }
                C4638h.m10269a();
                throw null;
            } else {
                C4638h.m10269a();
                throw null;
            }
        } else {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
    }

    /* renamed from: b */
    public long mo11077b(C4892f fVar, long j) {
        if (fVar != null) {
            if (j >= 0) {
                long j2 = this.f11661f;
                if (j2 == 0) {
                    return -1;
                }
                if (j > j2) {
                    j = j2;
                }
                fVar.mo11105a(this, j);
                return j;
            }
            throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j).toString());
        }
        C4638h.m10271a("sink");
        throw null;
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return C4886b0.f11649d;
    }

    /* renamed from: b */
    public C4892f mo11445b(int i) {
        long j;
        long j2;
        if (i < 128) {
            writeByte(i);
        } else {
            if (i < 2048) {
                C4912v a = mo11444a(2);
                byte[] bArr = a.f11701a;
                int i2 = a.f11703c;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                a.f11703c = i2 + 2;
                j2 = this.f11661f;
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                writeByte(63);
            } else if (i < 65536) {
                C4912v a2 = mo11444a(3);
                byte[] bArr2 = a2.f11701a;
                int i3 = a2.f11703c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                a2.f11703c = i3 + 3;
                j2 = this.f11661f;
                j = 3;
            } else if (i <= 1114111) {
                C4912v a3 = mo11444a(4);
                byte[] bArr3 = a3.f11701a;
                int i4 = a3.f11703c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                a3.f11703c = i4 + 4;
                j2 = this.f11661f;
                j = 4;
            } else {
                StringBuilder a4 = C1965a.m4756a("Unexpected code point: ");
                a4.append(Integer.toHexString(i));
                throw new IllegalArgumentException(a4.toString());
            }
            this.f11661f = j2 + j;
        }
        return this;
    }

    /* renamed from: b */
    public C4897j mo11446b(long j) {
        return new C4897j(mo11452e(j));
    }

    /* renamed from: c */
    public boolean mo11447c(long j) {
        return this.f11661f >= j;
    }

    public C4892f clone() {
        C4892f fVar = new C4892f();
        if (this.f11661f == 0) {
            return fVar;
        }
        C4912v vVar = this.f11660e;
        if (vVar != null) {
            C4912v b = vVar.mo11544b();
            fVar.f11660e = b;
            if (b != null) {
                b.f11707g = b;
                if (b == null) {
                    C4638h.m10269a();
                    throw null;
                } else if (b != null) {
                    b.f11706f = b;
                    C4912v vVar2 = this.f11660e;
                    if (vVar2 != null) {
                        while (true) {
                            vVar2 = vVar2.f11706f;
                            if (vVar2 != this.f11660e) {
                                C4912v vVar3 = fVar.f11660e;
                                if (vVar3 != null) {
                                    C4912v vVar4 = vVar3.f11707g;
                                    if (vVar4 == null) {
                                        C4638h.m10269a();
                                        throw null;
                                    } else if (vVar2 != null) {
                                        vVar4.mo11542a(vVar2.mo11544b());
                                    } else {
                                        C4638h.m10269a();
                                        throw null;
                                    }
                                } else {
                                    C4638h.m10269a();
                                    throw null;
                                }
                            } else {
                                fVar.f11661f = this.f11661f;
                                return fVar;
                            }
                        }
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        } else {
            C4638h.m10269a();
            throw null;
        }
    }

    public void close() {
    }

    /* renamed from: d */
    public final byte mo11449d(long j) {
        C0967p0.m2197a(this.f11661f, j, 1);
        C4912v vVar = this.f11660e;
        if (vVar != null) {
            long j2 = this.f11661f;
            if (j2 - j < j) {
                while (j2 > j) {
                    vVar = vVar.f11707g;
                    if (vVar != null) {
                        j2 -= (long) (vVar.f11703c - vVar.f11702b);
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                return vVar.f11701a[(int) ((((long) vVar.f11702b) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = vVar.f11703c;
                int i2 = vVar.f11702b;
                long j4 = ((long) (i - i2)) + j3;
                if (j4 > j) {
                    return vVar.f11701a[(int) ((((long) i2) + j) - j3)];
                }
                vVar = vVar.f11706f;
                if (vVar != null) {
                    j3 = j4;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
        } else {
            C4638h.m10269a();
            throw null;
        }
    }

    /* renamed from: d */
    public String mo11450d() {
        return mo11454f(RecyclerView.FOREVER_NS);
    }

    /* renamed from: e */
    public byte[] mo11451e() {
        return mo11452e(this.f11661f);
    }

    /* renamed from: e */
    public byte[] mo11452e(long j) {
        int i = 0;
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(C1965a.m4748a("byteCount: ", j).toString());
        } else if (this.f11661f >= j) {
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read = read(bArr, i, i2 - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof C4892f)) {
            return false;
        }
        long j = this.f11661f;
        C4892f fVar = (C4892f) obj2;
        if (j != fVar.f11661f) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C4912v vVar = this.f11660e;
        if (vVar != null) {
            C4912v vVar2 = fVar.f11660e;
            if (vVar2 != null) {
                int i = vVar.f11702b;
                int i2 = vVar2.f11702b;
                long j3 = 0;
                while (j3 < this.f11661f) {
                    long min = (long) Math.min(vVar.f11703c - i, vVar2.f11703c - i2);
                    long j4 = j2;
                    while (j4 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (vVar.f11701a[i] != vVar2.f11701a[i2]) {
                            return false;
                        }
                        j4++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == vVar.f11703c) {
                        vVar = vVar.f11706f;
                        if (vVar != null) {
                            i = vVar.f11702b;
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    }
                    if (i2 == vVar2.f11703c) {
                        vVar2 = vVar2.f11706f;
                        if (vVar2 != null) {
                            i2 = vVar2.f11702b;
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    }
                    j3 += min;
                    j2 = 0;
                }
                return true;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: f */
    public String mo11454f(long j) {
        if (j >= 0) {
            long j2 = RecyclerView.FOREVER_NS;
            if (j != RecyclerView.FOREVER_NS) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long a = mo11434a(b, 0, j2);
            if (a != -1) {
                return mo11455g(a);
            }
            if (j2 < this.f11661f && mo11449d(j2 - 1) == ((byte) 13) && mo11449d(j2) == b) {
                return mo11455g(j2);
            }
            C4892f fVar = new C4892f();
            mo11442a(fVar, 0, Math.min((long) 32, this.f11661f));
            StringBuilder a2 = C1965a.m4756a("\\n not found: limit=");
            a2.append(Math.min(this.f11661f, j));
            a2.append(" content=");
            a2.append(C4889a.m10949d(fVar.mo11464m()));
            a2.append(8230);
            throw new EOFException(a2.toString());
        }
        throw new IllegalArgumentException(C1965a.m4748a("limit < 0: ", j).toString());
    }

    public void flush() {
    }

    /* renamed from: g */
    public final String mo11455g(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (mo11449d(j2) == ((byte) 13)) {
                String a = mo11437a(j2, C4674a.f10859a);
                skip(2);
                return a;
            }
        }
        String a2 = mo11437a(j, C4674a.f10859a);
        skip(1);
        return a2;
    }

    public C4892f getBuffer() {
        return this;
    }

    /* renamed from: h */
    public void mo11457h(long j) {
        if (this.f11661f < j) {
            throw new EOFException();
        }
    }

    public int hashCode() {
        C4912v vVar = this.f11660e;
        if (vVar == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = vVar.f11702b; i2 < vVar.f11703c; i2++) {
                i = (i * 31) + vVar.f11701a[i2];
            }
            vVar = vVar.f11706f;
            if (vVar == null) {
                C4638h.m10269a();
                throw null;
            }
        } while (vVar != this.f11660e);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ee A[LOOP:0: B:69:0x00ea->B:71:0x00ee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fe  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p423w.C4892f mo11459i(long r13) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000c
            r13 = 48
            r12.writeByte(r13)
            return r12
        L_0x000c:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L_0x001c
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001b
            java.lang.String r13 = "-9223372036854775808"
            r12.mo11440a(r13)
            return r12
        L_0x001b:
            r3 = r4
        L_0x001c:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 10
            if (r2 >= 0) goto L_0x0066
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0048
            r6 = 100
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003c
            r6 = 10
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0039
            goto L_0x00dd
        L_0x0039:
            r4 = 2
            goto L_0x00dd
        L_0x003c:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0044
            r2 = 3
            goto L_0x0045
        L_0x0044:
            r2 = 4
        L_0x0045:
            r4 = r2
            goto L_0x00dd
        L_0x0048:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005a
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0058
            r2 = 5
            goto L_0x0045
        L_0x0058:
            r2 = 6
            goto L_0x0045
        L_0x005a:
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0063
            r2 = 7
            goto L_0x0045
        L_0x0063:
            r2 = 8
            goto L_0x0045
        L_0x0066:
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0093
            r6 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0084
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0082
            r4 = 9
            goto L_0x00dd
        L_0x0082:
            r4 = r5
            goto L_0x00dd
        L_0x0084:
            r6 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0090
            r2 = 11
            goto L_0x0045
        L_0x0090:
            r2 = 12
            goto L_0x0045
        L_0x0093:
            r6 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b7
            r6 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a8
            r4 = 13
            goto L_0x00dd
        L_0x00a8:
            r6 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b4
            r2 = 14
            goto L_0x0045
        L_0x00b4:
            r2 = 15
            goto L_0x0045
        L_0x00b7:
            r6 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00cf
            r6 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00cc
            r4 = 16
            goto L_0x00dd
        L_0x00cc:
            r4 = 17
            goto L_0x00dd
        L_0x00cf:
            r6 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00db
            r4 = 18
            goto L_0x00dd
        L_0x00db:
            r4 = 19
        L_0x00dd:
            if (r3 == 0) goto L_0x00e1
            int r4 = r4 + 1
        L_0x00e1:
            w.v r2 = r12.mo11444a(r4)
            byte[] r6 = r2.f11701a
            int r7 = r2.f11703c
            int r7 = r7 + r4
        L_0x00ea:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00fc
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + -1
            byte[] r11 = f11659g
            byte r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto L_0x00ea
        L_0x00fc:
            if (r3 == 0) goto L_0x0105
            int r7 = r7 + -1
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L_0x0105:
            int r13 = r2.f11703c
            int r13 = r13 + r4
            r2.f11703c = r13
            long r13 = r12.f11661f
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.f11661f = r13
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p423w.C4892f.mo11459i(long):w.f");
    }

    /* renamed from: i */
    public boolean mo11460i() {
        return this.f11661f == 0;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: k */
    public final long mo11462k() {
        long j = this.f11661f;
        if (j == 0) {
            return 0;
        }
        C4912v vVar = this.f11660e;
        if (vVar != null) {
            C4912v vVar2 = vVar.f11707g;
            if (vVar2 != null) {
                int i = vVar2.f11703c;
                if (i < 8192 && vVar2.f11705e) {
                    j -= (long) (i - vVar2.f11702b);
                }
                return j;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: l */
    public C4895h mo11463l() {
        return this;
    }

    /* renamed from: m */
    public C4897j mo11464m() {
        return new C4897j(mo11451e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r5 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r2 = p213q.p214a.p215a.p216a.C1965a.m4756a("Number too large: ");
        r2.append(r0.mo11470r());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo11465n() {
        /*
            r15 = this;
            long r0 = r15.f11661f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b3
            r0 = -7
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x000d:
            w.v r7 = r15.f11660e
            if (r7 == 0) goto L_0x00ae
            byte[] r8 = r7.f11701a
            int r9 = r7.f11702b
            int r10 = r7.f11703c
        L_0x0017:
            if (r9 >= r10) goto L_0x008f
            byte r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L_0x0064
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L_0x0064
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x003d
            if (r13 != 0) goto L_0x0037
            long r13 = (long) r12
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            r13 = 10
            long r2 = r2 * r13
            long r11 = (long) r12
            long r2 = r2 + r11
            goto L_0x006f
        L_0x003d:
            w.f r0 = new w.f
            r0.<init>()
            r0.mo11459i(r2)
            r0.writeByte(r11)
            if (r5 != 0) goto L_0x004d
            r0.readByte()
        L_0x004d:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            java.lang.String r0 = r0.mo11470r()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0064:
            r12 = 45
            byte r12 = (byte) r12
            if (r11 != r12) goto L_0x0074
            if (r4 != 0) goto L_0x0074
            r11 = 1
            long r0 = r0 - r11
            r5 = 1
        L_0x006f:
            int r9 = r9 + 1
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0074:
            if (r4 == 0) goto L_0x0078
            r6 = 1
            goto L_0x008f
        L_0x0078:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008f:
            if (r9 != r10) goto L_0x009b
            w.v r8 = r7.mo11541a()
            r15.f11660e = r8
            p423w.C4913w.m11091a(r7)
            goto L_0x009d
        L_0x009b:
            r7.f11702b = r9
        L_0x009d:
            if (r6 != 0) goto L_0x00a3
            w.v r7 = r15.f11660e
            if (r7 != 0) goto L_0x000d
        L_0x00a3:
            long r0 = r15.f11661f
            long r6 = (long) r4
            long r0 = r0 - r6
            r15.f11661f = r0
            if (r5 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            long r2 = -r2
        L_0x00ad:
            return r2
        L_0x00ae:
            p392u.p401r.p403c.C4638h.m10269a()
            r0 = 0
            throw r0
        L_0x00b3:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p423w.C4892f.mo11465n():long");
    }

    /* renamed from: o */
    public short mo11466o() {
        short readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r8 != r9) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r14.f11660e = r6.mo11541a();
        p423w.C4913w.m11091a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r6.f11702b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (r1 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0075 A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo11467p() {
        /*
            r14 = this;
            long r0 = r14.f11661f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00ac
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            w.v r6 = r14.f11660e
            if (r6 == 0) goto L_0x00a7
            byte[] r7 = r6.f11701a
            int r8 = r6.f11702b
            int r9 = r6.f11703c
        L_0x0015:
            if (r8 >= r9) goto L_0x008c
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0026
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0026
            int r11 = r10 - r11
            goto L_0x003f
        L_0x0026:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0031
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0031
            goto L_0x003b
        L_0x0031:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0071
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0071
        L_0x003b:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x003f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0015
        L_0x004f:
            w.f r0 = new w.f
            r0.<init>()
            r0.mo11439a(r4)
            r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            java.lang.String r0 = r0.mo11470r()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0071:
            if (r0 == 0) goto L_0x0075
            r1 = 1
            goto L_0x008c
        L_0x0075:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008c:
            if (r8 != r9) goto L_0x0098
            w.v r7 = r6.mo11541a()
            r14.f11660e = r7
            p423w.C4913w.m11091a(r6)
            goto L_0x009a
        L_0x0098:
            r6.f11702b = r8
        L_0x009a:
            if (r1 != 0) goto L_0x00a0
            w.v r6 = r14.f11660e
            if (r6 != 0) goto L_0x000b
        L_0x00a0:
            long r1 = r14.f11661f
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f11661f = r1
            return r4
        L_0x00a7:
            p392u.p401r.p403c.C4638h.m10269a()
            r0 = 0
            throw r0
        L_0x00ac:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p423w.C4892f.mo11467p():long");
    }

    public C4896i peek() {
        return C0967p0.m2183a((C4882a0) new C4908s(this));
    }

    /* renamed from: q */
    public InputStream mo11469q() {
        return new C4893a(this);
    }

    /* renamed from: r */
    public String mo11470r() {
        return mo11437a(this.f11661f, C4674a.f10859a);
    }

    public int read(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            C4912v vVar = this.f11660e;
            if (vVar == null) {
                return -1;
            }
            int min = Math.min(byteBuffer.remaining(), vVar.f11703c - vVar.f11702b);
            byteBuffer.put(vVar.f11701a, vVar.f11702b, min);
            int i = vVar.f11702b + min;
            vVar.f11702b = i;
            this.f11661f -= (long) min;
            if (i == vVar.f11703c) {
                this.f11660e = vVar.mo11541a();
                C4913w.m11091a(vVar);
            }
            return min;
        }
        C4638h.m10271a("sink");
        throw null;
    }

    public byte readByte() {
        long j = this.f11661f;
        if (j != 0) {
            C4912v vVar = this.f11660e;
            if (vVar != null) {
                int i = vVar.f11702b;
                int i2 = vVar.f11703c;
                int i3 = i + 1;
                byte b = vVar.f11701a[i];
                this.f11661f = j - 1;
                if (i3 == i2) {
                    this.f11660e = vVar.mo11541a();
                    C4913w.m11091a(vVar);
                } else {
                    vVar.f11702b = i3;
                }
                return b;
            }
            C4638h.m10269a();
            throw null;
        }
        throw new EOFException();
    }

    public int readInt() {
        long j = this.f11661f;
        if (j >= 4) {
            C4912v vVar = this.f11660e;
            if (vVar != null) {
                int i = vVar.f11702b;
                int i2 = vVar.f11703c;
                if (((long) (i2 - i)) < 4) {
                    return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
                }
                byte[] bArr = vVar.f11701a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
                int i5 = i4 + 1;
                byte b2 = b | ((bArr[i4] & 255) << 8);
                int i6 = i5 + 1;
                byte b3 = b2 | (bArr[i5] & 255);
                this.f11661f = j - 4;
                if (i6 == i2) {
                    this.f11660e = vVar.mo11541a();
                    C4913w.m11091a(vVar);
                } else {
                    vVar.f11702b = i6;
                }
                return b3;
            }
            C4638h.m10269a();
            throw null;
        }
        throw new EOFException();
    }

    public short readShort() {
        long j = this.f11661f;
        if (j >= 2) {
            C4912v vVar = this.f11660e;
            if (vVar != null) {
                int i = vVar.f11702b;
                int i2 = vVar.f11703c;
                if (i2 - i < 2) {
                    return (short) (((readByte() & 255) << 8) | (readByte() & 255));
                }
                byte[] bArr = vVar.f11701a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
                this.f11661f = j - 2;
                if (i4 == i2) {
                    this.f11660e = vVar.mo11541a();
                    C4913w.m11091a(vVar);
                } else {
                    vVar.f11702b = i4;
                }
                return (short) b;
            }
            C4638h.m10269a();
            throw null;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public int mo11476s() {
        byte b;
        int i;
        byte b2;
        if (this.f11661f != 0) {
            byte d = mo11449d(0);
            int i2 = 1;
            byte b3 = 65533;
            if ((d & 128) == 0) {
                b2 = d & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((d & 224) == 192) {
                b2 = d & 31;
                i = 2;
                b = 128;
            } else if ((d & 240) == 224) {
                b2 = d & 15;
                i = 3;
                b = 2048;
            } else if ((d & 248) == 240) {
                b2 = d & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f11661f >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte d2 = mo11449d(j2);
                    if ((d2 & 192) == 128) {
                        b2 = (b2 << 6) | (d2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 <= 1114111 && ((55296 > b2 || 57343 < b2) && b2 >= b)) {
                    b3 = b2;
                }
                return b3;
            }
            StringBuilder a = C1965a.m4757a("size < ", i, ": ");
            a.append(this.f11661f);
            a.append(" (to read code point prefixed 0x");
            a.append(Integer.toHexString(d));
            a.append(")");
            throw new EOFException(a.toString());
        }
        throw new EOFException();
    }

    public void skip(long j) {
        while (j > 0) {
            C4912v vVar = this.f11660e;
            if (vVar != null) {
                int min = (int) Math.min(j, (long) (vVar.f11703c - vVar.f11702b));
                long j2 = (long) min;
                this.f11661f -= j2;
                j -= j2;
                int i = vVar.f11702b + min;
                vVar.f11702b = i;
                if (i == vVar.f11703c) {
                    this.f11660e = vVar.mo11541a();
                    C4913w.m11091a(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        C4897j jVar;
        int i = 0;
        if (this.f11661f <= ((long) Integer.MAX_VALUE)) {
            long j = this.f11661f;
            int i2 = (int) j;
            if (i2 == 0) {
                jVar = C4897j.f11664h;
            } else {
                C0967p0.m2197a(j, 0, (long) i2);
                C4912v vVar = this.f11660e;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                    if (vVar != null) {
                        int i5 = vVar.f11703c;
                        int i6 = vVar.f11702b;
                        if (i5 != i6) {
                            i3 += i5 - i6;
                            i4++;
                            vVar = vVar.f11706f;
                        } else {
                            throw new AssertionError("s.limit == s.pos");
                        }
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                byte[][] bArr = new byte[i4][];
                int[] iArr = new int[(i4 * 2)];
                C4912v vVar2 = this.f11660e;
                int i7 = 0;
                while (i < i2) {
                    if (vVar2 != null) {
                        bArr[i7] = vVar2.f11701a;
                        i += vVar2.f11703c - vVar2.f11702b;
                        iArr[i7] = Math.min(i, i2);
                        iArr[i7 + i4] = vVar2.f11702b;
                        vVar2.f11704d = true;
                        i7++;
                        vVar2 = vVar2.f11706f;
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                jVar = new C4914x(bArr, iArr, null);
            }
            return jVar.toString();
        }
        StringBuilder a = C1965a.m4756a("size > Integer.MAX_VALUE: ");
        a.append(this.f11661f);
        throw new IllegalStateException(a.toString().toString());
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C4912v a = mo11444a(1);
                int min = Math.min(i, 8192 - a.f11703c);
                byteBuffer.get(a.f11701a, a.f11703c, min);
                i -= min;
                a.f11703c += min;
            }
            this.f11661f += (long) remaining;
            return remaining;
        }
        C4638h.m10271a("source");
        throw null;
    }

    public C4892f writeByte(int i) {
        C4912v a = mo11444a(1);
        byte[] bArr = a.f11701a;
        int i2 = a.f11703c;
        a.f11703c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f11661f++;
        return this;
    }

    public C4892f writeInt(int i) {
        C4912v a = mo11444a(4);
        byte[] bArr = a.f11701a;
        int i2 = a.f11703c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        a.f11703c = i6;
        this.f11661f += 4;
        return this;
    }

    public C4892f writeShort(int i) {
        C4912v a = mo11444a(2);
        byte[] bArr = a.f11701a;
        int i2 = a.f11703c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        a.f11703c = i4;
        this.f11661f += 2;
        return this;
    }

    /* renamed from: a */
    public long mo11434a(byte b, long j, long j2) {
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            long j4 = this.f11661f;
            if (j2 > j4) {
                j2 = j4;
            }
            long j5 = -1;
            if (j == j2) {
                return -1;
            }
            C4912v vVar = this.f11660e;
            if (vVar == null) {
                return -1;
            }
            long j6 = this.f11661f;
            if (j6 - j < j) {
                while (j6 > j) {
                    vVar = vVar.f11707g;
                    if (vVar != null) {
                        j6 -= (long) (vVar.f11703c - vVar.f11702b);
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                while (j6 < j2) {
                    byte[] bArr = vVar.f11701a;
                    int min = (int) Math.min((long) vVar.f11703c, (((long) vVar.f11702b) + j2) - j6);
                    for (int i = (int) ((((long) vVar.f11702b) + j) - j6); i < min; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - vVar.f11702b)) + j6;
                        }
                    }
                    j6 += (long) (vVar.f11703c - vVar.f11702b);
                    vVar = vVar.f11706f;
                    if (vVar != null) {
                        j5 = -1;
                        j = j6;
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                return j5;
            }
            while (true) {
                long j7 = ((long) (vVar.f11703c - vVar.f11702b)) + j3;
                if (j7 > j) {
                    while (j3 < j2) {
                        byte[] bArr2 = vVar.f11701a;
                        int min2 = (int) Math.min((long) vVar.f11703c, (((long) vVar.f11702b) + j2) - j3);
                        for (int i2 = (int) ((((long) vVar.f11702b) + j) - j3); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return ((long) (i2 - vVar.f11702b)) + j3;
                            }
                        }
                        j3 += (long) (vVar.f11703c - vVar.f11702b);
                        vVar = vVar.f11706f;
                        if (vVar != null) {
                            j = j3;
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    }
                    return -1;
                }
                vVar = vVar.f11706f;
                if (vVar != null) {
                    j3 = j7;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
        } else {
            StringBuilder a = C1965a.m4756a("size=");
            a.append(this.f11661f);
            a.append(" fromIndex=");
            a.append(j);
            a.append(" toIndex=");
            a.append(j2);
            throw new IllegalArgumentException(a.toString().toString());
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C0967p0.m2197a((long) bArr.length, (long) i, (long) i2);
            C4912v vVar = this.f11660e;
            if (vVar == null) {
                return -1;
            }
            int min = Math.min(i2, vVar.f11703c - vVar.f11702b);
            System.arraycopy(vVar.f11701a, vVar.f11702b, bArr, i, min);
            int i3 = vVar.f11702b + min;
            vVar.f11702b = i3;
            this.f11661f -= (long) min;
            if (i3 == vVar.f11703c) {
                this.f11660e = vVar.mo11541a();
                C4913w.m11091a(vVar);
            }
            return min;
        }
        C4638h.m10271a("sink");
        throw null;
    }

    public C4892f write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        C4638h.m10271a("source");
        throw null;
    }

    public C4892f write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C0967p0.m2197a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C4912v a = mo11444a(1);
                int min = Math.min(i3 - i, 8192 - a.f11703c);
                System.arraycopy(bArr, i, a.f11701a, a.f11703c, min);
                i += min;
                a.f11703c += min;
            }
            this.f11661f += j;
            return this;
        }
        C4638h.m10271a("source");
        throw null;
    }

    /* renamed from: a */
    public long mo11436a(C4915y yVar) {
        if (yVar != null) {
            long j = this.f11661f;
            if (j > 0) {
                yVar.mo11105a(this, j);
            }
            return j;
        }
        C4638h.m10271a("sink");
        throw null;
    }

    /* renamed from: a */
    public String mo11437a(long j, Charset charset) {
        if (charset != null) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
                throw new IllegalArgumentException(C1965a.m4748a("byteCount: ", j).toString());
            } else if (this.f11661f < j) {
                throw new EOFException();
            } else if (i == 0) {
                return Objects.EMPTY_STRING;
            } else {
                C4912v vVar = this.f11660e;
                if (vVar != null) {
                    int i2 = vVar.f11702b;
                    if (((long) i2) + j > ((long) vVar.f11703c)) {
                        return new String(mo11452e(j), charset);
                    }
                    int i3 = (int) j;
                    String str = new String(vVar.f11701a, i2, i3, charset);
                    int i4 = vVar.f11702b + i3;
                    vVar.f11702b = i4;
                    this.f11661f -= j;
                    if (i4 == vVar.f11703c) {
                        this.f11660e = vVar.mo11541a();
                        C4913w.m11091a(vVar);
                    }
                    return str;
                }
                C4638h.m10269a();
                throw null;
            }
        } else {
            C4638h.m10271a("charset");
            throw null;
        }
    }

    /* renamed from: a */
    public String mo11438a(Charset charset) {
        if (charset != null) {
            return mo11437a(this.f11661f, charset);
        }
        C4638h.m10271a("charset");
        throw null;
    }

    /* renamed from: a */
    public int mo11432a(C4905q qVar) {
        if (qVar != null) {
            int a = mo11433a(qVar, false);
            if (a == -1) {
                return -1;
            }
            skip((long) qVar.f11684e[a].mo11503g());
            return a;
        }
        C4638h.m10271a("options");
        throw null;
    }

    /* renamed from: a */
    public final int mo11433a(C4905q qVar, boolean z) {
        int i;
        int i2;
        int i3;
        C4912v vVar;
        int i4;
        C4905q qVar2 = qVar;
        if (qVar2 != null) {
            C4912v vVar2 = this.f11660e;
            int i5 = -2;
            if (vVar2 != null) {
                byte[] bArr = vVar2.f11701a;
                int i6 = vVar2.f11702b;
                int i7 = vVar2.f11703c;
                int[] iArr = qVar2.f11685f;
                C4912v vVar3 = vVar2;
                int i8 = -1;
                int i9 = 0;
                loop0:
                while (true) {
                    int i10 = i9 + 1;
                    int i11 = iArr[i9];
                    int i12 = i10 + 1;
                    int i13 = iArr[i10];
                    if (i13 != -1) {
                        i8 = i13;
                    }
                    if (vVar3 == null) {
                        break;
                    }
                    if (i11 < 0) {
                        int i14 = (i11 * -1) + i12;
                        while (true) {
                            int i15 = i6 + 1;
                            int i16 = i12 + 1;
                            if ((bArr[i6] & 255) != iArr[i12]) {
                                return i8;
                            }
                            boolean z2 = i16 == i14;
                            if (i15 != i7) {
                                C4912v vVar4 = vVar3;
                                i3 = i7;
                                i4 = i15;
                                vVar = vVar4;
                            } else if (vVar3 != null) {
                                C4912v vVar5 = vVar3.f11706f;
                                if (vVar5 != null) {
                                    i4 = vVar5.f11702b;
                                    byte[] bArr2 = vVar5.f11701a;
                                    i3 = vVar5.f11703c;
                                    if (vVar5 != vVar2) {
                                        byte[] bArr3 = bArr2;
                                        vVar = vVar5;
                                        bArr = bArr3;
                                    } else if (!z2) {
                                        break loop0;
                                    } else {
                                        bArr = bArr2;
                                        vVar = null;
                                    }
                                } else {
                                    C4638h.m10269a();
                                    throw null;
                                }
                            } else {
                                C4638h.m10269a();
                                throw null;
                            }
                            if (z2) {
                                i = iArr[i16];
                                i2 = i4;
                                i7 = i3;
                                vVar3 = vVar;
                                break;
                            }
                            i6 = i4;
                            i7 = i3;
                            i12 = i16;
                            vVar3 = vVar;
                        }
                    } else {
                        int i17 = i6 + 1;
                        byte b = bArr[i6] & 255;
                        int i18 = i12 + i11;
                        while (i12 != i18) {
                            if (b == iArr[i12]) {
                                i = iArr[i12 + i11];
                                if (i17 == i7) {
                                    vVar3 = vVar3.f11706f;
                                    if (vVar3 != null) {
                                        i2 = vVar3.f11702b;
                                        bArr = vVar3.f11701a;
                                        i7 = vVar3.f11703c;
                                        if (vVar3 == vVar2) {
                                            vVar3 = null;
                                        }
                                    } else {
                                        C4638h.m10269a();
                                        throw null;
                                    }
                                } else {
                                    i2 = i17;
                                }
                            } else {
                                i12++;
                            }
                        }
                        return i8;
                    }
                    if (i >= 0) {
                        return i;
                    }
                    i9 = -i;
                    i6 = i2;
                    i5 = -2;
                }
                return z ? i5 : i8;
            }
            return z ? -2 : -1;
        }
        C4638h.m10271a("options");
        throw null;
    }

    /* renamed from: a */
    public C4892f mo11443a(C4897j jVar) {
        if (jVar != null) {
            jVar.mo11497a(this);
            return this;
        }
        C4638h.m10271a("byteString");
        throw null;
    }

    /* renamed from: a */
    public void mo11105a(C4892f fVar, long j) {
        C4912v vVar;
        C4912v vVar2;
        if (fVar != null) {
            if (fVar != this) {
                C0967p0.m2197a(fVar.f11661f, 0, j);
                while (j > 0) {
                    C4912v vVar3 = fVar.f11660e;
                    if (vVar3 != null) {
                        int i = vVar3.f11703c;
                        if (vVar3 != null) {
                            if (j < ((long) (i - vVar3.f11702b))) {
                                C4912v vVar4 = this.f11660e;
                                if (vVar4 == null) {
                                    vVar = null;
                                } else if (vVar4 != null) {
                                    vVar = vVar4.f11707g;
                                } else {
                                    C4638h.m10269a();
                                    throw null;
                                }
                                if (vVar != null && vVar.f11705e) {
                                    if ((((long) vVar.f11703c) + j) - ((long) (vVar.f11704d ? 0 : vVar.f11702b)) <= ((long) 8192)) {
                                        C4912v vVar5 = fVar.f11660e;
                                        if (vVar5 != null) {
                                            vVar5.mo11543a(vVar, (int) j);
                                            fVar.f11661f -= j;
                                            this.f11661f += j;
                                            return;
                                        }
                                        C4638h.m10269a();
                                        throw null;
                                    }
                                }
                                C4912v vVar6 = fVar.f11660e;
                                if (vVar6 != null) {
                                    int i2 = (int) j;
                                    if (vVar6 != null) {
                                        if (i2 > 0 && i2 <= vVar6.f11703c - vVar6.f11702b) {
                                            if (i2 >= 1024) {
                                                vVar2 = vVar6.mo11544b();
                                            } else {
                                                vVar2 = C4913w.m11090a();
                                                C0967p0.m2235b(vVar6.f11701a, vVar6.f11702b, vVar2.f11701a, 0, i2);
                                            }
                                            vVar2.f11703c = vVar2.f11702b + i2;
                                            vVar6.f11702b += i2;
                                            C4912v vVar7 = vVar6.f11707g;
                                            if (vVar7 != null) {
                                                vVar7.mo11542a(vVar2);
                                                fVar.f11660e = vVar2;
                                            } else {
                                                C4638h.m10269a();
                                                throw null;
                                            }
                                        } else {
                                            throw new IllegalArgumentException("byteCount out of range".toString());
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    C4638h.m10269a();
                                    throw null;
                                }
                            }
                            C4912v vVar8 = fVar.f11660e;
                            if (vVar8 != null) {
                                long j2 = (long) (vVar8.f11703c - vVar8.f11702b);
                                fVar.f11660e = vVar8.mo11541a();
                                C4912v vVar9 = this.f11660e;
                                if (vVar9 == null) {
                                    this.f11660e = vVar8;
                                    vVar8.f11707g = vVar8;
                                    vVar8.f11706f = vVar8;
                                } else if (vVar9 != null) {
                                    C4912v vVar10 = vVar9.f11707g;
                                    if (vVar10 != null) {
                                        vVar10.mo11542a(vVar8);
                                        if (vVar8.f11707g != vVar8) {
                                            C4912v vVar11 = vVar8.f11707g;
                                            if (vVar11 == null) {
                                                C4638h.m10269a();
                                                throw null;
                                            } else if (!vVar11.f11705e) {
                                                continue;
                                            } else {
                                                int i3 = vVar8.f11703c - vVar8.f11702b;
                                                if (i3 > (8192 - vVar11.f11703c) + (vVar11.f11704d ? 0 : vVar11.f11702b)) {
                                                    continue;
                                                } else {
                                                    C4912v vVar12 = vVar8.f11707g;
                                                    if (vVar12 != null) {
                                                        vVar8.mo11543a(vVar12, i3);
                                                        vVar8.mo11541a();
                                                        C4913w.m11091a(vVar8);
                                                    } else {
                                                        C4638h.m10269a();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException("cannot compact".toString());
                                        }
                                    } else {
                                        C4638h.m10269a();
                                        throw null;
                                    }
                                } else {
                                    C4638h.m10269a();
                                    throw null;
                                }
                                fVar.f11661f -= j2;
                                this.f11661f += j2;
                                j -= j2;
                            } else {
                                C4638h.m10269a();
                                throw null;
                            }
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("source == this".toString());
        }
        C4638h.m10271a("source");
        throw null;
    }

    /* renamed from: a */
    public long mo11435a(C4882a0 a0Var) {
        if (a0Var != null) {
            long j = 0;
            while (true) {
                long b = a0Var.mo11077b(this, (long) 8192);
                if (b == -1) {
                    return j;
                }
                j += b;
            }
        } else {
            C4638h.m10271a("source");
            throw null;
        }
    }

    /* renamed from: a */
    public C4892f mo11440a(String str) {
        if (str != null) {
            mo11441a(str, 0, str.length());
            return this;
        }
        C4638h.m10271a("string");
        throw null;
    }

    /* renamed from: a */
    public C4892f mo11441a(String str, int i, int i2) {
        long j;
        long j2;
        if (str != null) {
            if (i >= 0) {
                if (i2 >= i) {
                    if (i2 <= str.length()) {
                        while (i < i2) {
                            char charAt = str.charAt(i);
                            if (charAt < 128) {
                                C4912v a = mo11444a(1);
                                byte[] bArr = a.f11701a;
                                int i3 = a.f11703c - i;
                                int min = Math.min(i2, 8192 - i3);
                                int i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                                while (true) {
                                    i = i4;
                                    if (i >= min) {
                                        break;
                                    }
                                    char charAt2 = str.charAt(i);
                                    if (charAt2 >= 128) {
                                        break;
                                    }
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt2;
                                }
                                int i5 = i3 + i;
                                int i6 = a.f11703c;
                                int i7 = i5 - i6;
                                a.f11703c = i6 + i7;
                                this.f11661f += (long) i7;
                            } else {
                                if (charAt < 2048) {
                                    C4912v a2 = mo11444a(2);
                                    byte[] bArr2 = a2.f11701a;
                                    int i8 = a2.f11703c;
                                    bArr2[i8] = (byte) ((charAt >> 6) | 192);
                                    bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                                    a2.f11703c = i8 + 2;
                                    j2 = this.f11661f;
                                    j = 2;
                                } else if (charAt < 55296 || charAt > 57343) {
                                    C4912v a3 = mo11444a(3);
                                    byte[] bArr3 = a3.f11701a;
                                    int i9 = a3.f11703c;
                                    bArr3[i9] = (byte) ((charAt >> 12) | 224);
                                    bArr3[i9 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                    bArr3[i9 + 2] = (byte) ((charAt & '?') | 128);
                                    a3.f11703c = i9 + 3;
                                    j2 = this.f11661f;
                                    j = 3;
                                } else {
                                    int i10 = i + 1;
                                    int charAt3 = i10 < i2 ? str.charAt(i10) : 0;
                                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                        writeByte(63);
                                        i = i10;
                                    } else {
                                        int i11 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                                        C4912v a4 = mo11444a(4);
                                        byte[] bArr4 = a4.f11701a;
                                        int i12 = a4.f11703c;
                                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                                        a4.f11703c = i12 + 4;
                                        this.f11661f += 4;
                                        i += 2;
                                    }
                                }
                                this.f11661f = j2 + j;
                                i++;
                            }
                        }
                        return this;
                    }
                    StringBuilder a5 = C1965a.m4757a("endIndex > string.length: ", i2, " > ");
                    a5.append(str.length());
                    throw new IllegalArgumentException(a5.toString().toString());
                }
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex < beginIndex: ");
                sb.append(i2);
                sb.append(" < ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            throw new IllegalArgumentException(C1965a.m4761b("beginIndex < 0: ", i).toString());
        }
        C4638h.m10271a("string");
        throw null;
    }
}
