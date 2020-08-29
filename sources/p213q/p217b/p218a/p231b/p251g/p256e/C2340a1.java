package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Collections;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.C2379a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.a1 */
public final class C2340a1 extends C2490i6<C2340a1, C2341a> implements C2652r7 {
    public static final C2340a1 zzi;
    public static volatile C2348a8<C2340a1> zzj;
    public int zzc;
    public C2635q6<C2378c1> zzd = C2365b8.f6336h;
    public String zze = Objects.EMPTY_STRING;
    public long zzf;
    public long zzg;
    public int zzh;

    /* renamed from: q.b.a.b.g.e.a1$a */
    public static final class C2341a extends C2491a<C2340a1, C2341a> implements C2652r7 {
        public C2341a() {
            super(C2340a1.zzi);
        }

        /* renamed from: a */
        public final C2341a mo7356a(int i, C2378c1 c1Var) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2340a1.m5422a((C2340a1) this.f6618f, i, c1Var);
            return this;
        }

        /* renamed from: a */
        public final C2341a mo7357a(long j) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2340a1 a1Var = (C2340a1) this.f6618f;
            a1Var.zzc |= 2;
            a1Var.zzf = j;
            return this;
        }

        /* renamed from: a */
        public final C2341a mo7358a(String str) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2340a1.m5424a((C2340a1) this.f6618f, str);
            return this;
        }

        /* renamed from: a */
        public final C2341a mo7359a(C2379a aVar) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2340a1.m5425a((C2340a1) this.f6618f, (C2378c1) ((C2490i6) aVar.mo7778m()));
            return this;
        }

        /* renamed from: b */
        public final C2341a mo7361b(int i) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2340a1.m5421a((C2340a1) this.f6618f, i);
            return this;
        }

        /* renamed from: b */
        public final C2341a mo7362b(long j) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            C2340a1 a1Var = (C2340a1) this.f6618f;
            a1Var.zzc |= 4;
            a1Var.zzg = j;
            return this;
        }

        /* renamed from: n */
        public final int mo7363n() {
            return ((C2340a1) this.f6618f).zzd.size();
        }

        /* renamed from: o */
        public final String mo7364o() {
            return ((C2340a1) this.f6618f).zze;
        }

        /* renamed from: p */
        public final long mo7365p() {
            return ((C2340a1) this.f6618f).zzf;
        }

        /* renamed from: q */
        public final long mo7366q() {
            return ((C2340a1) this.f6618f).zzg;
        }

        /* renamed from: a */
        public final C2378c1 mo7360a(int i) {
            return (C2378c1) ((C2340a1) this.f6618f).zzd.get(i);
        }

        public /* synthetic */ C2341a(C2741x0 x0Var) {
            super(C2340a1.zzi);
        }

        /* renamed from: a */
        public final List<C2378c1> mo7355a() {
            return Collections.unmodifiableList(((C2340a1) this.f6618f).zzd);
        }
    }

    static {
        C2340a1 a1Var = new C2340a1();
        zzi = a1Var;
        C2490i6.zzd.put(C2340a1.class, a1Var);
    }

    /* renamed from: n */
    public static C2341a m5426n() {
        return (C2341a) zzi.mo7768g();
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2741x0.f6954a[i - 1]) {
            case 1:
                return new C2340a1();
            case 2:
                return new C2341a(null);
            case 3:
                return new C2420e8(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", C2378c1.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C2348a8<C2340a1> a8Var = zzj;
                if (a8Var == null) {
                    synchronized (C2340a1.class) {
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

    /* renamed from: a */
    public final List<C2378c1> mo7351a() {
        return this.zzd;
    }

    /* renamed from: k */
    public final String mo7352k() {
        return this.zze;
    }

    /* renamed from: l */
    public final boolean mo7353l() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: m */
    public final void mo7354m() {
        C2635q6<C2378c1> q6Var = this.zzd;
        if (!q6Var.mo7387a()) {
            this.zzd = C2490i6.m5946a(q6Var);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5420a(C2340a1 a1Var) {
        if (a1Var != null) {
            a1Var.zzd = C2365b8.f6336h;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5421a(C2340a1 a1Var, int i) {
        a1Var.mo7354m();
        a1Var.zzd.remove(i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m5422a(C2340a1 a1Var, int i, C2378c1 c1Var) {
        if (a1Var != null) {
            c1Var.getClass();
            a1Var.mo7354m();
            a1Var.zzd.set(i, c1Var);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5425a(C2340a1 a1Var, C2378c1 c1Var) {
        if (a1Var != null) {
            c1Var.getClass();
            a1Var.mo7354m();
            a1Var.zzd.add(c1Var);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5423a(C2340a1 a1Var, Iterable iterable) {
        a1Var.mo7354m();
        C2730w4.m6511a(iterable, a1Var.zzd);
    }

    /* renamed from: a */
    public static /* synthetic */ void m5424a(C2340a1 a1Var, String str) {
        if (a1Var != null) {
            str.getClass();
            a1Var.zzc |= 1;
            a1Var.zze = str;
            return;
        }
        throw null;
    }
}
