package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.p0 */
public final class C2608p0 extends C2490i6<C2608p0, C2610b> implements C2652r7 {
    public static final C2608p0 zzh;
    public static volatile C2348a8<C2608p0> zzi;
    public int zzc;
    public int zzd;
    public String zze = Objects.EMPTY_STRING;
    public boolean zzf;
    public C2635q6<String> zzg = C2365b8.f6336h;

    /* renamed from: q.b.a.b.g.e.p0$a */
    public enum C2609a implements C2529k6 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        

        /* renamed from: e */
        public final int f6793e;

        /* access modifiers changed from: public */
        C2609a(int i) {
            this.f6793e = i;
        }

        /* renamed from: a */
        public static C2609a m6216a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static C2563m6 m6217b() {
            return C2645r0.f6830a;
        }

        /* renamed from: a */
        public final int mo7628a() {
            return this.f6793e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(C2609a.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.f6793e);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    /* renamed from: q.b.a.b.g.e.p0$b */
    public static final class C2610b extends C2491a<C2608p0, C2610b> implements C2652r7 {
        public /* synthetic */ C2610b(C2506j0 j0Var) {
            super(C2608p0.zzh);
        }
    }

    static {
        C2608p0 p0Var = new C2608p0();
        zzh = p0Var;
        C2490i6.zzd.put(C2608p0.class, p0Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2506j0.f6636a[i - 1]) {
            case 1:
                return new C2608p0();
            case 2:
                return new C2610b(null);
            case 3:
                return new C2420e8(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", C2609a.m6217b(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C2348a8<C2608p0> a8Var = zzi;
                if (a8Var == null) {
                    synchronized (C2608p0.class) {
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

    /* renamed from: k */
    public final C2609a mo7929k() {
        C2609a a = C2609a.m6216a(this.zzd);
        return a == null ? C2609a.UNKNOWN_MATCH_TYPE : a;
    }

    /* renamed from: l */
    public final int mo7930l() {
        return this.zzg.size();
    }
}
