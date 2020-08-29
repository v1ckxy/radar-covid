package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.z0 */
public final class C2772z0 extends C2490i6<C2772z0, C2773a> implements C2652r7 {
    public static final C2772z0 zzf;
    public static volatile C2348a8<C2772z0> zzg;
    public int zzc;
    public int zzd;
    public long zze;

    /* renamed from: q.b.a.b.g.e.z0$a */
    public static final class C2773a extends C2491a<C2772z0, C2773a> implements C2652r7 {
        public C2773a() {
            super(C2772z0.zzf);
        }

        public /* synthetic */ C2773a(C2741x0 x0Var) {
            super(C2772z0.zzf);
        }
    }

    static {
        C2772z0 z0Var = new C2772z0();
        zzf = z0Var;
        C2490i6.zzd.put(C2772z0.class, z0Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2772z0();
            case 2:
                return new C2773a(null);
            case 3:
                return new C2420e8(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C2348a8<C2772z0> a8Var = zzg;
                if (a8Var == null) {
                    synchronized (C2772z0.class) {
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

    /* renamed from: k */
    public final boolean mo8129k() {
        return (this.zzc & 2) != 0;
    }
}
