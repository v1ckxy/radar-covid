package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Arrays;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3722v1.C3723a;

/* renamed from: q.b.c.a.j0.a.n1 */
public final class C3680n1 {

    /* renamed from: f */
    public static final C3680n1 f9117f = new C3680n1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f9118a;

    /* renamed from: b */
    public int[] f9119b;

    /* renamed from: c */
    public Object[] f9120c;

    /* renamed from: d */
    public int f9121d;

    /* renamed from: e */
    public boolean f9122e;

    public C3680n1() {
        this(0, new int[8], new Object[8], true);
    }

    public C3680n1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9121d = -1;
        this.f9118a = i;
        this.f9119b = iArr;
        this.f9120c = objArr;
        this.f9122e = z;
    }

    /* renamed from: a */
    public static C3680n1 m8770a(C3680n1 n1Var, C3680n1 n1Var2) {
        int i = n1Var.f9118a + n1Var2.f9118a;
        int[] copyOf = Arrays.copyOf(n1Var.f9119b, i);
        System.arraycopy(n1Var2.f9119b, 0, copyOf, n1Var.f9118a, n1Var2.f9118a);
        Object[] copyOf2 = Arrays.copyOf(n1Var.f9120c, i);
        System.arraycopy(n1Var2.f9120c, 0, copyOf2, n1Var.f9118a, n1Var2.f9118a);
        return new C3680n1(i, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public static C3680n1 m8772c() {
        return new C3680n1(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public void mo9858a() {
        if (!this.f9122e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public boolean mo9861a(int i, C3656k kVar) {
        int r;
        mo9858a();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            mo9859a(i, (Object) Long.valueOf(kVar.mo9746k()));
            return true;
        } else if (i3 == 1) {
            mo9859a(i, (Object) Long.valueOf(kVar.mo9743h()));
            return true;
        } else if (i3 == 2) {
            mo9859a(i, (Object) kVar.mo9738d());
            return true;
        } else if (i3 == 3) {
            C3680n1 n1Var = new C3680n1(0, new int[8], new Object[8], true);
            do {
                r = kVar.mo9753r();
                if (r == 0) {
                    break;
                }
            } while (n1Var.mo9861a(r, kVar));
            kVar.mo9733a((i2 << 3) | 4);
            mo9859a(i, (Object) n1Var);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                mo9859a(i, (Object) Integer.valueOf(kVar.mo9742g()));
                return true;
            }
            throw C3606c0.m8177d();
        }
    }

    /* renamed from: b */
    public int mo9862b() {
        int i;
        int i2 = this.f9121d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9118a; i4++) {
            int i5 = this.f9119b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C3670m.m8667g(i6, ((Long) this.f9120c[i4]).longValue());
            } else if (i7 == 1) {
                i = C3670m.m8648c(i6, ((Long) this.f9120c[i4]).longValue());
            } else if (i7 == 2) {
                i = C3670m.m8649c(i6, (C3635j) this.f9120c[i4]);
            } else if (i7 == 3) {
                i3 = ((C3680n1) this.f9120c[i4]).mo9862b() + (C3670m.m8669h(i6) * 2) + i3;
            } else if (i7 == 5) {
                i = C3670m.m8662f(i6, ((Integer) this.f9120c[i4]).intValue());
            } else {
                throw new IllegalStateException(C3606c0.m8177d());
            }
            i3 = i + i3;
        }
        this.f9121d = i3;
        return i3;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3680n1)) {
            return false;
        }
        C3680n1 n1Var = (C3680n1) obj;
        int i = this.f9118a;
        if (i == n1Var.f9118a) {
            int[] iArr = this.f9119b;
            int[] iArr2 = n1Var.f9119b;
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
                Object[] objArr = this.f9120c;
                Object[] objArr2 = n1Var.f9120c;
                int i3 = this.f9118a;
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

    public int hashCode() {
        int i = this.f9118a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f9119b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f9120c;
        for (int i7 = 0; i7 < this.f9118a; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: a */
    public void mo9859a(int i, Object obj) {
        mo9858a();
        int i2 = this.f9118a;
        if (i2 == this.f9119b.length) {
            int i3 = this.f9118a + (i2 < 4 ? 8 : i2 >> 1);
            this.f9119b = Arrays.copyOf(this.f9119b, i3);
            this.f9120c = Arrays.copyOf(this.f9120c, i3);
        }
        int[] iArr = this.f9119b;
        int i4 = this.f9118a;
        iArr[i4] = i;
        this.f9120c[i4] = obj;
        this.f9118a = i4 + 1;
    }

    /* renamed from: a */
    public static void m8771a(int i, Object obj, C3722v1 v1Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ((C3678n) v1Var).f9116a.mo9811b(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            ((C3678n) v1Var).f9116a.mo9801a(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            ((C3678n) v1Var).f9116a.mo9803a(i2, (C3635j) obj);
        } else if (i3 == 3) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                C3723a aVar = C3723a.ASCENDING;
                if (aVar == aVar) {
                    nVar.f9116a.mo9815c(i2, 3);
                    ((C3680n1) obj).mo9860a(v1Var);
                    nVar.f9116a.mo9815c(i2, 4);
                    return;
                }
                nVar.f9116a.mo9815c(i2, 4);
                ((C3680n1) obj).mo9860a(v1Var);
                nVar.f9116a.mo9815c(i2, 3);
                return;
            }
            throw null;
        } else if (i3 == 5) {
            ((C3678n) v1Var).f9116a.mo9800a(i2, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(C3606c0.m8177d());
        }
    }

    /* renamed from: a */
    public void mo9860a(C3722v1 v1Var) {
        int i = this.f9118a;
        if (i != 0) {
            if (((C3678n) v1Var) != null) {
                C3723a aVar = C3723a.ASCENDING;
                if (aVar == aVar) {
                    for (int i2 = 0; i2 < this.f9118a; i2++) {
                        m8771a(this.f9119b[i2], this.f9120c[i2], v1Var);
                    }
                } else {
                    for (int i3 = i - 1; i3 >= 0; i3--) {
                        m8771a(this.f9119b[i3], this.f9120c[i3], v1Var);
                    }
                }
                return;
            }
            throw null;
        }
    }
}
