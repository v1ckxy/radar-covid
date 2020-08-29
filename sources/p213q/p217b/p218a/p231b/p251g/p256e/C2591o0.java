package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.o0 */
public final class C2591o0 extends C2490i6<C2591o0, C2592a> implements C2652r7 {
    public static final C2591o0 zzj;
    public static volatile C2348a8<C2591o0> zzk;
    public int zzc;
    public int zzd;
    public String zze = Objects.EMPTY_STRING;
    public C2556m0 zzf;
    public boolean zzg;
    public boolean zzh;
    public boolean zzi;

    /* renamed from: q.b.a.b.g.e.o0$a */
    public static final class C2592a extends C2491a<C2591o0, C2592a> implements C2652r7 {
        public C2592a() {
            super(C2591o0.zzj);
        }

        public /* synthetic */ C2592a(C2506j0 j0Var) {
            super(C2591o0.zzj);
        }
    }

    static {
        C2591o0 o0Var = new C2591o0();
        zzj = o0Var;
        C2490i6.zzd.put(C2591o0.class, o0Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2506j0.f6636a[i - 1]) {
            case 1:
                return new C2591o0();
            case 2:
                return new C2592a(null);
            case 3:
                return new C2420e8(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                C2348a8<C2591o0> a8Var = zzk;
                if (a8Var == null) {
                    synchronized (C2591o0.class) {
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

    /* renamed from: a */
    public final boolean mo7904a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6196a(C2591o0 o0Var, String str) {
        if (o0Var != null) {
            str.getClass();
            o0Var.zzc |= 2;
            o0Var.zze = str;
            return;
        }
        throw null;
    }
}
