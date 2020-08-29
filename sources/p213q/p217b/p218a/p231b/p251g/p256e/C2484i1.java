package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.i1 */
public final class C2484i1 extends C2490i6<C2484i1, C2485a> implements C2652r7 {
    public static final C2484i1 zzj;
    public static volatile C2348a8<C2484i1> zzk;
    public int zzc;
    public long zzd;
    public String zze;
    public String zzf;
    public long zzg;
    public float zzh;
    public double zzi;

    /* renamed from: q.b.a.b.g.e.i1$a */
    public static final class C2485a extends C2491a<C2484i1, C2485a> implements C2652r7 {
        public C2485a() {
            super(C2484i1.zzj);
        }

        /* renamed from: a */
        public final C2485a mo7734a(long j) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2484i1 i1Var = (C2484i1) this.f6618f;
            i1Var.zzc |= 1;
            i1Var.zzd = j;
            return this;
        }

        /* renamed from: a */
        public final C2485a mo7735a(String str) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2484i1.m5924a((C2484i1) this.f6618f, str);
            return this;
        }

        /* renamed from: b */
        public final C2485a mo7736b(long j) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2484i1 i1Var = (C2484i1) this.f6618f;
            i1Var.zzc |= 8;
            i1Var.zzg = j;
            return this;
        }

        public /* synthetic */ C2485a(C2741x0 x0Var) {
            super(C2484i1.zzj);
        }
    }

    static {
        C2484i1 i1Var = new C2484i1();
        zzj = i1Var;
        C2490i6.zzd.put(C2484i1.class, i1Var);
    }

    public C2484i1() {
        String str = Objects.EMPTY_STRING;
        this.zze = str;
        this.zzf = str;
    }

    /* renamed from: b */
    public static /* synthetic */ void m5925b(C2484i1 i1Var, String str) {
        if (i1Var != null) {
            str.getClass();
            i1Var.zzc |= 4;
            i1Var.zzf = str;
            return;
        }
        throw null;
    }

    /* renamed from: l */
    public static C2485a m5926l() {
        return (C2485a) zzj.mo7768g();
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2484i1();
            case 2:
                return new C2485a(null);
            case 3:
                return new C2420e8(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                C2348a8<C2484i1> a8Var = zzk;
                if (a8Var == null) {
                    synchronized (C2484i1.class) {
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

    /* renamed from: k */
    public final String mo7733k() {
        return this.zze;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5924a(C2484i1 i1Var, String str) {
        if (i1Var != null) {
            str.getClass();
            i1Var.zzc |= 2;
            i1Var.zze = str;
            return;
        }
        throw null;
    }
}
