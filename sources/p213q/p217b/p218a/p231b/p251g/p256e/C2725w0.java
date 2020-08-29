package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2493c;

/* renamed from: q.b.a.b.g.e.w0 */
public final class C2725w0 extends C2490i6<C2725w0, C2726a> implements C2652r7 {
    public static final C2725w0 zzf;
    public static volatile C2348a8<C2725w0> zzg;
    public int zzc;
    public String zzd;
    public String zze;

    /* renamed from: q.b.a.b.g.e.w0$a */
    public static final class C2726a extends C2491a<C2725w0, C2726a> implements C2652r7 {
        public /* synthetic */ C2726a(C2661s0 s0Var) {
            super(C2725w0.zzf);
        }
    }

    static {
        C2725w0 w0Var = new C2725w0();
        zzf = w0Var;
        C2490i6.zzd.put(C2725w0.class, w0Var);
    }

    public C2725w0() {
        String str = Objects.EMPTY_STRING;
        this.zzd = str;
        this.zze = str;
    }

    /* renamed from: a */
    public final Object mo7350a(int i, Object obj, Object obj2) {
        switch (C2661s0.f6857a[i - 1]) {
            case 1:
                return new C2725w0();
            case 2:
                return new C2726a(null);
            case 3:
                return new C2420e8(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C2348a8<C2725w0> a8Var = zzg;
                if (a8Var == null) {
                    synchronized (C2725w0.class) {
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
