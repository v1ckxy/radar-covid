package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.C2616a;

/* renamed from: q.b.a.b.g.e.t8 */
public final class C2685t8 {

    /* renamed from: f */
    public static final C2685t8 f6893f = new C2685t8(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f6894a;

    /* renamed from: b */
    public int[] f6895b;

    /* renamed from: c */
    public Object[] f6896c;

    /* renamed from: d */
    public int f6897d;

    /* renamed from: e */
    public boolean f6898e;

    public C2685t8() {
        this(0, new int[8], new Object[8], true);
    }

    public C2685t8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f6897d = -1;
        this.f6894a = i;
        this.f6895b = iArr;
        this.f6896c = objArr;
        this.f6898e = z;
    }

    /* renamed from: a */
    public static void m6438a(int i, Object obj, C2584n9 n9Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ((C2650r5) n9Var).mo7980a(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            ((C2650r5) n9Var).mo7991d(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            ((C2650r5) n9Var).mo7983a(i2, (C2435f5) obj);
        } else if (i3 == 3) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i4 = i2 << 3;
                ((C2616a) r5Var.f6834a).mo7946b(i4 | 3);
                ((C2685t8) obj).mo8034a(n9Var);
                ((C2616a) r5Var.f6834a).mo7946b(i4 | 4);
                return;
            }
            throw null;
        } else if (i3 == 5) {
            ((C2650r5) n9Var).mo7985b(i2, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(C2618p6.m6293d());
        }
    }

    /* renamed from: b */
    public static C2685t8 m6439b() {
        return new C2685t8(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo8032a() {
        int i;
        int i2 = this.f6897d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f6894a; i4++) {
            int i5 = this.f6895b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C2615p5.m6240b(i6, ((Long) this.f6896c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.f6896c[i4]).longValue();
                i = C2615p5.m6261i(i6);
            } else if (i7 == 2) {
                i = C2615p5.m6229a(i6, (C2435f5) this.f6896c[i4]);
            } else if (i7 == 3) {
                i3 = ((C2685t8) this.f6896c[i4]).mo8032a() + (C2615p5.m6256f(i6) << 1) + i3;
            } else if (i7 == 5) {
                ((Integer) this.f6896c[i4]).intValue();
                i = C2615p5.m6264l(i6);
            } else {
                throw new IllegalStateException(C2618p6.m6293d());
            }
            i3 = i + i3;
        }
        this.f6897d = i3;
        return i3;
    }

    /* renamed from: a */
    public final void mo8033a(int i, Object obj) {
        if (this.f6898e) {
            int i2 = this.f6894a;
            if (i2 == this.f6895b.length) {
                int i3 = this.f6894a + (i2 < 4 ? 8 : i2 >> 1);
                this.f6895b = Arrays.copyOf(this.f6895b, i3);
                this.f6896c = Arrays.copyOf(this.f6896c, i3);
            }
            int[] iArr = this.f6895b;
            int i4 = this.f6894a;
            iArr[i4] = i;
            this.f6896c[i4] = obj;
            this.f6894a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2685t8)) {
            return false;
        }
        C2685t8 t8Var = (C2685t8) obj;
        int i = this.f6894a;
        if (i == t8Var.f6894a) {
            int[] iArr = this.f6895b;
            int[] iArr2 = t8Var.f6895b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f6896c;
                Object[] objArr2 = t8Var.f6896c;
                int i3 = this.f6894a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f6894a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f6895b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f6896c;
        for (int i7 = 0; i7 < this.f6894a; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: a */
    public final void mo8034a(C2584n9 n9Var) {
        if (this.f6894a != 0) {
            if (((C2650r5) n9Var) != null) {
                for (int i = 0; i < this.f6894a; i++) {
                    m6438a(this.f6895b[i], this.f6896c[i], n9Var);
                }
                return;
            }
            throw null;
        }
    }
}
