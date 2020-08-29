package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.g1 */
public final class C2447g1 extends C2490i6<C2447g1, C2448a> implements C2652r7 {
    public static final C2447g1 zzg;
    public static volatile C2348a8<C2447g1> zzh;
    public C2581n6 zzc;
    public C2581n6 zzd;
    public C2635q6<C2772z0> zze;
    public C2635q6<C2467h1> zzf;

    /* renamed from: q.b.a.b.g.e.g1$a */
    public static final class C2448a extends C2491a<C2447g1, C2448a> implements C2652r7 {
        public C2448a() {
            super(C2447g1.zzg);
        }

        /* renamed from: a */
        public final C2448a mo7665a() {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2447g1.m5836a((C2447g1) this.f6618f);
            return this;
        }

        /* renamed from: a */
        public final C2448a mo7666a(int i) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2447g1 g1Var = (C2447g1) this.f6618f;
            C2635q6<C2772z0> q6Var = g1Var.zze;
            if (!q6Var.mo7387a()) {
                g1Var.zze = C2490i6.m5946a(q6Var);
            }
            g1Var.zze.remove(i);
            return this;
        }

        /* renamed from: b */
        public final C2448a mo7668b(int i) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2447g1 g1Var = (C2447g1) this.f6618f;
            C2635q6<C2467h1> q6Var = g1Var.zzf;
            if (!q6Var.mo7387a()) {
                g1Var.zzf = C2490i6.m5946a(q6Var);
            }
            g1Var.zzf.remove(i);
            return this;
        }

        public /* synthetic */ C2448a(C2741x0 x0Var) {
            super(C2447g1.zzg);
        }

        /* renamed from: a */
        public final C2448a mo7667a(Iterable<? extends Long> iterable) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2447g1 g1Var = (C2447g1) this.f6618f;
            C2581n6 n6Var = g1Var.zzc;
            if (!n6Var.mo7387a()) {
                g1Var.zzc = C2490i6.m5945a(n6Var);
            }
            C2730w4.m6511a(iterable, g1Var.zzc);
            return this;
        }

        /* renamed from: b */
        public final C2448a mo7669b(Iterable<? extends Long> iterable) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2447g1 g1Var = (C2447g1) this.f6618f;
            C2581n6 n6Var = g1Var.zzd;
            if (!n6Var.mo7387a()) {
                g1Var.zzd = C2490i6.m5945a(n6Var);
            }
            C2730w4.m6511a(iterable, g1Var.zzd);
            return this;
        }
    }

    static {
        C2447g1 g1Var = new C2447g1();
        zzg = g1Var;
        C2490i6.zzd.put(C2447g1.class, g1Var);
    }

    public C2447g1() {
        C2402d7 d7Var = C2402d7.f6444h;
        this.zzc = d7Var;
        this.zzd = d7Var;
        C2365b8<Object> b8Var = C2365b8.f6336h;
        this.zze = b8Var;
        this.zzf = b8Var;
    }

    /* renamed from: b */
    public static /* synthetic */ void m5837b(C2447g1 g1Var) {
        if (g1Var != null) {
            g1Var.zzd = C2402d7.f6444h;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2447g1();
            case 2:
                return new C2448a(null);
            case 3:
                return new C2420e8(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", C2772z0.class, "zzf", C2467h1.class});
            case 4:
                return zzg;
            case 5:
                C2348a8<C2447g1> a8Var = zzh;
                if (a8Var == null) {
                    synchronized (C2447g1.class) {
                        a8Var = zzh;
                        if (a8Var == null) {
                            a8Var = new C2493c<>(zzg);
                            zzh = a8Var;
                        }
                    }
                }
                return a8Var;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final C2772z0 mo7660a(int i) {
        return (C2772z0) this.zze.get(i);
    }

    /* renamed from: b */
    public final C2467h1 mo7661b(int i) {
        return (C2467h1) this.zzf.get(i);
    }

    /* renamed from: k */
    public final int mo7662k() {
        return this.zzc.size();
    }

    /* renamed from: l */
    public final int mo7663l() {
        return this.zze.size();
    }

    /* renamed from: m */
    public final int mo7664m() {
        return this.zzf.size();
    }

    /* renamed from: a */
    public static /* synthetic */ void m5836a(C2447g1 g1Var) {
        if (g1Var != null) {
            g1Var.zzc = C2402d7.f6444h;
            return;
        }
        throw null;
    }
}
