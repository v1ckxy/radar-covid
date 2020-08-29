package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.l0 */
public final class C2539l0 extends C2490i6<C2539l0, C2540a> implements C2652r7 {
    public static final C2539l0 zzl;
    public static volatile C2348a8<C2539l0> zzm;
    public int zzc;
    public int zzd;
    public String zze = Objects.EMPTY_STRING;
    public C2635q6<C2556m0> zzf = C2365b8.f6336h;
    public boolean zzg;
    public C2573n0 zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;

    /* renamed from: q.b.a.b.g.e.l0$a */
    public static final class C2540a extends C2491a<C2539l0, C2540a> implements C2652r7 {
        public C2540a() {
            super(C2539l0.zzl);
        }

        public /* synthetic */ C2540a(C2506j0 j0Var) {
            super(C2539l0.zzl);
        }
    }

    static {
        C2539l0 l0Var = new C2539l0();
        zzl = l0Var;
        C2490i6.zzd.put(C2539l0.class, l0Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2506j0.f6636a[i - 1]) {
            case 1:
                return new C2539l0();
            case 2:
                return new C2540a(null);
            case 3:
                return new C2420e8(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C2556m0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                C2348a8<C2539l0> a8Var = zzm;
                if (a8Var == null) {
                    synchronized (C2539l0.class) {
                        a8Var = zzm;
                        if (a8Var == null) {
                            a8Var = new C2493c<>(zzl);
                            zzm = a8Var;
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
    public final boolean mo7835a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: k */
    public final boolean mo7836k() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6095a(C2539l0 l0Var, int i, C2556m0 m0Var) {
        if (l0Var != null) {
            m0Var.getClass();
            C2635q6<C2556m0> q6Var = l0Var.zzf;
            if (!q6Var.mo7387a()) {
                l0Var.zzf = C2490i6.m5946a(q6Var);
            }
            l0Var.zzf.set(i, m0Var);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6096a(C2539l0 l0Var, String str) {
        if (l0Var != null) {
            str.getClass();
            l0Var.zzc |= 2;
            l0Var.zze = str;
            return;
        }
        throw null;
    }
}
