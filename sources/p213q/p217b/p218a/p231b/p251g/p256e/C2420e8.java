package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.e8 */
public final class C2420e8 implements C2582n7 {

    /* renamed from: a */
    public final C2619p7 f6465a;

    /* renamed from: b */
    public final String f6466b;

    /* renamed from: c */
    public final Object[] f6467c;

    /* renamed from: d */
    public final int f6468d;

    public C2420e8(C2619p7 p7Var, String str, Object[] objArr) {
        this.f6465a = p7Var;
        this.f6466b = str;
        this.f6467c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6468d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f6468d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo7623a() {
        return (this.f6468d & 1) == 1 ? 1 : 2;
    }

    /* renamed from: b */
    public final boolean mo7624b() {
        return (this.f6468d & 2) == 2;
    }

    /* renamed from: c */
    public final C2619p7 mo7625c() {
        return this.f6465a;
    }
}
