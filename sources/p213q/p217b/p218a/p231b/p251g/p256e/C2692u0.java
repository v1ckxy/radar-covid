package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.u0 */
public final class C2692u0 extends C2490i6<C2692u0, C2693a> implements C2652r7 {
    public static final C2692u0 zzh;
    public static volatile C2348a8<C2692u0> zzi;
    public int zzc;
    public String zzd = Objects.EMPTY_STRING;
    public boolean zze;
    public boolean zzf;
    public int zzg;

    /* renamed from: q.b.a.b.g.e.u0$a */
    public static final class C2693a extends C2491a<C2692u0, C2693a> implements C2652r7 {
        public C2693a() {
            super(C2692u0.zzh);
        }

        /* renamed from: a */
        public final String mo8044a() {
            return ((C2692u0) this.f6618f).zzd;
        }

        /* renamed from: n */
        public final int mo8045n() {
            return ((C2692u0) this.f6618f).zzg;
        }

        public /* synthetic */ C2693a(C2661s0 s0Var) {
            super(C2692u0.zzh);
        }
    }

    static {
        C2692u0 u0Var = new C2692u0();
        zzh = u0Var;
        C2490i6.zzd.put(C2692u0.class, u0Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2661s0.f6857a[i - 1]) {
            case 1:
                return new C2692u0();
            case 2:
                return new C2693a(null);
            case 3:
                return new C2420e8(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C2348a8<C2692u0> a8Var = zzi;
                if (a8Var == null) {
                    synchronized (C2692u0.class) {
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
    public static /* synthetic */ void m6453a(C2692u0 u0Var, String str) {
        if (u0Var != null) {
            str.getClass();
            u0Var.zzc |= 1;
            u0Var.zzd = str;
            return;
        }
        throw null;
    }
}
