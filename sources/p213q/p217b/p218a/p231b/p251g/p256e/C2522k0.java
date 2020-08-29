package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.k0 */
public final class C2522k0 extends C2490i6<C2522k0, C2523a> implements C2652r7 {
    public static final C2522k0 zzi;
    public static volatile C2348a8<C2522k0> zzj;
    public int zzc;
    public int zzd;
    public C2635q6<C2591o0> zze;
    public C2635q6<C2539l0> zzf;
    public boolean zzg;
    public boolean zzh;

    /* renamed from: q.b.a.b.g.e.k0$a */
    public static final class C2523a extends C2491a<C2522k0, C2523a> implements C2652r7 {
        public C2523a() {
            super(C2522k0.zzi);
        }

        public /* synthetic */ C2523a(C2506j0 j0Var) {
            super(C2522k0.zzi);
        }
    }

    static {
        C2522k0 k0Var = new C2522k0();
        zzi = k0Var;
        C2490i6.zzd.put(C2522k0.class, k0Var);
    }

    public C2522k0() {
        C2365b8<Object> b8Var = C2365b8.f6336h;
        this.zze = b8Var;
        this.zzf = b8Var;
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2506j0.f6636a[i - 1]) {
            case 1:
                return new C2522k0();
            case 2:
                return new C2523a(null);
            case 3:
                return new C2420e8(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", C2591o0.class, "zzf", C2539l0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C2348a8<C2522k0> a8Var = zzj;
                if (a8Var == null) {
                    synchronized (C2522k0.class) {
                        a8Var = zzj;
                        if (a8Var == null) {
                            a8Var = new C2493c<>(zzi);
                            zzj = a8Var;
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
    public static /* synthetic */ void m6062a(C2522k0 k0Var, int i, C2539l0 l0Var) {
        if (k0Var != null) {
            l0Var.getClass();
            C2635q6<C2539l0> q6Var = k0Var.zzf;
            if (!q6Var.mo7387a()) {
                k0Var.zzf = C2490i6.m5946a(q6Var);
            }
            k0Var.zzf.set(i, l0Var);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6063a(C2522k0 k0Var, int i, C2591o0 o0Var) {
        if (k0Var != null) {
            o0Var.getClass();
            C2635q6<C2591o0> q6Var = k0Var.zze;
            if (!q6Var.mo7387a()) {
                k0Var.zze = C2490i6.m5946a(q6Var);
            }
            k0Var.zze.set(i, o0Var);
            return;
        }
        throw null;
    }
}
