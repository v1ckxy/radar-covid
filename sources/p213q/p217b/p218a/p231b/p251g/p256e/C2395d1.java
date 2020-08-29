package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.C2413a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.d1 */
public final class C2395d1 extends C2490i6<C2395d1, C2396a> implements C2652r7 {
    public static final C2395d1 zzd;
    public static volatile C2348a8<C2395d1> zze;
    public C2635q6<C2412e1> zzc = C2365b8.f6336h;

    /* renamed from: q.b.a.b.g.e.d1$a */
    public static final class C2396a extends C2491a<C2395d1, C2396a> implements C2652r7 {
        public C2396a() {
            super(C2395d1.zzd);
        }

        /* renamed from: a */
        public final C2396a mo7494a(C2413a aVar) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2395d1.m5616a((C2395d1) this.f6618f, (C2412e1) ((C2490i6) aVar.mo7778m()));
            return this;
        }

        public /* synthetic */ C2396a(C2741x0 x0Var) {
            super(C2395d1.zzd);
        }
    }

    static {
        C2395d1 d1Var = new C2395d1();
        zzd = d1Var;
        C2490i6.zzd.put(C2395d1.class, d1Var);
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2395d1();
            case 2:
                return new C2396a(null);
            case 3:
                return new C2420e8(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C2412e1.class});
            case 4:
                return zzd;
            case 5:
                C2348a8<C2395d1> a8Var = zze;
                if (a8Var == null) {
                    synchronized (C2395d1.class) {
                        a8Var = zze;
                        if (a8Var == null) {
                            a8Var = new C2493c<>(zzd);
                            zze = a8Var;
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
    public static /* synthetic */ void m5616a(C2395d1 d1Var, C2412e1 e1Var) {
        if (d1Var != null) {
            e1Var.getClass();
            C2635q6<C2412e1> q6Var = d1Var.zzc;
            if (!q6Var.mo7387a()) {
                d1Var.zzc = C2490i6.m5946a(q6Var);
            }
            d1Var.zzc.add(e1Var);
            return;
        }
        throw null;
    }
}
