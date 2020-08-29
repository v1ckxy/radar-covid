package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.c1 */
public final class C2378c1 extends C2490i6<C2378c1, C2379a> implements C2652r7 {
    public static final C2378c1 zzj;
    public static volatile C2348a8<C2378c1> zzk;
    public int zzc;
    public String zzd;
    public String zze;
    public long zzf;
    public float zzg;
    public double zzh;
    public C2635q6<C2378c1> zzi = C2365b8.f6336h;

    /* renamed from: q.b.a.b.g.e.c1$a */
    public static final class C2379a extends C2491a<C2378c1, C2379a> implements C2652r7 {
        public C2379a() {
            super(C2378c1.zzj);
        }

        /* renamed from: a */
        public final C2379a mo7479a(double d) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2378c1 c1Var = (C2378c1) this.f6618f;
            c1Var.zzc |= 16;
            c1Var.zzh = d;
            return this;
        }

        /* renamed from: a */
        public final C2379a mo7482a(String str) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2378c1.m5576a((C2378c1) this.f6618f, str);
            return this;
        }

        /* renamed from: b */
        public final C2379a mo7483b(String str) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2378c1.m5578b((C2378c1) this.f6618f, str);
            return this;
        }

        /* renamed from: a */
        public final C2379a mo7480a(long j) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2378c1 c1Var = (C2378c1) this.f6618f;
            c1Var.zzc |= 4;
            c1Var.zzf = j;
            return this;
        }

        public /* synthetic */ C2379a(C2741x0 x0Var) {
            super(C2378c1.zzj);
        }

        /* renamed from: a */
        public final C2379a mo7481a(Iterable<? extends C2378c1> iterable) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2378c1 c1Var = (C2378c1) this.f6618f;
            C2635q6<C2378c1> q6Var = c1Var.zzi;
            if (!q6Var.mo7387a()) {
                c1Var.zzi = C2490i6.m5946a(q6Var);
            }
            C2730w4.m6511a(iterable, c1Var.zzi);
            return this;
        }
    }

    static {
        C2378c1 c1Var = new C2378c1();
        zzj = c1Var;
        C2490i6.zzd.put(C2378c1.class, c1Var);
    }

    public C2378c1() {
        String str = Objects.EMPTY_STRING;
        this.zzd = str;
        this.zze = str;
    }

    /* renamed from: b */
    public static /* synthetic */ void m5578b(C2378c1 c1Var, String str) {
        if (c1Var != null) {
            str.getClass();
            c1Var.zzc |= 2;
            c1Var.zze = str;
            return;
        }
        throw null;
    }

    /* renamed from: s */
    public static C2379a m5579s() {
        return (C2379a) zzj.mo7768g();
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        Class<C2378c1> cls = C2378c1.class;
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2378c1();
            case 2:
                return new C2379a(null);
            case 3:
                return new C2420e8(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", cls});
            case 4:
                return zzj;
            case 5:
                C2348a8<C2378c1> a8Var = zzk;
                if (a8Var == null) {
                    synchronized (cls) {
                        a8Var = zzk;
                        if (a8Var == null) {
                            a8Var = new C2493c<>(zzj);
                            zzk = a8Var;
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

    /* renamed from: k */
    public final String mo7471k() {
        return this.zzd;
    }

    /* renamed from: l */
    public final boolean mo7472l() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: m */
    public final String mo7473m() {
        return this.zze;
    }

    /* renamed from: n */
    public final boolean mo7474n() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: o */
    public final long mo7475o() {
        return this.zzf;
    }

    /* renamed from: p */
    public final boolean mo7476p() {
        return (this.zzc & 16) != 0;
    }

    /* renamed from: q */
    public final double mo7477q() {
        return this.zzh;
    }

    /* renamed from: r */
    public final int mo7478r() {
        return this.zzi.size();
    }

    /* renamed from: a */
    public static /* synthetic */ void m5577a(C2378c1 c1Var, C2378c1 c1Var2) {
        if (c1Var != null) {
            c1Var2.getClass();
            C2635q6<C2378c1> q6Var = c1Var.zzi;
            if (!q6Var.mo7387a()) {
                c1Var.zzi = C2490i6.m5946a(q6Var);
            }
            c1Var.zzi.add(c1Var2);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5576a(C2378c1 c1Var, String str) {
        if (c1Var != null) {
            str.getClass();
            c1Var.zzc |= 1;
            c1Var.zzd = str;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5575a(C2378c1 c1Var) {
        if (c1Var != null) {
            c1Var.zzi = C2365b8.f6336h;
            return;
        }
        throw null;
    }
}
