package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.f1 */
public final class C2429f1 extends C2490i6<C2429f1, C2430a> implements C2652r7 {
    public static final C2429f1 zzf;
    public static volatile C2348a8<C2429f1> zzg;
    public int zzc;
    public int zzd = 1;
    public C2635q6<C2357b1> zze = C2365b8.f6336h;

    /* renamed from: q.b.a.b.g.e.f1$a */
    public static final class C2430a extends C2491a<C2429f1, C2430a> implements C2652r7 {
        public /* synthetic */ C2430a(C2741x0 x0Var) {
            super(C2429f1.zzf);
        }
    }

    /* renamed from: q.b.a.b.g.e.f1$b */
    public enum C2431b implements C2529k6 {
        RADS(1),
        PROVISIONING(2);
        

        /* renamed from: e */
        public final int f6518e;

        /* access modifiers changed from: public */
        C2431b(int i) {
            this.f6518e = i;
        }

        /* renamed from: a */
        public static C2431b m5796a(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        /* renamed from: b */
        public static C2563m6 m5797b() {
            return C2507j1.f6637a;
        }

        /* renamed from: a */
        public final int mo7628a() {
            return this.f6518e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(C2431b.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.f6518e);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    static {
        C2429f1 f1Var = new C2429f1();
        zzf = f1Var;
        C2490i6.zzd.put(C2429f1.class, f1Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2429f1();
            case 2:
                return new C2430a(null);
            case 3:
                return new C2420e8(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", C2431b.m5797b(), "zze", C2357b1.class});
            case 4:
                return zzf;
            case 5:
                C2348a8<C2429f1> a8Var = zzg;
                if (a8Var == null) {
                    synchronized (C2429f1.class) {
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
