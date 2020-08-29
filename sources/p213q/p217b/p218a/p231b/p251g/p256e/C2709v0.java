package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.v0 */
public final class C2709v0 extends C2490i6<C2709v0, C2710a> implements C2652r7 {
    public static final C2709v0 zzl;
    public static volatile C2348a8<C2709v0> zzm;
    public int zzc;
    public long zzd;
    public String zze;
    public int zzf;
    public C2635q6<C2725w0> zzg;
    public C2635q6<C2692u0> zzh;
    public C2635q6<C2522k0> zzi;
    public String zzj;
    public boolean zzk;

    /* renamed from: q.b.a.b.g.e.v0$a */
    public static final class C2710a extends C2491a<C2709v0, C2710a> implements C2652r7 {
        public C2710a() {
            super(C2709v0.zzl);
        }

        public /* synthetic */ C2710a(C2661s0 s0Var) {
            super(C2709v0.zzl);
        }
    }

    static {
        C2709v0 v0Var = new C2709v0();
        zzl = v0Var;
        C2490i6.zzd.put(C2709v0.class, v0Var);
    }

    public C2709v0() {
        String str = Objects.EMPTY_STRING;
        this.zze = str;
        C2365b8<Object> b8Var = C2365b8.f6336h;
        this.zzg = b8Var;
        this.zzh = b8Var;
        this.zzi = b8Var;
        this.zzj = str;
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2661s0.f6857a[i - 1]) {
            case 1:
                return new C2709v0();
            case 2:
                return new C2710a(null);
            case 3:
                return new C2420e8(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C2725w0.class, "zzh", C2692u0.class, "zzi", C2522k0.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                C2348a8<C2709v0> a8Var = zzm;
                if (a8Var == null) {
                    synchronized (C2709v0.class) {
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
    public final boolean mo8052a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: k */
    public final long mo8053k() {
        return this.zzd;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6484a(C2709v0 v0Var) {
        if (v0Var != null) {
            v0Var.zzi = C2365b8.f6336h;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6485a(C2709v0 v0Var, int i, C2692u0 u0Var) {
        if (v0Var != null) {
            u0Var.getClass();
            C2635q6<C2692u0> q6Var = v0Var.zzh;
            if (!q6Var.mo7387a()) {
                v0Var.zzh = C2490i6.m5946a(q6Var);
            }
            v0Var.zzh.set(i, u0Var);
            return;
        }
        throw null;
    }
}
