package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Iterator;
import java.util.Map.Entry;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2494d;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2495e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2698u5.C2699a;

/* renamed from: q.b.a.b.g.e.u7 */
public final class C2701u7<T> implements C2455g8<T> {

    /* renamed from: a */
    public final C2619p7 f6918a;

    /* renamed from: b */
    public final C2702u8<?, ?> f6919b;

    /* renamed from: c */
    public final boolean f6920c;

    /* renamed from: d */
    public final C2731w5<?> f6921d;

    public C2701u7(C2702u8<?, ?> u8Var, C2731w5<?> w5Var, C2619p7 p7Var) {
        this.f6919b = u8Var;
        if (((C2715v5) w5Var) != null) {
            this.f6920c = p7Var instanceof C2492b;
            this.f6921d = w5Var;
            this.f6918a = p7Var;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final int mo7678a(T t) {
        if (((C2734w8) this.f6919b) != null) {
            int hashCode = ((C2490i6) t).zzb.hashCode();
            if (!this.f6920c) {
                return hashCode;
            }
            if (((C2715v5) this.f6921d) != null) {
                return (hashCode * 53) + ((C2492b) t).zzc.hashCode();
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public final T mo7679a() {
        return ((C2491a) this.f6918a.mo7771j()).mo7777l();
    }

    /* renamed from: b */
    public final void mo7683b(T t, T t2) {
        C2498i8.m5987a(this.f6919b, t, t2);
        if (this.f6920c) {
            C2498i8.m5988a(this.f6921d, t, t2);
        }
    }

    /* renamed from: b */
    public final boolean mo7684b(T t) {
        if (((C2715v5) this.f6921d) != null) {
            return ((C2492b) t).zzc.mo8096c();
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo7685c(T t) {
        if (((C2734w8) this.f6919b) != null) {
            ((C2490i6) t).zzb.f6898e = false;
            if (((C2715v5) this.f6921d) != null) {
                ((C2492b) t).zzc.mo8092a();
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: d */
    public final int mo7686d(T t) {
        if (((C2734w8) this.f6919b) != null) {
            C2685t8 t8Var = ((C2490i6) t).zzb;
            int i = t8Var.f6897d;
            if (i == -1) {
                i = 0;
                for (int i2 = 0; i2 < t8Var.f6894a; i2++) {
                    int f = C2615p5.m6256f(1) << 1;
                    int c = C2615p5.m6244c(2, t8Var.f6895b[i2] >>> 3) + f;
                    i += C2615p5.m6229a(3, (C2435f5) t8Var.f6896c[i2]) + c;
                }
                t8Var.f6897d = i;
            }
            int i3 = i + 0;
            if (!this.f6920c) {
                return i3;
            }
            if (((C2715v5) this.f6921d) != null) {
                C2746x5<C2495e> x5Var = ((C2492b) t).zzc;
                int i4 = 0;
                for (int i5 = 0; i5 < x5Var.f6958a.mo7710b(); i5++) {
                    i4 += C2746x5.m6533c(x5Var.f6958a.mo7708a(i5));
                }
                for (Entry c2 : x5Var.f6958a.mo7712c()) {
                    i4 += C2746x5.m6533c(c2);
                }
                return i3 + i4;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo7680a(T t, C2584n9 n9Var) {
        if (((C2715v5) this.f6921d) != null) {
            Iterator b = ((C2492b) t).zzc.mo8095b();
            while (b.hasNext()) {
                Entry entry = (Entry) b.next();
                C2778z5 z5Var = (C2778z5) entry.getKey();
                if (z5Var.mo7784c() != C2601o9.MESSAGE || z5Var.mo7786d() || z5Var.mo7787e()) {
                    throw new IllegalStateException("Found invalid MessageSet item.");
                }
                ((C2650r5) n9Var).mo7981a(z5Var.mo7780a(), entry instanceof C2732w6 ? ((C2700u6) ((C2732w6) entry).f6941e.getValue()).mo8119b() : entry.getValue());
            }
            if (((C2734w8) this.f6919b) != null) {
                C2685t8 t8Var = ((C2490i6) t).zzb;
                if (t8Var != null) {
                    C2650r5 r5Var = (C2650r5) n9Var;
                    if (r5Var != null) {
                        for (int i = 0; i < t8Var.f6894a; i++) {
                            r5Var.mo7981a(t8Var.f6895b[i] >>> 3, t8Var.f6896c[i]);
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo7681a(T t, byte[] bArr, int i, int i2, C2362b5 b5Var) {
        C2490i6 i6Var = (C2490i6) t;
        C2685t8 t8Var = i6Var.zzb;
        if (t8Var == C2685t8.f6893f) {
            t8Var = C2685t8.m6439b();
            i6Var.zzb = t8Var;
        }
        ((C2492b) t).mo7779a();
        C2494d dVar = null;
        while (i < i2) {
            int a = C2286e.m5166a(bArr, i, b5Var);
            int i3 = b5Var.f6329a;
            if (i3 == 11) {
                int i4 = 0;
                Object obj = null;
                while (a < i2) {
                    a = C2286e.m5166a(bArr, a, b5Var);
                    int i5 = b5Var.f6329a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (dVar != null) {
                                C2386c8 c8Var = C2386c8.f6416c;
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                a = C2286e.m5327e(bArr, a, b5Var);
                                obj = (C2435f5) b5Var.f6331c;
                            }
                        }
                    } else if (i7 == 0) {
                        a = C2286e.m5166a(bArr, a, b5Var);
                        i4 = b5Var.f6329a;
                        C2731w5<?> w5Var = this.f6921d;
                        C2698u5 u5Var = b5Var.f6332d;
                        C2619p7 p7Var = this.f6918a;
                        if (((C2715v5) w5Var) != null) {
                            dVar = (C2494d) u5Var.f6915a.get(new C2699a(p7Var, i4));
                        } else {
                            throw null;
                        }
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a = C2286e.m5146a(i5, bArr, a, i2, b5Var);
                }
                if (obj != null) {
                    t8Var.mo8033a((i4 << 3) | 2, obj);
                }
                i = a;
            } else if ((i3 & 7) == 2) {
                C2731w5<?> w5Var2 = this.f6921d;
                C2698u5 u5Var2 = b5Var.f6332d;
                C2619p7 p7Var2 = this.f6918a;
                int i8 = i3 >>> 3;
                if (((C2715v5) w5Var2) != null) {
                    dVar = (C2494d) u5Var2.f6915a.get(new C2699a(p7Var2, i8));
                    if (dVar == null) {
                        i = C2286e.m5148a(i3, bArr, a, i2, t8Var, b5Var);
                    } else {
                        C2386c8 c8Var2 = C2386c8.f6416c;
                        throw new NoSuchMethodError();
                    }
                } else {
                    throw null;
                }
            } else {
                i = C2286e.m5146a(i3, bArr, a, i2, b5Var);
            }
        }
        if (i != i2) {
            throw C2618p6.m6294e();
        }
    }

    /* renamed from: a */
    public final boolean mo7682a(T t, T t2) {
        C2702u8<?, ?> u8Var = this.f6919b;
        if (((C2734w8) u8Var) != null) {
            C2685t8 t8Var = ((C2490i6) t).zzb;
            if (((C2734w8) u8Var) == null) {
                throw null;
            } else if (!t8Var.equals(((C2490i6) t2).zzb)) {
                return false;
            } else {
                if (!this.f6920c) {
                    return true;
                }
                C2731w5<?> w5Var = this.f6921d;
                if (((C2715v5) w5Var) != null) {
                    C2746x5<C2495e> x5Var = ((C2492b) t).zzc;
                    if (((C2715v5) w5Var) != null) {
                        return x5Var.equals(((C2492b) t2).zzc);
                    }
                    throw null;
                }
                throw null;
            }
        } else {
            throw null;
        }
    }
}
