package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.C3701a;

/* renamed from: q.b.c.a.j0.a.k */
public abstract class C3656k {

    /* renamed from: a */
    public int f9066a;

    /* renamed from: b */
    public int f9067b = 100;

    /* renamed from: c */
    public int f9068c = Integer.MAX_VALUE;

    /* renamed from: d */
    public C3666l f9069d;

    /* renamed from: q.b.c.a.j0.a.k$b */
    public static final class C3658b extends C3656k {

        /* renamed from: e */
        public final byte[] f9070e;

        /* renamed from: f */
        public final boolean f9071f;

        /* renamed from: g */
        public int f9072g;

        /* renamed from: h */
        public int f9073h;

        /* renamed from: i */
        public int f9074i;

        /* renamed from: j */
        public int f9075j;

        /* renamed from: k */
        public int f9076k;

        /* renamed from: l */
        public int f9077l = Integer.MAX_VALUE;

        public /* synthetic */ C3658b(byte[] bArr, int i, int i2, boolean z, C3657a aVar) {
            super(null);
            this.f9070e = bArr;
            this.f9072g = i2 + i;
            this.f9074i = i;
            this.f9075j = i;
            this.f9071f = z;
        }

        /* renamed from: A */
        public final void mo9756A() {
            int i = this.f9072g + this.f9073h;
            this.f9072g = i;
            int i2 = i - this.f9075j;
            int i3 = this.f9077l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f9073h = i4;
                this.f9072g = i - i4;
                return;
            }
            this.f9073h = 0;
        }

        /* renamed from: a */
        public int mo9732a() {
            return this.f9074i - this.f9075j;
        }

        /* renamed from: a */
        public void mo9733a(int i) {
            if (this.f9076k != i) {
                throw C3606c0.m8174a();
            }
        }

        /* renamed from: b */
        public void mo9734b(int i) {
            this.f9077l = i;
            mo9756A();
        }

        /* renamed from: b */
        public boolean mo9735b() {
            return this.f9074i == this.f9072g;
        }

        /* renamed from: c */
        public int mo9736c(int i) {
            if (i >= 0) {
                int a = mo9732a() + i;
                int i2 = this.f9077l;
                if (a <= i2) {
                    this.f9077l = a;
                    mo9756A();
                    return i2;
                }
                throw C3606c0.m8181h();
            }
            throw C3606c0.m8179f();
        }

        /* renamed from: c */
        public boolean mo9737c() {
            return mo9762y() != 0;
        }

        /* renamed from: d */
        public C3635j mo9738d() {
            byte[] bArr;
            int x = mo9761x();
            if (x > 0 && x <= this.f9072g - this.f9074i) {
                boolean z = this.f9071f;
                C3635j a = C3635j.m8389a(this.f9070e, this.f9074i, x);
                this.f9074i += x;
                return a;
            } else if (x == 0) {
                return C3635j.f9034f;
            } else {
                if (x > 0) {
                    int i = this.f9072g;
                    int i2 = this.f9074i;
                    if (x <= i - i2) {
                        int i3 = x + i2;
                        this.f9074i = i3;
                        bArr = Arrays.copyOfRange(this.f9070e, i2, i3);
                        return C3635j.m8391b(bArr);
                    }
                }
                if (x > 0) {
                    throw C3606c0.m8181h();
                } else if (x == 0) {
                    bArr = C3594b0.f8973b;
                    return C3635j.m8391b(bArr);
                } else {
                    throw C3606c0.m8179f();
                }
            }
        }

        /* renamed from: e */
        public double mo9740e() {
            return Double.longBitsToDouble(mo9760w());
        }

        /* renamed from: f */
        public int mo9741f() {
            return mo9761x();
        }

        /* renamed from: f */
        public void mo9757f(int i) {
            if (i >= 0) {
                int i2 = this.f9072g;
                int i3 = this.f9074i;
                if (i <= i2 - i3) {
                    this.f9074i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C3606c0.m8179f();
            }
            throw C3606c0.m8181h();
        }

        /* renamed from: g */
        public int mo9742g() {
            return mo9759v();
        }

        /* renamed from: h */
        public long mo9743h() {
            return mo9760w();
        }

        /* renamed from: i */
        public float mo9744i() {
            return Float.intBitsToFloat(mo9759v());
        }

        /* renamed from: j */
        public int mo9745j() {
            return mo9761x();
        }

        /* renamed from: k */
        public long mo9746k() {
            return mo9762y();
        }

        /* renamed from: l */
        public int mo9747l() {
            return mo9759v();
        }

        /* renamed from: m */
        public long mo9748m() {
            return mo9760w();
        }

        /* renamed from: n */
        public int mo9749n() {
            return C3656k.m8448e(mo9761x());
        }

        /* renamed from: o */
        public long mo9750o() {
            return C3656k.m8444a(mo9762y());
        }

        /* renamed from: p */
        public String mo9751p() {
            int x = mo9761x();
            if (x > 0 && x <= this.f9072g - this.f9074i) {
                String str = new String(this.f9070e, this.f9074i, x, C3594b0.f8972a);
                this.f9074i += x;
                return str;
            } else if (x == 0) {
                return Objects.EMPTY_STRING;
            } else {
                if (x < 0) {
                    throw C3606c0.m8179f();
                }
                throw C3606c0.m8181h();
            }
        }

        /* renamed from: q */
        public String mo9752q() {
            int x = mo9761x();
            if (x > 0) {
                int i = this.f9072g;
                int i2 = this.f9074i;
                if (x <= i - i2) {
                    String b = C3700r1.m8887b(this.f9070e, i2, x);
                    this.f9074i += x;
                    return b;
                }
            }
            if (x == 0) {
                return Objects.EMPTY_STRING;
            }
            if (x <= 0) {
                throw C3606c0.m8179f();
            }
            throw C3606c0.m8181h();
        }

        /* renamed from: r */
        public int mo9753r() {
            if (mo9735b()) {
                this.f9076k = 0;
                return 0;
            }
            int x = mo9761x();
            this.f9076k = x;
            if ((x >>> 3) != 0) {
                return x;
            }
            throw C3606c0.m8175b();
        }

        /* renamed from: s */
        public int mo9754s() {
            return mo9761x();
        }

        /* renamed from: t */
        public long mo9755t() {
            return mo9762y();
        }

        /* renamed from: u */
        public byte mo9758u() {
            int i = this.f9074i;
            if (i != this.f9072g) {
                byte[] bArr = this.f9070e;
                this.f9074i = i + 1;
                return bArr[i];
            }
            throw C3606c0.m8181h();
        }

        /* renamed from: v */
        public int mo9759v() {
            int i = this.f9074i;
            if (this.f9072g - i >= 4) {
                byte[] bArr = this.f9070e;
                this.f9074i = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw C3606c0.m8181h();
        }

        /* renamed from: w */
        public long mo9760w() {
            int i = this.f9074i;
            if (this.f9072g - i >= 8) {
                byte[] bArr = this.f9070e;
                this.f9074i = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C3606c0.m8181h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo9761x() {
            /*
                r5 = this;
                int r0 = r5.f9074i
                int r1 = r5.f9072g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f9070e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f9074i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo9763z()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f9074i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.C3658b.mo9761x():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo9762y() {
            /*
                r11 = this;
                int r0 = r11.f9074i
                int r1 = r11.f9072g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f9070e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f9074i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo9763z()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f9074i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.C3658b.mo9762y():long");
        }

        /* renamed from: z */
        public long mo9763z() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte u = mo9758u();
                j |= ((long) (u & Byte.MAX_VALUE)) << i;
                if ((u & 128) == 0) {
                    return j;
                }
            }
            throw C3606c0.m8178e();
        }

        /* renamed from: d */
        public boolean mo9739d(int i) {
            int i2;
            int r;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = 8;
                } else if (i3 == 2) {
                    i2 = mo9761x();
                } else if (i3 == 3) {
                    do {
                        r = mo9753r();
                        if (r == 0) {
                            break;
                        }
                    } while (mo9739d(r));
                    mo9733a(((i >>> 3) << 3) | 4);
                    return true;
                } else if (i3 == 4) {
                    return false;
                } else {
                    if (i3 == 5) {
                        mo9757f(4);
                        return true;
                    }
                    throw C3606c0.m8177d();
                }
                mo9757f(i2);
                return true;
            }
            if (this.f9072g - this.f9074i >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f9070e;
                    int i5 = this.f9074i;
                    this.f9074i = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw C3606c0.m8178e();
            }
            while (i4 < 10) {
                if (mo9758u() < 0) {
                    i4++;
                }
            }
            throw C3606c0.m8178e();
            return true;
        }
    }

    /* renamed from: q.b.c.a.j0.a.k$c */
    public static final class C3659c extends C3656k {

        /* renamed from: e */
        public final InputStream f9078e;

        /* renamed from: f */
        public final byte[] f9079f;

        /* renamed from: g */
        public int f9080g;

        /* renamed from: h */
        public int f9081h;

        /* renamed from: i */
        public int f9082i;

        /* renamed from: j */
        public int f9083j;

        /* renamed from: k */
        public int f9084k;

        /* renamed from: l */
        public int f9085l = Integer.MAX_VALUE;

        /* renamed from: m */
        public C3660a f9086m = null;

        /* renamed from: q.b.c.a.j0.a.k$c$a */
        public interface C3660a {
            /* renamed from: a */
            void mo9777a();
        }

        public /* synthetic */ C3659c(InputStream inputStream, int i, C3657a aVar) {
            super(null);
            C3594b0.m8166a(inputStream, "input");
            this.f9078e = inputStream;
            this.f9079f = new byte[i];
            this.f9080g = 0;
            this.f9082i = 0;
            this.f9084k = 0;
        }

        /* renamed from: A */
        public final void mo9764A() {
            int i = this.f9080g + this.f9081h;
            this.f9080g = i;
            int i2 = this.f9084k + i;
            int i3 = this.f9085l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f9081h = i4;
                this.f9080g = i - i4;
                return;
            }
            this.f9081h = 0;
        }

        /* renamed from: a */
        public int mo9732a() {
            return this.f9084k + this.f9082i;
        }

        /* renamed from: a */
        public void mo9733a(int i) {
            if (this.f9083j != i) {
                throw C3606c0.m8174a();
            }
        }

        /* renamed from: a */
        public final byte[] mo9765a(int i, boolean z) {
            byte[] f = mo9766f(i);
            if (f != null) {
                if (z) {
                    f = (byte[]) f.clone();
                }
                return f;
            }
            int i2 = this.f9082i;
            int i3 = this.f9080g;
            int i4 = i3 - i2;
            this.f9084k += i3;
            this.f9082i = 0;
            this.f9080g = 0;
            List g = mo9767g(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f9079f, i2, bArr, 0, i4);
            Iterator it = ((ArrayList) g).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: b */
        public void mo9734b(int i) {
            this.f9085l = i;
            mo9764A();
        }

        /* renamed from: b */
        public boolean mo9735b() {
            return this.f9082i == this.f9080g && !mo9770j(1);
        }

        /* renamed from: c */
        public int mo9736c(int i) {
            if (i >= 0) {
                int i2 = this.f9084k + this.f9082i + i;
                int i3 = this.f9085l;
                if (i2 <= i3) {
                    this.f9085l = i2;
                    mo9764A();
                    return i3;
                }
                throw C3606c0.m8181h();
            }
            throw C3606c0.m8179f();
        }

        /* renamed from: c */
        public boolean mo9737c() {
            return mo9775y() != 0;
        }

        /* renamed from: d */
        public C3635j mo9738d() {
            C3635j jVar;
            int x = mo9774x();
            int i = this.f9080g;
            int i2 = this.f9082i;
            if (x <= i - i2 && x > 0) {
                C3635j a = C3635j.m8389a(this.f9079f, i2, x);
                this.f9082i += x;
                return a;
            } else if (x == 0) {
                return C3635j.f9034f;
            } else {
                byte[] f = mo9766f(x);
                if (f != null) {
                    jVar = C3635j.m8388a(f);
                } else {
                    int i3 = this.f9082i;
                    int i4 = this.f9080g;
                    int i5 = i4 - i3;
                    this.f9084k += i4;
                    this.f9082i = 0;
                    this.f9080g = 0;
                    List g = mo9767g(x - i5);
                    byte[] bArr = new byte[x];
                    System.arraycopy(this.f9079f, i3, bArr, 0, i5);
                    Iterator it = ((ArrayList) g).iterator();
                    while (it.hasNext()) {
                        byte[] bArr2 = (byte[]) it.next();
                        System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                        i5 += bArr2.length;
                    }
                    jVar = C3635j.m8391b(bArr);
                }
                return jVar;
            }
        }

        /* renamed from: e */
        public double mo9740e() {
            return Double.longBitsToDouble(mo9773w());
        }

        /* renamed from: f */
        public int mo9741f() {
            return mo9774x();
        }

        /* renamed from: f */
        public final byte[] mo9766f(int i) {
            if (i == 0) {
                return C3594b0.f8973b;
            }
            if (i >= 0) {
                int i2 = this.f9084k;
                int i3 = this.f9082i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f9068c <= 0) {
                    int i5 = this.f9085l;
                    if (i4 <= i5) {
                        int i6 = this.f9080g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f9078e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f9079f, this.f9082i, bArr, 0, i6);
                        this.f9084k += this.f9080g;
                        this.f9082i = 0;
                        this.f9080g = 0;
                        while (i6 < i) {
                            int read = this.f9078e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f9084k += read;
                                i6 += read;
                            } else {
                                throw C3606c0.m8181h();
                            }
                        }
                        return bArr;
                    }
                    mo9769i((i5 - i2) - i3);
                    throw C3606c0.m8181h();
                }
                throw new C3606c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C3606c0.m8179f();
        }

        /* renamed from: g */
        public int mo9742g() {
            return mo9772v();
        }

        /* renamed from: g */
        public final List<byte[]> mo9767g(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f9078e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f9084k += read;
                        i2 += read;
                    } else {
                        throw C3606c0.m8181h();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: h */
        public long mo9743h() {
            return mo9773w();
        }

        /* renamed from: h */
        public final void mo9768h(int i) {
            if (mo9770j(i)) {
                return;
            }
            if (i > (this.f9068c - this.f9084k) - this.f9082i) {
                throw new C3606c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C3606c0.m8181h();
        }

        /* renamed from: i */
        public float mo9744i() {
            return Float.intBitsToFloat(mo9772v());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
            r8.f9084k += r3;
            mo9764A();
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9769i(int r9) {
            /*
                r8 = this;
                int r0 = r8.f9080g
                int r1 = r8.f9082i
                int r0 = r0 - r1
                if (r9 > r0) goto L_0x000e
                if (r9 < 0) goto L_0x000e
                int r1 = r1 + r9
                r8.f9082i = r1
                goto L_0x0097
            L_0x000e:
                if (r9 < 0) goto L_0x00a2
                int r0 = r8.f9084k
                int r1 = r8.f9082i
                int r2 = r0 + r1
                int r3 = r2 + r9
                int r4 = r8.f9085l
                if (r3 > r4) goto L_0x0098
                q.b.c.a.j0.a.k$c$a r0 = r8.f9086m
                r3 = 0
                if (r0 != 0) goto L_0x007d
                r8.f9084k = r2
                int r0 = r8.f9080g
                int r0 = r0 - r1
                r8.f9080g = r3
                r8.f9082i = r3
                r3 = r0
            L_0x002b:
                if (r3 >= r9) goto L_0x0075
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f9078e     // Catch:{ all -> 0x006b }
                long r4 = (long) r0     // Catch:{ all -> 0x006b }
                long r0 = r1.skip(r4)     // Catch:{ all -> 0x006b }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0046
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 > 0) goto L_0x0046
                if (r2 != 0) goto L_0x0043
                goto L_0x0075
            L_0x0043:
                int r0 = (int) r0     // Catch:{ all -> 0x006b }
                int r3 = r3 + r0
                goto L_0x002b
            L_0x0046:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006b }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
                r2.<init>()     // Catch:{ all -> 0x006b }
                java.io.InputStream r4 = r8.f9078e     // Catch:{ all -> 0x006b }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x006b }
                r2.append(r4)     // Catch:{ all -> 0x006b }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x006b }
                r2.append(r0)     // Catch:{ all -> 0x006b }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x006b }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x006b }
                r9.<init>(r0)     // Catch:{ all -> 0x006b }
                throw r9     // Catch:{ all -> 0x006b }
            L_0x006b:
                r9 = move-exception
                int r0 = r8.f9084k
                int r0 = r0 + r3
                r8.f9084k = r0
                r8.mo9764A()
                throw r9
            L_0x0075:
                int r0 = r8.f9084k
                int r0 = r0 + r3
                r8.f9084k = r0
                r8.mo9764A()
            L_0x007d:
                if (r3 >= r9) goto L_0x0097
                int r0 = r8.f9080g
                int r1 = r8.f9082i
                int r1 = r0 - r1
                r8.f9082i = r0
                r0 = 1
            L_0x0088:
                r8.mo9768h(r0)
                int r2 = r9 - r1
                int r3 = r8.f9080g
                if (r2 <= r3) goto L_0x0095
                int r1 = r1 + r3
                r8.f9082i = r3
                goto L_0x0088
            L_0x0095:
                r8.f9082i = r2
            L_0x0097:
                return
            L_0x0098:
                int r4 = r4 - r0
                int r4 = r4 - r1
                r8.mo9769i(r4)
                q.b.c.a.j0.a.c0 r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8181h()
                throw r9
            L_0x00a2:
                q.b.c.a.j0.a.c0 r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8179f()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.C3659c.mo9769i(int):void");
        }

        /* renamed from: j */
        public int mo9745j() {
            return mo9774x();
        }

        /* renamed from: j */
        public final boolean mo9770j(int i) {
            int i2 = this.f9082i;
            if (i2 + i > this.f9080g) {
                int i3 = this.f9068c;
                int i4 = this.f9084k;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f9085l) {
                    return false;
                }
                C3660a aVar = this.f9086m;
                if (aVar != null) {
                    aVar.mo9777a();
                }
                int i5 = this.f9082i;
                if (i5 > 0) {
                    int i6 = this.f9080g;
                    if (i6 > i5) {
                        byte[] bArr = this.f9079f;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f9084k += i5;
                    this.f9080g -= i5;
                    this.f9082i = 0;
                }
                InputStream inputStream = this.f9078e;
                byte[] bArr2 = this.f9079f;
                int i7 = this.f9080g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f9068c - this.f9084k) - i7));
                if (read == 0 || read < -1 || read > this.f9079f.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f9078e.getClass());
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f9080g += read;
                    mo9764A();
                    return this.f9080g >= i ? true : mo9770j(i);
                }
            } else {
                throw new IllegalStateException(C1965a.m4762b("refillBuffer() called when ", i, " bytes were already available in buffer"));
            }
        }

        /* renamed from: k */
        public long mo9746k() {
            return mo9775y();
        }

        /* renamed from: l */
        public int mo9747l() {
            return mo9772v();
        }

        /* renamed from: m */
        public long mo9748m() {
            return mo9773w();
        }

        /* renamed from: n */
        public int mo9749n() {
            return C3656k.m8448e(mo9774x());
        }

        /* renamed from: o */
        public long mo9750o() {
            return C3656k.m8444a(mo9775y());
        }

        /* renamed from: p */
        public String mo9751p() {
            int x = mo9774x();
            if (x > 0 && x <= this.f9080g - this.f9082i) {
                String str = new String(this.f9079f, this.f9082i, x, C3594b0.f8972a);
                this.f9082i += x;
                return str;
            } else if (x == 0) {
                return Objects.EMPTY_STRING;
            } else {
                if (x > this.f9080g) {
                    return new String(mo9765a(x, false), C3594b0.f8972a);
                }
                mo9768h(x);
                String str2 = new String(this.f9079f, this.f9082i, x, C3594b0.f8972a);
                this.f9082i += x;
                return str2;
            }
        }

        /* renamed from: q */
        public String mo9752q() {
            byte[] bArr;
            int x = mo9774x();
            int i = this.f9082i;
            if (x <= this.f9080g - i && x > 0) {
                bArr = this.f9079f;
                this.f9082i = i + x;
            } else if (x == 0) {
                return Objects.EMPTY_STRING;
            } else {
                if (x <= this.f9080g) {
                    mo9768h(x);
                    bArr = this.f9079f;
                    this.f9082i = x + 0;
                } else {
                    bArr = mo9765a(x, false);
                }
                i = 0;
            }
            return C3700r1.m8887b(bArr, i, x);
        }

        /* renamed from: r */
        public int mo9753r() {
            if (mo9735b()) {
                this.f9083j = 0;
                return 0;
            }
            int x = mo9774x();
            this.f9083j = x;
            if ((x >>> 3) != 0) {
                return x;
            }
            throw C3606c0.m8175b();
        }

        /* renamed from: s */
        public int mo9754s() {
            return mo9774x();
        }

        /* renamed from: t */
        public long mo9755t() {
            return mo9775y();
        }

        /* renamed from: u */
        public byte mo9771u() {
            if (this.f9082i == this.f9080g) {
                mo9768h(1);
            }
            byte[] bArr = this.f9079f;
            int i = this.f9082i;
            this.f9082i = i + 1;
            return bArr[i];
        }

        /* renamed from: v */
        public int mo9772v() {
            int i = this.f9082i;
            if (this.f9080g - i < 4) {
                mo9768h(4);
                i = this.f9082i;
            }
            byte[] bArr = this.f9079f;
            this.f9082i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: w */
        public long mo9773w() {
            int i = this.f9082i;
            if (this.f9080g - i < 8) {
                mo9768h(8);
                i = this.f9082i;
            }
            byte[] bArr = this.f9079f;
            this.f9082i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo9774x() {
            /*
                r5 = this;
                int r0 = r5.f9082i
                int r1 = r5.f9080g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f9079f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f9082i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo9776z()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f9082i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.C3659c.mo9774x():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo9775y() {
            /*
                r11 = this;
                int r0 = r11.f9082i
                int r1 = r11.f9080g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f9079f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f9082i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo9776z()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f9082i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.C3659c.mo9775y():long");
        }

        /* renamed from: z */
        public long mo9776z() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte u = mo9771u();
                j |= ((long) (u & Byte.MAX_VALUE)) << i;
                if ((u & 128) == 0) {
                    return j;
                }
            }
            throw C3606c0.m8178e();
        }

        /* renamed from: d */
        public boolean mo9739d(int i) {
            int i2;
            int r;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = 8;
                } else if (i3 == 2) {
                    i2 = mo9774x();
                } else if (i3 == 3) {
                    do {
                        r = mo9753r();
                        if (r == 0) {
                            break;
                        }
                    } while (mo9739d(r));
                    mo9733a(((i >>> 3) << 3) | 4);
                    return true;
                } else if (i3 == 4) {
                    return false;
                } else {
                    if (i3 == 5) {
                        mo9769i(4);
                        return true;
                    }
                    throw C3606c0.m8177d();
                }
                mo9769i(i2);
                return true;
            }
            if (this.f9080g - this.f9082i >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f9079f;
                    int i5 = this.f9082i;
                    this.f9082i = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw C3606c0.m8178e();
            }
            while (i4 < 10) {
                if (mo9771u() < 0) {
                    i4++;
                }
            }
            throw C3606c0.m8178e();
            return true;
        }
    }

    /* renamed from: q.b.c.a.j0.a.k$d */
    public static final class C3661d extends C3656k {

        /* renamed from: e */
        public final ByteBuffer f9087e;

        /* renamed from: f */
        public final boolean f9088f;

        /* renamed from: g */
        public final long f9089g;

        /* renamed from: h */
        public long f9090h;

        /* renamed from: i */
        public long f9091i;

        /* renamed from: j */
        public long f9092j;

        /* renamed from: k */
        public int f9093k;

        /* renamed from: l */
        public int f9094l;

        /* renamed from: m */
        public int f9095m = Integer.MAX_VALUE;

        public /* synthetic */ C3661d(ByteBuffer byteBuffer, boolean z, C3657a aVar) {
            super(null);
            this.f9087e = byteBuffer;
            long a = C3691q1.m8805a(byteBuffer);
            this.f9089g = a;
            this.f9090h = a + ((long) byteBuffer.limit());
            long position = this.f9089g + ((long) byteBuffer.position());
            this.f9091i = position;
            this.f9092j = position;
            this.f9088f = z;
        }

        /* renamed from: A */
        public final void mo9778A() {
            long j = this.f9090h + ((long) this.f9093k);
            this.f9090h = j;
            int i = (int) (j - this.f9092j);
            int i2 = this.f9095m;
            if (i > i2) {
                int i3 = i - i2;
                this.f9093k = i3;
                this.f9090h = j - ((long) i3);
                return;
            }
            this.f9093k = 0;
        }

        /* renamed from: B */
        public final int mo9779B() {
            return (int) (this.f9090h - this.f9091i);
        }

        /* renamed from: a */
        public int mo9732a() {
            return (int) (this.f9091i - this.f9092j);
        }

        /* renamed from: a */
        public void mo9733a(int i) {
            if (this.f9094l != i) {
                throw C3606c0.m8174a();
            }
        }

        /* renamed from: b */
        public final int mo9780b(long j) {
            return (int) (j - this.f9089g);
        }

        /* renamed from: b */
        public void mo9734b(int i) {
            this.f9095m = i;
            mo9778A();
        }

        /* renamed from: b */
        public boolean mo9735b() {
            return this.f9091i == this.f9090h;
        }

        /* renamed from: c */
        public int mo9736c(int i) {
            if (i >= 0) {
                int a = mo9732a() + i;
                int i2 = this.f9095m;
                if (a <= i2) {
                    this.f9095m = a;
                    mo9778A();
                    return i2;
                }
                throw C3606c0.m8181h();
            }
            throw C3606c0.m8179f();
        }

        /* renamed from: c */
        public boolean mo9737c() {
            return mo9786y() != 0;
        }

        /* renamed from: d */
        public C3635j mo9738d() {
            int x = mo9785x();
            if (x > 0 && x <= mo9779B()) {
                byte[] bArr = new byte[x];
                long j = (long) x;
                C3691q1.f9140f.mo9892a(this.f9091i, bArr, 0, j);
                this.f9091i += j;
                return C3635j.m8391b(bArr);
            } else if (x == 0) {
                return C3635j.f9034f;
            } else {
                if (x < 0) {
                    throw C3606c0.m8179f();
                }
                throw C3606c0.m8181h();
            }
        }

        /* renamed from: e */
        public double mo9740e() {
            return Double.longBitsToDouble(mo9784w());
        }

        /* renamed from: f */
        public int mo9741f() {
            return mo9785x();
        }

        /* renamed from: f */
        public void mo9781f(int i) {
            if (i >= 0 && i <= mo9779B()) {
                this.f9091i += (long) i;
            } else if (i < 0) {
                throw C3606c0.m8179f();
            } else {
                throw C3606c0.m8181h();
            }
        }

        /* renamed from: g */
        public int mo9742g() {
            return mo9783v();
        }

        /* renamed from: h */
        public long mo9743h() {
            return mo9784w();
        }

        /* renamed from: i */
        public float mo9744i() {
            return Float.intBitsToFloat(mo9783v());
        }

        /* renamed from: j */
        public int mo9745j() {
            return mo9785x();
        }

        /* renamed from: k */
        public long mo9746k() {
            return mo9786y();
        }

        /* renamed from: l */
        public int mo9747l() {
            return mo9783v();
        }

        /* renamed from: m */
        public long mo9748m() {
            return mo9784w();
        }

        /* renamed from: n */
        public int mo9749n() {
            return C3656k.m8448e(mo9785x());
        }

        /* renamed from: o */
        public long mo9750o() {
            return C3656k.m8444a(mo9786y());
        }

        /* renamed from: p */
        public String mo9751p() {
            int x = mo9785x();
            if (x > 0 && x <= mo9779B()) {
                byte[] bArr = new byte[x];
                long j = (long) x;
                C3691q1.f9140f.mo9892a(this.f9091i, bArr, 0, j);
                String str = new String(bArr, C3594b0.f8972a);
                this.f9091i += j;
                return str;
            } else if (x == 0) {
                return Objects.EMPTY_STRING;
            } else {
                if (x < 0) {
                    throw C3606c0.m8179f();
                }
                throw C3606c0.m8181h();
            }
        }

        /* renamed from: q */
        public String mo9752q() {
            int x = mo9785x();
            if (x > 0 && x <= mo9779B()) {
                int b = mo9780b(this.f9091i);
                ByteBuffer byteBuffer = this.f9087e;
                C3701a aVar = C3700r1.f9152a;
                if (aVar != null) {
                    String str = byteBuffer.hasArray() ? aVar.mo9915a(byteBuffer.array(), byteBuffer.arrayOffset() + b, x) : byteBuffer.isDirect() ? aVar.mo9916b(byteBuffer, b, x) : aVar.mo9914a(byteBuffer, b, x);
                    this.f9091i += (long) x;
                    return str;
                }
                throw null;
            } else if (x == 0) {
                return Objects.EMPTY_STRING;
            } else {
                if (x <= 0) {
                    throw C3606c0.m8179f();
                }
                throw C3606c0.m8181h();
            }
        }

        /* renamed from: r */
        public int mo9753r() {
            if (mo9735b()) {
                this.f9094l = 0;
                return 0;
            }
            int x = mo9785x();
            this.f9094l = x;
            if ((x >>> 3) != 0) {
                return x;
            }
            throw C3606c0.m8175b();
        }

        /* renamed from: s */
        public int mo9754s() {
            return mo9785x();
        }

        /* renamed from: t */
        public long mo9755t() {
            return mo9786y();
        }

        /* renamed from: u */
        public byte mo9782u() {
            long j = this.f9091i;
            if (j != this.f9090h) {
                this.f9091i = 1 + j;
                return C3691q1.m8803a(j);
            }
            throw C3606c0.m8181h();
        }

        /* renamed from: v */
        public int mo9783v() {
            long j = this.f9091i;
            if (this.f9090h - j >= 4) {
                this.f9091i = 4 + j;
                return ((C3691q1.m8803a(j + 3) & 255) << 24) | (C3691q1.m8803a(j) & 255) | ((C3691q1.m8803a(1 + j) & 255) << 8) | ((C3691q1.m8803a(2 + j) & 255) << 16);
            }
            throw C3606c0.m8181h();
        }

        /* renamed from: w */
        public long mo9784w() {
            long j = this.f9091i;
            if (this.f9090h - j >= 8) {
                this.f9091i = 8 + j;
                return ((((long) C3691q1.m8803a(j + 7)) & 255) << 56) | (((long) C3691q1.m8803a(j)) & 255) | ((((long) C3691q1.m8803a(1 + j)) & 255) << 8) | ((((long) C3691q1.m8803a(2 + j)) & 255) << 16) | ((((long) C3691q1.m8803a(3 + j)) & 255) << 24) | ((((long) C3691q1.m8803a(4 + j)) & 255) << 32) | ((((long) C3691q1.m8803a(5 + j)) & 255) << 40) | ((((long) C3691q1.m8803a(6 + j)) & 255) << 48);
            }
            throw C3606c0.m8181h();
        }

        /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.a(long):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r4) < 0) goto L_0x0085;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo9785x() {
            /*
                r10 = this;
                long r0 = r10.f9091i
                long r2 = r10.f9090h
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r0)
                if (r0 < 0) goto L_0x0017
                r10.f9091i = r4
                return r0
            L_0x0017:
                long r6 = r10.f9090h
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8803a(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo9787z()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f9091i = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.C3661d.mo9785x():int");
        }

        /* renamed from: y */
        public long mo9786y() {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f9091i;
            if (this.f9090h != j4) {
                long j5 = j4 + 1;
                byte a = C3691q1.m8803a(j4);
                if (a >= 0) {
                    this.f9091i = j5;
                    return (long) a;
                } else if (this.f9090h - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte a2 = a ^ (C3691q1.m8803a(j5) << 7);
                    if (a2 < 0) {
                        b = a2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte a3 = a2 ^ (C3691q1.m8803a(j6) << 14);
                        if (a3 >= 0) {
                            j = (long) (a3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte a4 = a3 ^ (C3691q1.m8803a(j7) << 21);
                            if (a4 < 0) {
                                b = a4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long a5 = ((long) a4) ^ (((long) C3691q1.m8803a(j6)) << 28);
                                if (a5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long a6 = a5 ^ (((long) C3691q1.m8803a(j7)) << 35);
                                    if (a6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        a5 = a6 ^ (((long) C3691q1.m8803a(j8)) << 42);
                                        if (a5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            a6 = a5 ^ (((long) C3691q1.m8803a(j7)) << 49);
                                            if (a6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (a6 ^ (((long) C3691q1.m8803a(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C3691q1.m8803a(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f9091i = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = a6 ^ j2;
                                    j6 = j8;
                                    this.f9091i = j6;
                                    return j;
                                }
                                j = a5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f9091i = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f9091i = j6;
                    return j;
                }
            }
            return mo9787z();
        }

        /* renamed from: z */
        public long mo9787z() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte u = mo9782u();
                j |= ((long) (u & Byte.MAX_VALUE)) << i;
                if ((u & 128) == 0) {
                    return j;
                }
            }
            throw C3606c0.m8178e();
        }

        /* renamed from: d */
        public boolean mo9739d(int i) {
            int i2;
            int r;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = 8;
                } else if (i3 == 2) {
                    i2 = mo9785x();
                } else if (i3 == 3) {
                    do {
                        r = mo9753r();
                        if (r == 0) {
                            break;
                        }
                    } while (mo9739d(r));
                    mo9733a(((i >>> 3) << 3) | 4);
                    return true;
                } else if (i3 == 4) {
                    return false;
                } else {
                    if (i3 == 5) {
                        mo9781f(4);
                        return true;
                    }
                    throw C3606c0.m8177d();
                }
                mo9781f(i2);
                return true;
            }
            if (mo9779B() >= 10) {
                while (i4 < 10) {
                    long j = this.f9091i;
                    this.f9091i = 1 + j;
                    if (C3691q1.m8803a(j) < 0) {
                        i4++;
                    }
                }
                throw C3606c0.m8178e();
            }
            while (i4 < 10) {
                if (mo9782u() < 0) {
                    i4++;
                }
            }
            throw C3606c0.m8178e();
            return true;
        }
    }

    public C3656k() {
    }

    public /* synthetic */ C3656k(C3657a aVar) {
    }

    /* renamed from: a */
    public static int m8443a(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C3606c0.m8181h();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C3606c0.m8181h();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw C3606c0.m8178e();
    }

    /* renamed from: a */
    public static long m8444a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static C3656k m8445a(InputStream inputStream) {
        if (inputStream != null) {
            return new C3659c(inputStream, 4096, null);
        }
        byte[] bArr = C3594b0.f8973b;
        return m8447a(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static C3656k m8447a(byte[] bArr, int i, int i2, boolean z) {
        C3658b bVar = new C3658b(bArr, i, i2, z, null);
        try {
            bVar.mo9736c(i2);
            return bVar;
        } catch (C3606c0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m8448e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo9732a();

    /* renamed from: a */
    public abstract void mo9733a(int i);

    /* renamed from: b */
    public abstract void mo9734b(int i);

    /* renamed from: b */
    public abstract boolean mo9735b();

    /* renamed from: c */
    public abstract int mo9736c(int i);

    /* renamed from: c */
    public abstract boolean mo9737c();

    /* renamed from: d */
    public abstract C3635j mo9738d();

    /* renamed from: d */
    public abstract boolean mo9739d(int i);

    /* renamed from: e */
    public abstract double mo9740e();

    /* renamed from: f */
    public abstract int mo9741f();

    /* renamed from: g */
    public abstract int mo9742g();

    /* renamed from: h */
    public abstract long mo9743h();

    /* renamed from: i */
    public abstract float mo9744i();

    /* renamed from: j */
    public abstract int mo9745j();

    /* renamed from: k */
    public abstract long mo9746k();

    /* renamed from: l */
    public abstract int mo9747l();

    /* renamed from: m */
    public abstract long mo9748m();

    /* renamed from: n */
    public abstract int mo9749n();

    /* renamed from: o */
    public abstract long mo9750o();

    /* renamed from: p */
    public abstract String mo9751p();

    /* renamed from: q */
    public abstract String mo9752q();

    /* renamed from: r */
    public abstract int mo9753r();

    /* renamed from: s */
    public abstract int mo9754s();

    /* renamed from: t */
    public abstract long mo9755t();

    /* renamed from: a */
    public static C3656k m8446a(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m8447a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        } else if (byteBuffer.isDirect() && C3691q1.f9141g) {
            return new C3661d(byteBuffer, z, null);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            return m8447a(bArr, 0, remaining, true);
        }
    }
}
