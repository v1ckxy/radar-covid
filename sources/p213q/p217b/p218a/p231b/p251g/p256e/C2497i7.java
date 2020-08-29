package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.i7 */
public final class C2497i7 implements C2636q7 {

    /* renamed from: a */
    public C2636q7[] f6621a;

    public C2497i7(C2636q7... q7VarArr) {
        this.f6621a = q7VarArr;
    }

    /* renamed from: a */
    public final boolean mo7648a(Class<?> cls) {
        for (C2636q7 a : this.f6621a) {
            if (a.mo7648a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C2582n7 mo7649b(Class<?> cls) {
        C2636q7[] q7VarArr;
        for (C2636q7 q7Var : this.f6621a) {
            if (q7Var.mo7648a(cls)) {
                return q7Var.mo7649b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? str.concat(name) : new String(str));
    }
}
