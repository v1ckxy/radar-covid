package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.m0 */
public final class C2556m0 extends C2490i6<C2556m0, C2557a> implements C2652r7 {
    public static final C2556m0 zzh;
    public static volatile C2348a8<C2556m0> zzi;
    public int zzc;
    public C2608p0 zzd;
    public C2573n0 zze;
    public boolean zzf;
    public String zzg = Objects.EMPTY_STRING;

    /* renamed from: q.b.a.b.g.e.m0$a */
    public static final class C2557a extends C2491a<C2556m0, C2557a> implements C2652r7 {
        public C2557a() {
            super(C2556m0.zzh);
        }

        public /* synthetic */ C2557a(C2506j0 j0Var) {
            super(C2556m0.zzh);
        }
    }

    static {
        C2556m0 m0Var = new C2556m0();
        zzh = m0Var;
        C2490i6.zzd.put(C2556m0.class, m0Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2506j0.f6636a[i - 1]) {
            case 1:
                return new C2556m0();
            case 2:
                return new C2557a(null);
            case 3:
                return new C2420e8(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C2348a8<C2556m0> a8Var = zzi;
                if (a8Var == null) {
                    synchronized (C2556m0.class) {
                        a8Var = zzi;
                        if (a8Var == null) {
                            a8Var = new C2493c<>(zzh);
                            zzi = a8Var;
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
    public final boolean mo7860a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: k */
    public final C2608p0 mo7861k() {
        C2608p0 p0Var = this.zzd;
        return p0Var == null ? C2608p0.zzh : p0Var;
    }

    /* renamed from: l */
    public final boolean mo7862l() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: m */
    public final C2573n0 mo7863m() {
        C2573n0 n0Var = this.zze;
        return n0Var == null ? C2573n0.zzi : n0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6132a(C2556m0 m0Var, String str) {
        if (m0Var != null) {
            str.getClass();
            m0Var.zzc |= 8;
            m0Var.zzg = str;
            return;
        }
        throw null;
    }
}
