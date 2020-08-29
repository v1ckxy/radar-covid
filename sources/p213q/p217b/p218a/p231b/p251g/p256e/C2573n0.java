package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.n0 */
public final class C2573n0 extends C2490i6<C2573n0, C2574a> implements C2652r7 {
    public static final C2573n0 zzi;
    public static volatile C2348a8<C2573n0> zzj;
    public int zzc;
    public int zzd;
    public boolean zze;
    public String zzf;
    public String zzg;
    public String zzh;

    /* renamed from: q.b.a.b.g.e.n0$a */
    public static final class C2574a extends C2491a<C2573n0, C2574a> implements C2652r7 {
        public /* synthetic */ C2574a(C2506j0 j0Var) {
            super(C2573n0.zzi);
        }
    }

    /* renamed from: q.b.a.b.g.e.n0$b */
    public enum C2575b implements C2529k6 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        

        /* renamed from: e */
        public final int f6731e;

        /* access modifiers changed from: public */
        C2575b(int i) {
            this.f6731e = i;
        }

        /* renamed from: a */
        public static C2575b m6164a(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        /* renamed from: b */
        public static C2563m6 m6165b() {
            return C2628q0.f6812a;
        }

        /* renamed from: a */
        public final int mo7628a() {
            return this.f6731e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(C2575b.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.f6731e);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    static {
        C2573n0 n0Var = new C2573n0();
        zzi = n0Var;
        C2490i6.zzd.put(C2573n0.class, n0Var);
    }

    public C2573n0() {
        String str = Objects.EMPTY_STRING;
        this.zzf = str;
        this.zzg = str;
        this.zzh = str;
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2506j0.f6636a[i - 1]) {
            case 1:
                return new C2573n0();
            case 2:
                return new C2574a(null);
            case 3:
                return new C2420e8(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", C2575b.m6165b(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C2348a8<C2573n0> a8Var = zzj;
                if (a8Var == null) {
                    synchronized (C2573n0.class) {
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

    /* renamed from: k */
    public final C2575b mo7876k() {
        C2575b a = C2575b.m6164a(this.zzd);
        return a == null ? C2575b.UNKNOWN_COMPARISON_TYPE : a;
    }
}
