package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.h1 */
public final class C2467h1 extends C2490i6<C2467h1, C2468a> implements C2652r7 {
    public static final C2467h1 zzf;
    public static volatile C2348a8<C2467h1> zzg;
    public int zzc;
    public int zzd;
    public C2581n6 zze = C2402d7.f6444h;

    /* renamed from: q.b.a.b.g.e.h1$a */
    public static final class C2468a extends C2491a<C2467h1, C2468a> implements C2652r7 {
        public C2468a() {
            super(C2467h1.zzf);
        }

        public /* synthetic */ C2468a(C2741x0 x0Var) {
            super(C2467h1.zzf);
        }
    }

    static {
        C2467h1 h1Var = new C2467h1();
        zzf = h1Var;
        C2490i6.zzd.put(C2467h1.class, h1Var);
    }

    /* renamed from: a */
    public final long mo7699a(int i) {
        C2402d7 d7Var = (C2402d7) this.zze;
        d7Var.mo7533f(i);
        return d7Var.f6445f[i];
    }

    /* renamed from: a */
    public final boolean mo7700a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: k */
    public final int mo7701k() {
        return this.zze.size();
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2467h1();
            case 2:
                return new C2468a(null);
            case 3:
                return new C2420e8(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C2348a8<C2467h1> a8Var = zzg;
                if (a8Var == null) {
                    synchronized (C2467h1.class) {
                        a8Var = zzg;
                        if (a8Var == null) {
                            a8Var = new C2493c<>(zzf);
                            zzg = a8Var;
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
}
