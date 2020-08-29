package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.b1 */
public final class C2357b1 extends C2490i6<C2357b1, C2358a> implements C2652r7 {
    public static final C2357b1 zzf;
    public static volatile C2348a8<C2357b1> zzg;
    public int zzc;
    public String zzd = Objects.EMPTY_STRING;
    public long zze;

    /* renamed from: q.b.a.b.g.e.b1$a */
    public static final class C2358a extends C2491a<C2357b1, C2358a> implements C2652r7 {
        public /* synthetic */ C2358a(C2741x0 x0Var) {
            super(C2357b1.zzf);
        }
    }

    static {
        C2357b1 b1Var = new C2357b1();
        zzf = b1Var;
        C2490i6.zzd.put(C2357b1.class, b1Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2357b1();
            case 2:
                return new C2358a(null);
            case 3:
                return new C2420e8(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C2348a8<C2357b1> a8Var = zzg;
                if (a8Var == null) {
                    synchronized (C2357b1.class) {
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
