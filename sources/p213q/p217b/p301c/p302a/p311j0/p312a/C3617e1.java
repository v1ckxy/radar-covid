package p213q.p217b.p301c.p302a.p311j0.p312a;

/* renamed from: q.b.c.a.j0.a.e1 */
public final class C3617e1 implements C3690q0 {

    /* renamed from: a */
    public final C3706s0 f9005a;

    /* renamed from: b */
    public final String f9006b;

    /* renamed from: c */
    public final Object[] f9007c;

    /* renamed from: d */
    public final int f9008d;

    public C3617e1(C3706s0 s0Var, String str, Object[] objArr) {
        char charAt;
        this.f9005a = s0Var;
        this.f9006b = str;
        this.f9007c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c = charAt2 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                c |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            }
            charAt2 = c | (charAt << i);
        }
        this.f9008d = charAt2;
    }

    /* renamed from: a */
    public boolean mo9556a() {
        return (this.f9008d & 2) == 2;
    }

    /* renamed from: b */
    public C3604b1 mo9557b() {
        return (this.f9008d & 1) == 1 ? C3604b1.PROTO2 : C3604b1.PROTO3;
    }

    /* renamed from: c */
    public C3706s0 mo9558c() {
        return this.f9005a;
    }
}
